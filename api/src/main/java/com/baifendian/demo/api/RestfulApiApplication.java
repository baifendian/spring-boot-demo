package com.baifendian.demo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Restful Api 应用
 * <p>
 *
 * @author : shuanghu
 * @date : 17-6-28
 */
@SpringBootApplication()
@ComponentScan("com.baifendian.demo")
public class RestfulApiApplication {

  /**
   * spring rest 服务的入口main函数
   */
  public static void main(String[] args) {
    SpringApplication.run(RestfulApiApplication.class);
  }
}
