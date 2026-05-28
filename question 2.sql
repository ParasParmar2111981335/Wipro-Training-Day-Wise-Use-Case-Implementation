create database company;
use company;

create table users(
user_id int primary key,
username varchar(50),
email varchar(50),
status varchar(20),
last_login date
);

insert into users(user_id,username,email,status,last_login)
values
(1,'Paras','paras@gmail.com','ACTIVE',null),
(2,'Anu','anu@gmail.com','ACTIVE','2026-06-01'),
(3,'joshi','joshi@gmail.com','ACTIVE','2026-03-23'),
(4,'sasta','sasta@gmail.com','ACTIVE',null);

select username,email from users
where status='ACTIVE'
and last_login is null;
