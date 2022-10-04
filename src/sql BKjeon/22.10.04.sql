
-- �����, �޿�, ����(�޿�/12) �� ����ϵ� ������ �ʴ������� �ݿø��Ͽ� ���
SELECT ename, sal, round(sal/12, -1) as wolgub
FROM emp;

-- �����, �޿�, ����(�޿��� 3.3%)�� ������ �����ϰ� ���
SELECT ename, sal, sal*0.033, trunc(sal* 0.033, -1) as TAX
FROM emp;

-- smith�� ������ �����ȣ, ����, ������(�ҹ���) ���
SELECT empno, ename, LOWER(job)
FROM emp
WHERE ename = 'SMITH';
--WHERE lower(ename) like lower ('smith'); �̶�� �ᵵ ��

-- �����ȣ, �����(ù���ڸ� �빮��), ������(ù���ڸ� �빮��)�� ���
SELECT empno, INITCAP(ename), INITCAP(job)
FROM emp;

-- �̸��� ù���ڰ� ��K������ ũ�� ��Y������ ���� ����� ����( �����ȣ, �̸�, ����, �޿�, �μ���ȣ)�� ����ϵ� �̸������� ����
SELECT empno, ename, job, DEPTNO
FROM emp
WHERE SUBSTR (ename, 1, 1)> 'K' and  SUBSTR (ename, 1, 1)<'Y'
order by ename asc;

--asc = ascendant
--desc = descendant

-- �̸��� 5���� �̻��� ������� ���
SELECT *
FROM emp
WHERE LENGTH(ename) >=5;

-- �޿��� 10�ڷ� ���߰� ���ڴ� �����ʿ� ���ʿ� ��-���� ä���
SELECT LPAD(sal, 10, '-')
FROM emp;

-- �̸��� 15�ڷ� ���߰� ���ڴ� ���ʿ� �����ʿ��� ��*���� ä���
SELECT RPAD (ename,15,'*')
FROM emp;



-----------------info_tab-----------------------------------

SELECT name, jumin, substr(jumin, 8, 1) gender, substr(jumin, 1, 2) year
FROM info_tab;

-- ���� ������ ����

select '-' || trim(' �̼��� ') || '-' as col1, 
        '-' || ltrim(' �̼��� ') || '-' as col2, 
        '-' || rtrim(' �̼��� ') || '-' as col3 from dual;
--���� �ʿ�
--(*) dual : dummy ���̺�� sys user�� owner�̰� ��� ����ڰ� ��밡��.
--������ ���� �˰��� �� ��� �����ϰ� ����ϴ� ���̺�.
SELECT sysdate
FROM dual;

-- �޿��� ���ڿ��� �������̻�����ĥ�ȱ��� ���ڷ� ��ü
SELECT sal, translate (sal, '0123456789', '�����̻�����ĥ�ȱ�') kor_sal
FROM emp;

-- �޿��� ���ڿ��� 0�� ��$���� �ٲپ� ���
SELECT sal, replace (sal, '0', '$') char_sal
FROM emp;

--****** �߿�!! �������� �ϱ�!!!! ���ʿ� �ִ� ������� ����!!
SELECT  '   ��   ��   ��   ' as ename
FROM dual;

SELECT replace ('    ��    ��    ��    ', ' ','') as ename
FROM dual;

-- ������� �ٹ��� ���� ���� ��� ������ ���
SELECT ename, hiredate - nvl(hiredate, sysdate), ceil (sysdate - hiredate) as "work day"
FROM emp
ORDER BY sysdate - hiredate desc;

SELECT ename, hiredate
FROM emp
ORDER BY sysdate - hiredate nulls last desc ;
-- �ذ� �ʿ�

-- ������� �ٹ��� ���� �� �� ��ĥ �ΰ��� ���
SELECT ename, hiredate, ceil ((sysdate - hiredate)/7) as "work week", ceil (sysdate - hiredate) as "work day"
FROM emp;

SELECT ename, sysdate-hiredate, trunc((sysdate-hiredate)/7) as weeks,
                                floor(mod(sysdate-hiredate, 7)) as day
FROM emp;
--ceil �� �Ҽ��� ����, floor �� �Ҽ� �� �Ʒ���


