package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;


@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {

    @Resource
    private RoundTableMapper roundTableMapper;

    @Test
    void getAllRoundTable() {
        List<RoundTable> roundTables = roundTableMapper.getAllRoundTable();
        roundTables.forEach(System.out::println);
    }

    @Test
    void getTopFour() {
        List<RoundTable> roundTables = roundTableMapper.getTopFour();
        for (RoundTable roundTable:roundTables){
            System.out.println(roundTable.getVisitsCount());
        }
    }
}