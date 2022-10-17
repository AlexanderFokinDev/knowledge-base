## Исправление ошибки `Обнаружена незавершенная операция сохранения конфигурации` после динамического обновления

```sql
DELETE FROM configsave
DELETE FROM config WHERE FileName = 'commit'
DELETE FROM config WHERE FileName = 'dynamicCommit'
DELETE FROM config WHERE FileName = 'dbStruFinal'
```