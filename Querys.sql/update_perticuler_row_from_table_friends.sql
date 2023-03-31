// Update specific row from table.

mysql> select * from friends;
+------+-------------------+------+-----------------+------------+------------+
| Sr   | Name              | Age  | Relation        | Address    | Phone      |
+------+-------------------+------+-----------------+------------+------------+
|    1 | khushal Bhajipale |   22 | Doremon friend  | At Satgaon | 1234567890 |
|    2 | Sachin kalmbe     |   22 | degisugi friend | At narkhed | 9877655443 |
|    3 | vishal hedau      |   24 | sinchan friend  | At satgaon | 1234567890 |
|    4 | rudra sha         |   27 | sinchan friend  | At sikkim  | 9765648944 |
|    5 | satyam            |   20 | sanskari friend | At bihar   | 1234567890 |
|    6 | bharat gayki      |   23 |  friend         | At nagpur  | 1234567890 |
|    7 | Akash mankar      |   23 |  yogi friend    | At Satgaon | 1234567890 |
|    9 | bharati dakhate   |   26 |  friend         | At nagpur  | 1234567890 |
|   10 | pranay jumbde     |   24 | friend          | nagpur     | 9765459800 |
+------+-------------------+------+-----------------+------------+------------+
9 rows in set (0.00 sec)

mysql> update friends set sr=8 where Age=24;
Query OK, 2 rows affected (0.02 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> select * from friends;
+------+-------------------+------+-----------------+------------+------------+
| Sr   | Name              | Age  | Relation        | Address    | Phone      |
+------+-------------------+------+-----------------+------------+------------+
|    1 | khushal Bhajipale |   22 | Doremon friend  | At Satgaon | 1234567890 |
|    2 | Sachin kalmbe     |   22 | degisugi friend | At narkhed | 9877655443 |
|    8 | vishal hedau      |   24 | sinchan friend  | At satgaon | 1234567890 |
|    4 | rudra sha         |   27 | sinchan friend  | At sikkim  | 9765648944 |
|    5 | satyam            |   20 | sanskari friend | At bihar   | 1234567890 |
|    6 | bharat gayki      |   23 |  friend         | At nagpur  | 1234567890 |
|    7 | Akash mankar      |   23 |  yogi friend    | At Satgaon | 1234567890 |
|    9 | bharati dakhate   |   26 |  friend         | At nagpur  | 1234567890 |
|    8 | pranay jumbde     |   24 | friend          | nagpur     | 9765459800 |
+------+-------------------+------+-----------------+------------+------------+
9 rows in set (0.00 sec)
