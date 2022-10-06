--1. ����� ��L���ڰ� �ִ� ����� ���� �̸�, ����, �μ���, ��ġ�� ���
SELECT e.ename ename, e.job job, d.dname, dname, d.loc loc
FROM    emp e, dept d
WHERE   e.deptno = d.deptno AND e.ename like '%L%';
--GROUP BY
--HAVING
--ORDER BY

--ǥ�ؾ�
SELECT e.ename ename, e.job job, d.dname, dname, d.loc loc
FROM    emp e INNER JOIN dept d
ON  e.deptno = d.deptno 
WHERE e.ename like '%L%';

--2. �����ں��� ���� �Ի��� ����� ���� �̸�, �Ի���, ������ �̸�, ������ �Ի����� ���
SELECT e1.ENAME, e1.HIREDATE, e2.ENAME, e2.HIREDATE
FROM    emp e1, emp e2
WHERE   e1.mgr = e2.empno(+) AND e1.HIREDATE < e2.HIREDATE;

--ǥ�ؾ�
SELECT e1.ENAME, e1.HIREDATE, e2.ENAME, e2.HIREDATE
FROM    emp e1 LEFT OUTER JOIN emp e2
ON e1.mgr = e2.empno 
WHERE e1.HIREDATE < e2.HIREDATE;



--3. �Ʒ��� ����� ��� ( �����ڰ� ���� KING�� �����Ͽ� ��� ����� ��� )
--��� ����� �Ŵ������ �Ŵ�����
--7839 KING 
--7698 BLAKE 7839 KING 
--7782 CLARK 7839 KING
--: ���

SELECT e1.EMPNO , e1.ENAME , e2.EMPNO , e2.ENAME 
FROM    EMP e1, EMP e2 
WHERE   e1.mgr = e2.empno (+);

--ǥ�ؾ�
SELECT e1.EMPNO , e1.ENAME , e2.EMPNO , e2.ENAME 
FROM    EMP e1 LEFT OUTER JOIN EMP e2 
ON   e1.mgr = e2.empno;


?-----------------------------------------------------
-- ��������!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
--��ü ����� �� ��� �޿����� ���� �޿��� �޴� ����� ����� ��ȸ
-- ��� �޿� ���ϱ�
select round(avg(sal)) from emp;

-- �� ��� �޿����� ���� ��� ���� ��ȸ
select ename, sal from emp 
where sal < (select round(avg(sal)) from emp );

-- ������ ���� ���� ����� ���� ��ȸ
SELECT ename, sal
FROM  emp
WHERE sal = (select max(sal) from emp );

-- ��� �޿����� ���� �ִ� �޿����� ���� ������ �޴� ����� ������ ��ȸ
SELECT ename, sal
FROM  emp
WHERE sal > (select avg(sal) from emp )
AND sal < (select max(sal) from emp );

SELECT e.*
FROM emp e,
    (select avg(sal)avg , max(sal) max from emp) ext
WHERE e.sal > ext.avg AND e.sal < ext.max;

-- ���޼����� ���� 10���� ����� ���
SELECT ext.*
FROM(SELECT ename, sal from emp ORDER BY sal desc)ext
WHERE rownum < 11;

------------------------------------------------------
--<< �������� >>
--1. SCOTT�� �޿����� ���� ����� ������ �����ȣ, �̸�, ������, �޿��� ���

SELECT e.empno, e.ename, e.job, e.sal
FROM    emp e,
                (SELECT ename, sal FROM emp WHERE ename like 'SCOTT')s
WHERE   e.sal > s.sal;

SELECT empno, ename, job, sal
FROM    emp
WHERE   sal > (SELECT sal FROM emp WHERE ename like 'SCOTT');

--2. 30�� �μ��� �ּ� �޿����� ���μ��� �ּ� �޿��� ���� �μ��� ���
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
--3. �������� ��� �޿� �߿��� ���� ���� �޿��� ���� ������ ���
SELECT job, avg(sal)
FROM emp
WHERE job is not null
GROUP BY job
HAVING avg(sal) = (SELECT min(avg(sal)) FROM emp GROUP BY job);

