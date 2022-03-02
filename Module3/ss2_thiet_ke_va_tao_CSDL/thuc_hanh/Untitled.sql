create database if not exists QuanLySinhVien;
use QuanLySinhVien;

create table Class(
ClassID int not null primary key auto_increment,
ClassName varchar(60) not null,
StartDate datetime not null,
`Status` bit);