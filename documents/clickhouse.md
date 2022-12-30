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
