--1. EMPLOYEES ���̺��� ��� �̸��� first_name�� last_name�� ���� full_name���� ���
SELECT FIRST_NAME || ' '|| LAST_NAME AS FULL_NAME
FROM EMPLOYEES;

SELECT concat (FIRST_NAME, LAST_NAME) AS FULL_NAME
FROM EMPLOYEES;


--2. �μ���ȣ�� 30(���źμ�)�̰� �޿� 10000�̸��� ����� full_name�� ����,�μ���ȣ�� ���
SELECT FIRST_NAME || ' '|| LAST_NAME AS FULL_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30 and SALARY <10000;

-- where ������ , �� �ƴ� and �� �����

--3. �μ���ȣ�� 30�̰� �޿��� 10000�޷� ���ϸ� �޴� 2006�⵵ ���� �Ի��� ����� full_name�� ���
SELECT FIRST_NAME || ' '|| LAST_NAME AS FULL_NAME
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30 and SALARY <10000 and HIRE_DATE <'06/01/01';

--date Ÿ���� '' �� �ʿ�!!!

--4. �μ���ȣ�� 30(���źμ�)�̰� �޿��� 10000������ ����� �μ���ȣ�� 60(IT�μ�)���� �޿��� 5000�̻��� ����� ��ȸ
SELECT *
FROM EMPLOYEES
WHERE (DEPARTMENT_ID = 30 and SALARY <10000) or (DEPARTMENT_ID = 60 and SALARY >5000);
-- and �� �ƴ� or

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID NOT BETWEEN 110 and 120;

--5. �����ȣ�� 110������ 120���� ��� �� �޿��� 5000���� 10000������ �������� ��ȸ
SELECT *
FROM EMPLOYEES
WHERE (EMPLOYEE_ID between 110 and 120) and (SALARY between 5000 and 10000);
?
--6. �����ȣ�� 110������ 120���� �ƴ� ����� ��ȸ
SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID not between 110 and 120;


--7. �μ���ȣ�� 30(���źμ�), 60(IT�μ�), 90(�濵�μ�)�� ���� ����� ��ȸ
SELECT *
FROM EMPLOYEES
WHERE DEPARTMENT_ID in (30, 60, 90);

?

--8. �μ���ȣ�� 30(���źμ�), 60(IT�μ�), 90(�濵�μ�) ���� �μ��� ���� ����� ��ȸ
SELECT *
FROM EMPLOYEES
WHERE DEPARTMENT_ID not in (30, 60, 90);
?

--9. ��ȭ��ȣ���� 590���� �����ϴ� ������ ��ȭ��ȣ�� ��ȸ
SELECT *
FROM EMPLOYEES
WHERE PHONE_NUMBER like '590%';