 * Select clause

mysql> show tables;
+--------------------+
| Tables_in_project1 |
+--------------------+
| loginpage          |
| user               |
+--------------------+
2 rows in set (0.00 sec)

mysql> select * from user;
+----+-------+-----------------------+-------------+----------+--------------+------+--------------+
| ID | Name  | E_mail                | Mobile      | pass     | Reporting_to | role | joining_date |
+----+-------+-----------------------+-------------+----------+--------------+------+--------------+
|  1 | pavan | NULL                  | NULL        | 123      | NULL         | 1    | NULL         |
|  2 | pavan | pavanmohkat@gmail.com | 09552307590 | Pass@123 | 1,2          | 3    | 2023-03-31   |
|  3 | pavan | pavanmohkat@gmail.com | 09552307590 | Pass@123 | 1            | 2    | 2023-03-31   |
+----+-------+-----------------------+-------------+----------+--------------+------+--------------+
3 rows in set (0.00 sec)

mysql> select * from user where role=2;
+----+-------+-----------------------+-------------+----------+--------------+------+--------------+
| ID | Name  | E_mail                | Mobile      | pass     | Reporting_to | role | joining_date |
+----+-------+-----------------------+-------------+----------+--------------+------+--------------+
|  3 | pavan | pavanmohkat@gmail.com | 09552307590 | Pass@123 | 1            | 2    | 2023-03-31   |
+----+-------+-----------------------+-------------+----------+--------------+------+--------------+
1 row in set (0.00 sec)