use mydb;
create table if not exists ece(rollno varchar(10),name varchar(25),age int(2), cgpa varchar(5));
desc ece;
truncate ece;
insert into ece(rollno,name,age,cgpa) values(117,"peter",21,8.23);
insert into ece(rollno,name,age,cgpa) values(116,"parker",21,9.23);
insert into ece(rollno,name,age,cgpa) values(115,"tony",21,8.93);
insert into ece(rollno,name,age,cgpa) values(114,"stark",21,7.23);
alter table ece rename to cse;
desc cse; 
select * from cse;

select * from iris where species='Iris-setosa';
select distinct species from iris;
select * from iris where sepal_length between 5 and 6;
select species,avg(sepal_length) as 'Average' from iris group by species order by avg(sepal_length) asc;
select species,count(species) from iris group by species;
