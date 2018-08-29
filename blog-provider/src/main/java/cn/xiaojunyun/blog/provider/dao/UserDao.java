package cn.xiaojunyun.blog.provider.dao;

import cn.xiaojunyun.blog.api.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO: 用户信息数据访问层
 *
 * @author 萧竣匀
 * @date 2018-7-13 21:35
 */

@Mapper
public interface UserDao {

    /**
     * 通过用户ID删除用户信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增用户信息
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 通过用户ID查询用户信息
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 更新用户信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);
}