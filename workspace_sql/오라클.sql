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
