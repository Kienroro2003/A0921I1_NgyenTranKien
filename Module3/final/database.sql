create database if not exists java;
use java;

create table benh_an(
id int auto_increment primary key,
ma_benh_an varchar(45),
ma_benh_nhan varchar(45) ,
ten_benh_nhan varchar (45),
ngay_nhap_vien date,
ngay_ra_vien date,
ly_do varchar(100)
);

insert into benh_an values(1,"BA-001","BN-435","Nguyễn Văn A", "2016-08-07","2019-08-08","Ung thu"),
(2,"BA-001","BN-435","Nguyễn Văn A", "2016-08-07","2019-08-08","Ung thu"),
(3,"BA-001","BN-435","Nguyễn Văn A", "2016-08-07","2019-08-08","Ung thu"),
(4,"BA-001","BN-435","Nguyễn Văn A", "2016-08-07","2019-08-08","Ung thu");
