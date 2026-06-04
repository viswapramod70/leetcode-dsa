CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT MAX(CASE WHEN rn=N THEN salary ELSE null END) FROM(
        SELECT salary, DENSE_RANK() OVER(ORDER BY salary DESC) AS rn FROM Employee
      )a

  );
END