package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author l恋
 * @date 2020/1/20 21:30
 */
@Data
@Builder
public class Columns {
    /**
     * title 标题
     * description 介绍
     * url 链接
     * imageUrl 图片链接
     * followers 关注人数
     * articlesCount 文章数
     */
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;

}
