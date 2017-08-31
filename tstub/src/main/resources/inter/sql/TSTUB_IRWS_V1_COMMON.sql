-- Create table
create table TSTUB_IRWS_V1_COMMON
(
  ID           VARCHAR2(50 CHAR) primary key not null,
  GROAMING     VARCHAR2(50 CHAR),
  HEADER       VARCHAR2(50 CHAR),
  ACTIVITYCODE VARCHAR2(50 CHAR),
  REQSYS       VARCHAR2(50 CHAR),
  MSISDN       VARCHAR2(50 CHAR),
  ACESSCODE    VARCHAR2(50 CHAR),
  REQDATE      VARCHAR2(50 CHAR),
  REQTRANSID   VARCHAR2(50 CHAR),
  REQDATETIME  VARCHAR2(50 CHAR),
  ACTIONCODE   VARCHAR2(50 CHAR),
  RCVSYS       VARCHAR2(50 CHAR),
  RCVDATE      VARCHAR2(50 CHAR),
  RCVTRANSID   VARCHAR2(50 CHAR),
  RCVDATETIME  VARCHAR2(50 CHAR),
  RSPCODE      VARCHAR2(50 CHAR),
  RSPDESC      VARCHAR2(50 CHAR),
  BODY         VARCHAR2(50 CHAR),
  COMMON       VARCHAR2(2000 CHAR)
);
-- Add comments to the table 
comment on table TSTUB_IRWS_V1_COMMON
  is '国漫H5接口规范报文头';
-- Add comments to the columns 
comment on column TSTUB_IRWS_V1_COMMON.ACESSCODE
  is '渠道编码';
comment on column TSTUB_IRWS_V1_COMMON.ACTIONCODE
  is '交易动作代码';
comment on column TSTUB_IRWS_V1_COMMON.ACTIVITYCODE
  is '交易代码';
comment on column TSTUB_IRWS_V1_COMMON.BODY
  is '消息报文体';
comment on column TSTUB_IRWS_V1_COMMON.HEADER
  is '消息报文头';
comment on column TSTUB_IRWS_V1_COMMON.MSISDN
  is '用户手机号码';
comment on column TSTUB_IRWS_V1_COMMON.RCVDATE
  is '接收方交易日期';
comment on column TSTUB_IRWS_V1_COMMON.RCVDATETIME
  is '接收方时间戳';
comment on column TSTUB_IRWS_V1_COMMON.RCVSYS
  is '接收方系统编码';
comment on column TSTUB_IRWS_V1_COMMON.RCVTRANSID
  is '接收方交易流水号';
comment on column TSTUB_IRWS_V1_COMMON.REQDATE
  is '发起方日期';
comment on column TSTUB_IRWS_V1_COMMON.REQDATETIME
  is '发起方时间戳';
comment on column TSTUB_IRWS_V1_COMMON.REQSYS
  is '发起方系统编码';
comment on column TSTUB_IRWS_V1_COMMON.REQTRANSID
  is '发起方交易流水号';
comment on column TSTUB_IRWS_V1_COMMON.RSPCODE
  is '应答/错误代码';
comment on column TSTUB_IRWS_V1_COMMON.RSPDESC
  is '应答/错误描述代码';