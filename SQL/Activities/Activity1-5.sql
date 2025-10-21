--Activity1: Create table
CREATE TABLE salesman(
salesman_id int PRIMARY KEY,
salesman_name varchar2(20),
salesman_city varchar2(20),
commission int
 )

describe salesman
--Activity 2: Insert values into salesman table
-- Insert one row
INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

-- Insert multiple rows at once
INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View data from all columns
SELECT * FROM salesman;

--Activity 3: To display data from salesman table
select salesman_id ,salesman_city  from salesman;

select * from salesman where salesman_city='Paris';

select salesman_id ,commission from salesman where salesman_name='Paul Adam';

--Activity 4

Alter table salesman add grade int;
describe salesman
update salesman set grade=100;
select * from salesman;

-- Activity 5

update salesman set grade=200 where salesman_City='Rome';

update salesman set grade=300 where salesman_Name='James Hoog';

update salesman set salesman_Name='Pierre' where salesman_Name='McLyon';

select * from salesman