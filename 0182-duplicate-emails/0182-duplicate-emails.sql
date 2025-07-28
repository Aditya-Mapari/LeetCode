# Write your MySQL query statement below
select email As Email from Person Group by email Having COUNT(email) > 1;