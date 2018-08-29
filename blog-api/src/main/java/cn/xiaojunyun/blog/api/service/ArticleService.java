package cn.xiaojunyun.blog.api.service;

import cn.xiaojunyun.blog.api.domain.ArticleDetails;
import cn.xiaojunyun.blog.api.domain.ArticleInfo;

/**
 * TODO: 文章接口
 *
 * @author 萧竣匀
 * @date 2018-7-15 14:23
 */
public interface ArticleService {

    /**
     * 发布文章
     * @param articleInfo
     * @param details
     * @return
     */
    int releaseArticle(ArticleInfo articleInfo, ArticleDetails details);

    /**
     * 修改文章
     * @param articleInfo
     * @param details
     * @return
     */
    int modifyArticle(ArticleInfo articleInfo,ArticleDetails details);

    /**
     * 删除文章
     * @param articleId
     * @return
     */
    int deleteArcticle(int articleId);
}
