# Write your MySQL query statement below
select max(num) as num
from(select num from Mynumbers group by num Having count(*) = 1) AS single_numbers;