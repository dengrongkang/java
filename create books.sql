-- Create table
create table BOOKS
(
  bookid   NUMBER not null,
  bname    VARCHAR2(20),
  writer   VARCHAR2(20),
  type     VARCHAR2(20),
  price    NUMBER,
  isdelete NUMBER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns 
comment on column BOOKS.isdelete
  is '0&1';
-- Create/Recreate primary, unique and foreign key constraints 
alter table BOOKS
  add constraint BOOKID_KEY primary key (BOOKID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

insert into userdb values(710401,'老人与海','海明威','文学',16.1,0);
insert into userdb values(710402,'蛙','莫言','文学',24.5,0);
insert into userdb values(710403,'战胜华尔街','皮特灵奇','经管',33.6,0);
insert into userdb values(710404,'十年徒步','雷殿生','生活',28.8,0);
insert into userdb values(710405,'火影忍者','岸本齐史','漫画',100,0);
