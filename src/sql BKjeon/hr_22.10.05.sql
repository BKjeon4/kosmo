--1. �̸��� ���� 'King' ����� ����� �μ����� ��� ( employees, departments )
SELECT e.EMPLOYEE_ID, d.DEPARTMENT_NAME
FROM EMPLOYEES e, DEPARTMENTS d
WHERE e.DEPARTMENT_ID  = d.DEPARTMENT_ID  and LAST_NAME like 'King';

SELECT e.EMPLOYEE_ID, d.DEPARTMENT_NAME
FROM EMPLOYEES e INNER JOIN DEPARTMENTS d
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE LAST_NAME like 'King';
?

--2. �̸��� ���� 'King' ����� ����� �μ��� �׸��� �������� ��� ( employees, departments, jobs )
SELECT e.EMPLOYEE_ID, d.DEPARTMENT_NAME, j.JOB_TITLE
FROM   EMPLOYEES e LEFT OUTER JOIN DEPARTMENTS d
                    ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
                    RIGHT OUTER JOIN JOBS j
                    ON   j.JOB_ID = e.JOB_ID
WHERE LAST_NAME like 'King';


??

--3. 2007�� ��ݱ⿡ �Ի��� ������� ����� �̸�, �Ի��� �׸��� �μ����� ���
--(*) Grant�� ���� �μ��� �������� ���� ���������� Grant�� ��µǷ���
SELECT e.EMPLOYEE_ID , e.LAST_NAME , e.HIRE_DATE , d.DEPARTMENT_NAME
FROM    EMPLOYEES e LEFT OUTER JOIN DEPARTMENTS d
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE TO_CHAR(HIRE_DATE, 'YYYYMM') BETWEEN '200701' and '200706';

??

--4. 'Executive' �μ����� ����� �ش� ����� �Ŵ���(���) �̸��� ���
--(*) �Ŵ���(���)�� ���� ����� 'King'�� ��µǷ���
SELECT e1.LAST_NAME || e1.FIRST_NAME AS FULL_NAME, e2.LAST_NAME || e2.FIRST_NAME AS MNG_NAME
FROM EMPLOYEES e1 INNER JOIN DEPARTMENTS d
ON e1.DEPARTMENT_ID = d.DEPARTMENT_ID
FULL OUTER JOIN EMPLOYEES e2
ON e1.MANAGER_ID = e2.EMPLOYEE_ID
WHERE d.DEPARTMENT_ID = 90;




----------------------------------------------------------
--<�Ի繮��>

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