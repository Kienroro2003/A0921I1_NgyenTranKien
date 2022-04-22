create database if not exists case_study_2;
use case_study_2;

create table customer_type(
customer_type_id int primary key auto_increment,
customer_type_name varchar(45)
);

insert into customer_type
values (1,"Diamond"),
(2,"Platinium"),
(3,"Gold"),
(4,"Silver"),
(5,"Member");

create table customer(
customer_id int primary key auto_increment,
customer_type_id int,
customer_name varchar(45),
customer_birthday date,
custmer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45),
foreign key (customer_type_id) references customer_type(customer_type_id)
);

insert into customer(customer_id,customer_name,customer_birthday,custmer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id)
values (1,"Nguyễn Thị Hào","1970-11-07",0,643431213,0945423362,"thihao07@gmail.com","23 Nguyễn Hoàng, Đà Nẵng",5),
(2,"Phạm Xuân Diệu","1992-08-08",1,865342123,0954333333,"xuandieu92@gmail.com","K77/22 Thái Phiên, Quảng Trị",3),
(3,"Trương Đình Nghệ","1990-02-27",1,488645199,0373213122,"nghenhan2702@gmail.com","K323/12 Ông Ích Khiêm, Vinh",1),
(4,"Dương Văn Quan","1981-07-08",1,543432111,0490039241,"duongquan@gmail.com","K453/12 Lê Lợi, Đà Nẵng",1),
(5,"Hoàng Trần Nhi Nhi","1995-12-09",0,795453345,0312345678,"nhinhi123@gmail.com","224 Lý Thái Tổ, Gia Lai",4),
(6,"Tôn Nữ Mộc Châu","2005-12-06",0,732434215,0988888844,"tonnuchau@gmail.com","37 Yên Thế, Đà Nẵng",4),
(7,"Nguyễn Mỹ Kim","1984-04-08",0,856453123,0912345698,"kimcuong84@gmail.com","K123/45 Lê Lợi, Hồ Chí Minh",1),
(8,"Nguyễn Thị Hào","1999-04-08",0,965656433,0763212345,"haohao99@gmail.com","55 Nguyễn Văn Linh, Kon Tum",3),
(9,"Trần Đại Danh","1994-07-01",1,432341235,0643343433,"danhhai99@gmail.com","24 Lý Thường Kiệt, Quảng Ngãi",1),
(10,"Nguyễn Tâm Đắc","1989-07-01",1,344343432,0987654321,"dactam@gmail.com","22 Ngô Quyền, Đà Nẵng",2);

create table `position`(
position_id int primary key,
position_name varchar(45)
);

insert into `position` 
values (1,"Quản Lý"),
(2,"Nhân Viên");

create table employee(
employee_id int primary key auto_increment not null,
employee_name varchar(45),
employee_birthdat date,
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int,
foreign key(position_id) references `position`(position_id)
);

update employee set employee_name = "nth" where employee_id = 2;

insert into employee
values(1,"Nguyễn Văn An","1970-11-07",456231786,10000000,0901234121,"annguyen@gmail.com","295 Nguyễn Tất Thành, Đà Nẵng",1),
(2,"Lê Văn Bình","1997-04-09",654231234,7000000,0934212314,"binhlv@gmail.com","22 Yên Bái, Đà Nẵng",1),
(3,"Hồ Thị Yến","1995-12-12",999231723,14000000,0412352315,"thiyen@gmail.com","K234/11 Điện Biên Phủ, Gia Lai",1),
(4,"Võ Công Toản","1980-04-04",123231365,17000000,0374443232,"toan0404@gmail.com","77 Hoàng Diệu, Quảng Trị",1),
(5,"Nguyễn Bỉnh Phát","1999-12-09",454363232,6000000,0902341231,"phatphat@gmail.com","43 Yên Bái, Đà Nẵng",2),
(6,"Khúc Nguyễn An Nghi","2000-11-08",964542311,7000000,0978653213,"annghi20@gmail.com","294 Nguyễn Tất Thành, Đà Nẵng",2),
(7,"Nguyễn Hữu Hà","1993-01-01",534323231,8000000,0941234553,"nhh0101@gmail.com","4 Nguyễn Chí Thanh, Huế",2),
(8,"Nguyễn Hà Đông","1989-09-03",234414123,9000000,0642123111,"donghanguyen@gmail.com","111 Hùng Vương, Hà Nội",2),
(9,"Tòng Hoang","1982-09-03",256781231,6000000,0245144444,"hoangtong@gmail.com","213 Hàm Nghi, Đà Nẵng",2),
(10,"Nguyễn Công Đạo","1994-01-08",755434343,8000000,0988767111,"nguyencongdao12@gmail.com","6 Hoà Khánh, Đồng Nai",2);

create table contract(
contract_id int primary key auto_increment,
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double,
employee_id int,
customer_id int,
service_id int,
foreign key (employee_id) references employee(employee_id),
foreign key (customer_id) references customer(customer_id),
foreign key (service_id) references service(service_id)
);

truncate table contract;

insert into contract
values(1,"2020-12-08 00:00:00","2020-12-08 00:00:00",0,3,1,3),
(2,"2020-07-14 00:00:00","2020-07-21 00:00:00",200000,7,3,1),
(3,"2021-03-15 00:00:00","2021-03-17 00:00:00",50000,3,4,2),
(4,"2021-01-14 00:00:00","2021-01-18 00:00:00",100000,7,5,5),
(5,"2021-07-14 00:00:00","2021-07-15 00:00:00",0,7,2,6),
(6,"2021-06-01 00:00:00","2021-06-03 00:00:00",0,7,7,6),
(7,"2021-09-02 00:00:00","2021-09-05 00:00:00",100000,7,4,4),
(8,"2021-06-17 00:00:00","2021-06-18 00:00:00",150000,3,4,1),
(9,"2020-11-19 00:00:00","2020-11-19 00:00:00",0,3,4,3),
(10,"2021-04-12 00:00:00","2021-04-14 00:00:00",0,10,3,5),
(11,"2021-04-25 00:00:00","2021-04-25 00:00:00",0,2,2,1),
(12,"2021-05-25 00:00:00","2021-05-27 00:00:00",0,7,10,1);

create table service(
service_id int primary key,
serive_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
standard_room varchar(45),
description_other_conveniece varchar(45),
pool_area double,
number_of_floors int
);

insert into service
values(1,"Villa Beach Front",25000,10000000,10,"vip","Có hồ bơi",500,4),
(2,"House Princess 01",14000,5000000,7,"vip","Có thêm bếp nướng",null,3),
(3,"Room Twin 01",5000,1000000,2,"normal","Có tivi",null,null),
(4,"Villa No Beach Front",22000,9000000,8,"normal","Có hồ bơi",300,3),
(5,"House Princess 02",10000,4000000,5,"normal","Có thêm bếp nướngi",null,2),
(6,"Room Twin 02",3000,900000,2,"normal","Có tivi",null,null);