-- 10�� �μ��� ����� ��������� �ٹ� ������ ���
SELECT ename, hiredate,  floor(MONTHS_BETWEEN (sysdate, hiredate)) as WorkMonth
FROM emp
WHERE DEPTNO = 10;

SELECT ename, hiredate,  ceil(MONTHS_BETWEEN (sysdate, hiredate)) as WorkMonth
FROM emp
WHERE DEPTNO = 10;

-- floor �����ų�, ceil �ø��ų� (�Ҽ���)

-- ���� ��¥���� 3���� ���� ��¥ ���ϱ�
select add_months( sysdate, 3 ) as mydate from dual;


-- ���� ��¥���� ���ƿ��� ������������ ��¥ ���ϱ�
SELECT next_day (sysdate, '��') AS UpcomingMonday
FROM dual;


-- ���� ��¥���� �ش� ���� ������ ��¥ ���ϱ�
SELECT last_day (sysdate)
FROM dual;

-- �Ի����ڿ��� �Ի�⵵�� ���
SELECT ename, hiredate, to_char(hiredate, 'YYYY') AS hire_year
FROM emp;


-- �Ի����ڸ� ��1999�� 1�� 1�ϡ� �������� ���
SELECT ename, hiredate, TO_CHAR(hiredate, 'YYYY"��" MM"��" DD"��"') AS  "�Ի�����"
From emp;


-- 1981�⵵�� �Ի��� ��� �˻�
SELECT *
FROM emp
WHERE TO_Char (hiredate, 'YYYY') = 1981;

-- 5���� �Ի��� ��� �˻�
SELECT *
FROM emp
WHERE To_char (hiredate, 'MM') = 05;


-- �޿� �տ� $�� �����ϰ� 3�ڸ� ���� ,�� ���
SELECT ename, sal, TO_CHAR(sal, '$999,999,999,999,999') AS dollar
FROM emp;

--81�� 2���� �Ի��� ��� �˻�
SELECT *
FROM emp
WHERE TO_CHAR (hiredate, 'YYYYMM') = '198102';

--81�⿡ �Ի����� ���� ��� �˻�
SELECT *
FROM emp
WHERE TO_Char  (hiredate, 'YYYY') != 1981;

--81�� �Ϲݱ⿡ �Ի��� ��� �˻�
SELECT *
FROM emp
WHERE TO_Char (hiredate, 'YYYYMM') >= 198107
        and TO_CHAR (hiredate, 'YYYYMM') <= 198112;
        
SELECT *
FROM emp
WHERE TO_Char (hiredate, 'YYYY') = 1981
    and TO_CHAR (hiredate, 'MM') >= 7;

-- �ֹι�ȣ���� ���� ���ϱ�
SELECT decode(substr(jumin, 8, 1), '1', '����', '3', '����', '����') AS gender 
FROM info_tab;

SELECT CASE substr( jumin, 8, 1) 
WHEN '1' THEN '����'
WHEN '3' THEN '����'
ELSE '����'
END as gender
FROM info_tab;

-- �μ���ȣ�� 10�̸� ������, 20�̸� ������, 30�̸� IT�� �� �ܴ� ����η� ���
SELECT decode(substr(deptno, 1, 2), '10', '������', '20', '������', '30', 'IT��', '�����') AS department 
FROM emp;

SELECT CASE substr(deptno, 1, 2)
WHEN '10' THEN '������'
WHEN '20' THEN '������'
WHEN '30' THEN 'IT��'
ELSE '�����'
END as department
FROM emp;

-- ����(job)�� analyst�̸� �޿� ������ 10%�̰� clerk�̸� 15%, manager�̸� 20%�� ��� �����ȣ, �����, ����, �޿�, ������ �޿��� ���

SELECT empno, ename, job, sal, decode(substr(job, 1,1), 'A', sal*1.1, 'C', sal*1.15, 'M', sal*1.2) as "�޿�"
FROM emp;

SELECT empno, ename, job, sal, decode(job, 'ANALYST', sal*1.1, 'CLERK', sal*1.15, 'MANAGER', sal*1.2, sal)
FROM emp;

