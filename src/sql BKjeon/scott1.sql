-- 8000�� ������� <�����̸�>�� �޿� $10000�� ���� �ϼ���.

--INSERT INTO table_name( column_names ) VALUES ( values );

INSERT INTO emp (empno, ename, sal) VALUES (8000, '������', 10000);

SELECT * FROM emp;


-- 7788�� ������� <�����̸�>�� �޿� $10000�� ���� �ϼ���.

--UPDATE table_name SET column=value WHERE condition;

INSERT INTO emp (empno, ename, sal, deptno) VALUES (8001, 'ȫ�汹', 10000, 20);

SELECT * FROM emp;

-- (#)
INSERT INTO emp (empno, ename, sal, deptno) VALUES (8002, 'ȫ�浿', 10000, 50);

SELECT * FROM emp;

-----------------------------------------------------------------------
--INSERT INTO table_name( column_names ) VALUES ( values );
INSERT INTO info_tab(tel,name,jumin,gender,age,home)
VALUES('032','ȫ��','801212','����',33,'����');

SELECT * FROM info_tab;

INSERT INTO info_tab(tel,name) VALUES('1001','ȫ�浿');

INSERT INTO info_tab(tel,name) VALUES('1002','��浿');

INSERT INTO info_tab(tel,name) VALUES('1002','�Ѹ�');

INSERT INTO info_tab(name, jumin) VALUES('��浿','901212-1234567');

INSERT INTO info_tab(gender, age) VALUES('����',22);

INSERT INTO info_tab(name, tel, gender, age) VALUES('�ֱ���',9999,'����',22);

DELETE FROM info_tab;

SELECT * FROM info_tab;

--Primay key(PK) �� ���� �ֱ�
ALTER TABLE info_tab
ADD CONSTRAINT pk_info_tel PRIMARY KEY (tel);
--pk_tablename_columnname �Ǵ� tablename_columnname_pk �̸�����

DELETE FROM info_tab;
Drop Table info_tab;
commit;

CREATE TABLE info_tab
(
     name        varchar2(10),
     jumin        char(15),
     tel          varchar2 (20),
     gender        varchar2 (10),
     age           number (3),
     home        varchar2(20),
     CONSTRAINT pk_info_tel PRIMARY KEY (tel)
);

--���̺� ���� �ֱ� ����, ����
ALTER TABLE info_tab MODIFY (name varchar2(10) not null);

ALTER TABLE info_tab ADD CONSTRAINT uq_info_jumin UNIQUE (jumin);

INSERT INTO info_tab(tel, name, jumin) VALUES ('20001','ȫ����','990101');
INSERT INTO info_tab(tel, name, jumin) VALUES ('20002','ȫ����','990101');
INSERT INTO info_tab(tel, name) VALUES ('20003','ȫ����');

ALTER TABLE info_tab
ADD CONSTRAINT ck_info_gender CHECK (gender in ('����', '����') );

INSERT INTO info_tab(tel, name, gender) VALUES('10001','ȫ����','����');
INSERT INTO info_tab(tel, name, gender) VALUES('10001','ȫ����','����');
--�ȵ� -> ������ constraint �� ����, ������ �Է� �����ϱ� ����
INSERT INTO info_tab(tel, name, gender) VALUES('30001','ȫ����','����');

ALTER TABLE info_tab
MODIFY (gender varchar2(6) default '����');
--���� �ڸ��� ���, ������ ���� �������� �ڵ����� ��

INSERT INTO info_tab(tel, name) VALUES('7777','ȫ��');

INSERT INTO info_tab( name, tel, jumin ) 
VALUES('������', '02-777-4444', '990909-1234567');

INSERT INTO info_tab( name, tel, jumin, gender, age, home )
VALUES('������','03-555-5555', '880808-1234567', '����', 27,'���');
--������ ���ڰ� �ƴ� ������ ���;���

INSERT INTO info_tab( name, tel, jumin, gender, age, home )
VALUES('ȫ�浿','03-031-0310', '900909-1234567', '����', 27,'���');

INSERT INTO info_tab( name, jumin) VALUES('ȫ����', '550505-1234567');
-- pk�� ��ȭ��ȣ�� ����

INSERT INTO info_tab( tel, jumin ) VALUES('031-777-7777', '700707-1234567');
-- not null �� �̸��� ����

INSERT INTO info_tab( name, tel, jumin ) 
VALUES('������', '031-000-0000', '700707-1234567');

Drop table info_tab;

CREATE TABLE info_tab
(
     name        varchar2(10) NOT NULL,
     jumin        char(15),
     tel          varchar2 (20),
     gender        varchar2 (10) DEFAULT '����',
     age           number (3),
     home        varchar2(20),
     deptno        number(2),
     CONSTRAINT pk_info_tel PRIMARY KEY (tel),
     CONSTRAINT uq_info_jumin UNIQUE (jumin),
     CONSTRAINT ck_info_gender CHECK (gender IN ('����','����')),
     CONSTRAINT fk_info_deptno FOREIGN KEY (deptno) REFERENCES dept(deptno)
     --foreign key (������ �� �� �̸�) references ��� ������ (��� ������ ������)
);

INSERT INTO info_tab(tel, name, deptno) VALUES('7777','����',20);
INSERT INTO info_tab(tel, name, deptno) VALUES('8888','����',22);
INSERT INTO info_tab(tel, name) VALUES('9999','����');



-- unique : �ȳ־ ��� ������, �ߺ��� �ȵ� (like �ֹι�ȣ)
-- not null : �� �״�� null �� ��� ���� ����! ������ �־�� �ϴ� �� (like �̸�)
-- primary key :unique + not null -> ������ �����ؾ� �ϸ�, �ߺ� �ȵ� (like ����)
-- default : ���� �ȳ����� ������ ������ �Է�



--��������
--1. sawon ���̺��� �����ϼ���.
--sabun�� 6�ڸ� ����
--sawon_name�� �ִ� �ѱ� 5�ڸ�
--ubmu�� �ִ� �ѱ� 10�ڸ�
--weolgub�� ������ 8�ڸ��� �Ҽ��� 2�ڸ�
--buseo�� ���� 3�ڸ�

CREATE TABLE sawon
(
     sawon_name  varchar2(15),
     sabun          number(6),
     ubmu         varchar2(30),
     weolgub        number(10, 2),
     buseo          number(3)
     --CONSTRAINT pk_info_tel PRIMARY KEY (tel),
     --CONSTRAINT uq_info_jumin UNIQUE (jumin),
     -- CONSTRAINT ck_info_gender CHECK (gender IN ('����','����')),
     --CONSTRAINT fk_info_deptno FOREIGN KEY (deptno) REFERENCES dept(deptno)
     --foreign key (������ �� �� �̸�) references ��� ������ (��� ������ ������)
);

--2. ���� ���̺��� sabun�� �⺻Ű�� ����
ALTER TABLE sawon
ADD CONSTRAINT pk_sawon_sabun PRIMARY KEY (sabun);

--3. �ִ� �ѱ� 10�ڸ��� jiyeok �÷��� �߰��ϵ� NULL ���� �Էµ��� �ʵ��� ����
ALTER TABLE sawon
ADD (jiyeok varchar2(30));

ALTER TABLE sawon MODIFY (jiyeok varchar2(30) NOT NULL);

--4. weolgub �÷��� ������ 7�ڸ��� ����

ALTER TABLE sawon MODIFY (weolgub number(7));

--5. ubmu�÷��� �����ߡ�, ������������, �������� �� ������ ������ �Էµǵ��� ����
ALTER TABLE sawon
ADD CONSTRAINT ck_sawon_ubmu CHECK (ubmu in ('����', '��������','����') );

--6. ubmu�÷��� �����Ͱ� �Է��� �ȵ� ��� �����尪���� �����ߡ��� ����
ALTER TABLE sawon
MODIFY (ubmu varchar2(30) default '����');

--7. buseo ���̺��� �����ϼ���
--buseo_no�� ���� 3�ڷ� �̷���� ��ȣ�� �⺻Ű
--buseo_name�� �ִ� �ѱ� 10�ڸ�

CREATE TABLE buseo
(
     buseo_no       number(3),
     buseo_name     varchar2(30),
     CONSTRAINT pk_buseo_no PRIMARY KEY (buseo_no)
     --CONSTRAINT uq_info_jumin UNIQUE (jumin),
     -- CONSTRAINT ck_info_gender CHECK (gender IN ('����','����')),
     --CONSTRAINT fk_info_deptno FOREIGN KEY (deptno) REFERENCES dept(deptno)
     --foreign key (������ �� �� �̸�) references ��� ������ (��� ������ ������)
);

--8. sawon ���̺��� buseo �÷��� buseo ���̺��� buseo_no�� �����ϴ� �ܷ�Ű�� ����
ALTER TABLE sawon
ADD CONSTRAINT fk_sawon_buseo FOREIGN KEY (buseo) REFERENCES buseo(buseo_no);

--9. buseo ���̺� ������ �Է�
INSERT INTO buseo(buseo_no, buseo_name) VALUES (101, '����Ʈ��������������');
INSERT INTO buseo(buseo_no, buseo_name) VALUES (202, '������');
INSERT INTO buseo(buseo_no, buseo_name) VALUES (303, '�����ڿ���');

--10. sawon ���̺� ������ �Է� (�Է��� �ȵ� ��쵵 ����)

INSERT INTO sawon(sabun, sawon_name, weolgub, buseo, jiyeok)  
VALUES (8001, 'ȫ�浿�̱�', 100000, 101, '�λ�');


INSERT INTO sawon(sabun, sawon_name, ubmu, weolgub, buseo, jiyeok)  
VALUES (8002, 'ȫ����', '�繫', 200000, 202, '��õ');
--�Է� �ȵ� -> ceck �����̳�, ��������, ������ �ƴ� �繫�� �ȵ�

INSERT INTO sawon(sabun, sawon_name, ubmu, buseo, jiyeok)  
VALUES (8003, 'ȫ���', '����', 111, '����');
--�Է� �ȵ� -> 111�̶�� �μ��� ����, 101,202,303 �μ��� ����

INSERT INTO sawon(sabun, sawon_name, weolgub, jiyeok)  
VALUES (8004, 'ȫ�漮', 12345678, '����');
--�Է� �ȵ� -> ������ �ʹ� �� (���� 7�ڸ�����) ������ 8�ڸ�

INSERT INTO sawon(sabun, sawon_name, ubmu, buseo, jiyeok)  
VALUES (8005, 'ȫ��ö', '��������', 303, '�Ǳ�');

--11. sawon ���̺��� jiyeok �÷��� ����
ALTER TABLE sawon DROP (jiyeok);

--12. buseo ���̺��� buseo ���� �������ڿ��Ρ��� ���� ����
DELETE FROM sawon WHERE buseo = 303;
DELETE FROM buseo WHERE buseo_name = '�����ڿ���';
--foreign key �������� ���� ���� �� ���� (����)

--13. sawon ���̺��� ��� ������ �����ϰ� ��������� ����
truncate TABLE sawon;
DROP TABLE sawon;

--14. 1~8 �ܰ������ ������ ���̺��� ���� �ϳ��� CREATE ������ �ۼ�
DESCRIBE  sawon;

CREATE TABLE sawon
(
     sawon_name  varchar2(15),
     sabun          number(6),
     ubmu         varchar2(30) DEFAULT '����',
     weolgub        number(7),
     buseo          number(3),
     jiyeok         varchar2(30) NOT NULL,
     
     CONSTRAINT pk_sawon_sabun PRIMARY KEY (sabun),
     --CONSTRAINT uq_info_jumin UNIQUE (jumin),
     CONSTRAINT ck_sawon_ubmu CHECK (ubmu IN ('����','��������','����')),
     CONSTRAINT fk_sawon_buseo FOREIGN KEY (buseo) REFERENCES buseo(buseo_no)
     --foreign key (������ �� �� �̸�) references ��� ������ (��� ������ ������)
);

SELECT * FROM sawon;

