--1. 사원번호, 이름, 업무, 급여,  현재 급여에 15% 증가된 급여를(New Salary),  증가액(Increase)를 출력
SELECT empno, ename, job, sal, sal*1.15 as New_Salary, sal*0.15 as Increase
FROM emp;
?

?

--2. 이름, 입사일, 입사일로부터 6개월 후에 돌아오는 월요일을 출력
SELECT ename, hiredate, next_day(add_months(hiredate, 6), '월') as the_day
FROM emp;
?

?

--3.이름, 입사일, 입사일로부터 현재까지의  년수, 급여, 입사일로부터 현재까지의 급여의 총계를 출력
SELECT ename, hiredate, round(months_between(sysdate,hiredate)/12)as year, sal, round(months_Between(sysdate,hiredate))*sal as total_sal
FROM emp;
?
--
?

--4.이름, 업무, 입사일, 입사한 요일을 출력
SELECT ename, job, hiredate, TO_CHAR(HIREDATE, 'day')as day
FROM emp;

?
--
?

--5. 업무별, 부서별 급여 합계와 인원수를 출력하되, 
--10번 부서를 제외하고 업무가 ‘SALESMAN’과 ‘MANAGER’만 출력한다.
SELECT job, deptno, sum(sal) as sum, count(*) as employees
FROM emp
WHERE deptno !=10
GROUP by job, deptno
HAVING job in ('SALESMAN', 'MANAGER');
?

?

--6. 업무별로 평균급여와 최대급여를 출력하되, 평균급여가 2000이상인 것만 출력하고 평균급여가 높은 순으로 정렬
SELECT trunc(avg(sal),2)as avg_sal, max(sal)
FROM emp
GROUP BY job
HAVING avg(sal) >= 2000
order by avg(sal) desc;
?

?

--7. 같은 입사년도 별로 인원수를 출력
SELECT TO_CHAR(HIREDATE, 'YY')as year, count(*) || '명' as employees
FROM emp
GROUP BY TO_CHAR(HIREDATE, 'YY');

--8. 5개씩 급여합계와 인원수를 출력 (rownum이용)
SELECT  trunc(rownum/5),sum(sal), count(*)
FROM emp
GROUP BY trunc(rownum/5) ;

-- 다시!!!!!!!!!!!!!!!!!!!

--9. 다음과 같이 출력
--( 실제 출력된 인원수가 다를 수도 있음 )
--CLERK  SALESMAN  MANAGER    (업무명)
-------------------------------------
--  4         5        3        (인원수)?

SELECT count('CLERK') AS CLERK,count('SALESMAN') AS SALESMAN, count('MANAGER') AS MANAGER
FROM emp;

SELECT count(decode (job, 'CLERK',  1))as clerk, count (decode (job, 'SALESMAN', 1)) as salesman,
count (decode (job, 'MANAGER', 1)) as manager
FROM emp;
---완성 해야함!!

--10. 다음과 같이 업무별, 부서별 출력
--( 실제 계산된 금액이 다를 수도 있음 )

/*
업무명          10번부서           20번부서           30번부서            급여합계
----------------------------------------------------------------------------------------
CLERK            1300               1900                 950             4150
SALESMAN           0                 0                  5600              5600
PRESIDENT        5000                0                   0               5000
MANAGER          2450                2975                2850             8275
ANALYST            0                6000                  0              6000
*/

