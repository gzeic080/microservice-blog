package cn.xiaojunyun.blog.provider.dao;

import cn.xiaojunyun.blog.api.domain.ArticleCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TODO: 文章分类数据访问层
 *
 * @author 萧竣匀
 * @date 2018-7-13 21:35
 */
@Mapper
public interface ArticleCategoryDao {
    /**
     *通过文章分类ID删除文章分类信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *新增文章分类信息
     * @param record
     * @return
     */
    int insertSelective(ArticleCategory record);

    /**
     *查询所有文章分类信息
     * @return
     */
    List<ArticleCategory> queryArticleCategory();

    /**
     *更新文章分类信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ArticleCategory record);
}