--1. �����ȣ, �̸�, ����, �޿�,  ���� �޿��� 15% ������ �޿���(New Salary),  ������(Increase)�� ���
SELECT empno, ename, job, sal, sal*1.15 as New_Salary, sal*0.15 as Increase
FROM emp;
?

?

--2. �̸�, �Ի���, �Ի��Ϸκ��� 6���� �Ŀ� ���ƿ��� �������� ���
SELECT ename, hiredate, next_day(add_months(hiredate, 6), '��') as the_day
FROM emp;
?

?

--3.�̸�, �Ի���, �Ի��Ϸκ��� ���������  ���, �޿�, �Ի��Ϸκ��� ��������� �޿��� �Ѱ踦 ���
SELECT ename, hiredate, round(months_between(sysdate,hiredate)/12)as year, sal, round(months_Between(sysdate,hiredate))*sal as total_sal
FROM emp;
?
--
?

--4.�̸�, ����, �Ի���, �Ի��� ������ ���
SELECT ename, job, hiredate, TO_CHAR(HIREDATE, 'day')as day
FROM emp;

?
--
?

--5. ������, �μ��� �޿� �հ�� �ο����� ����ϵ�, 
--10�� �μ��� �����ϰ� ������ ��SALESMAN���� ��MANAGER���� ����Ѵ�.
SELECT job, deptno, sum(sal) as sum, count(*) as employees
FROM emp
WHERE deptno !=10
GROUP by job, deptno
HAVING job in ('SALESMAN', 'MANAGER');
?

?

--6. �������� ��ձ޿��� �ִ�޿��� ����ϵ�, ��ձ޿��� 2000�̻��� �͸� ����ϰ� ��ձ޿��� ���� ������ ����
SELECT trunc(avg(sal),2)as avg_sal, max(sal)
FROM emp
GROUP BY job
HAVING avg(sal) >= 2000
order by avg(sal) desc;
?

?

--7. ���� �Ի�⵵ ���� �ο����� ���
SELECT TO_CHAR(HIREDATE, 'YY')as year, count(*) || '��' as employees
FROM emp
GROUP BY TO_CHAR(HIREDATE, 'YY');

--8. 5���� �޿��հ�� �ο����� ��� (rownum�̿�)
SELECT  trunc(rownum/5),sum(sal), count(*)
FROM emp
GROUP BY trunc(rownum/5) ;

-- �ٽ�!!!!!!!!!!!!!!!!!!!

--9. ������ ���� ���
--( ���� ��µ� �ο����� �ٸ� ���� ���� )
--CLERK  SALESMAN  MANAGER    (������)
-------------------------------------
--  4         5        3        (�ο���)?

SELECT count('CLERK') AS CLERK,count('SALESMAN') AS SALESMAN, count('MANAGER') AS MANAGER
FROM emp;

SELECT count(decode (job, 'CLERK',  1))as clerk, count (decode (job, 'SALESMAN', 1)) as salesman,
count (decode (job, 'MANAGER', 1)) as manager
FROM emp;
---�ϼ� �ؾ���!!

--10. ������ ���� ������, �μ��� ���
--( ���� ���� �ݾ��� �ٸ� ���� ���� )

/*
������          10���μ�           20���μ�           30���μ�            �޿��հ�
----------------------------------------------------------------------------------------
CLERK            1300               1900                 950             4150
SALESMAN           0                 0                  5600              5600
PRESIDENT        5000                0                   0               5000
MANAGER          2450                2975                2850             8275
ANALYST            0                6000                  0              6000
*/

