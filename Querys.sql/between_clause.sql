/// betweem clause.
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

mysql> select *from familymembers where mid between 1 and 5;
+------+------------------+------+----------+------------+------------+
| mid  | Name             | Age  | relation | Address    | Phone      |
+------+------------------+------+----------+------------+------------+
|    1 | khushal mohankar |   52 | baba     | At stagaon | 97677969   |
|    2 | vanita mohankar  |   46 | aai      | At stagaon | 9767796980 |
|    3 | bharti mohankar  |   25 | tai      | At stagaon | 9960870673 |
|    4 | Harish mohankar  |   23 | bhai     | At stagaon | 9552307590 |
|    5 | Mahadev nanhe    |   75 | nanaji   | At stagaon | 9552307590 |
+------+------------------+------+----------+------------+------------+
5 rows in set (0.00 sec)