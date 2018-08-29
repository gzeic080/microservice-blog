package cn.xiaojunyun.blog.provider.dao;

import cn.xiaojunyun.blog.api.domain.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * TODO: 角色信息数据访问层
 *
 * @author 萧竣匀
 * @date 2018-7-15 14:23
 */
@Mapper
public interface RoleDao {

    /**
     * 通过角色信息ID删除角色信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增角色信息
     * @param record
     * @return
     */
    int insertSelective(Role record);

    /**
     * 通过角色信息ID查询角色信息
     * @param id
     * @return
     */
    Role selectByPrimaryKey(Integer id);

    /**
     *更新角色信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Role record);
}