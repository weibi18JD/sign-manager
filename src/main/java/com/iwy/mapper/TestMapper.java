package com.iwy.mapper;

import com.iwy.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by weibi on 2017/7/1.
 */
@Mapper
public interface TestMapper {

    @Select("Select * from test1")
    List<Test> findAll();

}
