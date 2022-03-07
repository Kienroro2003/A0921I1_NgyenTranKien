create database if not exists demo;
use demo;

create table Products(
Id int primary key auto_increment not null,
productCode int,
productName varchar(50),
productPrice int,
productAmount int,
productDescripion varchar(50),
productStatus bit
);

insert into Products
values(1,1,"ban phim",2000000,3,"con hang",1),
(2,2,"ban phim",2100000,3,"con hang",1),
(3,3,"ban phim",2200000,12,"het hang",0),
(4,4,"ban phim",2300000,22,"con hang",1),
(5,5,"ban phim",2400000,3,"het hang",0);

drop index idx_name on Products;
create unique index idx_unique on Products(productCode);

create index idx_composite on Products(productName, productPrice);

select *
from Products
where productName = 'ban phim';





update Products 
set productAmount = 12
where Id = 3;

select *
from Products;

create view findAllView as
select productCode, productName, productPrice, productStatus
from Products;

select *
from findAllView;

select *
from findAllView
where productCode = 1;

drop view findAllView;

-- 3
delimiter $$
create procedure displayAll()
begin
select *
from Products;

end $$
delimiter ;

call displayAll();

delimiter $$
create procedure addNew(in id int, productCode int, productName varchar(50), productPrice int, productAmount int, productDescripion varchar(50), productStatus bit)
begin
insert into Products values (id,productCode,productName, productPrice, productAmount, productDescripion, productStatus);

end $$
delimiter ;

call addNew(13,13,"kem danh rang",12000,100,"con hang",1);

delimiter $$
create procedure updateData(in id int)
begin
update Products as p
set productPrice = 12345
where p.Id = id;

end $$
delimiter ;

call updateData(13);

delimiter $$
create procedure delData(in id int)
begin
delete from Products as p
where p.Id = id;

end $$
delimiter ;

call delData(13);

