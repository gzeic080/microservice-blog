package cn.xiaojunyun.blog.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * TODO: 博客服务提供者启动类
 *
 * @author 萧竣匀
 * @date 2018-7-13 21:06
 */
@SpringBootApplication
public class BlogProviderApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(BlogProviderApplication.class).web(WebApplicationType.NONE).run(args);
	}
}
