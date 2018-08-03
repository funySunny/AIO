package com.mprs.aio;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *.主函数
 * @author Cary
 * @date 2018年7月18日
 */
@SpringBootApplication
@MapperScan("com.mprs.aio.*.mapper,com.mprs.aio.system.shiro")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
