-- # Write your MySQL query statement below
-- SELECT r.contest_id ,ROUND((SELECT DISTINCT COUNT(*) FROM Register GROUP BY contest_id)/SELECT COUNT(*) FROM Users)*100,2) AS percentage FROM Register r ORDER BY percentage DESC,contest_id ASC

select contest_id, round(count(*)*100/(select count(*) from users),2) AS percentage from Register Group By contest_id Order By percentage DESC, contest_id ASC