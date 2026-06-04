/* Write your T-SQL query statement below */
with cte as(
    SELECT player_id, MIN(event_date) AS first_login_date
    FROM Activity
    GROUP BY player_id
)

SELECT round(count(DISTINCT a.player_id)*1.0/(SELECT count(DISTINCT player_id) FROM Activity),2) as fraction
FROM Activity a
JOIN cte ON a.player_id = cte.player_id
AND a.event_date = dateadd(day,1,cte.first_login_date)