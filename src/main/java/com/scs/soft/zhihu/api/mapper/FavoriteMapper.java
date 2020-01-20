package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Favorite;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author l恋
 * @date 2020/1/19 16:10
 */
public interface FavoriteMapper {
    /**
     * 获取关注人数最多的前四条收藏
     * @return list<Favorite>
     */
    @Select("SELECT * FROM t_favorite ORDER BY followers DESC LIMIT 0,4 ")
    List<Favorite> getHotFavorite();

    /**
     * 获取所有的收藏夹
     * @return List<Favorite>
     */
    @Select("SELECT * FROM t_favorite")
    List<Favorite> getAllFavorite();
}
