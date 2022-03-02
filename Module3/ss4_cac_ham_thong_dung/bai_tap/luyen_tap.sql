use QuanLySinhVien;

select * 
from Subject;

select * 
from Mark;
-- 1
select * 
from Subject as s
where s.credit >= all(select credit from Subject);
-- 2
select*
from Subject as sj
join Mark as m on sj.SubID = m.SubID
where m.mark >= all (select mark from mark); 
-- 3
select * , avg(Mark) as tb
from Student as s
join Mark as m on s.StudentID = m.StudentId
group by m.StudentId
order by tb desc;