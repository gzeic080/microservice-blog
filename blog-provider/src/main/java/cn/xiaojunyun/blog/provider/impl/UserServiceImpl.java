package cn.xiaojunyun.blog.provider.impl;


import cn.xiaojunyun.blog.api.domain.User;
import cn.xiaojunyun.blog.api.service.UserService;
import cn.xiaojunyun.blog.common.domain.Page;
import cn.xiaojunyun.blog.provider.dao.UserDao;
import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * TODO: 用户Service实现类
 *
 * @author 萧竣匀
 * @date 2018/7/5 16:33
 */

@Service(
        version = "${service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UserServiceImpl implements UserService {

    private static final Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;


    @Override
    public User queryUserByUserName(String userName){
        return null;
                //userDao.queryUserByUserName(userName);
    }

    @Override
    public int register(User user) throws Exception {
        logger.info("rpc调用成功");
        return  5;
    }


    @Override
    public Page<User> queryUserListByPage(Map<String, Object> parameterMap) throws Exception {
        Page<User> page=new Page<>();
        page.setPageCurrent(parameterMap.get("pageCurrent")!=null&& Integer.parseInt(parameterMap.get("pageCurrent").toString())>1?Integer.parseInt(parameterMap.get("pageCurrent").toString()):1);
        page.setPageSize(parameterMap.get("pageSize")!=null&& Integer.parseInt(parameterMap.get("pageSize").toString())>20?Integer.parseInt(parameterMap.get("pageSize").toString()):20);
        parameterMap.put("page",page);
        /*page.setRows(userDao.queryUserByPage(parameterMap));*/
        return page;
    }

    @Override
    public int modifyUser(User user) throws Exception {
        return 0;
    }

    @Override
    public int deleteUserById(Integer id) throws Exception {
        return 0;
    }
}
