--1. Zlotkey�� ������ �μ��� ���� ��� ����� �̸��� �Ի����� ǥ���ϴ� ���Ǹ� �ۼ��Ͻʽÿ�. 
--   Zlotkey�� �����Ͻʽÿ�.

SELECT FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE LAST_NAME = 'Zlotkey')
AND LAST_NAME != (SELECT LAST_NAME FROM EMPLOYEES WHERE LAST_NAME = 'Zlotkey');
?
--2. �޿��� ��� �޿����� ���� ��� ����� ��� ��ȣ�� �̸��� ǥ���ϴ� ���Ǹ� �ۼ��ϰ� 
--   ����� �޿��� ���� ������������ �����Ͻʽÿ�.

SELECT EMPLOYEE_ID, FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME
FROM    EMPLOYEES
WHERE   SALARY > (SELECT avg(SALARY) FROM EMPLOYEES)
ORDER BY SALARY asc;
?

--3. �̸��� u�� ���Ե� ����� ���� �μ����� ���ϴ� ��� ����� ��� ��ȣ�� �̸��� ǥ���ϴ�
--   ���Ǹ� �ۼ��Ͻʽÿ�.

SELECT EMPLOYEE_ID, FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME
FROM EMPLOYEES
WHERE DEPARTMENT_ID  in (SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE FIRST_NAME ||' '|| LAST_NAME like '%u%'); --AS ����


SELECT EMPLOYEE_ID, FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME
FROM EMPLOYEES
WHERE DEPARTMENT_ID  in (SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE FIRST_NAME like '%u%');

?

--4. �μ� ��ġ ID�� 1700�� ��� ����� �̸�, �μ� ��ȣ �� ���� ID�� ǥ���Ͻʽÿ�.
SELECT FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME, DEPARTMENT_ID, EMPLOYEE_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID in (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE LOCATION_ID = 1700);

--FROM �� DEPARTMENT �� ���Ե��� �ʴ� ���� ����!!
?

--5. King���� �����ϴ� ��� ����� �̸��� �޿��� ǥ���Ͻʽÿ�.
SELECT FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME, SALARY
FROM EMPLOYEES
WHERE MANAGER_ID in (SELECT EMPLOYEE_ID FROM EMPLOYEES WHERE LAST_NAME = 'King');
?

?

--6. Executive �μ��� ��� ����� ���� �μ� ��ȣ, �̸� �� ���� ID�� ǥ���Ͻʽÿ�.
SELECT DEPARTMENT_ID, FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME, JOB_ID
FROM    EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME = 'Executive');

?

?

--7. ��� �޿����� ���� �޿��� �ް� �̸��� u�� ���Ե� ����� ���� �μ����� �ٹ��ϴ� 
--   ��� ����� ��� ��ȣ, �̸� �� �޿��� ǥ���ϴ� ���Ǹ� �ۼ��Ͻʽÿ�.
SELECT EMPLOYEE_ID, FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME, SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID in(SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE FIRST_NAME ||' '|| LAST_NAME like '%u%')
AND SALARY > (SELECT avg(SALARY) FROM EMPLOYEES);
