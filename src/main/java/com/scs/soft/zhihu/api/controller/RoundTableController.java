package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author l恋
 */
@RestController
@RequestMapping(value = "/api/roundTables")
public class RoundTableController {

    @Resource
    private RoundTableService roundTableService;

    /**
     * 获取所有圆桌
     * @return Result
     */
    @GetMapping(value = "/all")
    public Result getAll(){
        return roundTableService.getAllRoundTable();
    }

    /**
     * 获取点击量最高的前四条
     * @return  Result
     */
    @GetMapping(value = "/topFour")
    public Result getPopular(){
        return roundTableService.getTopFour();
    }

}
