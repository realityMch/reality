-- Create table
create table TSTUB_TSN_V1_COMMON
(
  ID           VARCHAR2(50 CHAR) primary key not null,
  INTERBOSS    VARCHAR2(50 CHAR),
  VERSION      VARCHAR2(50 CHAR),
  TESTFLAG     VARCHAR2(50 CHAR),
  BIPTYPE      VARCHAR2(50 CHAR),
  BIPCODE      VARCHAR2(50 CHAR),
  ACTIVITYCODE VARCHAR2(50 CHAR),
  ACTIONCODE   VARCHAR2(50 CHAR),
  ROUTINGINFO  VARCHAR2(50 CHAR),
  ORIGDOMAIN   VARCHAR2(50 CHAR),
  ROUTETYPE    VARCHAR2(50 CHAR),
  ROUTING      VARCHAR2(50 CHAR),
  HOMEDOMAIN   VARCHAR2(50 CHAR),
  ROUTEVALUE   VARCHAR2(50 CHAR),
  TRANSINFO    VARCHAR2(50 CHAR),
  SESSIONID    VARCHAR2(50 CHAR),
  TRANSIDO     VARCHAR2(50 CHAR),
  TRANSIDOTIME VARCHAR2(50 CHAR),
  TRANSIDH     VARCHAR2(50 CHAR),
  TRANSIDHTIME VARCHAR2(50 CHAR),
  SNRESERVE    VARCHAR2(50 CHAR),
  TRANSIDC     VARCHAR2(50 CHAR),
  CONVID       VARCHAR2(50 CHAR),
  CUTOFFDAY    VARCHAR2(50 CHAR),
  OSNTIME      VARCHAR2(50 CHAR),
  OSNDUNS      VARCHAR2(50 CHAR),
  HSNDUNS      VARCHAR2(50 CHAR),
  MSGSENDER    VARCHAR2(50 CHAR),
  MSGRECEIVER  VARCHAR2(50 CHAR),
  PRIORITY     VARCHAR2(50 CHAR),
  SERVICELEVEL VARCHAR2(50 CHAR),
  SVCCONTTYPE  VARCHAR2(50 CHAR),
  RESPONSE     VARCHAR2(50 CHAR),
  RSPTYPE      VARCHAR2(50 CHAR),
  RSPCODE      VARCHAR2(50 CHAR),
  RSPDESC      VARCHAR2(50 CHAR),
  SVCCONT      VARCHAR2(2000 CHAR),
  COMMON       VARCHAR2(2000 CHAR)
)
-- Add comments to the table 
comment on table TSTUB_TSN_V1_COMMON
  is '网状网接口规范报文头';
-- Add comments to the columns 
comment on column TSTUB_TSN_V1_COMMON.ACTIONCODE
  is '交易动作代码';
comment on column TSTUB_TSN_V1_COMMON.ACTIVITYCODE
  is '交易代码';
comment on column TSTUB_TSN_V1_COMMON.BIPCODE
  is '业务功能代码';
comment on column TSTUB_TSN_V1_COMMON.BIPTYPE
  is '交易类型信息';
comment on column TSTUB_TSN_V1_COMMON.CONVID
  is 'SN处理标识';
comment on column TSTUB_TSN_V1_COMMON.CUTOFFDAY
  is '日切点';
comment on column TSTUB_TSN_V1_COMMON.HSNDUNS
  is '归属方交换节点代码';
comment on column TSTUB_TSN_V1_COMMON.HOMEDOMAIN
  is '归属方应用域代码';
comment on column TSTUB_TSN_V1_COMMON.MSGRECEIVER
  is '归属方机构编码';
comment on column TSTUB_TSN_V1_COMMON.MSGSENDER
  is '发起方机构编码';
comment on column TSTUB_TSN_V1_COMMON.OSNDUNS
  is '发起方交换节点代码';
comment on column TSTUB_TSN_V1_COMMON.OSNTIME
  is '处理时间';
comment on column TSTUB_TSN_V1_COMMON.ORIGDOMAIN
  is '发起方应用域代码';
comment on column TSTUB_TSN_V1_COMMON.PRIORITY
  is '交易优先级';
comment on column TSTUB_TSN_V1_COMMON.RESPONSE
  is '应答节点';
comment on column TSTUB_TSN_V1_COMMON.ROUTETYPE
  is '路由类型';
comment on column TSTUB_TSN_V1_COMMON.ROUTEVALUE
  is '路由关键值';
comment on column TSTUB_TSN_V1_COMMON.ROUTING
  is '路由信息';
comment on column TSTUB_TSN_V1_COMMON.ROUTINGINFO
  is '交易路由信息';
comment on column TSTUB_TSN_V1_COMMON.RSPCODE
  is '应答/错误代码';
comment on column TSTUB_TSN_V1_COMMON.RSPDESC
  is '应答/错误描述';
comment on column TSTUB_TSN_V1_COMMON.RSPTYPE
  is '应答/错误类型';
comment on column TSTUB_TSN_V1_COMMON.SNRESERVE
  is '机构不填，SN保留信息';
comment on column TSTUB_TSN_V1_COMMON.SERVICELEVEL
  is '服务级别';
comment on column TSTUB_TSN_V1_COMMON.SESSIONID
  is '业务流水号';
comment on column TSTUB_TSN_V1_COMMON.SVCCONT
  is '业务应答内容';
comment on column TSTUB_TSN_V1_COMMON.SVCCONTTYPE
  is '报文体类型';
comment on column TSTUB_TSN_V1_COMMON.TESTFLAG
  is '测试标记';
comment on column TSTUB_TSN_V1_COMMON.TRANSIDC
  is 'SN交易流水号';
comment on column TSTUB_TSN_V1_COMMON.TRANSIDH
  is '落地方交易流水号';
comment on column TSTUB_TSN_V1_COMMON.TRANSIDHTIME
  is '处理时间';
comment on column TSTUB_TSN_V1_COMMON.TRANSIDO
  is '发起方交易流水号';
comment on column TSTUB_TSN_V1_COMMON.TRANSIDOTIME
  is '处理时间';
comment on column TSTUB_TSN_V1_COMMON.TRANSINFO
  is '交易流水信息';
comment on column TSTUB_TSN_V1_COMMON.VERSION
  is '报文版本号';
