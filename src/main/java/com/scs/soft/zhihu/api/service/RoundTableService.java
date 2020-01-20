package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.common.Result;


/**
 * @author l恋
 * @date 2020/1/18 10:36
 */
public interface RoundTableService {
    /**
     * 查询所有的圆桌
     * @return list<Map>
     */
    Result getAllRoundTable();

    /**
     * 查询前四条圆桌
     * @return list<RoundTable>
     */
   Result getTopFour();
}
