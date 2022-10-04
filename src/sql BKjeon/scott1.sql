-- 8000번 사원으로 <본인이름>과 급여 $10000를 저장 하세요.

--INSERT INTO table_name( column_names ) VALUES ( values );

INSERT INTO emp (empno, ename, sal) VALUES (8000, '전병욱', 10000);

SELECT * FROM emp;


-- 7788번 사원으로 <본인이름>과 급여 $10000를 저장 하세요.

--UPDATE table_name SET column=value WHERE condition;

INSERT INTO emp (empno, ename, sal, deptno) VALUES (8001, '홍길국', 10000, 20);

SELECT * FROM emp;

-- (#)
INSERT INTO emp (empno, ename, sal, deptno) VALUES (8002, '홍길동', 10000, 50);

SELECT * FROM emp;

-----------------------------------------------------------------------
--INSERT INTO table_name( column_names ) VALUES ( values );
INSERT INTO info_tab(tel,name,jumin,gender,age,home)
VALUES('032','홍자','801212','남자',33,'제주');

SELECT * FROM info_tab;

INSERT INTO info_tab(tel,name) VALUES('1001','홍길동');

INSERT INTO info_tab(tel,name) VALUES('1002','김길동');

INSERT INTO info_tab(tel,name) VALUES('1002','둘리');

INSERT INTO info_tab(name, jumin) VALUES('김길동','901212-1234567');

INSERT INTO info_tab(gender, age) VALUES('남자',22);

INSERT INTO info_tab(name, tel, gender, age) VALUES('최기태',9999,'남자',22);

DELETE FROM info_tab;

SELECT * FROM info_tab;

--Primay key(PK) 로 제약 주기
ALTER TABLE info_tab
ADD CONSTRAINT pk_info_tel PRIMARY KEY (tel);
--pk_tablename_columnname 또는 tablename_columnname_pk 이름설정

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

--테이블 제어 넣기 위해, 수정
ALTER TABLE info_tab MODIFY (name varchar2(10) not null);

ALTER TABLE info_tab ADD CONSTRAINT uq_info_jumin UNIQUE (jumin);

INSERT INTO info_tab(tel, name, jumin) VALUES ('20001','홍실이','990101');
INSERT INTO info_tab(tel, name, jumin) VALUES ('20002','홍동이','990101');
INSERT INTO info_tab(tel, name) VALUES ('20003','홍실이');

ALTER TABLE info_tab
ADD CONSTRAINT ck_info_gender CHECK (gender in ('남성', '여성') );

INSERT INTO info_tab(tel, name, gender) VALUES('10001','홍돌이','남성');
INSERT INTO info_tab(tel, name, gender) VALUES('10001','홍숙이','남자');
--안됨 -> 이유는 constraint 에 남성, 여성만 입력 가능하기 때문
INSERT INTO info_tab(tel, name, gender) VALUES('30001','홍숙이','여성');

ALTER TABLE info_tab
MODIFY (gender varchar2(6) default '남성');
--젠더 자리가 비면, 디폴드 값인 남성으로 자동으로 들어감

INSERT INTO info_tab(tel, name) VALUES('7777','홍이');

INSERT INTO info_tab( name, tel, jumin ) 
VALUES('갑순이', '02-777-4444', '990909-1234567');

INSERT INTO info_tab( name, tel, jumin, gender, age, home )
VALUES('갑갑이','03-555-5555', '880808-1234567', '남자', 27,'경기');
--젠더에 남자가 아닌 남성이 들어와야함

INSERT INTO info_tab( name, tel, jumin, gender, age, home )
VALUES('홍길동','03-031-0310', '900909-1234567', '남성', 27,'경기');

INSERT INTO info_tab( name, jumin) VALUES('홍길자', '550505-1234567');
-- pk인 전화번호가 없음

INSERT INTO info_tab( tel, jumin ) VALUES('031-777-7777', '700707-1234567');
-- not null 인 이름이 없음

INSERT INTO info_tab( name, tel, jumin ) 
VALUES('갑동이', '031-000-0000', '700707-1234567');

Drop table info_tab;

CREATE TABLE info_tab
(
     name        varchar2(10) NOT NULL,
     jumin        char(15),
     tel          varchar2 (20),
     gender        varchar2 (10) DEFAULT '남성',
     age           number (3),
     home        varchar2(20),
     deptno        number(2),
     CONSTRAINT pk_info_tel PRIMARY KEY (tel),
     CONSTRAINT uq_info_jumin UNIQUE (jumin),
     CONSTRAINT ck_info_gender CHECK (gender IN ('남성','여성')),
     CONSTRAINT fk_info_deptno FOREIGN KEY (deptno) REFERENCES dept(deptno)
     --foreign key (가지고 올 곳 이름) references 어디에 넣을지 (어디서 가지고 오는지)
);

INSERT INTO info_tab(tel, name, deptno) VALUES('7777','맹이',20);
INSERT INTO info_tab(tel, name, deptno) VALUES('8888','꽁이',22);
INSERT INTO info_tab(tel, name) VALUES('9999','꽁이');



-- unique : 안넣어도 상관 없지만, 중복은 안됨 (like 주민번호)
-- not null : 말 그대로 null 값 허용 하지 않음! 무조건 넣어야 하는 값 (like 이름)
-- primary key :unique + not null -> 무조건 존재해야 하며, 중복 안됨 (like 폰번)
-- default : 값을 안넣으면 디폴드 값으로 입력



--연습문제
--1. sawon 테이블을 생성하세요.
--sabun은 6자리 숫자
--sawon_name은 최대 한글 5자리
--ubmu는 최대 한글 10자리
--weolgub는 정수형 8자리와 소수점 2자리
--buseo는 숫자 3자리

CREATE TABLE sawon
(
     sawon_name  varchar2(15),
     sabun          number(6),
     ubmu         varchar2(30),
     weolgub        number(10, 2),
     buseo          number(3)
     --CONSTRAINT pk_info_tel PRIMARY KEY (tel),
     --CONSTRAINT uq_info_jumin UNIQUE (jumin),
     -- CONSTRAINT ck_info_gender CHECK (gender IN ('남성','여성')),
     --CONSTRAINT fk_info_deptno FOREIGN KEY (deptno) REFERENCES dept(deptno)
     --foreign key (가지고 올 곳 이름) references 어디에 넣을지 (어디서 가지고 오는지)
);

--2. 위의 테이블에서 sabun을 기본키로 설정
ALTER TABLE sawon
ADD CONSTRAINT pk_sawon_sabun PRIMARY KEY (sabun);

--3. 최대 한글 10자리의 jiyeok 컬럼을 추가하되 NULL 값이 입력되지 않도록 지정
ALTER TABLE sawon
ADD (jiyeok varchar2(30));

ALTER TABLE sawon MODIFY (jiyeok varchar2(30) NOT NULL);

--4. weolgub 컬럼은 정수형 7자리로 변경

ALTER TABLE sawon MODIFY (weolgub number(7));

--5. ubmu컬럼은 ‘개발’, ‘유지보수’, ‘관리’ 만 데이터 값으로 입력되도록 지정
ALTER TABLE sawon
ADD CONSTRAINT ck_sawon_ubmu CHECK (ubmu in ('개발', '유지보수','관리') );

--6. ubmu컬럼에 데이터가 입력이 안될 경우 디폴드값으로 ‘개발’을 설정
ALTER TABLE sawon
MODIFY (ubmu varchar2(30) default '개발');

--7. buseo 테이블을 생성하세요
--buseo_no는 숫자 3자로 이루어진 번호로 기본키
--buseo_name은 최대 한글 10자리

CREATE TABLE buseo
(
     buseo_no       number(3),
     buseo_name     varchar2(30),
     CONSTRAINT pk_buseo_no PRIMARY KEY (buseo_no)
     --CONSTRAINT uq_info_jumin UNIQUE (jumin),
     -- CONSTRAINT ck_info_gender CHECK (gender IN ('남성','여성')),
     --CONSTRAINT fk_info_deptno FOREIGN KEY (deptno) REFERENCES dept(deptno)
     --foreign key (가지고 올 곳 이름) references 어디에 넣을지 (어디서 가지고 오는지)
);

--8. sawon 테이블의 buseo 컬럼을 buseo 테이블의 buseo_no를 참조하는 외래키로 설정
ALTER TABLE sawon
ADD CONSTRAINT fk_sawon_buseo FOREIGN KEY (buseo) REFERENCES buseo(buseo_no);

--9. buseo 테이블에 데이터 입력
INSERT INTO buseo(buseo_no, buseo_name) VALUES (101, '소프트웨어유지보수부');
INSERT INTO buseo(buseo_no, buseo_name) VALUES (202, '관리부');
INSERT INTO buseo(buseo_no, buseo_name) VALUES (303, '인적자원부');

--10. sawon 테이블에 데이터 입력 (입력이 안될 경우도 있음)

INSERT INTO sawon(sabun, sawon_name, weolgub, buseo, jiyeok)  
VALUES (8001, '홍길동이군', 100000, 101, '부산');


INSERT INTO sawon(sabun, sawon_name, ubmu, weolgub, buseo, jiyeok)  
VALUES (8002, '홍길자', '사무', 200000, 202, '인천');
--입력 안됨 -> ceck 개발이나, 유지보수, 관리가 아닌 사무라서 안됨

INSERT INTO sawon(sabun, sawon_name, ubmu, buseo, jiyeok)  
VALUES (8003, '홍길순', '개발', 111, '대전');
--입력 안됨 -> 111이라는 부서는 없음, 101,202,303 부서만 존재

INSERT INTO sawon(sabun, sawon_name, weolgub, jiyeok)  
VALUES (8004, '홍길석', 12345678, '서울');
--입력 안됨 -> 월급이 너무 긺 (숫자 7자리까지) 지금은 8자리

INSERT INTO sawon(sabun, sawon_name, ubmu, buseo, jiyeok)  
VALUES (8005, '홍길철', '유지보수', 303, '판교');

--11. sawon 테이블에서 jiyeok 컬럼을 제거
ALTER TABLE sawon DROP (jiyeok);

--12. buseo 테이블에서 buseo 명이 ‘인적자원부’인 행을 삭제
DELETE FROM sawon WHERE buseo = 303;
DELETE FROM buseo WHERE buseo_name = '인적자원부';
--foreign key 설정으로 인해 지울 수 없음 (실패)

--13. sawon 테이블이 모든 내용을 삭제하고 저장공간을 해제
truncate TABLE sawon;
DROP TABLE sawon;

--14. 1~8 단계까지를 각각의 테이블을 각각 하나의 CREATE 문으로 작성
DESCRIBE  sawon;

CREATE TABLE sawon
(
     sawon_name  varchar2(15),
     sabun          number(6),
     ubmu         varchar2(30) DEFAULT '개발',
     weolgub        number(7),
     buseo          number(3),
     jiyeok         varchar2(30) NOT NULL,
     
     CONSTRAINT pk_sawon_sabun PRIMARY KEY (sabun),
     --CONSTRAINT uq_info_jumin UNIQUE (jumin),
     CONSTRAINT ck_sawon_ubmu CHECK (ubmu IN ('개발','유지보수','관리')),
     CONSTRAINT fk_sawon_buseo FOREIGN KEY (buseo) REFERENCES buseo(buseo_no)
     --foreign key (가지고 올 곳 이름) references 어디에 넣을지 (어디서 가지고 오는지)
);

SELECT * FROM sawon;

