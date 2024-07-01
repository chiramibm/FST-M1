REM   Script: Activity5-update
REM   SQL FST Training

select * from scott.emp;

select * from scott.emp;

select * from scott.emp;

create table salesman( 
    salesman_id int, 
    salesman_name   varchar2(20) 
    ,salesman_city  varchar2(20), 
    commission  int);

describe salesman


insert into salesman values(5001,James Hoog,New York,15);

insert into salesman values(5002,Nail Knite,Paris,13);

insert into salesman values(5005,Pit Alex,London,11);

insert into salesman values(5006,McLyon,Paris,14);

insert into salesman values(5007,Paul Adam,Rome,13);

insert into salesman values(5003,Lauson Hen,San Jose,12);

desc salesman


insert into salesman values(5001,James Hoog,New York,15);

insert into salesman values(5002,Nail Knite,Paris,13);

insert into salesman values(5001,'James Hoog','New York',15);

insert all 
 into salesman values(5002,'Nail Knite','Paris',13);

 into salesman values(5005,'Pit Alex','London',11); 


 into salesman values(5006,'McLyon','Paris',14); 


 into salesman values(5007,'Paul Adam','Rome',13); 


 into salesman values(5003,'Lauson Hen','San Jose',12);


insert all 
 into salesman values(5002,'Nail Knite','Paris',13);

 into salesman values(5005,'Pit Alex','London',11); 


 into salesman values(5006,'McLyon','Paris',14); 


 into salesman values(5007,'Paul Adam','Rome',13); 


 into salesman values(5003,'Lauson Hen','San Jose',12); 


SELECT 1 FROM DUAL;

insert all 
 into salesman values(5002,'Nail Knite','Paris',13) 
 into salesman values(5005,'Pit Alex','London',11) 
 into salesman values(5006,'McLyon','Paris',14) 
 into salesman values(5007,'Paul Adam','Rome',13) 
 into salesman values(5003,'Lauson Hen','San Jose',12) 
SELECT 1 FROM DUAL;

insert into salesman values(5001,'James Hoog','New York',15);

insert all 
 into salesman values(5002,'Nail Knite','Paris',13) 
 into salesman values(5005,'Pit Alex','London',11) 
 into salesman values(5006,'McLyon','Paris',14) 
 into salesman values(5007,'Paul Adam','Rome',13) 
 into salesman values(5003,'Lauson Hen','San Jose',12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

select salesman_id,salesman_city from salesman ;

desc salesman


select * from salesman where SALESMAN_CITY='paris';

select salesman_id,commission from salesman where salesman_name='Paul Adam';

select * from salesman where salesman_city ='paris';

select salesman_id,salesman_city from salesman;

select * from salesman where salesman_city ='Paris';

select salesman_id,commission from salesman where salesman_name='Paul Adam';

ALTER TABLE salesman 
ADD COLUMN grade int;

ALTER TABLE salesman 
ADD (COLUMN grade int);

ALTER TABLE salesman 
ADD  grade int;

update salesman set grade=100;

SELECT * FROM salesman;

desc salesman


update salesman set grade=200 where SALESMAN_CITY='Rome';

update salesman set grade=300 where SALESMAN_NAME='James Hoog';

update salesman set SALESMAN_NAME='McLyon' where SALESMAN_NAME='Pierre';

update salesman set SALESMAN_NAME='Pierre' where SALESMAN_NAME='McLyon';

select * salesman;

update salesman set grade=200 where SALESMAN_CITY='Rome';

update salesman set grade=300 where SALESMAN_NAME='James Hoog';

update salesman set SALESMAN_NAME='Pierre' where SALESMAN_NAME='McLyon';

select * from salesman ;

desc salesman


select * from salesman ;

