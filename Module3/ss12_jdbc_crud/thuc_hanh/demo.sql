create database if not exists user;

use user;


create table users(
id int(3) not null auto_increment,
name varchar(120) not null,
email varchar(120) not null,
country varchar(120) not null,
primary key(id)
);

create table Permision(
id int(11) primary key,
name varchar(50)
);

create table User_Permision(
permision_id int(11),
user_id int(11)
);


insert into Permision(id, name) values(1, 'add');

insert into Permision(id, name) values(2, 'edit');

insert into Permision(id, name) values(3, 'delete');

insert into Permision(id, name) values(4, 'view');

insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');

DELIMITER $$

CREATE PROCEDURE get_user_by_id(IN user_id INT)

BEGIN

    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END$$

DELIMITER ;

DELIMITER $$

CREATE PROCEDURE insert_user(IN user_name varchar(50),IN user_email varchar(50),in user_country varchar(50))

BEGIN
INSERT INTO users(name, email, country) values (user_name,user_email,user_country);
END$$
DELIMITER ;
select *
from users; 
update users 
set name = "hee"
where id = 9;
select *
from User_Permision;
select *
from permision;

delete from users where id = 20;

delimiter $$
create procedure select_all_user()
begin
select * from users;
end$$
delimiter ;
call select_all_user();

delimiter $$
create procedure update_user(in `name` varchar(100), email varchar(100), country varchar(100), id int)
begin
update users
set users.name = `name`, users.email = email, users.country = country
where users.id = id;
end $$
delimiter ;

call update_user("Kien",'kienroro1703@gmail.com',"Da Nang",10);

call select_all_user;

delimiter $$
create procedure delete_user_procedure(in id int)
begin
delete from users where users.id = id;
end $$
delimiter ;

call delete_user_procedure(31);