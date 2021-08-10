package com.weweibuy.bds.api.model.dto;

import com.weweibuy.framework.common.core.model.dto.CommonPageRequest;
import lombok.Data;

/**
 * 地区查询请求
 *
 * @author durenhao
 * @date 2021/8/10 20:58
 **/
@Data
public class AreaQueryReqDTO extends CommonPageRequest {

    /**
     * 父级区域代码(0: 表示国内)
     */
    private Integer parentAreaCode;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 区域类型(1: 省; 2: 市; 3: 区)
     */
    private Integer areaType;



}
