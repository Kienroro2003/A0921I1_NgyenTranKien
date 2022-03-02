create database if not exists QuanLyDiemThi;
use QuanLyDiemThi;

create table HocSinh(
id varchar(20) primary key,
name varchar(20),
birthDay datetime,
class varchar(20),
gt varchar(20)
);

create table MonHoc(
MaMH varchar(20) primary key,
TenMH varchar(50)
);

create table BangDiem(
MaHS varchar(20),
MaMH varchar(20),
DiemThi int,
NgayKT datetime,
primary key(MaHS, MaMH),
foreign key (MaHS) references HocSinh(id),
foreign key (MaMH) references MonHoc(MaMH)
);

create table GiaoVien(
MaGV varchar(20) primary key,
TenGV varchar(20),
SDT varchar(10)
);

alter table MonHoc add MaGV varchar(20);
alter table MonHoc add constraint FK_MaGV foreign key (MaGV) references GiaoVien(MaGV);