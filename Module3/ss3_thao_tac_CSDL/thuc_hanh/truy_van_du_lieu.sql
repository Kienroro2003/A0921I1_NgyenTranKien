use QuanLySinhVien;

select *
from Student;

select * 
from Student 
where Status = true;

select *
from Subject 
where Credit < 10;

select c.ClassName, s.StudentName, s.StudentID
from Student as s join Class as c on c.ClassID = s.ClassID
where c.ClassName = 'A1';

SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';