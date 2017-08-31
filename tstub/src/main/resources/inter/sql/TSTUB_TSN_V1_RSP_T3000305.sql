-- Create table
create table TSTUB_TSN_V1_RSP_T3000305
(
  ID                VARCHAR2(50 CHAR) primary key not null,
  SVCCONT           VARCHAR2(50 CHAR),
  GPRSPAUSERSP      VARCHAR2(50 CHAR),
  MSGTRANSACTIONID  VARCHAR2(50 CHAR),
  CFMRESULTCODE     VARCHAR2(50 CHAR),
  CFMRESULTCODEDESC VARCHAR2(50 CHAR),
  GPRSPAUSEINFO     VARCHAR2(50 CHAR),
  MSISDN            VARCHAR2(50 CHAR),
  PROVCODE          VARCHAR2(50 CHAR),
  OPRTIMSI          VARCHAR2(50 CHAR),
  SERVTYPE          VARCHAR2(50 CHAR),
  EFFTIMSI          VARCHAR2(50 CHAR),
  SERVPARAMINFO     VARCHAR2(50 CHAR)
);
-- Add comments to the table 
comment on table TSTUB_TSN_V1_RSP_T3000305
  is '数据功能暂停/恢复请求接口';
-- Add comments to the columns 
comment on column TSTUB_TSN_V1_RSP_T3000305.MSISDN
  is '手机号码';
comment on column TSTUB_TSN_V1_RSP_T3000305.PROVCODE
  is '省代码';
comment on column TSTUB_TSN_V1_RSP_T3000305.SVCCONT
  is '请求内容';
comment on column TSTUB_TSN_V1_RSP_T3000305.CFMRESULTCODE
  is '处理结果码';
comment on column TSTUB_TSN_V1_RSP_T3000305.CFMRESULTCODEDESC
  is '处理结果描述';
comment on column TSTUB_TSN_V1_RSP_T3000305.EFFTIMSI
  is '服务暂停/恢复生效时间';
comment on column TSTUB_TSN_V1_RSP_T3000305.GPRSPAUSEINFO
  is '业务暂停/恢复信息';
comment on column TSTUB_TSN_V1_RSP_T3000305.GPRSPAUSERSP
  is '业务应答信息';
comment on column TSTUB_TSN_V1_RSP_T3000305.MSGTRANSACTIONID
  is '业务应答流水号';
comment on column TSTUB_TSN_V1_RSP_T3000305.OPRTIMSI
  is '省boss服务功能暂停/恢复处理时间';
comment on column TSTUB_TSN_V1_RSP_T3000305.SERVPARAMINFO
  is '业务受理信息';
comment on column TSTUB_TSN_V1_RSP_T3000305.SERVTYPE
  is '服务类型';
