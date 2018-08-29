package cn.xiaojunyun.blog.provider.dao;

import cn.xiaojunyun.blog.api.domain.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO: 用户角色关联表数据访问层
 *
 * @author 萧竣匀
 * @date 2018-7-13 21:35
 */

@Mapper
public interface UserRoleDao {

    /**
     * 通过用户角色信息表ID删除关联表信息
     * @param userRoleId
     * @return
     */
    int deleteByPrimaryKey(Integer userRoleId);

    /**
     * 新增用户角色关联信息
     * @param record
     * @return
     */
    int insertSelective(UserRole record);

    /**
     * 查询用户角色关联信息
     * @param userRoleId
     * @return
     */
    UserRole selectByPrimaryKey(Integer userRoleId);


    /**
     * 更新用户角色关联信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UserRole record);
}