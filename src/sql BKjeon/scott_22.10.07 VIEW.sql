--7. �� (VIEW) : ���� ���̺�

-- ������ ����

-- ������ ������ ���󵵰� ���� ���

CREATE OR REPLACE VIEW v_emp AS
            SELECT empno, ename, deptno FROM emp;
            
SELECT * FROM v_emp;
DESCRIBE v_emp;

INSERT INTO v_emp VALUES (1000, 'ȫ�浿', 20);
--view ����������, �б������� �ƴϱ� ������, �������� ������ ��ħ

SELECT * FROM v_emp;
SELECT * FROM emp;

INSERT INTO v_emp VALUES (1000, 'ȫȫ��', 20); --

INSERT INTO v_emp VALUES (2000, 'ȫȫ��', 90); --
--foreign key �� �ɸ�

CREATE OR REPLACE VIEW v_emp AS
        SELECT empno, ename, deptno from emp
        WITH READ ONLY;
        --���� �ȵǴ� �б� �������� �����
        
INSERT INTO v_emp VALUES (1000, 'ȫȫ��', 30);

--(2) read-only ��
CREATE OR REPLACE VIEW v_emp_30 AS
        SELECT empno EMP_NO, ename NAME, sal SALARY 
        FROM emp
        WHERE deptno = 30
        WITH READ ONLY;
        
SELECT * FROM v_emp_30;

--(3) ���պ�
Create or replace view v_emp_info as
select e.empno empno, e.ename ename, d.dname dname 
from emp e, dept d
where e.deptno=d.deptno;

SELECT * FROM v_emp_info;

INSERT INTO v_emp_info(empno, ename, dname) VALUES (3333, '�Ͳ���', 30);
--�б������� �ƴԿ���, insert�� �� �� ���� ������, �䰡 2���� ���̺��� �����ؼ� ���� ���� ����
-- 2���� ���̺� ���ÿ� �Է��� �� ����
INSERT INTO v_emp_info(empno, ename) VALUES (3333, '�Ͳ���');
--empno, ename �� emp ���̺��� �ִ� ������ ������, �Է� Ȥ�� ���� ����

DELETE FROM v_emp_info WHERE empno=7788;
-- view ���� ������, �������� �ش� ���� ���� ��!

-- [ ���� ] �μ����� �μ���, �ּұ޿�, �ִ� �޿�, �μ��� ��� �޿��� �����ϴ� 
--V_DEPT_SUM �並 �����Ͽ���.

Create or replace view V_DEPT_SUM as
select d.dname dname, min(sal) min, max(sal) max, avg(e.sal) avg
from emp e, dept d
WHERE e.DEPTNO = d.deptno
GROUP BY dname
WITH READ ONLY;

SELECT * FROM V_DEPT_SUM;

INSERT INTO emp(empno, ename, sal, deptno) VALUES (4444, 'ȣ��', 9900, 20);
-- �䰡 �ƴ� �������̺� ����(�߰�,����)�� �ص� �信 ������ �޶���!!


--8. ������ (sequence) : �ڵ�������

CREATE  SEQUENCE    seq_temp;
SELECT seq_temp.NEXTVAL FROM DUAL;
-- NEXTVAL : ���� ������ ������ ��

SELECT seq_temp.CURRVAL FROM DUAL;
-- CURRVAL : ���� ������ ��

-- 5000������ 10�� �����ϴ� �ڵ������� (������)
CREATE  SEQUENCE   seq_temp2
start with 5000 increment by 10;

--emp ���̺� �Է� �� Ȯ��
INSERT INTO emp (empno, ename) VALUES (seq_temp2.NEXTVAL, '�ھ�');

-- 9. �ε��� (INDEX) - ���� �˻��� ����
DESC EMP;
SELECT empno, ename, job, rowid from emp;
--rowid ��°� ����Ŭ���� ����, ������ ����ٰ� ������ �ƴ�, ���� ���� �ϴ� ���� ���ϴ°� ����

--���η� �ε��� �÷��� ROWID ������ �����ϰ� �� ������ ���� ã�� ���� ���̺� �ִ� �����͸� �˻�
--���̺� ���ο� ���� �Էµǰų� ���� ���ŵǸ� �ε��� ������ ���ŵȴ�.
--�ʹ� ���� �ε����� ���̺��� �����Ͱ� ���� ���� ������ ����
--PRIMARY KEY�� UNIQUE KEY�� �ڵ����� UNIQUE INDEX�� �ڵ� ����


------
SELECT e.empno, e.ename, e.sal, d.dname, e.job
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
WHERE d.deptno = 20;

select e.empno, e.ename, e.sal, d.dname, d.loc
from emp e inner join dept d
on e.deptno = d.deptno
where d.deptno = 20;