SELECT JOB, decode(DEPTNO, 10, sal) '10���μ�', 
decode(DEPTNO, 20, sal) '20���μ�', 
decode(DEPTNO, 30, sal) '30���μ�', 
sum(
FROM emp
WHERE
GROUP BY JOB;

select job as ������,nvl(sum(decode(deptno,10,sal)),0) as "10���μ�", nvl(sum(decode(deptno,20,sal)),0) as "20���μ�" ,nvl(sum(decode(deptno,30,sal)),0) as "30���μ�", sum(sal) as �޿��հ�
from emp
group by job;


--������̺� (emp)�� ������ �μ����̺� (dept)�� �� ����� �μ����� ���
SELECT ename, dname
FROM emp, dept; 

-- ��������
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e, dept d
WHERE e.deptno =  d.deptno;

--(ǥ�ؾ� ���)
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e INNER JOIN dept d
ON e.deptno =  d.deptno;

-- �ܺ�����
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e, dept d
WHERE e.deptno =  d.deptno (+);

SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e, dept d
WHERE e.deptno(+) =  d.deptno;

--������ �Ұ�!!!!!!!!!!!!!!
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e, dept d
WHERE e.deptno(+) =  d.deptno(+);

--ǥ�ؾ� (������ (+)�� ����)
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno =  d.deptno;

--ǥ�ؾ� (���� (+)�� ����)
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e RIGHT OUTER JOIN dept d
ON e.deptno =  d.deptno;

-- ǥ�ؾ� ( ���� (+), ���� ������δ� �Ұ���)
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e FULL OUTER JOIN dept d
ON e.deptno =  d.deptno;
-- ���� �Ⱦ�


-- ������̺�(emp)�� �� ����� �Ŵ����� ��ȸ
SELECT e1.empno, e1.ename, e1.mgr, e2.empno mgr_EMPNO, e2.ename mgr_ENAME
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno;
--(��������) : �ΰ��� ���� �ִٰ� ����

--ǥ�ؾ�
SELECT e1.empno, e1.ename, e1.mgr, e2.empno mgr_EMPNO, e2.ename mgr_ENAME
FROM emp e1 INNER JOIN emp e2
on e1.mgr = e2.empno;

--�ܺ�����
SELECT e1.empno, e1.ename, e1.mgr, e2.empno mgr_EMPNO, e2.ename mgr_ENAME
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno (+);
--ǥ�ؾ�
SELECT e1.empno, e1.ename, e1.mgr, e2.empno mgr_EMPNO, e2.ename mgr_ENAME
FROM emp e1 LEFT OUTER JOIN emp e2
ON e1.mgr = e2.empno ;

---------------------------------------------
--[����]
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK'
    -- SMITH/ ADAMS/ JAMES/ MILLER
    
    UNION --(������) ��ġ�� �� ���� �� ��� -> UNION ALL!!!!!!
    

SELECT empno, ename, job, deptno FROM emp WHERE deptno=10;
    -- CLARK/ KING/ MILLER
    
--������
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK'
    -- SMITH/ ADAMS/ JAMES/ MILLER
    
    INTERSECT --(������)
    

SELECT empno, ename, job, deptno FROM emp WHERE deptno=10;
    -- CLARK/ KING/ MILLER
    
--������
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK'
    -- SMITH/ ADAMS/ JAMES/ MILLER
    
    MINUS --(������) A�� �ִ� �� B���� ���� ���
    

SELECT empno, ename, job, deptno FROM emp WHERE deptno=10;
    -- CLARK/ KING/ MILLER

-------------------------------------------------
--��������

--<< ���� ���� >>

--1. EMP ���̺��� �����ȣ, �̸�, ����, �μ���ȣ�� DEPT ���̺��� �μ���, �ٹ����� ���
SELECT e.empno, e.ename, e.job, e.deptno, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno (+);

SELECT e.empno, e.ename, e.job, e.deptno, d.dname, d.loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno;

?

--2. SALESMAN ����� �����ȣ, �̸�, �޿�, �μ���, �ٹ����� ���
SELECT e.empno, e.ename, e.sal, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno (+) and job like 'SALESMAN';

SELECT e.empno, e.ename, e.sal, d.dname, d.loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
WHERE job like 'SALESMAN';

?

--3. ���ʽ�(comm)�� �޴� ����� ���� �̸�, �μ���, ��ġ�� ���
SELECT e.ename, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno (+) and e.comm is not null;

SELECT e.ename, d.dname, d.loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
WHERE e.comm is not null;
??

--4. �μ��� �μ���� �޿� �հ踦 ���
SELECT d.dname, sum(e.sal) 
FROM dept d, emp e
WHERE d.deptno = e.deptno
GROUP BY d.dname;
--- �ٽ� Ȯ�� �ʿ�

??

-- 5. ������ ��MANAGER���� ����� ������ �̸�, ����, �μ���, �ٹ����� ��� 
SELECT e.ename, e.job, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno (+) and JOB like 'MANAGER';

SELECT e.ename, e.job, d.dname, d.loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
WHERE JOB like 'MANAGER';
