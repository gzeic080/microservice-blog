package cn.xiaojunyun.blog.customer.controller;

import cn.xiaojunyun.blog.api.domain.User;
import cn.xiaojunyun.blog.common.domain.Page;
import cn.xiaojunyun.blog.common.message.TradeMessages;
import cn.xiaojunyun.blog.api.service.UserService;
import cn.xiaojunyun.blog.common.utils.BeansUtil;
import cn.xiaojunyun.blog.api.vo.UserVo;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * TODO: 用户控制层
 *
 * @author 萧竣匀
 * @date 2018-7-13 21:35
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "${service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880"
    )
    private UserService userService;


    @PostMapping("/login")
    @ResponseBody
    public TradeMessages<User> login(String username,String password){
        TradeMessages<User> messages=new TradeMessages<>();
        User user=new User();
        user.setId(1);
        user.setUserName(username);
        user.setUserPwd(password);
        user.setUserPhoneNum("16602309566");
        if (org.apache.commons.lang3.StringUtils.isNoneEmpty(username) && org.apache.commons.lang3.StringUtils.isNoneEmpty(password) ){
            messages.setData(user);
            messages.setResultCode("1");
            messages.setResultMessage("登陆成功");
            return  messages;
        } else {
            messages.setResultCode("10001");
            messages.setResultMessage("用户名或密码为空，请检查");
            messages.setData(null);
            return messages;
        }
    }


    @PostMapping("/register")
    @ResponseBody
    public TradeMessages<Integer> register(User user)throws Exception {
        TradeMessages<Integer> messages=new TradeMessages<>();
        if (!StringUtils.isEmpty(user)){
            int resultNum=userService.register(user);
            messages.setResultCode("1");
            messages.setResultMessage("用户注册成功,受影响条数"+resultNum+" 条");
            messages.setData(resultNum);
            return messages;
        }else {
            messages.setResultCode("10002");
            messages.setResultMessage("输入参数为空，注册失败！！！");
            messages.setData(0);
            return  messages;
        }
    }

    /**
     * 查询用户信息并分页，输入Vo返回Po对象
     * @param userVo
     * @return
     * @throws Exception
     */
    @GetMapping("/queryUserListByPage")
    @ResponseBody
    public TradeMessages<Page<User>> queryUserListByPage(UserVo userVo) throws Exception{
        TradeMessages<Page<User>> messages=new TradeMessages<>();
        if (userVo!=null && userVo.getPageCurrent()!=0 && userVo.getPageSize()!=0){
            userVo.setPageCurrent(userVo.getPageCurrent()>1?userVo.getPageCurrent():1);
            userVo.setPageSize(userVo.getPageSize()>1?userVo.getPageSize():20);
            Map<String,Object> parameterMap=BeansUtil.voToMap(userVo);
            Page<User> resultPage=userService.queryUserListByPage(parameterMap);
            messages.setResultCode("1");
            messages.setResultMessage("请求成功,api正确返回数据");
            messages.setData(resultPage);
            return messages;
        } else {
            messages.setResultCode("10001");
            messages.setResultMessage("参数不全，请检查!!!");
            messages.setData(null);
            return  messages;
        }
    }


    @GetMapping("/removeUser/{id}")
    @ResponseBody
    public TradeMessages<Integer> removeUser(@PathVariable("id") Integer userId) throws Exception{
        TradeMessages<Integer> messages=new TradeMessages<>();
        if (userId !=null){
            int resultNum=userService.deleteUserById(userId);
            messages.setResultCode("1");
            messages.setResultMessage("用户数据删除成功,受影响条数:"+resultNum+" 条");
            messages.setData(resultNum);
            return  messages;
        }else {
            messages.setResultCode("10001");
            messages.setResultMessage("用户ID必填，请检查!!!");
            messages.setData(0);
            return  messages;
        }
    }

    @PostMapping("/modefyUserInfo")
    @ResponseBody
    public TradeMessages<Integer> modefyUserInfo(User user)throws Exception{
        TradeMessages<Integer> messages=new TradeMessages<>();
        if (!StringUtils.isEmpty(user)){
            int resultNum=userService.modifyUser(user);
            messages.setResultCode("1");
            messages.setResultMessage("用户数据修改成功,影响行数:"+resultNum+" 条");
            messages.setData(0);
            return  messages;
        }else {
            messages.setResultCode("10002");
            messages.setResultMessage("尚未发现数据有修改，请检查输入参数！！！");
            messages.setData(0);
            return  messages;
        }
    }
}
