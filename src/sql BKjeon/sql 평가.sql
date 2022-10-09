SELECT * FROM emp;
--1.    급여가 2000 이상 3000 이하인 사원의 이름과 사원번호, 입사일, 급여를 출력하되 이름을  오름차순 정렬하세요.
SELECT ename, empno, hiredate, salary
FROM employee
WHERE salary between 2000 and 3000
ORDER BY  ename ASC;

--2. 커미션이 NULL 인 사원이름과, 입사일 부서번호를 출력하되 부서번호를 오를차순 정렬하되 부서번호가 같은 항목이 있을 경우 이
SELECT ename, hiredate, dno
FROM employee
WHERE commission is null
ORDER BY dno, ename ASC;

--3. 커미션이 300 이거나 500 이거나 1400인 사원의 사원번호와 이름, 월급, 커미션을 출력 하되 커미션을 내림차순 정렬하세요.
    --IN 연산자를 사용해서 출력 하세요.

SELECT eno, ename, salary, commision
FROM employee
WHERE commission in (300, 500, 1400)
ORDER BY comm DESC;

--4. 이름의 첫 글자가 ’S’로 시작하는 사원의 이름을 출력하세요.
SELECT ename
FROM employee
WHERE regexp_like (ename, '^S');


--5. LIKE 연산자와 와일드 카드를 사용해서 '81'년도에 입사하지 않은 사원의 이름과 입사일을 출력하세요.
SELECT ename, hiredate
FROM employee
WHERE not hiredate like '81%';

--6. 부서 번호를 중복 제거후 오름차순으로 정렬해서 출력하세요.
SELECT distinct dno
FROM employee
ORDER BY dno ASC;

--7. 이름에 ‘A’  와 ‘E’ 를 모두 포함하는 사원의 이름을 출력하세요.
SELECT ename
FROM employee
WHERE ename like '%A%' AND ename like '%E%'; 

--8. substr 함수를 사용해서 12월 달에 입사한 사원의 사원번호, 이름, 입사일을 출력하세요.
--SUBSTR(str, pos(위치에서), len(개의 문자))
SELECT eno, ename, hiredate
FROM employee
WHERE substr(hiredate,4, 2) = '12';

--9.NVL 함수를 사용해서 사원의 연봉을 계산해서 사원이름, 월급, 커미션 , 연봉을 출력하되 연봉이 많은 순서대로 출력하세요.
-- NVL("값", "지정값") 
SELECT ename, salary, commission, nvl(salary*12,0) A_salary
FROM employee
ORDER BY A_salary DESC;


--10. NVL2 함수를 사용해서 사원의 연봉을 계산해서 사원이름, 월급, 커미션 , 연봉을 출력하되 연봉이 많은 순서대로 출력하세요.
--NVL2("값", "지정값1", "지정값2") // NVL2("값", "NOT NULL", "NULL") 
SELECT ename, salary, comm, nvl2(salary*12, salary*12, 0) A_salary
FROM employee
ORDER BY A_salary DESC;

--11. 사원들의 급여 총액 , 평균액, 최고액, 최소액을 출력 하세요. 각 컬럼을 “급여총액”, “평균액, “최고액”, “최소액”으로 별칭이름으로 출력하세요.
SELECT sum(salary) "급여총액", max(salary) "최고액" , min(salary) "최소액"
FROM employee;

--12. 직업 종류의 갯수를 출력 하세요.  출력컬럼을 “직업 종류의 갯수”로 별칭이름으로 출력 하세요.
SELECT count(job)"직업 종류의 갯수"
FROM (SELECT distinct job FROM employee);

SELECT count(distinct job)"직업 종류의 갯수"
FROM emplyee;


-- 13.각 부서별 평균 월급을 구해서 부서번호와 평균 월급을 출력 하되  각각 “부서번호”, “평균월급” 으로 별칭이름으로 출력하세요.
SELECT dno "부서번호", avg(salary) "평균 월급"
FROM employee
GROUP BY dno;

-- 14. 담당 업무가 동일한 사원의 수를 구하시오. (참고 , count 함수 사용)

SELECT count(eno), job
FROM employee
GROUP BY job;

-- 15.     직급별 사원의 최저 급여를 출력하시오, 관리자를 알수 없는 사원 및 최저 급여가 2000 미만인 그룹은 제외 시키고
--    결과를 급여에 대한 내림차순으로 정렬하여 출력 하세요.

SELECT job, min(salary)
FROM employee
WHERE manager is not null
GROUP BY job
HAVING min(salary) > 2000
ORDER BY min(salary) DESC;

--16.  서브 쿼리를 사용해서 사원번호가 7788인 사원과 담당업무가 같은 사원을 출력 하시오  <담당이름, 담당업무> 출력 하시오
SELECT ename 담당이름, job 담당업무
FROM employee
WHERE job = (SELECT job FROM employee WHERE eno = 7788);

--17.  서브 쿼리를 사용해서 담당업무가 7499 인 사원보다 급여가 많은 사원을 출력 하시오. <사원이름, 담당업무> 출력 하시오.
SELECT ename 사원이름, job 담당업무
FROM employee
WHERE salary > (SELECT salary FROM employee WHERE eno = 7499);

--18. 서브 쿼리를 사용해서 각 부서의 최소 급여를 받는 사원의 이름 , 급여, 부서번호를 출력하시오.
SELECT ename, salary, dno
FROM employee
WHERE salary in (SELECT min(salary) FROM employee GROUP BY dno);


-- 19.서브 쿼리를 사용해서 급여가 평균 급여보다 많은 사원들의 사원보호와 이름을 표시하되 결과를 급여에 대해서 오름차순으로 정렬하시오.
SELECT eno, ename
FROM employee
WHERE salary > (SELECT avg(salary) FROM employee)
ORDER BY salary asc;


-- 20.서브 쿼리를 사용해서 DEPT 테이블에 있는 부서명 DNAME 컬럼에서  ‘RESEARCH’ 부서의 부서번호, 사원이름 및 담당 업무를 표시하시오.
SELECT d.dname, e.dno, e.ename, e.job
FROM employee e INNER JOIN dept d
ON e.dno = d.dno
WHERE e.dno in (SELECT dno FROM dept WHERE dname = 'RESEARCH');

