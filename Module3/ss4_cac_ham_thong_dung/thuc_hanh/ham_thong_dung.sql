use QuanLySinhVien;

select * 
from Student;

select * 
from Mark;

select Address, count(StudentID) as 'Số lượng sinh viên'
from Student
group by Address;

select s.StudentID, s.StudentName, avg(Mark) 
from Student as s
join Mark as m on m.StudentId = s.StudentID
group by s.StudentID, s.StudentName;

select s.StudentID, s.StudentName, avg(Mark) as tb
from Student as s
join Mark as m on m.StudentId = s.StudentID
group by s.StudentID, s.StudentName
having tb > 15;

select s.StudentID, s.StudentName, avg(Mark) as tb
from Student as s
join Mark as m on m.StudentId = s.StudentID
group by s.StudentID, s.StudentName
having tb >= all (select avg(Mark) from Mark as m group by m.StudentID);