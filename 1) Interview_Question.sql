1) Interview Question

mysql> select * from hotel;
+------+------+---------+
| id   | year | revenue |
+------+------+---------+
|    1 | 2015 |   23000 |
|    2 | 2016 |   25320 |
|    3 | 2017 |   18810 |
|    4 | 2018 |   20000 |
|    5 | 2019 |   31650 |
|    6 | 2020 |   20210 |
+------+------+---------+
6 rows in set (0.06 sec)

mysql> select year ,revenue as current ,lag(revenue) over(order by year) as privious from hotel;
+------+---------+----------+
| year | current | privious |
+------+---------+----------+
| 2015 |   23000 |     NULL |
| 2016 |   25320 |    23000 |
| 2017 |   18810 |    25320 |
| 2018 |   20000 |    18810 |
| 2019 |   31650 |    20000 |
| 2020 |   20210 |    31650 |
+------+---------+----------+
6 rows in set (0.01 sec)

mysql> select year ,revenue as current ,lag(revenue) over(order by year) as privious,revenue - lag(revenue) over(order by year) as difference from hotel;
+------+---------+----------+------------+
| year | current | privious | difference |
+------+---------+----------+------------+
| 2015 |   23000 |     NULL |       NULL |
| 2016 |   25320 |    23000 |       2320 |
| 2017 |   18810 |    25320 |      -6510 |
| 2018 |   20000 |    18810 |       1190 |
| 2019 |   31650 |    20000 |      11650 |
| 2020 |   20210 |    31650 |     -11440 |
+------+---------+----------+------------+
6 rows in set (0.01 sec)