create database if not exists QuanLySinhVien;
use QuanLySinhVien;

create table Class (
ClassID int primary key auto_increment not null,
ClassName varchar(10) not null,
StartDate datetime,
Status bit
);
select * from Class;

create table Student(
StudentID int primary key not null auto_increment,
StudentName varchar(30),
Address varchar(50),
Phone varchar(20),
Status bit,
ClassID int not null,
foreign key(ClassID) references Class(ClassID)
);
select * from Student;

create table Subject(
SubID int not null primary key auto_increment,
SubName varchar(30)not null,
Credit tinyint not null default 1 check (Credit > 1),
Status bit default 1
);
select * from Subject;

create table Mark(
MarkId int primary key not null auto_increment,
SubId int not null unique ,
StudentId int not null unique,
Mark float default 0 check (Mark between 0 and 100),
ExamTimes tinyint default 1,
foreign key (SubID) references Subject(SubID),
foreign key (StudentID) references Student(StudentID)
);
select * from Mark;


INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);

INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (3, 2, 10, 2),
       (2, 3, 12, 1);
       
       drop database QuanLySinhVien;
