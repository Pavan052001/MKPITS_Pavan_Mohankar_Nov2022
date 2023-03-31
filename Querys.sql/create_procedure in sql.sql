mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| emp_info           |
| information_schema |
| infyinterns_db     |
| inventorydb        |
| login_db_page      |
| moviesdb           |
| myfamilydb         |
| mysql              |
| performance_schema |
| sakila             |
| somalia2           |
| somaliadb          |
| somaliapdb1        |
| somaliapdb2        |
| sys                |
| world              |
+--------------------+
16 rows in set (0.01 sec)

mysql> use emp_info;
Database changed
mysql> show tables
    -> ;
+--------------------+
| Tables_in_emp_info |
+--------------------+
| emp_table          |
+--------------------+
1 row in set (0.00 sec)

/// create procedure

mysql> delimiter @
mysql> create procedure btm()
    -> begin
    -> select * from emp_table;
    -> end
    -> @
Query OK, 0 rows affected (0.01 sec)

mysql> call btm @
+------+-----------+-----------+
| id   | user_name | user_pass |
+------+-----------+-----------+
|    2 | sachin    | kalmbe    |
|    3 | vishal    | vishal    |
|    4 | Shubhan   | katre     |
|    1 | pavan     | mohankar  |
|    7 | omkar     | jivtode   |
|   11 | harish    | mohankar  |
+------+-----------+-----------+
6 rows in set (0.00 sec)

Query OK, 0 rows affected (0.01 sec)