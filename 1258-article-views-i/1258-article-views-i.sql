# Write your MySQL query statement below
select DISTINCT author_id As id from Views WHERE author_id = viewer_id
ORDER BY author_id ASC;