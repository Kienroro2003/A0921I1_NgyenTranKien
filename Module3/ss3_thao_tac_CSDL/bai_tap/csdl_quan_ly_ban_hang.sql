use QuanLyBanHang;

insert into Customer(cID, cName, cAge)
values (1,'Minh Quan',10);
insert into Customer(cID, cName, cAge)
values (2,'Ngoc Anh',20);
insert into Customer(cID, cName, cAge)
values (3,'Hong Anh',50);

select * 
from Customer;

insert into `Order`(oID, cID, oDate, oTotalPrice)
values(1,1,'2006-3-21',null);
insert into `Order`(oID, cID, oDate, oTotalPrice)
values(2,2,'2006-3-23',null);
insert into `Order`(oID, cID, oDate, oTotalPrice)
values(3,1,'2006-3-16',null);
select * 
from `Order`;

insert into Product(pID,pName,pPrice)
values(1,'May Giat',3);
insert into Product(pID,pName,pPrice)
values(2,'Tu Lanh',3);
insert into Product(pID,pName,pPrice)
values(3,'Dieu Hoa',3);
insert into Product(pID,pName,pPrice)
values(4,'Quat',3);
insert into Product(pID,pName,pPrice)
values(5,'Bep Dien',3);
select * 
from Product;

insert into OrderDetail(oID,pID,odQTY)
values (1,1,3);
insert into OrderDetail(oID,pID,odQTY)
values (1,3,7);
insert into OrderDetail(oID,pID,odQTY)
values (1,4,2);
insert into OrderDetail(oID,pID,odQTY)
values (2,1,1);
insert into OrderDetail(oID,pID,odQTY)
values (3,1,8);
insert into OrderDetail(oID,pID,odQTY)
values (2,5,4);
insert into OrderDetail(oID,pID,odQTY)
values (2,3,3);
select *
from OrderDetail;

-- 1
select oID, cID, oDate
from `Order`;
-- 2
select c.cName as Name,p.pName as Product
from Customer as c
join `Order` as o on c.cID = o.oID
join OrderDetail as od on o.oID = od.oID
left join Product as p on od.pID =p.pID ;
-- 3
select *
from Customer as c
join `Order` as o on c.cID = o.oID
;
-- 4
select o.oID, o.oDate, sum(p.pPrice * od.odQTY)  as total
from `Order` as o
join OrderDetail as od on o.oID = od.oID
join Product as p on od.pID = p.pID
group by o.oID,p.pID;



