## Clickhouse
[Official documentation](https://clickhouse.com/docs/en/home/)

#### 1. Expand array elements

```sql
SELECT
    doc_title,
    document_access_people_id_arr AS user_id
FROM     
    local_db.stg_finance_documents
    ARRAY JOIN document_access_people_id_arr
WHERE 
    user_id like '%AE%'
```

#### 2. Find null discrepancies in two tables

```sql
with

group_by_account_old as (
select 
    acc_id, 
    count(*) as counts, 
    acc_id || ' ' ||  toString(counts) as id
from test_int_attr_weights1
group by acc_id            ),

group_by_account_new as (
select 
    acc_id, 
    count(*) as counts, 
    acc_id || ' ' ||  toString(counts) as id
from test_int_attr_weights
group by acc_id            )

select *
from group_by_account_old
left join group_by_account_new
using id
where group_by_account_new.id is null
```

#### 3. EXCEPT. Find rows discrepancies in two tables

```sql
SELECT * FROM test_int_attr_weights1
EXCEPT
SELECT * FROM test_int_attr_weights
```

#### 4. Quantiles. Divide a table by parts

```sql
SELECT
    toString(toFloat64(min(toUInt64(acc_id)))) as min_range,
    toString(toFloat64(max(toUInt256(acc_id)))) as max_range,
    arrayStringConcat(quantiles(1/10, 2/10, 3/10, 4/10, 5/10, 6/10, 7/10, 8/10, 9/10, 10/10)(toUInt256(acc_id)), ',') as quantiles_acc
FROM
    test_attribution_union
```