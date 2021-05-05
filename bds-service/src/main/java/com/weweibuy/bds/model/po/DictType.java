package com.weweibuy.bds.model.po;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class DictType {
    /**
     * id自增1
     */
    private Long id;

    /**
     * 名称空间
     */
    private String namespace;

    /**
     * 字典类型
     */
    private String typeCode;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 是否删除
     */
    private Boolean deleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}