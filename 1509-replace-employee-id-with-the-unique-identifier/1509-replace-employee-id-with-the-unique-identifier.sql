SELECT 
    B.unique_id, 
    A.name 
FROM 
    Employees A
LEFT JOIN 
    EmployeeUNI B
ON 
    A.id = B.id
ORDER BY 
    A.id;
 
