--1. 사원명에 ‘L’자가 있는 사원에 대해 이름, 업무, 부서명, 위치를 출력
SELECT e.ename ename, e.job job, d.dname, dname, d.loc loc
FROM    emp e, dept d
WHERE   e.deptno = d.deptno AND e.ename like '%L%';
--GROUP BY
--HAVING
--ORDER BY

--표준안
SELECT e.ename ename, e.job job, d.dname, dname, d.loc loc
FROM    emp e INNER JOIN dept d
ON  e.deptno = d.deptno 
WHERE e.ename like '%L%';

--2. 관리자보다 먼저 입사한 사원에 대해 이름, 입사일, 관리자 이름, 관리자 입사일을 출력
SELECT e1.ENAME, e1.HIREDATE, e2.ENAME, e2.HIREDATE
FROM    emp e1, emp e2
WHERE   e1.mgr = e2.empno(+) AND e1.HIREDATE < e2.HIREDATE;

--표준안
SELECT e1.ENAME, e1.HIREDATE, e2.ENAME, e2.HIREDATE
FROM    emp e1 LEFT OUTER JOIN emp e2
ON e1.mgr = e2.empno 
WHERE e1.HIREDATE < e2.HIREDATE;



--3. 아래의 결과를 출력 ( 관리자가 없는 KING을 포함하여 모든 사원을 출력 )
--사번 사원명 매니저사번 매니저명
--7839 KING 
--7698 BLAKE 7839 KING 
--7782 CLARK 7839 KING
--: 등등

SELECT e1.EMPNO , e1.ENAME , e2.EMPNO , e2.ENAME 
FROM    EMP e1, EMP e2 
WHERE   e1.mgr = e2.empno (+);

--표준안
SELECT e1.EMPNO , e1.ENAME , e2.EMPNO , e2.ENAME 
FROM    EMP e1 LEFT OUTER JOIN EMP e2 
ON   e1.mgr = e2.empno;


?-----------------------------------------------------
-- 서브쿼리!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
--전체 사원들 중 평균 급여보다 낮은 급여를 받는 사원의 명단을 조회
-- 평균 급여 구하기
select round(avg(sal)) from emp;

-- 그 평균 급여보다 낮은 사원 정보 조회
select ename, sal from emp 
where sal < (select round(avg(sal)) from emp );

-- 월급이 가장 많은 사원의 정보 조회
SELECT ename, sal
FROM  emp
WHERE sal = (select max(sal) from emp );

-- 평균 급여보다 높고 최대 급여보다 낮은 월급을 받는 사원의 정보를 조회
SELECT ename, sal
FROM  emp
WHERE sal > (select avg(sal) from emp )
AND sal < (select max(sal) from emp );

SELECT e.*
FROM emp e,
    (select avg(sal)avg , max(sal) max from emp) ext
WHERE e.sal > ext.avg AND e.sal < ext.max;

-- 월급순으로 상위 10명의 명단을 출력
SELECT ext.*
FROM(SELECT ename, sal from emp ORDER BY sal desc)ext
WHERE rownum < 11;

------------------------------------------------------
--<< 연습문제 >>
--1. SCOTT의 급여보다 많은 사원의 정보를 사원번호, 이름, 담당업무, 급여를 출력

SELECT e.empno, e.ename, e.job, e.sal
FROM    emp e,
                (SELECT ename, sal FROM emp WHERE ename like 'SCOTT')s
WHERE   e.sal > s.sal;

SELECT empno, ename, job, sal
FROM    emp
WHERE   sal > (SELECT sal FROM emp WHERE ename like 'SCOTT');

--2. 30번 부서의 최소 급여보다 각부서의 최소 급여가 높은 부서를 출력
SELECT DA.deptno
FROM (SELECT min(sal)AS min FROM emp WHERE deptno = 30 )D30, 
        (SELECT deptno, min(sal)AS min FROM emp WHERE deptno != 30 GROUP BY deptno)DA
WHERE D30.min < DA.min ;

