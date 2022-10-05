--1. 이름의 성이 'King' 사원의 사번과 부서명을 출력 ( employees, departments )
SELECT e.EMPLOYEE_ID, d.DEPARTMENT_NAME
FROM EMPLOYEES e, DEPARTMENTS d
WHERE e.DEPARTMENT_ID  = d.DEPARTMENT_ID  and LAST_NAME like 'King';

SELECT e.EMPLOYEE_ID, d.DEPARTMENT_NAME
FROM EMPLOYEES e INNER JOIN DEPARTMENTS d
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE LAST_NAME like 'King';
?

--2. 이름의 성이 'King' 사원의 사번과 부서명 그리고 업무명을 출력 ( employees, departments, jobs )
SELECT e.EMPLOYEE_ID, d.DEPARTMENT_NAME, j.JOB_TITLE
FROM   EMPLOYEES e LEFT OUTER JOIN DEPARTMENTS d
                    ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
                    RIGHT OUTER JOIN JOBS j
                    ON   j.JOB_ID = e.JOB_ID
WHERE LAST_NAME like 'King';


??

--3. 2007년 상반기에 입사한 사원들의 사번과 이름, 입사일 그리고 부서명을 출력
--(*) Grant는 아직 부서가 배정받지 못한 상태이지만 Grant도 출력되려면
SELECT e.EMPLOYEE_ID , e.LAST_NAME , e.HIRE_DATE , d.DEPARTMENT_NAME
FROM    EMPLOYEES e LEFT OUTER JOIN DEPARTMENTS d
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE TO_CHAR(HIRE_DATE, 'YYYYMM') BETWEEN '200701' and '200706';

??

--4. 'Executive' 부서에서 사원과 해당 사원의 매니저(상사) 이름을 출력
--(*) 매니저(상사)가 없는 사원인 'King'이 출력되려면
SELECT e1.LAST_NAME || e1.FIRST_NAME AS FULL_NAME, e2.LAST_NAME || e2.FIRST_NAME AS MNG_NAME
FROM EMPLOYEES e1 INNER JOIN DEPARTMENTS d
ON e1.DEPARTMENT_ID = d.DEPARTMENT_ID
FULL OUTER JOIN EMPLOYEES e2
ON e1.MANAGER_ID = e2.EMPLOYEE_ID
WHERE d.DEPARTMENT_ID = 90;




----------------------------------------------------------
--<입사문제>

1.
SELECT s.name
FROM STUDENT s, ENROLL e
WHERE e.grade >= 3.0 
and s.student_no = e.student_no;

SELECT s.name, avg(e.grade)
FROM STUDENT s INNER JOIN ENROLL e
ON s.student_no = e.student_no
FROM CLASS c INNER JOIN ENROLL e
ON c.class_no = e.class_no
WHERE avg(e.grade) >= 3.0;

2.
SELECT d.DEPTNO , e.DEPTNO, d.DNAME, e.DNAME
FROM DEPT d FULL OUTER JOIN EMP e
ON d.DEPTNO = e.DEPTNO;