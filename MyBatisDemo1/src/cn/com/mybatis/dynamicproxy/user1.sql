 create table d_user(
 u_no number,
 n_name varchar2(15),
 u_age number(3),
 u_sex char(2)
 );
 
 
 insert into d_user values (1001,'Brain',35,'男');
 insert into d_user values (1002,'Jerry',22,'女');
 insert into d_user values (1003,'Tom',24,'男');
 insert into d_user values (1004,'Kate',30,'女');
 
 commit;