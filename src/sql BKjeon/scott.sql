-- �������
/*
    �̸�          name        varchar2(10)
    �ֹι�ȣ       jumin        char(15)
    ��ȭ��ȣ       tel          varchar2 (20)
    ����          gender        varchar2 (10)
    ����          age           number (3)
    �����         home        varchar2(20)

*/
-- CREATE 

CREATE TABLE info_tab
(
     name        varchar2(10),
     jumin        char(15),
     tel          varchar2 (20),
     gender        varchar2 (10),
     age           number (3),
     home        varchar2(20)
);
-- ���̺� ����Ȯ��
DESCRIBE    info_tab;


-- ������ Ȯ��
SELECT * FROM info_tab;



/*  ���̺�� : student_score

�й�      id          char(4)
�л���     name        varchar2(10)
����      kor         number(3)
����      eng         number(3)
����      totla       number
���      avg         number(5,2)     -- ���ڸ��� ��ü�ڸ���

*/

--���̺� ����
--CREATE TABLE table_name ( [column_name data_type] );
CREATE TABLE student_score
(
     id         char(4),
     name       varchar2(10),
     kor        number(3),
     eng        number(3),
     total      number,
     avg        number(5,2)
);

--���̺� ����
--DROP TABLE table_name [CASCADE CONSTRAINT];
DROP TABLE student_score;

-- ���̺� ���� Ȯ��
DESCRIBE student_score;

-- ���� �÷��� �߰�
-- ALTER TABLE table_name ADD ( [ column_name data_type ] );
ALTER TABLE student_score ADD (math number(3));

-- ���� �÷��� �����ϱ�
--ALTER TABLE table_name DROP ( [ column_name ] );
ALTER TABLE student_score DROP (total);

-- ��� �÷����� �Ҽ��� 1�ڷ� ����
--ALTER TABLE table_name MODIFY ( [ column_name data_type ] );
ALTER TABLE student_score MODIFY (avg NUMBER(4,1));

DESCRIBE student_score;


-- ������ �Է�
-- ���� : ' '

INSERT INTO student_score (id, name, kor, eng)
VALUES ('0001', 'ȫ�浿', 60, 80);

-- ������ �˻�
SELECT * FROM student_score;


-- 2000�� �й��� ȫ������ ����� ���������� ���� 60, 90���� ���� (�Է�)
INSERT INTO student_score (id, name, kor, eng)
VALUES ('2000', 'ȫ����', 60, 90);



commit;

--Ŀ�� �� �ܰ� ������ ���� �� �ִ�.
rollback;

-- 100�� �л� ȫ��� ������ ����
--INSERT INTO table_name( column_names ) VALUES ( values );
INSERT INTO student_score (id, name)
VALUES ('100', 'ȫ���');

-- �̸��� ȫ����� �л��� ���ڵ带 ����
--DELETE FROM table_name WHERE condition;
DELETE FROM student_score WHERE name='ȫ���';

--������ �˻�
SELECT * FROM student_score;

commit;

-- 0001�� �л��� ���� ������ 100���� �����ϱ�
-- UPDATE table_name SET column=value WHERE condition;

UPDATE student_score SET Kor=100 WHERE id='0001';

--������ �˻�
SELECT * FROM student_score;

commit;

--ȫ������ ���� ������ 90������ �Է� ( -> ����)

UPDATE student_score SET math=90 WHERE name='ȫ����';

SELECT * FROM student_score;

--�л����� ��� ���ϱ�
UPDATE student_score SET avg = (kor+eng+nvl(math,0))/3;

SELECT * FROM student_score;


CREATE TABLE emp_copy AS SELECT * FROM emp;

DESCRIBE emp_copy;

SELECt * FROM emp_copy;


-- 1. �����ȣ�� 7788�� ����� �μ��� 10������ ����
UPDATE emp_copy SET DEPTNO=10 WHERE EMPNO=7788;
SELECt * FROM emp_copy;

-- 2. �����ȣ�� 7782�� ����� �̸��� ȫ������� �����ϰ� �޿��� 3500���� ����
UPDATE emp_copy SET ENAME='ȫ���', SAL= 3500 WHERE EMPNO=7782;
SELECt * FROM emp_copy;

-- 3. ��� �μ����� ���ʽ��� 300�� �λ� ����
UPDATE emp_copy SET  COMM= nvl(COMM,0) + 300;
SELECt * FROM emp_copy;

-- 4. �����ȣ�� 7499�� ����� ������ ����
DELETE FROM emp_copy WHERE EMPNO=7499;
SELECt * FROM emp_copy;


-- 5. �Ի����ڰ� 81�� 6�� 1�� ������ ����� ������ ����
DELETE FROM emp_copy WHERE HIREDATE < '1981-06-01';
SELECt * FROM emp_copy;

DELETE FROM emp_copy;
SELECt * FROM emp_copy;

truncate;

rollback;
commit;

