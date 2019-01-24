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

insert into userdb values(710401,'�����뺣','������','��ѧ',16.1,0);
insert into userdb values(710402,'��','Ī��','��ѧ',24.5,0);
insert into userdb values(710403,'սʤ������','Ƥ������','����',33.6,0);
insert into userdb values(710404,'ʮ��ͽ��','�׵���','����',28.8,0);
insert into userdb values(710405,'��Ӱ����','������ʷ','����',100,0);