SELECT JOB, decode(DEPTNO, 10, sal) '10번부서', 
decode(DEPTNO, 20, sal) '20번부서', 
decode(DEPTNO, 30, sal) '30번부서', 
sum(
FROM emp
WHERE
GROUP BY JOB;

select job as 업무명,nvl(sum(decode(deptno,10,sal)),0) as "10번부서", nvl(sum(decode(deptno,20,sal)),0) as "20번부서" ,nvl(sum(decode(deptno,30,sal)),0) as "30번부서", sum(sal) as 급여합계
from emp
group by job;


--사원테이블 (emp)에 사원명과 부서테이블 (dept)에 그 사원의 부서명을 출력
SELECT ename, dname
FROM emp, dept; 

-- 내부조인
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e, dept d
WHERE e.deptno =  d.deptno;

--(표준안 방식)
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e INNER JOIN dept d
ON e.deptno =  d.deptno;

-- 외부조인
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e, dept d
WHERE e.deptno =  d.deptno (+);

SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e, dept d
WHERE e.deptno(+) =  d.deptno;

--양쪽은 불가!!!!!!!!!!!!!!
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e, dept d
WHERE e.deptno(+) =  d.deptno(+);

--표준안 (오른쪽 (+)랑 같음)
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno =  d.deptno;

--표준안 (왼쪽 (+)랑 같음)
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e RIGHT OUTER JOIN dept d
ON e.deptno =  d.deptno;

-- 표준안 ( 양쪽 (+), 옛날 방식으로는 불가능)
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e FULL OUTER JOIN dept d
ON e.deptno =  d.deptno;
-- 거의 안씀


-- 사원테이블(emp)에 각 사원의 매니저를 조회
SELECT e1.empno, e1.ename, e1.mgr, e2.empno mgr_EMPNO, e2.ename mgr_ENAME
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno;
--(셀프조인) : 두개의 방이 있다고 생각

--표준안
SELECT e1.empno, e1.ename, e1.mgr, e2.empno mgr_EMPNO, e2.ename mgr_ENAME
FROM emp e1 INNER JOIN emp e2
on e1.mgr = e2.empno;

--외부조인
SELECT e1.empno, e1.ename, e1.mgr, e2.empno mgr_EMPNO, e2.ename mgr_ENAME
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno (+);
--표준안
SELECT e1.empno, e1.ename, e1.mgr, e2.empno mgr_EMPNO, e2.ename mgr_ENAME
FROM emp e1 LEFT OUTER JOIN emp e2
ON e1.mgr = e2.empno ;

---------------------------------------------
--[집합]
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK'
    -- SMITH/ ADAMS/ JAMES/ MILLER
    
    UNION --(합집합) 겹치는 것 까지 다 출력 -> UNION ALL!!!!!!
    

SELECT empno, ename, job, deptno FROM emp WHERE deptno=10;
    -- CLARK/ KING/ MILLER
    
--교집합
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK'
    -- SMITH/ ADAMS/ JAMES/ MILLER
    
    INTERSECT --(교집합)
    

SELECT empno, ename, job, deptno FROM emp WHERE deptno=10;
    -- CLARK/ KING/ MILLER
    
--차집합
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK'
    -- SMITH/ ADAMS/ JAMES/ MILLER
    
    MINUS --(차집합) A에 있는 건 B에서 빼고 출력
    

SELECT empno, ename, job, deptno FROM emp WHERE deptno=10;
    -- CLARK/ KING/ MILLER

-------------------------------------------------
--연습문제

--<< 기초 문제 >>

--1. EMP 테이블에서 사원번호, 이름, 업무, 부서번호와 DEPT 테이블에서 부서명, 근무지를 출력
SELECT e.empno, e.ename, e.job, e.deptno, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno (+);

SELECT e.empno, e.ename, e.job, e.deptno, d.dname, d.loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno;

?

--2. SALESMAN 사원만 사원번호, 이름, 급여, 부서명, 근무지를 출력
SELECT e.empno, e.ename, e.sal, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno (+) and job like 'SALESMAN';

SELECT e.empno, e.ename, e.sal, d.dname, d.loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
WHERE job like 'SALESMAN';

?

--3. 보너스(comm)를 받는 사원에 대해 이름, 부서명, 위치를 출력
SELECT e.ename, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno (+) and e.comm is not null;

SELECT e.ename, d.dname, d.loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
WHERE e.comm is not null;
??

--4. 부서별 부서명과 급여 합계를 출력
SELECT d.dname, sum(e.sal) 
FROM dept d, emp e
WHERE d.deptno = e.deptno
GROUP BY d.dname;
--- 다시 확인 필요

??

-- 5. 업무가 ‘MANAGER’인 사원의 정보를 이름, 업무, 부서명, 근무지를 출력 
SELECT e.ename, e.job, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno (+) and JOB like 'MANAGER';

SELECT e.ename, e.job, d.dname, d.loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
WHERE JOB like 'MANAGER';
