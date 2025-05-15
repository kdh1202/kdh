--SQL : Structured Query language

--한줄 주석

/* 범위   주석 */

/*select empno, ename, from emp;*/
select * from dept;
select * from salgrade;
select ename, sal,
'a'
from emp;
select deptno from emp;
select distinct deptno from emp;
select /*distinct*/ deptno, job from emp;
select distinct deptno, job from emp;
select  all job, deptno from emp;
select ename, 
sal,
sal*12+comm s, sal*12+comm ,
sal*12+comm "s  s",-- sql에서 유일하게 "가 들어가는곳
comm from emp;

select  empno "사원", ename "이름", job"직업" 
from emp;

select * from emp order by sal desc;
select * from emp order by deptno asc, sal desc;

select sal as 월급, sal*12 as 연봉  
from emp;   

select *from emp
order by sal; --sal 컬럼을 기준으로 오름차순-작은것부터 큰것 순서로(asc 생략가능)

select *from emp
order by sal desc;  -- sal 컬럼을 기준으로 내림차순 - 큰것부터 

select *from emp
order by hiredate;
select * from emp
order by ename;

select * from emp order by deptno, sal desc;
--deptno, sal desc; 이상황에서 연봉이 같으면 사원번호 내림차순으로 정렬
--부서번호로 오름차순, 겹치면 sal 내림차순

select * from emp order by deptno, sal desc, empno desc;

select distinct deptno from emp;

select * from emp where deptno = 30
order by sal;

select * from emp where sal = 1600;   -- 같다
select * from emp where sal > 1600;    -- 크다 
select * from emp where sal < 1600;   -- 작다 
select * from emp where sal >= 1600;  -- =은 항상 오른쪽
select * from emp where deptno != 30;   --  !은 부정
select * from emp where deptno <> 30;  -- 부정

select * from emp where deptno = 30 and job = 'SALESMAN';

--or
/*
 emp 테이블에서 부서번호(deptno)가 30 이거나(또는) 
 직책(job)이 clerk 인 사원의  모든정보를 출력해라
*/
-- and와 or 들이 있을떄 and 먼저 적용된다
select * from emp where deptno = 30 or job = 'CLERK';


/*
job이 CLERK sal이 2000초과 이거나 deptno 10인 사원 조회
*/
select * from emp where (job = 'CLERK' or sal > 2000) and deptno = 20;
/*
select * from emp where job = 'CLERK' or/ sal > 2000 and deptno = 10/;
select * from wmp where job = 'CLERK' or sal > 2000 and deptno = 10 ;
  위에 두개는 같다 2개
select * from emp where job = 'CLERK' or (sal > 2000 and deptno = 10 );
*/
-- ()먼저 실행해야 한는 것을 묶어 주는게 편함

select * from emp where not (job = 'CLERK' or ( sal > 2000 and deptno = 10 ) );

/*
    deptno != 30, deptno <> 30, deptno ^=30, not deptno = 30
*/

--월급2000만원이상 4000미만인 사월을 출력하시오
select * from emp where sal >= 2000 and sal < 4000;

-- 2000 <= sal < 4000;
-- 2000 <= sal and sal < 4000;

--  부서번호 10 또는 20인 사원만 출력

select * from emp where deptno = 10 or deptno =20;
select * from emp where deptno in ( 10, 20 );

-- 부서번호 10 또는 20인 사원뺴고 출력
select * from emp where deptno not in ( 10, 20);


select * from emp where empno in ( 7369, 7934 );
select * from emp where empno in ( 10, 20 );



select *  from emp where job > 'B' and job < 'Z';

select * from emp order by job desc;

select * from emp where deptno = 30;

select * from emp where deptno =10 or deptno = 20;

select * from emp where mgr >= 7500 or mgr = 7999;
select * from emp where mgr = 7698 and job = 'SALESMAN';
select * from emp where ename = 'SCOTT' and job = 'ANALYST';


select * from emp where sal >= 1600 or sal = 4000 and  comm = 300;

select * from emp where sal <3000;
/*
select * from emp where  sal != 3000;
select * from emp where  sal ^= 3000;
select * from emp where  sal <> 3000;
뜻 = 같지않다*/

