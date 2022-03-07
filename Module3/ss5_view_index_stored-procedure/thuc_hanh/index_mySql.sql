use classicmodels;

explain select *
from customers
where customerName = 'Land of Toys Inc.';

alter table customers add index idx_customerName(customerName);

drop index idx_customerName on customers;

