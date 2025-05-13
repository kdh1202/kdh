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


 
 
 
 
 
 
 
 

