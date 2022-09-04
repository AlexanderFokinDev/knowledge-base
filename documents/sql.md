## SQL, Transact-SQL (T-SQL)

#### 1. Concat a list of fields in a one field. Keyword `GROUP_CONCAT`

```sql
SELECT
    A1.sell_date,
    Count(DISTINCT A1.product) AS num_sold,
    GROUP_CONCAT(DISTINCT A1.product
        ORDER BY A1.product ASC SEPARATOR ',') AS products
FROM
    Activities AS A1
GROUP BY
    A1.sell_date
```


#### 2. UPDATE a table. Examples

```sql
UPDATE Salary
SET sex = if(sex='m', 'f', 'm')
```


#### 3. Select top rows from the table. Example. Keyword `LIMIT`

```sql
SELECT 
    customer_number
FROM
    (SELECT
        customer_number,
        COUNT(order_number) AS order_count
    FROM
        Orders
    GROUP BY
        customer_number) AS GroupTable
ORDER BY
    order_count DESC,
    customer_number
LIMIT 1
```

#### 4. Using the conditional operator. Example. Keyword `IF (<condition>, <true_value>, <false_value>)`

```sql
SELECT
    innerTable.name,
    innerTable.travelled_distance
FROM
( SELECT
    Users.id AS user_id,
    Users.name AS name,
    SUM(IF(Rides.distance is NULL, 0, Rides.distance))  AS travelled_distance
FROM
    Users LEFT JOIN Rides
    ON Rides.user_id = Users.id
GROUP BY
    Users.id,
    Users.name
 ) AS innerTable
ORDER BY
    travelled_distance DESC,
    name
```

```sql
SELECT
    IF(id%2=0, id-1, 
       IF(id = countRows.size, id, id+1)) AS id,
    student
FROM
    Seat,
    (SELECT Count(id) AS size FROM Seat) countRows
ORDER BY
    id
```

#### 5. Using the case operator and the left operator. Example. 
#### Keyword `CASE WHEN <condition1> THEN <value1> WHEN <condition2> THEN <value2> ELSE <value_default> END` 
#### and 'LEFT(<string>, <count_symbols>)'

```sql
SELECT
    employee_id,
    CASE
        WHEN employee_id % 2 <> 0 AND LEFT(name, 1) <> 'M' THEN salary
        ELSE 0
    END AS bonus
FROM
    Employees
ORDER BY
    employee_id
```