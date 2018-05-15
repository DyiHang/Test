create table user(
id int(11) not null auto_increment,
username varchar(32) not null comment'用户名称',
birthday date Default null comment'生日',
sex char(1) default null comment'性别',
address varchar(256) default null comment'地址',
primary key(id)
)engine=innodb auto_increment=27 default charset=utf8;

insert into user values (1,'张三',null,'2',null);
insert into user values (10,'博瑞','2018-02-10','2','北京市');
insert into user values (16,'李四',null,'1','河南郑州');
insert into user values (22,'王五光',null,'1','河北唐山');
insert into user values (24,'张三光',null,'1','山西太原');
insert into user values (25,'李四光',null,'1','山东菏泽');
insert into user values (25,'张三',null,null,null);
