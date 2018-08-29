package cn.xiaojunyun.blog.provider.dao;

import cn.xiaojunyun.blog.api.domain.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO:权限信息数据访问层
 *
 * @author 萧竣匀
 * @date 2018-7-15 14:23
 */
@Mapper
public interface PermissionDao {

    /**
     * 通过权限ID删除权限信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增权限信息
     * @param record
     * @return
     */
    int insertSelective(Permission record);

    /**
     * 通过权限ID查询权限信息
     * @param id
     * @return
     */
    Permission selectByPrimaryKey(Integer id);

    /**
     * 更新权限信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Permission record);
}