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
A1.sell_date```