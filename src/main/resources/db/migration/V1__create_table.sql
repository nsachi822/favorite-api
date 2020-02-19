create table common(
id bigint unsigned not null auto_increment,
contentname varchar(64) not null,
type varchar(10) not null,
primary key(id)) engine=InnoDB default charset=utf8;

create table book(
id bigint unsigned not null auto_increment,
booktitle text not null,
author text not null,
about text,
date date,
image text,
status text,
primary key (id)) engine=InnoDB default charset=utf8;