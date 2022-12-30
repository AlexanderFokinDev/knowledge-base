## DBT
[Official documentation](https://docs.getdbt.com/)

#### 1. Build model in the target destination with a different name

Example:
Filename = my_inner_model.sql

```sql
{{ config( alias='new_model_name' ) }}
```