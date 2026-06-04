# Write your MySQL query statement below
SELECT manager as name FROM
(SELECT e.id,e.name,m.id as managerId,m.name as manager
FROM Employee e LEFT JOIN Employee m
ON e.managerId = m.id) a
GROUP BY managerId
HAVING count(managerId)>=5