select * from emp where  job not in ('SALESMAN', 'MANAGER', 'CLERK');
select * from emp where job <> 'SALESMAN';
select * from emp where job != 'SALESMAN' and job not in ('MANAGER', 'CLERK',
'PRESIDENT');

select * from emp where sal >= 1000 and sal <= 3000;

select * from emp where mgr > 7600 and mgr < 7900;


-- 월급 3000만원이상 사원을 찾고  30 인사람을 찾으시오
select * from emp where sal >= 3000 and deptno = 20;

-- 입사일  81년 1월1일 이후입사한사람 찾으시오
select * from emp where  hiredate > '81/01/01';

select * from emp where (sal >= 3000) and hiredate >= '81/01/01';

-- 입사날짜가 87년이전이고   1600이하 직원들의 이름과 입사날짜를 조회하세요
select * from emp where hiredate < '87/01/01' and sal < 1600;

--추가수당이 100만원 이상 사람과 사원번호30인 사람

select * from emp where comm >= 100 and deptno = 30;
;
--추가수당이  눌인 사람과 empno 7700이상인사람
select * from emp order by deptno desc;

-- where과 order by 같이 있을떄 where 먼저 사용후 order by

select * from emp where deptno = 30 order by ename desc;

--일이 clerk거나  월급이 2000초과 면서  deptno가 10인 사원을조회

select * from emp where job = 'CLERK' or (sal > 2000 and deptno = 10);

select * from emp where (job = 'CLERK' or sal > 2000) and deptno = 10;

select * from emp where job = 'CLERK' or sal > 2000 and deptno = 10;


select * from emp order by ename;
 
--1. 부서번호10번인 사람들을 출력
select * from emp where deptno = 10;
--2. 부서번호 10번이 아닌사람들을 출력
select * from emp where deptno <> 10;
--3. 급여가 3000이상인 사람들을 출력
select * from emp where sal >= 3000;
--4. 급여가 1500~3000 사이포함의 사람을 출력
select * from emp where sal >= 1500 and sal <= 3000;
--5. 부서 번호 10번인 사람중 급여 2000이상인 사람을 출력
select * from emp where deptno = 10 and sal >= 2000;
--6 부서번호 30번중  1500~3000 사이 미포함인 사람을 출력
select * from emp where deptno = 30 and sal > 1500 and sal < 3000; 
--7 부서번호 30번중 1500~3000 사이 미포함 인 사람을 연봉이 작은순으로 출력 연봉이 같은경우 이름이 빠른순으로 출력
select * from emp where deptno = 30 and sal >1500 and sal < 3000 order by sal, ename;
--8 부서번호 20.30번중 1500~3000 사이 (미포함)인 사람을 연봉이 작은순으로출력, 연봉이 같은경우 이름이 빠른순으로 출력
select * from emp where deptno in ( 20, 30) and sal > 1500 and sal < 3000
order by sal,ename;
--9 부서번호가 20또는 30이고 급여가1500 이상인 직원의 이름과 급여를 급여 오름차순으로 출력
select ename, sal from emp where( deptno = 20 or deptno = 30) and sal >= 1500 order by
sal;
--  9번 내용 잘보기
-- where 절만 잘해도 편하다
 
select * from emp
where sal between 2000 and 3000 and deptno = 20;
 
select * from emp 
where sal not between 2000 and 3000;

--select * from emp 
--where sal between 2000 and 3000
--and sal != 2000  
--and sal != 3000;
 -- 2000초과 3000미만 비트윈으로 표시할떄 쓸수있는 방법,


--       like = xx 처럼 
--      % = 와일드 카드
--      시물레이션 돌리는거 엄청 중요함
--      _ = 한글자로 인식
select * from emp
where ename like 'S%';

-- 첫번쨰 글자는 상관없음  ( _ )
-- 두번쨰 무조건 L인것만 
-- 그 이후는 상관없음 ( % )
select *from emp where
ename  like '_L%';

-- %%안에 포함된 사원 출력할떄 
select *from emp where
ename  like '%AM%_';

select *from emp where
ename  like '%A%';

select *from emp where
ename  not like '%A%' and ename  like '%S%'; 

