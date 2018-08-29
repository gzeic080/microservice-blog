package cn.xiaojunyun.blog.provider.dao;

import cn.xiaojunyun.blog.api.domain.ArticleDetails;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO: 文章详情数据访问层
 *
 * @author 萧竣匀
 * @date 2018-7-13 21:35
 */

@Mapper
public interface ArticleDetailsDao {
    /**
     * 通过文章详情ID删除问行详情
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增文章详情
     * @param record
     * @return
     */
    int insertSelective(ArticleDetails record);

    /**
     * 通过文章详情ID查询文章详情
     * @param id
     * @return
     */
    ArticleDetails selectByPrimaryKey(Integer id);

    /**
     * 更新文章详情信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ArticleDetails record);

}