package com.zx.mapper;

import com.zx.domain.FlowerSystem;

public interface FlowerSystemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FlowerSystem record);

    int insertSelective(FlowerSystem record);

    FlowerSystem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FlowerSystem record);

    int updateByPrimaryKey(FlowerSystem record);
}