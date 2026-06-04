# Write your MySQL query statement below
-- SELECT MAX(salary) AS SecondHighestSalary FROM Employee WHERE salary<(SELECT MAX(salary) FROM Employee)

SELECT max(case when  rn=2 then salary else null end) AS SecondHighestSalary 
FROM (SELECT salary, DENSE_RANK() OVER(ORDER BY salary DESC) AS rn FROM Employee) a 