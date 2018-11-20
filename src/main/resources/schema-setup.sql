use world;

drop table users;

create table users(
id int not null auto_increment,
name varchar(50) not null,
age int not null,
sex char not null,
address varchar(100) null,
request_type varchar (20) null,
primary key (id)
);

select * from users;

create database world;

insert into world.users (name,age,sex,address) values
("billie", 21, 'm', '123 Mockingbird Lane'),
("susis", 23, 'f', '123 Elm Str'),
("Bob", 29, 'm', '567 Main'),
("Fred", 41, 'm', 'YMCA');
