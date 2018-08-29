package cn.xiaojunyun.blog.provider.dao;

import cn.xiaojunyun.blog.api.domain.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO: 文章信息数据访问层
 *
 * @author 萧竣匀
 * @date 2018-7-13 21:35
 */


@Mapper
public interface ArticleInfoDao {


    /**
     * 通过文章信息ID删除文章信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增文章信息
     * @param record
     * @return
     */
    int insertSelective(ArticleInfo record);

    /**
     * 通过文章ID查询文章信息
     * @param id
     * @return
     */
    ArticleInfo selectByPrimaryKey(Integer id);

    /**
     * 更新文章信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ArticleInfo record);
}