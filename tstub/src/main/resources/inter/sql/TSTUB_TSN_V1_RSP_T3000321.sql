-- Create table
create table TSTUB_TSN_V1_RSP_T3000321
(
  ID                VARCHAR2(50 CHAR) primary key not null,
  SVCCONT           VARCHAR2(50 CHAR),
  IDDFUNCMANAGERSP  VARCHAR2(50 CHAR),
  MSGTRANSACTIONID  VARCHAR2(50 CHAR),
  CFMRESULTCODE     VARCHAR2(50 CHAR),
  CFMRESULTCODEDESC VARCHAR2(50 CHAR),
  IDDINFO           VARCHAR2(50 CHAR),
  MSISDN            VARCHAR2(50 CHAR),
  PROVCODE          VARCHAR2(50 CHAR),
  OPRTIMSI          VARCHAR2(50 CHAR),
  SERVTYPE          VARCHAR2(50 CHAR),
  ACTIONID          VARCHAR2(50 CHAR),
  EFFTIMSI          VARCHAR2(50 CHAR),
  EXPTIMSI          VARCHAR2(50 CHAR),
  SERVPARAMINFO     VARCHAR2(50 CHAR)
);
-- Add comments to the table 
comment on table TSTUB_TSN_V1_RSP_T3000321
  is '国际长途功能开通/关闭接口';
-- Add comments to the columns 
comment on column TSTUB_TSN_V1_RSP_T3000321.IDDFUNCMANAGERSP
  is '业务应答';
comment on column TSTUB_TSN_V1_RSP_T3000321.IDDINFO
  is '业务应答详细信息';
comment on column TSTUB_TSN_V1_RSP_T3000321.MSISDN
  is '手机号码';
comment on column TSTUB_TSN_V1_RSP_T3000321.PROVCODE
  is '省代码';
comment on column TSTUB_TSN_V1_RSP_T3000321.SVCCONT
  is '请求内容';
comment on column TSTUB_TSN_V1_RSP_T3000321.ACTIONID
  is '操作类型';
comment on column TSTUB_TSN_V1_RSP_T3000321.CFMRESULTCODE
  is '处理结果码';
comment on column TSTUB_TSN_V1_RSP_T3000321.CFMRESULTCODEDESC
  is '处理结果
描述
';
comment on column TSTUB_TSN_V1_RSP_T3000321.EFFTIMSI
  is '开通/关闭生效时间';
comment on column TSTUB_TSN_V1_RSP_T3000321.EXPTIMSI
  is '开通失效时间';
comment on column TSTUB_TSN_V1_RSP_T3000321.MSGTRANSACTIONID
  is '业务应答流水号';
comment on column TSTUB_TSN_V1_RSP_T3000321.OPRTIMSI
  is '省boss操作处理时间';
comment on column TSTUB_TSN_V1_RSP_T3000321.SERVPARAMINFO
  is '业务受理信息';
comment on column TSTUB_TSN_V1_RSP_T3000321.SERVTYPE
  is '服务类型';