select * from emp
where ename like 'S___H';

select comm from emp;

--null 은 계산이 안됨
--null 값이 없는 상태를 뜻한다 
--연산이 안되서 빠진다 들어갈수가 없다

select comm from emp
where comm > 400;

select * from emp
where comm is null;

select * from emp
where comm is not null;

select ename , sal,sal*12+comm as ANNSAL, comm from emp;

select * from emp
where comm = 0;


select * from emp where deptno = 10; 
select * from emp where deptno = 20;

--union
-- union  앞에있는 조회 쿼리(sql) 결과뒤에 있는 조회 쿼리 결과를 위 아래로 합쳐줌
--중복 되는 줄은 한번만 나온다

select * from emp where deptno = 10
union 
select * from emp where deptno = 10;

--union all
--union all은 더 사용한다
--union all 출력데이터가 같을떄 사용한다
-- 둘다 조회 하는 컬럼의수 , 컬럽의 타입이 같아야실행된다.


select * from emp where deptno = 10
union all
select * from emp where deptno = 10;


-- 글자와 숫자는 같을수없다 참인것만 가능하다
-- 숫자 + 숫자 o 글자 + 글자 0 
-- 숫자 + 글자 x 글자 + 숫자 x

select empno from emp
union all
select sal from emp;

select empno from emp
union all
select ename from emp;


-- Q5
-- 이름  사월번호 월급 부서번호
--  부서 10번 사원번호 내림차순으로  정렬하여 출력
-- 부서 20번을 사원번호 오름차순으로 출력

select * from emp
where deptno = 10 order by empno desc
union all
select * from emp
where deptno = 20 order by empno;


