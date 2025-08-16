# Write your MySQL query statement below
select  teacher_id , count(DISTINCT subject_id) As cnt
from Teacher
group by teacher_id;