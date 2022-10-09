SELECT * FROM emp;
--1.    �޿��� 2000 �̻� 3000 ������ ����� �̸��� �����ȣ, �Ի���, �޿��� ����ϵ� �̸���  �������� �����ϼ���.
SELECT ename, empno, hiredate, salary
FROM employee
WHERE salary between 2000 and 3000
ORDER BY  ename ASC;

--2. Ŀ�̼��� NULL �� ����̸���, �Ի��� �μ���ȣ�� ����ϵ� �μ���ȣ�� �������� �����ϵ� �μ���ȣ�� ���� �׸��� ���� ��� ��
SELECT ename, hiredate, dno
FROM employee
WHERE commission is null
ORDER BY dno, ename ASC;

--3. Ŀ�̼��� 300 �̰ų� 500 �̰ų� 1400�� ����� �����ȣ�� �̸�, ����, Ŀ�̼��� ��� �ϵ� Ŀ�̼��� �������� �����ϼ���.
    --IN �����ڸ� ����ؼ� ��� �ϼ���.

SELECT eno, ename, salary, commision
FROM employee
WHERE commission in (300, 500, 1400)
ORDER BY comm DESC;

--4. �̸��� ù ���ڰ� ��S���� �����ϴ� ����� �̸��� ����ϼ���.
SELECT ename
FROM employee
WHERE regexp_like (ename, '^S');


--5. LIKE �����ڿ� ���ϵ� ī�带 ����ؼ� '81'�⵵�� �Ի����� ���� ����� �̸��� �Ի����� ����ϼ���.
SELECT ename, hiredate
FROM employee
WHERE not hiredate like '81%';

--6. �μ� ��ȣ�� �ߺ� ������ ������������ �����ؼ� ����ϼ���.
SELECT distinct dno
FROM employee
ORDER BY dno ASC;

--7. �̸��� ��A��  �� ��E�� �� ��� �����ϴ� ����� �̸��� ����ϼ���.
SELECT ename
FROM employee
WHERE ename like '%A%' AND ename like '%E%'; 

--8. substr �Լ��� ����ؼ� 12�� �޿� �Ի��� ����� �����ȣ, �̸�, �Ի����� ����ϼ���.
--SUBSTR(str, pos(��ġ����), len(���� ����))
SELECT eno, ename, hiredate
FROM employee
WHERE substr(hiredate,4, 2) = '12';

--9.NVL �Լ��� ����ؼ� ����� ������ ����ؼ� ����̸�, ����, Ŀ�̼� , ������ ����ϵ� ������ ���� ������� ����ϼ���.
-- NVL("��", "������") 
SELECT ename, salary, commission, nvl(salary*12,0) A_salary
FROM employee
ORDER BY A_salary DESC;


--10. NVL2 �Լ��� ����ؼ� ����� ������ ����ؼ� ����̸�, ����, Ŀ�̼� , ������ ����ϵ� ������ ���� ������� ����ϼ���.
--NVL2("��", "������1", "������2") // NVL2("��", "NOT NULL", "NULL") 
SELECT ename, salary, comm, nvl2(salary*12, salary*12, 0) A_salary
FROM employee
ORDER BY A_salary DESC;

--11. ������� �޿� �Ѿ� , ��վ�, �ְ��, �ּҾ��� ��� �ϼ���. �� �÷��� ���޿��Ѿס�, ����վ�, ���ְ�ס�, ���ּҾס����� ��Ī�̸����� ����ϼ���.
SELECT sum(salary) "�޿��Ѿ�", max(salary) "�ְ��" , min(salary) "�ּҾ�"
FROM employee;

--12. ���� ������ ������ ��� �ϼ���.  ����÷��� ������ ������ �������� ��Ī�̸����� ��� �ϼ���.
SELECT count(job)"���� ������ ����"
FROM (SELECT distinct job FROM employee);

SELECT count(distinct job)"���� ������ ����"
FROM emplyee;


-- 13.�� �μ��� ��� ������ ���ؼ� �μ���ȣ�� ��� ������ ��� �ϵ�  ���� ���μ���ȣ��, ����տ��ޡ� ���� ��Ī�̸����� ����ϼ���.
SELECT dno "�μ���ȣ", avg(salary) "��� ����"
FROM employee
GROUP BY dno;

-- 14. ��� ������ ������ ����� ���� ���Ͻÿ�. (���� , count �Լ� ���)

SELECT count(eno), job
FROM employee
GROUP BY job;

-- 15.     ���޺� ����� ���� �޿��� ����Ͻÿ�, �����ڸ� �˼� ���� ��� �� ���� �޿��� 2000 �̸��� �׷��� ���� ��Ű��
--    ����� �޿��� ���� ������������ �����Ͽ� ��� �ϼ���.

SELECT job, min(salary)
FROM employee
WHERE manager is not null
GROUP BY job
HAVING min(salary) > 2000
ORDER BY min(salary) DESC;

--16.  ���� ������ ����ؼ� �����ȣ�� 7788�� ����� �������� ���� ����� ��� �Ͻÿ�  <����̸�, ������> ��� �Ͻÿ�
SELECT ename ����̸�, job ������
FROM employee
WHERE job = (SELECT job FROM employee WHERE eno = 7788);

--17.  ���� ������ ����ؼ� �������� 7499 �� ������� �޿��� ���� ����� ��� �Ͻÿ�. <����̸�, ������> ��� �Ͻÿ�.
SELECT ename ����̸�, job ������
FROM employee
WHERE salary > (SELECT salary FROM employee WHERE eno = 7499);

--18. ���� ������ ����ؼ� �� �μ��� �ּ� �޿��� �޴� ����� �̸� , �޿�, �μ���ȣ�� ����Ͻÿ�.
SELECT ename, salary, dno
FROM employee
WHERE salary in (SELECT min(salary) FROM employee GROUP BY dno);


-- 19.���� ������ ����ؼ� �޿��� ��� �޿����� ���� ������� �����ȣ�� �̸��� ǥ���ϵ� ����� �޿��� ���ؼ� ������������ �����Ͻÿ�.
SELECT eno, ename
FROM employee
WHERE salary > (SELECT avg(salary) FROM employee)
ORDER BY salary asc;


-- 20.���� ������ ����ؼ� DEPT ���̺� �ִ� �μ��� DNAME �÷�����  ��RESEARCH�� �μ��� �μ���ȣ, ����̸� �� ��� ������ ǥ���Ͻÿ�.
SELECT d.dname, e.dno, e.ename, e.job
FROM employee e INNER JOIN dept d
ON e.dno = d.dno
WHERE e.dno in (SELECT dno FROM dept WHERE dname = 'RESEARCH');

