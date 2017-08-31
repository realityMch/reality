-- Create table
create table TSTUB_TSN_V1_RSP_T3000309
(
  ID                VARCHAR2(50 CHAR) primary key not null,
  SVCCONT           VARCHAR2(50 CHAR),
  USERINFOQRYRSP    VARCHAR2(50 CHAR),
  MSGTRANSACTIONID  VARCHAR2(50 CHAR),
  CFMRESULTCODE     VARCHAR2(50 CHAR),
  CFMRESULTCODEDESC VARCHAR2(50 CHAR),
  SUBSCRIPTIONINFO  VARCHAR2(50 CHAR),
  MSISDN            VARCHAR2(50 CHAR),
  PROVCODE          VARCHAR2(50 CHAR),
  OPRTIMSI          VARCHAR2(50 CHAR),
  IMSI              VARCHAR2(50 CHAR),
  EFFTIMSI          VARCHAR2(50 CHAR),
  BRAND             VARCHAR2(50 CHAR),
  USERTYPE          VARCHAR2(50 CHAR),
  COL_LEVEL         VARCHAR2(50 CHAR),
  USERSTAT          VARCHAR2(50 CHAR),
  INTERROAMFUNCSTAT VARCHAR2(50 CHAR),
  SERVTYPE          VARCHAR2(50 CHAR),
  EFFTIMSI2         VARCHAR2(50 CHAR),
  VALIDITYDATE      VARCHAR2(50 CHAR),
  ISBLACKLIST       VARCHAR2(50 CHAR),
  ISBALANCEJUD      VARCHAR2(50 CHAR),
  USERBALANCE       VARCHAR2(50 CHAR),
  IDDSERVTYPE       VARCHAR2(50 CHAR),
  IDDEFFTIMSI       VARCHAR2(50 CHAR),
  IDDVALIDITYDATE   VARCHAR2(50 CHAR),
  IDDFUNCSTAT       VARCHAR2(50 CHAR),
  SERVPARAMINFO     VARCHAR2(50 CHAR)
);
-- Add comments to the table 
comment on table TSTUB_TSN_V1_RSP_T3000309
  is '用户基本信息查询接口';
-- Add comments to the columns 
comment on column TSTUB_TSN_V1_RSP_T3000309.EFFTIMSI
  is 'IMSI号生效时间';
comment on column TSTUB_TSN_V1_RSP_T3000309.IDDEFFTIMSI
  is '国际长途开通生效时间';
comment on column TSTUB_TSN_V1_RSP_T3000309.IDDFUNCSTAT
  is '用户国际长途开通状态';
comment on column TSTUB_TSN_V1_RSP_T3000309.IDDSERVTYPE
  is '服务类型';
comment on column TSTUB_TSN_V1_RSP_T3000309.IDDVALIDITYDATE
  is '国际长途开通失效时间';
comment on column TSTUB_TSN_V1_RSP_T3000309.IMSI
  is '国际移动用户身份识别号';
comment on column TSTUB_TSN_V1_RSP_T3000309.INTERROAMFUNCSTAT
  is '用户国漫服务开通状态';
comment on column TSTUB_TSN_V1_RSP_T3000309.ISBALANCEJUD
  is '是否需要余额判断';
comment on column TSTUB_TSN_V1_RSP_T3000309.ISBLACKLIST
  is '用户是否为黑名单用户';
comment on column TSTUB_TSN_V1_RSP_T3000309.MSISDN
  is '手机号码';
comment on column TSTUB_TSN_V1_RSP_T3000309.PROVCODE
  is '省代码';
comment on column TSTUB_TSN_V1_RSP_T3000309.SVCCONT
  is '请求内容';
comment on column TSTUB_TSN_V1_RSP_T3000309.USERBALANCE
  is '帐户余额';
comment on column TSTUB_TSN_V1_RSP_T3000309.USERSTAT
  is '用户状态';
comment on column TSTUB_TSN_V1_RSP_T3000309.VALIDITYDATE
  is '国漫开通失效时间';
comment on column TSTUB_TSN_V1_RSP_T3000309.BRAND
  is '用户品牌';
comment on column TSTUB_TSN_V1_RSP_T3000309.CFMRESULTCODE
  is '处理结果码';
comment on column TSTUB_TSN_V1_RSP_T3000309.CFMRESULTCODEDESC
  is '处理结果描述';
comment on column TSTUB_TSN_V1_RSP_T3000309.COL_LEVEL
  is '用户星级';
comment on column TSTUB_TSN_V1_RSP_T3000309.EFFTIMSI2
  is '国漫开通生效时间';
comment on column TSTUB_TSN_V1_RSP_T3000309.MSGTRANSACTIONID
  is '业务查询应答流水号';
comment on column TSTUB_TSN_V1_RSP_T3000309.OPRTIMSI
  is '操作时间';
comment on column TSTUB_TSN_V1_RSP_T3000309.SERVPARAMINFO
  is '业务受理信息';
comment on column TSTUB_TSN_V1_RSP_T3000309.SERVTYPE
  is '服务类型';
comment on column TSTUB_TSN_V1_RSP_T3000309.SUBSCRIPTIONINFO
  is '业务查询应答信息';
comment on column TSTUB_TSN_V1_RSP_T3000309.USERTYPE
  is '用户付费类型';
comment on column TSTUB_TSN_V1_RSP_T3000309.USERINFOQRYRSP
  is '业务查询应答信息';
