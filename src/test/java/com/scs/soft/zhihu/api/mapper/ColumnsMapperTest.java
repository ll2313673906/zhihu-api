package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Columns;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author l恋
 * @date 2020/1/19 16:43
 */
@SpringBootTest(classes = ZhihuApiApplication.class)
class ColumnsMapperTest {
    @Resource ColumnsMapper columnsMapper;
    @Test
    void getTopColumns() {
        List<Columns> columns = columnsMapper.getTopColumns();
        for (Columns columns1:columns){
            System.out.println(columns1.getFollowers());
        }
    }

    @Test
    void getAllColumns() {
        List<Columns> columns = columnsMapper.getAllColumns();
        columns.forEach(System.out::println);
    }
}