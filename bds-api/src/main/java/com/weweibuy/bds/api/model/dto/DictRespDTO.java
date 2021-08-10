package com.weweibuy.bds.api.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 字典响应
 *
 * @author durenhao
 * @date 2021/8/8 18:28
 **/
@Data
public class DictRespDTO {

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
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
