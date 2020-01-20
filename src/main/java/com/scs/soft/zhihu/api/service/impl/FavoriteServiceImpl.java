package com.scs.soft.zhihu.api.service.impl;


import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.common.ResultCode;
import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.service.FavoritService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author l恋
 * @date 2020/1/19 16:26
 */
@Service
public class FavoriteServiceImpl implements FavoritService {
    @Resource
    private FavoriteMapper favoriteMapper;
    @Override
    public Result getAllFavorite() {
        List<Favorite> favoriteList = favoriteMapper.getAllFavorite();
        if (favoriteList.size() <= 0){
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }else {
            return Result.success(favoriteList);
        }
    }

    @Override
    public Result getHotFavorite() {
        List<Favorite> favoriteList = favoriteMapper.getHotFavorite();
        if (favoriteList.size() <= 0){
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }else {
            return Result.success(favoriteList);
        }
    }
}
