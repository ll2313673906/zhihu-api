package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.FavoritService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author l恋
 * @date 2020/1/19 23:20
 */
@RestController
@RequestMapping(value = "/api/favorites")
public class FavoriteController {
    @Resource
    private FavoritService favoritService;

    /**
     * 获取关注量最多的收藏夹
     * @return Result
     */
    @GetMapping(value = "/hotFavorites")
    public Result getHotFavorite(){
        return favoritService.getHotFavorite();
    }

    /**
     * 获取所有的收藏夹
     * @return result
     */
    @GetMapping(value = "/all")
    public Result getAllFavorite(){
        return favoritService.getAllFavorite();
    }

}
