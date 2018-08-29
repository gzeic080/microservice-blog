package cn.xiaojunyun.blog.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * TODO: 博客服务消费者启动类
 *
 * @author 萧竣匀
 * @date 2018-7-13 21:06
 */
@SpringBootApplication(scanBasePackages = "cn.xiaojunyun.blog.customer.controller")
public class BlogCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogCustomerApplication.class, args);
	}
}
