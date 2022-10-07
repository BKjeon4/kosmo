--7. 뷰 (VIEW) : 가상 테이블

-- 데이터 보안

-- 복잡한 쿼리의 사용빈도가 높은 경우

CREATE OR REPLACE VIEW v_emp AS
            SELECT empno, ename, deptno FROM emp;
            
SELECT * FROM v_emp;
DESCRIBE v_emp;

INSERT INTO v_emp VALUES (1000, '홍길동', 20);
--view 전용이지만, 읽기전용이 아니기 때문에, 원본에도 영향을 끼침

SELECT * FROM v_emp;
SELECT * FROM emp;

INSERT INTO v_emp VALUES (1000, '홍홍이', 20); --

INSERT INTO v_emp VALUES (2000, '홍홍이', 90); --
--foreign key 에 걸림

CREATE OR REPLACE VIEW v_emp AS
        SELECT empno, ename, deptno from emp
        WITH READ ONLY;
        --변경 안되는 읽기 전용으로 만들기
        
INSERT INTO v_emp VALUES (1000, '홍홍이', 30);

--(2) read-only 뷰
CREATE OR REPLACE VIEW v_emp_30 AS
        SELECT empno EMP_NO, ename NAME, sal SALARY 
        FROM emp
        WHERE deptno = 30
        WITH READ ONLY;
        
SELECT * FROM v_emp_30;

--(3) 복합뷰
Create or replace view v_emp_info as
select e.empno empno, e.ename ename, d.dname dname 
from emp e, dept d
where e.deptno=d.deptno;

SELECT * FROM v_emp_info;

INSERT INTO v_emp_info(empno, ename, dname) VALUES (3333, '맹꽁이', 30);
--읽기전용이 아님에도, insert를 할 수 없는 이유는, 뷰가 2개의 테이블을 복합해서 만들 었기 때문
-- 2개의 테이블에 동시에 입력할 수 없음
INSERT INTO v_emp_info(empno, ename) VALUES (3333, '맹꽁이');
--empno, ename 은 emp 테이블에만 있는 정보기 때문에, 입력 혹은 수정 가능

DELETE FROM v_emp_info WHERE empno=7788;
-- view 에서 지워도, 원본에서 해당 정보 삭제 됨!

-- [ 연습 ] 부서별로 부서명, 최소급여, 최대 급여, 부서의 평균 급여를 포함하는 
--V_DEPT_SUM 뷰를 생성하여라.

Create or replace view V_DEPT_SUM as
select d.dname dname, min(sal) min, max(sal) max, avg(e.sal) avg
from emp e, dept d
WHERE e.DEPTNO = d.deptno
GROUP BY dname
WITH READ ONLY;

SELECT * FROM V_DEPT_SUM;

INSERT INTO emp(empno, ename, sal, deptno) VALUES (4444, '호이', 9900, 20);
-- 뷰가 아닌 원본테이블에 수정(추가,삭제)을 해도 뷰에 내용이 달라짐!!


--8. 시퀀스 (sequence) : 자동증가수

CREATE  SEQUENCE    seq_temp;
SELECT seq_temp.NEXTVAL FROM DUAL;
-- NEXTVAL : 다음 생성될 시퀀스 값

SELECT seq_temp.CURRVAL FROM DUAL;
-- CURRVAL : 현재 시퀀스 값

-- 5000번부터 10씩 증가하는 자동증가수 (시퀀스)
CREATE  SEQUENCE   seq_temp2
start with 5000 increment by 10;

--emp 테이블 입력 후 확인
INSERT INTO emp (empno, ename) VALUES (seq_temp2.NEXTVAL, '박씨');

-- 9. 인덱스 (INDEX) - 빠른 검색을 위해
DESC EMP;
SELECT empno, ename, job, rowid from emp;
--rowid 라는건 오라클에만 있음, 무조건 만든다고 좋은건 아님, 자주 변경 하는 값은 안하는게 나음

--별로로 인덱스 컬럼과 ROWID 정보를 관리하고 이 정보를 먼저 찾아 실제 테이블에 있는 데이터를 검색
--테이블에 새로운 행이 입력되거나 변경 제거되면 인덱스 정보도 갱신된다.
--너무 많은 인덱스나 테이블의 데이터가 적은 경우는 성능을 저하
--PRIMARY KEY와 UNIQUE KEY는 자동으로 UNIQUE INDEX로 자동 생성


------
SELECT e.empno, e.ename, e.sal, d.dname, e.job
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
WHERE d.deptno = 20;

select e.empno, e.ename, e.sal, d.dname, d.loc
from emp e inner join dept d
on e.deptno = d.deptno
where d.deptno = 20;
