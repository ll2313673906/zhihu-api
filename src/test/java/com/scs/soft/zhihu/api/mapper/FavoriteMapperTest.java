package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Favorite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author l恋
 * @date 2020/1/19 16:43
 */
@SpringBootTest(classes = ZhihuApiApplication.class)
class FavoriteMapperTest {
   @Resource FavoriteMapper favoriteMapper;
    @Test
    void getHotFavorite() {
        List<Favorite> favorites = favoriteMapper.getHotFavorite();
       for (Favorite favorite:favorites){
           System.out.println(favorite.getFollowers());
       }
    }

    @Test
    void getAllFavorite() {
        List<Favorite> favorites = favoriteMapper.getAllFavorite();
        favorites.forEach(System.out::println);
    }
}