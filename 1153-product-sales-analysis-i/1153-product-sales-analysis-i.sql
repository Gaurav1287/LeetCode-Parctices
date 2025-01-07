# Write your MySQL query statement below
Select B.product_name,A.year,A.price 
from Sales A 
INNER JOIN Product B 
ON
A.product_id=B.product_id 
ORDER BY 
A.year Asc;