--  아직 안배운 기술로 order by 안됨
select * from (
where deptno = 10 
union all
select * from emp
where deptno = 20 order by empno;

 





select ename, empno, sal, deptno from emp
where ename like '%E%' and  (sal < 1000 or sal > 2000) and deptno = 30;



-- 추가 수당이없고 상급자가 있고 직책이 매니저 크래크인사원중 사원이름의 두글자가 
-- L이 아닌 사원의 정보를 출력하는 sql 구문



select * from emp
where (job = 'CLERK' or job = 'MANAGER') and  ename not like '_L%'
and comm is null;














select * from emp where job in ('MANAGER', 'CLERK')
and  ename not like '_L%' and comm is null and mgr is not null;

-- q2
select empno, ename, job, sal, deptno from emp where job = 'SALESMAN';


select ename, upper(ename), lower(ename), initcap (ename) from emp;

select job,lower(job) from emp;

select initcap(ename) from emp
where lower(ename) like lower('%aM%');

-- 연습
select upper('aB'), lower('aB') from dual;


-- 컬럼의 문자 개수를 알려줌
select ename, length(ename) from emp;


select job, length( job) from emp;




--글자의 갯수를 찾아주는 방법
select * from emp where length(ename) = 5; -- 5개인 문자의 갯수를 찾아줌
select * from emp where length(job) = 7;

select * from emp where length(sal) = 4;

-- bit : 0또는 1( 참 or 거짓)
-- 1 Byte : 8bit 글씨하나를 저장하는 공간 (영어)
-- 1 kByte : 1024 Byte
-- 1 mbyte : 1024 kbyte
-- 1 gbyte : 1024 mbyte
-- 1 tbyte : 1024 gbyte

--MPNO    NOT NULL NUMBER(4)    4자리
--ENAME             VARCHAR2(10) 한글은 3글자 
--JOB               VARCHAR2(9)  
--MGR               NUMBER(4)    
--HIREDATE          DATE         
--SAL               NUMBER(7,2)  
--COMM              NUMBER(7,2)  
--DEPTNO            NUMBER(2)    

select lengthb ('a'), lengthb('한') from dual;

desc emp;

-- 수업잘듣기 
-- 따라쓰기 
-- 분석(이해)
-- 안보고 다시쓰기 
-- 응용 몇개라도 바꿔보기
-- 자랑 해라

-- 사원이름이 s 로 끝나는 데이터를모두 출력

select ename from emp
where ename like '%S';



-- 30번 부서에서 직책이 세일즈맨 

select deptno, job from emp
where deptno = 30 and job = 'SALESMAN';



--  EMP 테이블 에서 사원 번호 이름 직책 급여 부서 번호 출력

select empno, ename, job, sal, deptno from emp;

-- 급여  2000이상 3000이하의 이외의 범위값을 비트윈x 

select * from emp
where not sal between 2000 and 3000;

--사원이름에 E 가 포함된 30번 부서 ,급여가 1000~2000 사이가 x 
-- 사원 이름 번호 급여 부서 번호 를 출력
select ename, empno, sal, deptno from emp
where ename like '%E%' and deptno = 30 and 
sal >= 1000 and  sal <= 2000 ;


-- 직책이 MANAGER,CLERK 사원중 추가 수당X 상급자가 있고
-- 이름두번쨰글자가 L이 아닌사원의 정보를 출력

select * from emp
where (job = 'MANAGER' or job ='CLERK') and comm is null and
ename not like '_L%';










select * from emp
where ename like '%_S';

-- 30번 부서에서 직책이 세일즈맨 
--  EMP 테이블 에서 사원 번호 이름 직책 급여 부서 번호 출력

select  empno, ename, job, sal, deptno from emp
where deptno = 30 and joB = 'SALESMAN';

--emp 테이블 20,30번 에서 근무 하는 사원중
--급여가 2000초과 사원을  사원번호 이름 직책 급여 부서번호 출력


select empno, ename, job, sal, deptno from emp
where sal > 2000 and deptno in ( 20, 30);

-- 급여  2000이상 3000이하의 이외의 범위값을 비트윈x 


select * from emp
where sal < 2000 or sal > 3000;

--사원이름에 E 가 포함된 30번 부서 ,급여가 1000~2000 사이가 x 
-- 사원 이름 번호 급여 부서 번호 를 출력


select ename, empno, sal, deptno from emp
where deptno = 30 and  (sal < 1000 or sal > 2000)
and  ename like '%E%';

-- 직책이 MANAGER,CLERK 사원중 추가 수당X 상급자가 있고
-- 이름두번쨰글자가 L이 아닌사원의 정보를 출력

select * from emp
where comm is null and ename not like ('_L%')
and job in ('MANAGER', 'CLERK') ;


select * from emp
where comm is null and ename not like ('_L%')
and job = 'MANAGER' or job ='CLERK';

select * from emp 
where length(ename) = 5;


--비트윈
select * from emp
where not sal between 2000 and 3000;

select ^ from emp
where ename not like ('_E%');


select empno, ename, sal, deptno from emp
where deptno = 10
union
select sal, job, deptno, sal from emp
where deptno = 20;


select upper(ename) from emp
where lower(ename) like lower('%aM%');

select ename from emp
where lower(ename) like lower('%aM%');


/* 
emp 테이블에서 급여가 3000이상이고 잡이 샐러리맨인 직원의 이름과 급여를 조회하세요
*/

select ename, sal from emp
where sal > 3000 and job ='SALESMAN';

/* 
emp 테이블에서 추가수당이 null인 직원의 첫글자가 A가 들어가는 샐러리맨을 조회 하세요 
*/

select * from emp
where comm is null and ename like ('A%') and job = 'SALESMAN' ;


/* 
emp 테이블에서 부서번호 20 , 30 이고 마지막ㅇ이름에 a 가들어가며 급여가 3000이상인
직원의 사원번호 직속상관의 사원번호 입사일 추가수당 나오게 만들어라
*/


select ename, sal, empno, mgr, hiredate, deptno, comm from emp
where deptno in (20, 30)
and ename like ('%T')
and sal >= 3000;


select * from emp;



--- 테이블에서  이름이 5글자인 사람을 이름

select ename, length(ename) from emp
where length(ename) = 5 ; 


--job이 8글자인 사람을 이름만 나오게 

select ename from emp
where length(job) = 8;

select ename from emp
where length(job) = 8;


--각 사원의 이름(ENAME)과 그 이름의 길이를 출력하세요
select ename, length(ename) from emp
where length(ename) > 1;
--가장 긴 이름을 가진 사원 찾기
--가장 이름이 긴 사원의 이름과 사원 번호를 출력하세요.
select length(ename), ename, empno from emp
where length(ename) = 6;  

--이름 길이가 5 이상인 사원 찾기
--이름의 길이가 5자 이상인 사원의 이름과 직업을 출력하세요.
select length(ename), ename, job from emp
where length(ename) >= 5;


--2.이름 길이 기준 정렬
--모든 사원의 이름과 이름 길이를 출력하되, 이름 길이 순으로 내림차순 정렬하세요.


select ename,length(ename) from emp
order by length(ename) desc;









select ename, length(ename) from emp
order by  length(ename) desc; 


select length('한글'), lengthb('한글')
from dual;

select ename from emp
where length(ename) >= 3;

select job, substr(job, 1, 2), substr(job, 3, 2),substr(job, 5) from emp;


-- 사원이름 2번쨰 ~ 3글자만 출력

select ename, substr(ename, 2, 3) from emp;
select ename, substr(ename, 2, 30) from emp;
select ename, substr(ename, 20, 300) from emp;  
-- 실제 글씨 길이가 넘어가면 null 이나온다

--음수도 가능 
select job, substr(job, -3, 2) from emp;
select job, substr(job, -30, 2) from emp;
-- 실제 글씨 길이가 넘어가면 null 이나온다


-- 이름의 뒤에서 3글자만 모두 출려하기

select substr(ename, -3,3) from emp;
select substr(ename, -3) from emp;

select job, substr(job, -length(job), 2) from emp; 

--

select '010-1234-5678' as replace_before, 
replace('010-1234-5678', '-',' ') as replace_1,
replace('010-1234-5678', '-') as replace_2
from dual;


-- ename에 있는 E를 '-'로 교체


select ename, replace(ename, 'A', '-')
from emp;





select job,replace(job,'S','*') from emp;
select job as before,
replace(job, 'S', '2') as from emp;

select job,replace(job, 'E', '12') from emp; 


-- lpad, rpad = 모자르면 채우고 넘어가면 자른다
select lpad(ename,' 5', '+') from emp;
select lpad(ename,6,'*') from emp;
select substr(ename,'1','2',rpad('6','*')) from emp; 


-- ename의 전체글자6개  앞에 2글자 보이게

select ename, substr(ename,'1','2') from emp;

select ename from emp;
-- 이네임의 전체글자6개  앞에 두글자만 보이게 

select substr(ename,'1','2') from emp;

-- 문제2
-- 앞에 두글자만 원본을 출력하고 나머지는 4개의 로 표시

select rpad(substr(ename,'1','2'),'6','*')from emp;
-- why?  
-- rpad = 오늘쪽부터 남은공간을 채우는 방법
-- lpad =


select rpad(ename,'6','*') from emp;

select substr(ename,'1','2') from emp;



select substr(ename,'1','2', rpad(ename,'6','*') )
from emp;

select rpad(ename,'6','*', substr(ename)) from emp;

select ename from emp;


-- 문제2
-- 앞에 두글자만 원본을 출력하고 나머지는 4개의 로 표시

select rpad(ename,2) from emp;

-- 문제3
-- 사원 이름 두글자만 보이고 나머지는로. 단, 원래 이름 길이 만큼 표시
-- 예 : WA, SM*

select ename,;

--심화  이름을 총 20자 중  가운데 정렬









--  \ 를 시프트 사용하면 나옴  | 파이프 라고함
-- || 앞의 문자와 뒤의 문자를 합치는 연산자

select ename || empno from emp;

select 'ab'||'da'||'e' from dual;


select empno ||  ' : '  || ename from emp;



--TEIM 앞위의 공백을 자른다
-- 문자 사이의 공백은 건드리지 않는다 
select '    ab  b    ', trim('    ab  b    ') from dual;


-- round 사용 방법
select 
   round (14.46, 0),-- 하나만 입력하면 소수점 첫째자리 반올림
   round (14.46, 1), -- 소수점 두번째 자리
   round (14.46, -1) --음수 일떄 정수 부터 시작한다 .
from dual;


select 
    trunc(14.46),
    trunc(14.46,1),
    trunc(14.46,-1),
    trunc(-14.46)
from dual;


select ceil(12.23) from dual;

select 
  ceil(3.14), -- 올림
  floor(3.14), -- 내림
  ceil(-3.14), --
  floor(-3.14)
  from dual;

select trunc(-3.14) from dual;
select trunc (12314.231231) from dual;

select
    mod(15, 6),
    mod(15, 4)
from dual;

select  7/3 from dual;
select  7/0 from dual;


-- 나머지  
select mod (7,3) from dual;
select mod (8,3) from dual;
select mod (9,3) from dual;



 select sysdate from dual;






select empno +'1000' from emp;
select empno,empno + 1000 from emp;
select empno , empno 'asdf' from emp; -- 
select 'a' +'b' from dual;
select 'a'||'b' from emp;
select sysdate to_char from emp;



select to_char(sysdate) from emp;



select to_char(sysdate,'yyyy/mm/dd hh24:mi:ss') "england"from dual;

select to_char(hiredate, 'yyyy/mm/dd/ hh24:mi:ss') from emp;

select sysdate from dual;

select to_date('2025-05-15', 'yyyy-mm-dd') - to_date('1995-12-02', 'yyyy-mm-dd') from dual;

select * from emp;

--정석 
select * from emp
where hiredate > to_date('1981-12-04','yyyy-mm-dd');


select sal*12 + comm from emp;

select sal*12 + comm,  
    sal*12+nvl(comm,0)
    from emp;

--select from 
--where 
--substr
--sysdate 
--to_char
--legnth
--replace
--like
--nvl
--nvl2
--lpad
--rpad 
--trim
--||
--ceil
--floor
--mod
--round
--trunc
--upper
--lower
--union
--union all
--and, or 






-- 문제2
-- 앞에 두글자만 원본을 출력하고 나머지는 4개의 로 표시

select  ename,substr(ename,1,2
)
    from emp;

select lpad(ename,6,'*',substr(ename,1,6))
from emp;

select ename,lpad(ename,6,'*') from emp;

select rpad(ename,6,'*',substr(ename,1,2)) from emp;
substr(ename,1,2)


-- 문제3
-- 사원 이름 두글자만 보이고 나머지는로. 단, 원래 이름 길이 만큼 표시
-- 예 : WA, SM*

select rpad(substr(ename,1,2),6,'*') from emp;
--   오른쪽부터 (이름 첫번쨰부터두글자뺴고 )6글자중 빈공간에 *표시를 해라
select rpad(ename,6,'*') from emp;
-- 6글자 가안되는곳에 *를 채워라
select substr(ename,1,3) from emp;
-- e name중 첫번쨰부터 3글자만 써라


select rpad(substr(ename,1,2),6,'*') from emp;




-- 사원 이름 두글자만 보이고 나머지는로. 단, 원래 이름 길이 만큼 표시
-- 예 : WA, SM*

select 
    ename,
    rpad(substr(ename,1,2),length(ename),'*')
    from emp;

-- 문제2
-- 앞에 두글자만 원본을 출력하고 나머지는 4개의 로 표시

select rpad(substr(ename,1,2),6,'*') from emp;


select 
    job,
    rpad(substr(job,1,2),length(job),'*')
    from emp;




--심화  
-- 잡을 총 20자중 가운데정렬
select job from emp;
select en from emp;






--문제 1: 이름에서 'A'를 '*'로 대체하기


select ename,replace(ename,'A','*') from emp;



select '010-8120-0864',replace('010-8120-0864','-',' ')
from dual;






--3.이메일에서 도메인 부분만 추출하기
-- 문제: email 컬럼에서 이메일 도메인 부분만 추출하세요. 예를 들어, 
--'john.doe@example.com'은 'example.com'으로 바꿔야 합니다

select 
substr('john.doe@example.com',10,100)
"email" from dual;


select round(123.15),r from emp;


--salary 컬럼에서 소수 첫째 자리까지 반올림하세요

select empno from emp;


--1234.5678 
select round (1234.5678,2)from emp;














SELECT ROUND(1234.5678, 2) AS result FROM dual;

select ename trim(ename,'A','A') from emp;







