package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.common.Result;

/**
 * @author l恋
 * @date 2020/1/19 16:22
 */
public interface FavoritService {
    /**
     * 获取所有的收藏夹
     * @return getAllFavorite
     */
   Result getAllFavorite();

    /**
     * 获取关注最多的收藏夹
     * @return getHotFavorite
     */
   Result getHotFavorite();
}
