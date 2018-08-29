package cn.xiaojunyun.blog.provider.dao;

import cn.xiaojunyun.blog.api.domain.RolePermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO: 角色权限关联关系数据访问层
 *
 * @author 萧竣匀
 * @date 2018-7-13 21:35
 */

@Mapper
public interface RolePermissionDao {

    /**
     * 通过角色权限关联信息ID删除角色权限关联信息
     * @param rolePermissionId
     * @return
     */
    int deleteByPrimaryKey(Integer rolePermissionId);

    /**
     * 新增角色权限关联信息
     * @param record
     * @return
     */
    int insertSelective(RolePermission record);

    /**
     * 通过角色权限信息ID查询角色权限信息
     * @param rolePermissionId
     * @return
     */
    RolePermission selectByPrimaryKey(Integer rolePermissionId);

    /**
     * 更新角色权限信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(RolePermission record);
}