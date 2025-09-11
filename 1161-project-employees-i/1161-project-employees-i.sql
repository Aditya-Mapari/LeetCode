# Write your MySQL query statement belowd

select p.project_id as project_id , ROUND(SUM(e.experience_years ) / count(p.project_id), 2) AS average_years
from Project p
 join Employee e
on p.employee_id = e.employee_id
group by p.project_id ;