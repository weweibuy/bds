package com.weweibuy.bds.model.po;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Area {
    /**
     * id自增1
     */
    private Long id;

    /**
     * 父级区域代码(0: 表示国内)
     */
    private Integer parentAreaCode;

    /**
     * 区域代码
     */
    private Integer areaCode;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 区域类型(1: 省; 2: 市; 3: 区)
     */
    private Integer areaType;

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