package com.weweibuy.bds.model.po;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class DictValue {
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
     * 字典代码
     */
    private String dictCode;

    /**
     * 字典值
     */
    private String dictValue;

    /**
     * 字典名称
     */
    private String dictName;

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