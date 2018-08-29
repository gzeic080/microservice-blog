package cn.xiaojunyun.blog.customer.security.service;

import cn.xiaojunyun.blog.api.domain.User;
import cn.xiaojunyun.blog.api.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * TODO: 类描述
 *
 * @author junyunxiao
 * @date 2018-8-24 11:22
 */
@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Reference(version = "${service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880"
    )
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user =userService.queryUserByUserName(userName);

        if (StringUtils.isEmpty(user)){
            throw  new UsernameNotFoundException("用户："+userName+"不存在");
        }

        //获取用户权限数据
        Collection<GrantedAuthority> grantedAuthorities=new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("admin"));
        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getUserPwd(),grantedAuthorities);
    }
}
