create database if not exists QuanLyBanHang;
use QuanLyBanHang;

create table Customer(
cID int primary key auto_increment,
cName varchar(50),
cAge int
);

create table `Order`(
oID int primary key auto_increment,
cID int,
oDate datetime,
oTotalPrice int
);
alter table `Order` add constraint FK_cID foreign key (cID) references Customer(cID);

create table Product(
pID int primary key auto_increment,
pName varchar(50),
pPrice int
);

create table OrderDetail(
oID int,
pID int,
odQTY int,
foreign key(oID) references `Order`(oID),
foreign key(pID) references Product(pID)
);