select deptno, min(sal) min
from emp
where deptno is not null
group by deptno
having min(sal) > (select min(sal) from emp where deptno = 30);
?
--3. 업무별로 평균 급여 중에서 가장 적은 급여를 가진 직업을 출력
SELECT job, avg(sal)
FROM emp
WHERE job is not null
GROUP BY job
HAVING avg(sal) = (SELECT min(avg(sal)) FROM emp GROUP BY job);

?--4. 사원번호가 7521의 업무와 같고 사번 7934인 직원보다 급여를 많이 받는 사원의 정보를 출력
SELECT *
FROM emp
WHERE job in(SELECT job FROM emp WHERE empno =7521)
and sal > (SELECT sal FROM emp WHERE empno = 7934);

--- 따로 풀어봐야함


?
--5. 'WARD'와 부서와 업무가 같은 사원 명단 출력
SELECT ename
FROM emp
WHERE job = (SELECT job FROM emp WHERE ename = 'WARD')
AND deptno = (SELECT deptno FROM emp WHERE ename = 'WARD');


-- 풀어봐야함

----------------------------------------------------------------------------

--IN : 반환된 목록의 각각과 비교
--ANY : 비교연산자( >, >=, <, <=, =, !=(<>) ) 와 반환된 목록의 각각과 비교
--ALL : 비교연산자( >, >=, <, <=, =, !=(<>) ) 와 반환된 모든 목록과 비교
--EXISTS : 적어도 한 개의 행을 리턴하면 true, 그렇지 않으면 false

-- 업무별로 최소 급여를 받는 사원의 정보를 사원번호, 이름, 담당업무, 급여를 출력
SELECT empno, ename, job, sal
FROM    emp
WHERE (job, sal) in (SELECT job, min(sal) FROM emp GROUP BY job);

INSERT INTO emp(empno, ename, job, sal) VALUES(9999, '테스트', 'CLERK', 1250);

-- 10번 부서 사원들의 업무와 동일한 직원들 검색
SELECT ename, job
FROM    emp
WHERE job = ANY(SELECT job FROM emp WHERE deptno = 10); 
-- ANY 와 ALL 은 잘 안쓰임!!!!!!!!!!!!!!!!!!!!

SELECT ename, job
FROM    emp
WHERE job IN(SELECT job FROM emp WHERE deptno = 10); 

-- 적어도 한명의 사원으로부터 보고를 받을 수 있는 사원의 정보를 사원번호, 이름, 업무를 출력
SELECT empno, ename, job
FROM emp e1
WHERE EXISTS (SELECT * FROM emp e2 WHERE e1.empno = e2.mgr);
-- FORD / BLAKE / KING / JONES / SCOTT / CLARK

--사원을 출력
SELECT empno, ename, job
FROM emp e1
WHERE NOT EXISTS (SELECT * FROM emp e2 WHERE e1.empno = e2.mgr);


-------------------------------------------------------------------------------
--(1) 부서별 급여통계 테이블 생성

create table stat_salary ( 
stat_date date not null, -- 날짜
dept_no number, -- 부서
emp_count number, -- 사원수
tot_salary number, -- 급여총액
avg_salary number ); -- 급여평균

DESC Stat_salary;

SELECT sysdate, deptno FROM emp GROUP BY deptno;

--(2) 날짜와 부서번호 입력
INSERT INTO stat_salary(stat_date, dept_no) 
SELECT sysdate, deptno FROM emp GROUP BY deptno;

SELECT * FROM stat_salary;


--(3) 사원수, 급여총액, 평균급여 입력(?) -> 수정
SELECT count(*), sum(sal), round(avg(sal)) FROM emp GROUP BY deptno;

UPDATE stat_salary ss
SET ( EMP_count, tot_salary, avg_salary ) 
    = ( SELECT count(*), sum(sal), round(avg(sal))
    FROM emp e
    WHERE ss.dept_no = e.deptno
    GROUP BY deptno);
    
SELECT * FROM stat_salary;

CREATE TABLE emp_cp as select * from emp;

-- 부서명이 'SALES'인 사원의 정보를 삭제 ( emp_cp )

DELETE FROM emp_cp
WHERE deptno = (SELECT deptno FROM dept WHERE dname = 'SALES');
 

