package com.weweibuy.bds.mapper;

import com.weweibuy.bds.model.example.DictValueExample;
import com.weweibuy.bds.model.po.DictValue;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DictValueMapper {
    long countByExample(DictValueExample example);

    int deleteByExample(DictValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DictValue record);

    int insertSelective(DictValue record);

    DictValue selectOneByExample(DictValueExample example);

    List<DictValue> selectByExample(DictValueExample example);

    DictValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DictValue record, @Param("example") DictValueExample example);

    int updateByExample(@Param("record") DictValue record, @Param("example") DictValueExample example);

    int updateByPrimaryKeySelective(DictValue record);

    int updateByPrimaryKey(DictValue record);
}