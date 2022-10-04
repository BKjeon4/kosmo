
-- 사원명, 급여, 월급(급여/12) 를 출력하되 월급은 십단위에서 반올림하여 출력
SELECT ename, sal, round(sal/12, -1) as wolgub
FROM emp;

-- 사원명, 급여, 세금(급여의 3.3%)를 원단위 절삭하고 출력
SELECT ename, sal, sal*0.033, trunc(sal* 0.033, -1) as TAX
FROM emp;

-- smith의 정보를 사원번호, 성명, 담당업무(소문자) 출력
SELECT empno, ename, LOWER(job)
FROM emp
WHERE ename = 'SMITH';
--WHERE lower(ename) like lower ('smith'); 이라고 써도 됨

-- 사원번호, 사원명(첫글자만 대문자), 담당업무(첫글자만 대문자)로 출력
SELECT empno, INITCAP(ename), INITCAP(job)
FROM emp;

-- 이름의 첫글자가 ‘K’보다 크고 ‘Y’보다 작은 사원의 정보( 사원번호, 이름, 업무, 급여, 부서번호)를 출력하되 이름순으로 정렬
SELECT empno, ename, job, DEPTNO
FROM emp
WHERE SUBSTR (ename, 1, 1)> 'K' and  SUBSTR (ename, 1, 1)<'Y'
order by ename asc;

--asc = ascendant
--desc = descendant

-- 이름이 5글자 이상인 사원들을 출력
SELECT *
FROM emp
WHERE LENGTH(ename) >=5;

-- 급여는 10자로 맞추고 숫자는 오른쪽에 왼쪽엔 ‘-‘로 채운다
SELECT LPAD(sal, 10, '-')
FROM emp;

-- 이름을 15자로 맞추고 글자는 왼쪽에 오른쪽에는 ‘*’로 채운다
SELECT RPAD (ename,15,'*')
FROM emp;



-----------------info_tab-----------------------------------

SELECT name, jumin, substr(jumin, 8, 1) gender, substr(jumin, 1, 2) year
FROM info_tab;

-- 양쪽 공백을 제거

select '-' || trim(' 이순신 ') || '-' as col1, 
        '-' || ltrim(' 이순신 ') || '-' as col2, 
        '-' || rtrim(' 이순신 ') || '-' as col3 from dual;
--이해 필요
--(*) dual : dummy 테이블로 sys user가 owner이고 모든 사용자가 사용가능.
--임의의 값을 알고자 할 경우 유용하게 사용하는 테이블.
SELECT sysdate
FROM dual;

-- 급여를 숫자에서 ‘영일이삼사오육칠팔구’ 글자로 대체
SELECT sal, translate (sal, '0123456789', '영일이삼사오육칠팔구') kor_sal
FROM emp;

-- 급여의 숫자에서 0을 ‘$’로 바꾸어 출력
SELECT sal, replace (sal, '0', '$') char_sal
FROM emp;

--****** 중요!! 공백제거 하기!!!! 안쪽에 있는 공백까지 제거!!
SELECT  '   이   순   신   ' as ename
FROM dual;

SELECT replace ('    이    순    신    ', ' ','') as ename
FROM dual;

-- 현재까지 근무일 수가 많은 사람 순으로 출력
SELECT ename, hiredate - nvl(hiredate, sysdate), ceil (sysdate - hiredate) as "work day"
FROM emp
ORDER BY sysdate - hiredate desc;

SELECT ename, hiredate
FROM emp
ORDER BY sysdate - hiredate nulls last desc ;
-- 해결 필요

-- 현재까지 근무일 수가 몇 주 며칠 인가를 출력
SELECT ename, hiredate, ceil ((sysdate - hiredate)/7) as "work week", ceil (sysdate - hiredate) as "work day"
FROM emp;

SELECT ename, sysdate-hiredate, trunc((sysdate-hiredate)/7) as weeks,
                                floor(mod(sysdate-hiredate, 7)) as day
FROM emp;
--ceil 은 소숫점 위로, floor 는 소숫 점 아래로


-- 10번 부서의 사원의 현재까지의 근무 월수를 계산
SELECT ename, hiredate,  floor(MONTHS_BETWEEN (sysdate, hiredate)) as WorkMonth
FROM emp
WHERE DEPTNO = 10;

SELECT ename, hiredate,  ceil(MONTHS_BETWEEN (sysdate, hiredate)) as WorkMonth
FROM emp
WHERE DEPTNO = 10;

-- floor 내리거나, ceil 올리거나 (소숫점)

-- 현재 날짜에서 3개월 후의 날짜 구하기
select add_months( sysdate, 3 ) as mydate from dual;


-- 현재 날짜에서 돌아오는 ‘월’요일의 날짜 구하기
SELECT next_day (sysdate, '월') AS UpcomingMonday
FROM dual;


-- 현재 날짜에서 해당 월의 마지막 날짜 구하기
SELECT last_day (sysdate)
FROM dual;

-- 입사일자에서 입사년도를 출력
SELECT ename, hiredate, to_char(hiredate, 'YYYY') AS hire_year
FROM emp;


-- 입사일자를 ‘1999년 1월 1일’ 형식으로 출력
SELECT ename, hiredate, TO_CHAR(hiredate, 'YYYY"년" MM"월" DD"일"') AS  "입사일자"
From emp;


-- 1981년도에 입사한 사원 검색
SELECT *
FROM emp
WHERE TO_Char (hiredate, 'YYYY') = 1981;

-- 5월에 입사한 사원 검색
SELECT *
FROM emp
WHERE To_char (hiredate, 'MM') = 05;


