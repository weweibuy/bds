package com.weweibuy.bds.api.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 地区响应
 *
 * @author durenhao
 * @date 2021/8/10 20:55
 **/
@Data
public class AreaRespDTO {

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
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}
