package cn.xiaojunyun.blog.api.service;

import cn.xiaojunyun.blog.api.domain.User;
import cn.xiaojunyun.blog.common.domain.Page;

import java.util.Map;

/**
 * TODO: 用户Service
 *
 * @author 萧竣匀
 * @date 2018/7/5 16:33
 */
public interface UserService {


    /**
     * 根据用户名获取用户信息
     * @param userName
     * @return
     */
    User queryUserByUserName(String userName);

    /**
     * Exception
     * @param user
     * @return
     * @throws Exception
     */
    int register(User user)throws  Exception;

    /**
     * 根据条件查询用户列表，并分页
     * @param parameterMap
     * @return
     * @throws Exception
     */
    Page<User> queryUserListByPage(Map<String, Object> parameterMap) throws Exception;

    /**
     * 根据条件修改用户信息
     * @param user
     * @return
     * @throws Exception
     */
    int modifyUser(User user) throws Exception;

    /**
     * 根据ID删除用户信息
     * @param id
     * @return
     * @throws Exception
     */
    int deleteUserById(Integer id) throws Exception;

}
