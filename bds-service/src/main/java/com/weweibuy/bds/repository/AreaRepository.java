package com.weweibuy.bds.repository;

import com.weweibuy.bds.mapper.AreaMapper;
import com.weweibuy.bds.model.po.Area;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author durenhao
 * @date 2021/5/5 20:11
 **/
@RequiredArgsConstructor
@Repository
public class AreaRepository {

    private final AreaMapper areaMapper;


    public int insert(Area area) {
        return areaMapper.insertSelective(area);
    }

}
