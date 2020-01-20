package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author l恋
 * @date 2020/1/19 15:59
 */
@Data
@Builder
public class Favorite {
    /**
     * title  标题
     * creatorName 创建者名字
     * creatorAvatar 创建者头像
     * followers 关注人数
     * totalCount 收藏内容总数
     * questionTitle 置顶问题标题
     *  answerAuthorName 置顶回答作者名
     * answerContent  置顶回答内容
     * voteUpCount  置顶回答赞同总数
     * commentCount 置顶问题评论总数
     */

    private Integer id;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Integer followers;
    private Integer totalCount;
    private String questionTitle;
    private String answerAuthorName;
    private String answerContent;
    private Integer voteUpCount;
    private Integer commentCount;

}
