use QuanLySinhVien;
-- 1 
select * 
from Student 
where StudentName like 'h%';
-- 2
select *
from Class
where month(StartDate) = 12;
-- 3
select *
from Subject 
where (Credit between 3 and 5 );
-- 4
update Student as s
join Class as c on s.StudentID = c.ClassID
set s.ClassID = 2
where s.StudentName = 'Hung';
set sql_safe_updates = 0;
-- 5
select s.StudentName, sj.SubName, m.Mark
from Student as s
join Subject as sj on s.StudentID = sj.SubID
join Mark as m on m.StudentID = s.StudentID
order by m.Mark desc, s.StudentName asc;