package com.weweibuy.bds.repository;

import com.weweibuy.bds.mapper.AreaMapper;
import com.weweibuy.bds.model.example.AreaExample;
import com.weweibuy.bds.model.po.Area;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    public List<Area> select(AreaExample example) {
        return areaMapper.selectByExample(example);
    }

    public Optional<Area> select(Integer areaCode) {
        AreaExample example = AreaExample.newAndCreateCriteria()
                .andDeletedEqualTo(false)
                .andAreaCodeEqualTo(areaCode)
                .example();
        return Optional.ofNullable(areaMapper.selectOneByExample(example));
    }


}
