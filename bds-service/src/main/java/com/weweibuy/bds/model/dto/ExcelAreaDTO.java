package com.weweibuy.bds.model.dto;

import com.weweibuy.framework.common.util.excel.model.AbstractImportExcelVO;
import lombok.Data;

/**
 * @author durenhao
 * @date 2021/5/5 20:07
 **/
@Data
public class ExcelAreaDTO extends AbstractImportExcelVO {

    /**
     * 区域代码
     */
    private Integer areaCode;

    /**
     * 区域名称
     */
    private String areaName;

    @Override
    protected String doValidate() {
        return null;
    }
}
