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