package com.iwy.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by weibi on 2017/7/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperTest {

    @Autowired
    private TestMapper testMapper;
    @Test
    public void findAll() throws Exception {
        List<com.iwy.domain.Test> list = testMapper.findAll();
        System.out.println("长度："+list.size());
    }
}