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


