package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author l恋
 * @date 2020/1/18 10:10
 */
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String urlToken;
    private String visitsCount;
    private String includeCount;
}
