package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.entity.RoundTable;

import java.util.List;
import java.util.Map;

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
