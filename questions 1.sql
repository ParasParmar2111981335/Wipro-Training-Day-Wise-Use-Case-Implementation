create database duplicate;
use duplicate;

create table user(
user_id int primary key,
username varchar(50),
email varchar(100)
);

insert into user(user_id,username,email)
values 
(1,"Paras","parasparmar@gmail.com"),
(2,"rahul","parasparmar@gmail.com"),
(3,"sasta","sasta@gmail.com"),
(4,"joshi","sasta@gmail.com"),
(5,"anu","anu@gmail.com");

select email ,count(*) as duplicate_count
from user
group by email
having count(*)>1;