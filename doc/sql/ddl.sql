
create table bds_area
(
   id                   bigint unsigned not null auto_increment comment 'id自增1',
   parent_area_code     int unsigned not null comment '父级区域代码(0: 表示国内)',
   area_code            int unsigned not null comment '区域代码',
   area_name            varchar(50) not null comment '区域名称',
   area_type            int unsigned not null comment '区域类型(1: 省; 2: 市; 3: 区)',
   is_delete            tinyint(1) unsigned not null default 0 comment '是否删除',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_time          timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (id),
   index idx_parent_area_code(parent_area_code),
   index idx_area_code(area_code)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='区域表(国标三级区域)';


create table bds_dict_type
(
   id                   bigint unsigned not null auto_increment comment 'id自增1',
   namespace            varchar(50) not null comment '名称空间',
   type_code            varchar(50) not null comment '字典类型',
   type_name            varchar(200) not null default '' comment '类型名称',
   is_delete            tinyint(1) unsigned not null default 0 comment '是否删除',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_time          timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (id),
   index idx_namespace_type_code(namespace(15), type_code(15))
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='字典类型表';



create table bds_dict_value
(
   id                   bigint unsigned not null auto_increment comment 'id自增1',
   namespace            varchar(50) not null comment '名称空间',
   type_code            varchar(50) not null comment '字典类型',
   dict_code            varchar(50) not null comment '字典代码',
   dict_value           varchar(500) not null default '' comment '字典值',
   dict_name            varchar(200) not null default '' comment '字典名称',
   is_delete            tinyint(1) unsigned not null default 0 comment '是否删除',
   create_time          timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
   update_time          timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
   primary key (id),
   index idx_namespace_dict_type(namespace(15), type_code(15)),
   index idx_dict_code(dict_code(15))
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='数据字典表';





