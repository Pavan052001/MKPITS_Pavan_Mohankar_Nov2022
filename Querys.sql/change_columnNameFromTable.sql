
//// change column name from table .

mysql> select * from familymembers;
+------+------------------+------+-----------+------------+------------+
| mid  | Name             | Age  | relation  | Address    | Phone      |
+------+------------------+------+-----------+------------+------------+
|    1 | khushal mohankar |   52 | baba      | At stagaon | 97677969   |
|    2 | vanita mohankar  |   46 | aai       | At stagaon | 9767796980 |
|    3 | bharti mohankar  |   25 | tai       | At stagaon | 9960870673 |
|    4 | Harish mohankar  |   23 | bhai      | At stagaon | 9552307590 |
|    5 | Mahadev nanhe    |   75 | nanaji    | At stagaon | 9552307590 |
|    6 | kamlabai nanhe   |   60 | nani      | At stagaon | 9552307590 |
|    7 | hemant nanhe     |   47 | mama      | At stagaon | 8087888190 |
|    8 | nalini nanhe     |   43 | mami      | At stagaon | 8087888190 |
|    9 | raju durge       |   56 | bade papa | At nagpur  | 9960876820 |
|   10 | rekha durge      |   51 | badi aai  | At Nagpur  | 9960876820 |
+------+------------------+------+-----------+------------+------------+
10 rows in set (0.01 sec)

mysql> select name as nam from familymembers;
+------------------+
| nam              |
+------------------+
| khushal mohankar |
| vanita mohankar  |
| bharti mohankar  |
| Harish mohankar  |
| Mahadev nanhe    |
| kamlabai nanhe   |
| hemant nanhe     |
| nalini nanhe     |
| raju durge       |
| rekha durge      |
+------------------+
10 rows in set (0.00 sec)