?--4. �����ȣ�� 7521�� ������ ���� ��� 7934�� �������� �޿��� ���� �޴� ����� ������ ���
SELECT *
FROM emp
WHERE job in(SELECT job FROM emp WHERE empno =7521)
and sal > (SELECT sal FROM emp WHERE empno = 7934);

--- ���� Ǯ�������


?
--5. 'WARD'�� �μ��� ������ ���� ��� ��� ���
SELECT ename
FROM emp
WHERE job = (SELECT job FROM emp WHERE ename = 'WARD')
AND deptno = (SELECT deptno FROM emp WHERE ename = 'WARD');


-- Ǯ�������

----------------------------------------------------------------------------

--IN : ��ȯ�� ����� ������ ��
--ANY : �񱳿�����( >, >=, <, <=, =, !=(<>) ) �� ��ȯ�� ����� ������ ��
--ALL : �񱳿�����( >, >=, <, <=, =, !=(<>) ) �� ��ȯ�� ��� ��ϰ� ��
--EXISTS : ��� �� ���� ���� �����ϸ� true, �׷��� ������ false

-- �������� �ּ� �޿��� �޴� ����� ������ �����ȣ, �̸�, ������, �޿��� ���
SELECT empno, ename, job, sal
FROM    emp
WHERE (job, sal) in (SELECT job, min(sal) FROM emp GROUP BY job);

INSERT INTO emp(empno, ename, job, sal) VALUES(9999, '�׽�Ʈ', 'CLERK', 1250);

-- 10�� �μ� ������� ������ ������ ������ �˻�
SELECT ename, job
FROM    emp
WHERE job = ANY(SELECT job FROM emp WHERE deptno = 10); 
-- ANY �� ALL �� �� �Ⱦ���!!!!!!!!!!!!!!!!!!!!

SELECT ename, job
FROM    emp
WHERE job IN(SELECT job FROM emp WHERE deptno = 10); 

-- ��� �Ѹ��� ������κ��� ���� ���� �� �ִ� ����� ������ �����ȣ, �̸�, ������ ���
SELECT empno, ename, job
FROM emp e1
WHERE EXISTS (SELECT * FROM emp e2 WHERE e1.empno = e2.mgr);
-- FORD / BLAKE / KING / JONES / SCOTT / CLARK

--����� ���
SELECT empno, ename, job
FROM emp e1
WHERE NOT EXISTS (SELECT * FROM emp e2 WHERE e1.empno = e2.mgr);


-------------------------------------------------------------------------------
--(1) �μ��� �޿���� ���̺� ����

create table stat_salary ( 
stat_date date not null, -- ��¥
dept_no number, -- �μ�
emp_count number, -- �����
tot_salary number, -- �޿��Ѿ�
avg_salary number ); -- �޿����

DESC Stat_salary;

SELECT sysdate, deptno FROM emp GROUP BY deptno;

--(2) ��¥�� �μ���ȣ �Է�
INSERT INTO stat_salary(stat_date, dept_no) 
SELECT sysdate, deptno FROM emp GROUP BY deptno;

SELECT * FROM stat_salary;


--(3) �����, �޿��Ѿ�, ��ձ޿� �Է�(?) -> ����
SELECT count(*), sum(sal), round(avg(sal)) FROM emp GROUP BY deptno;

UPDATE stat_salary ss
SET ( EMP_count, tot_salary, avg_salary ) 
    = ( SELECT count(*), sum(sal), round(avg(sal))
    FROM emp e
    WHERE ss.dept_no = e.deptno
    GROUP BY deptno);
    
SELECT * FROM stat_salary;

CREATE TABLE emp_cp as select * from emp;

-- �μ����� 'SALES'�� ����� ������ ���� ( emp_cp )

DELETE FROM emp_cp
WHERE deptno = (SELECT deptno FROM dept WHERE dname = 'SALES');
 

