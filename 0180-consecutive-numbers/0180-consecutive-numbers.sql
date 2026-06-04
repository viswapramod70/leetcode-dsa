/* Write your T-SQL query statement below */
with cte as
(SELECT id,num, LAG(num,1) OVER(ORDER BY id) as prev_val,
               LEAD(num,1) OVER(ORDER BY id) as next_val
FROM Logs)

SELECT DISTINCT num AS ConsecutiveNums FROM cte
WHERE num = prev_val AND num = next_val;