SELECT CASE  substr(job, 1, 1)
WHEN 'A' THEN sal*1.1
WHEN 'C' THEN sal*1.15
WHEN 'm' THEN sal*1.2
ELSE sal
END as increased_sal
FROM emp;

SELECT empno, ename, job, sal, CASE job
WHEN 'ANALYST' THEN sal*1.1
WHEN 'CLERK' THEN sal*1.15
WHEN 'MANAGER' THEN sal*1.2
ELSE sal
END as increased_sal
FROM emp;

--------------------------------------------------------------------------

--4. �׷�
--(1) ALL, DISTINCT //��ġ�°� 

select all job from emp;
select distinct job from emp;

desc emp;
select rownum, empno, ename, job from emp;

--rownum -> ����� ��ȣ ���� ���� // ����Ŭ���� ����

select rownum, empno, ename, job 
from emp
where rownum <=5;

-- ������ ��SALESMAN���� ������� ������ ���, ����, �ּҰ�, �ִ밪�� ���ϱ�
SELECT avg(sal) avg, sum (sal) sum, min(sal) min, max(sal) max
FROM    emp
WHERE job = 'SALESMAN';

INSERT INTO emp(empno, ename, job)
VALUES(9001, 'ȫ�汹', 'SALESMAN');

select* from emp;

-- Ŀ�̼�(COMM)�� �޴� ������� ����
SELECT count(comm)AS count
FROM emp
WHERE comm is not null
and comm != 0;

SELECT count(comm)
FROM emp
WHERE comm >0;

-----------------------------------------------------------------
-- �μ����� �ο���, ��ձ޿�, �����޿�, �ְ�޿�, �޿��� ���� ���ϱ�
SELECT deptno, count(*), avg(sal), min(sal), max(sal), sum(sal)
FROM emp
--WHERE
GROUP BY deptno; 
--HAVING

--!!!!!!!group by �� ���� ����, ��� �÷���, �׷����ϴ� �÷��� �����Լ��� ����!!
--�߿�!!!!!!! ex) ename, empno �� �� select �� �� �� ����

-- �μ����� �ο���, ��ձ޿�, �����޿�, �ְ�޿�, �޿��� ���� ���ϱ� ( �μ��� �޿��� ���� ���� ������)
SELECT deptno, count(*), avg(sal), min(sal), max(sal), sum (sal)
FROM emp
GROUP BY deptno
ORDER BY sum(sal) asc;

-- �޿��� ���� ���� ������


-- �μ��� ������ �׷��Ͽ� �μ���ȣ, ����, �ο���, �޿��� ���, �޿��� ���� ���ϱ�
SELECT deptno, job, count(*), avg(sal), sum(sal)
FROM    emp
--WHERE
GROUP BY deptno, job;
--HAVING

-- �ִ� �޿��� 2900 �̻��� �μ��� ���� �μ���ȣ, ��� �޿�, �޿��� ���� ���

SELECT deptno, avg(sal), sum(sal)
FROM emp
GROUP BY deptno
HAVING 2900 <= max(sal);

-- ������ �޿��� ����� 3000�̻��� ������ ���� ������, ��� �޿�, �޿��� ���� ���
SELECT job, avg(sal), sum(sal)
FROM emp
GROUP BY job
HAVING 3000 <= avg(sal);


-- ��ü �հ� �޿��� 5000�� �ʰ��ϴ� �� ������ ���ؼ� ������ �޿� �հ踦 ��� ��, SALESMAN�� �����ϰ� �޿� �հ谡 ���� ������ ����
SELECT job, sum(sal)
FROM emp
WHERE job!= 'SALESMAN'
GROUP BY job
HAVING 5000 < sum(sal)
ORDER BY sum(sal) desc;

-- ������ �ְ� �޿��� �ּ� �޿��� ���̸� ���϶�
SELECT job, max(sal)-min(sal) AS SAL_GAB
FROM emp
GROUP BY job;



-- �μ� �ο��� 4�� ���� ���� �μ��� �μ���ȣ, �ο���, �޿��� ���� ���
SELECT deptno, count(*), sum(sal)
FROM emp
GROUP BY deptno
HAVING count(*) > 4;