-- 급여 앞에 $를 삽입하고 3자리 마다 ,를 출력
SELECT ename, sal, TO_CHAR(sal, '$999,999,999,999,999') AS dollar
FROM emp;

--81년 2월에 입사한 사원 검색
SELECT *
FROM emp
WHERE TO_CHAR (hiredate, 'YYYYMM') = '198102';

--81년에 입사하지 않은 사원 검색
SELECT *
FROM emp
WHERE TO_Char  (hiredate, 'YYYY') != 1981;

--81년 하반기에 입사한 사원 검색
SELECT *
FROM emp
WHERE TO_Char (hiredate, 'YYYYMM') >= 198107
        and TO_CHAR (hiredate, 'YYYYMM') <= 198112;
        
SELECT *
FROM emp
WHERE TO_Char (hiredate, 'YYYY') = 1981
    and TO_CHAR (hiredate, 'MM') >= 7;

-- 주민번호에서 성별 구하기
SELECT decode(substr(jumin, 8, 1), '1', '남자', '3', '남자', '여자') AS gender 
FROM info_tab;

SELECT CASE substr( jumin, 8, 1) 
WHEN '1' THEN '남자'
WHEN '3' THEN '남자'
ELSE '여자'
END as gender
FROM info_tab;

-- 부서번호가 10이면 영업부, 20이면 관리부, 30이면 IT부 그 외는 기술부로 출력
SELECT decode(substr(deptno, 1, 2), '10', '영업부', '20', '관리부', '30', 'IT부', '기술부') AS department 
FROM emp;

SELECT CASE substr(deptno, 1, 2)
WHEN '10' THEN '영업부'
WHEN '20' THEN '관리부'
WHEN '30' THEN 'IT부'
ELSE '기술부'
END as department
FROM emp;

-- 업무(job)이 analyst이면 급여 증가가 10%이고 clerk이면 15%, manager이면 20%인 경우 사원번호, 사원명, 업무, 급여, 증가한 급여를 출력

SELECT empno, ename, job, sal, decode(substr(job, 1,1), 'A', sal*1.1, 'C', sal*1.15, 'M', sal*1.2) as "급여"
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

--4. 그룹
--(1) ALL, DISTINCT //겹치는거 

select all job from emp;
select distinct job from emp;

desc emp;
select rownum, empno, ename, job from emp;

--rownum -> 몇개인지 번호 추출 가능 // 오라클에만 존재

select rownum, empno, ename, job 
from emp
where rownum <=5;

-- 업무가 ‘SALESMAN’인 사람들의 월급의 평균, 총합, 최소값, 최대값을 구하기
SELECT avg(sal) avg, sum (sal) sum, min(sal) min, max(sal) max
FROM    emp
WHERE job = 'SALESMAN';

INSERT INTO emp(empno, ename, job)
VALUES(9001, '홍길국', 'SALESMAN');

select* from emp;

-- 커미션(COMM)을 받는 사람들의 수는
SELECT count(comm)AS count
FROM emp
WHERE comm is not null
and comm != 0;

SELECT count(comm)
FROM emp
WHERE comm >0;

-----------------------------------------------------------------
-- 부서별로 인원수, 평균급여, 최저급여, 최고급여, 급여의 합을 구하기
SELECT deptno, count(*), avg(sal), min(sal), max(sal), sum(sal)
FROM emp
--WHERE
GROUP BY deptno; 
--HAVING

--!!!!!!!group by 가 있을 때는, 출력 컬럼은, 그룹핑하는 컬럼과 집계함수만 가능!!
--중요!!!!!!! ex) ename, empno 등 등 select 에 쓸 수 없음

-- 부서별로 인원수, 평균급여, 최저급여, 최고급여, 급여의 합을 구하기 ( 부서별 급여의 합이 높은 순으로)
SELECT deptno, count(*), avg(sal), min(sal), max(sal), sum (sal)
FROM emp
GROUP BY deptno
ORDER BY sum(sal) asc;

-- 급여의 합이 높은 순으로


-- 부서별 업무별 그룹하여 부서번호, 업무, 인원수, 급여의 평균, 급여의 합을 구하기
SELECT deptno, job, count(*), avg(sal), sum(sal)
FROM    emp
--WHERE
GROUP BY deptno, job;
--HAVING

-- 최대 급여가 2900 이상인 부서에 대해 부서번호, 평균 급여, 급여의 합을 출력

SELECT deptno, avg(sal), sum(sal)
FROM emp
GROUP BY deptno
HAVING 2900 <= max(sal);

-- 업무별 급여의 평균이 3000이상인 업무에 대해 업무명, 평균 급여, 급여의 합을 출력
SELECT job, avg(sal), sum(sal)
FROM emp
GROUP BY job
HAVING 3000 <= avg(sal);


-- 전체 합계 급여가 5000를 초과하는 각 업무에 대해서 업무와 급여 합계를 출력 단, SALESMAN은 제외하고 급여 합계가 높은 순으로 정렬
SELECT job, sum(sal)
FROM emp
WHERE job!= 'SALESMAN'
GROUP BY job
HAVING 5000 < sum(sal)
ORDER BY sum(sal) desc;

-- 업무별 최고 급여와 최소 급여의 차이를 구하라
SELECT job, max(sal)-min(sal) AS SAL_GAB
FROM emp
GROUP BY job;



-- 부서 인원이 4명 보다 많은 부서의 부서번호, 인원수, 급여의 합을 출력
SELECT deptno, count(*), sum(sal)
FROM emp
GROUP BY deptno
HAVING count(*) > 4;

