create database if not exists CSDL_quan_ly_sinh_vien;
use CSDL_quan_ly_sinh_vien;

create table Class(
ClassID int primary key not null auto_increment,
ClassName varchar(60) not null,
StartDate datetime not null,
`Status` bit
);

create table Student(
StudentID int primary key not null auto_increment,
StudentName varchar(30) not null,
Address varchar(50),
Phone varchar(20),
Status bit,
ClassID int not null,
foreign key (ClassID) references Class(ClassID)
);

create table Subject(
SubID int not null primary key auto_increment,
SubName varchar(30)not null,
Credit tinyint default 1 not null CHECK ( Credit >= 1 ),
Status bit default 1
);

create table Mark(
MarkID int not null primary key auto_increment,
SubID int not null,
StudentId int not null,
unique key (SubID, StudentID),
Mark float default 0 check ( Mark between 0 and 100),
ExamTimes tinyint default 1
);

alter table Mark add foreign key FK_STUDENT(StudentID) references Student(StudentID);
alter table Mark add foreign key FK_STUDENT(SubId) references Subject(SubId);

