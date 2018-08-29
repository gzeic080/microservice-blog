package cn.xiaojunyun.blog.api.service;

import cn.xiaojunyun.blog.api.domain.ArticleCategory;

import java.util.List;

/**
 * TODO: 文章分类接口
 *
 * @author junyunxiao
 * @date 2018-8-27 15:33
 */
public interface ArticleCategoryService {

    /**
     * 新增文章分类
     * @param category
     * @return
     */
    int addArticleCategory(ArticleCategory category);

    /**
     * 修改文章分类
     * @param category
     * @return
     */
    int modifyArticleCategory(ArticleCategory category);

    /**
     * 删除文章分类
     * @param articleCategoryId
     * @return
     */
    int deleteArticleCategory(int articleCategoryId);

    /**
     * 查询所有文章分类信息
     * @return
     */
    List<ArticleCategory> queryArticleCategory();

}
