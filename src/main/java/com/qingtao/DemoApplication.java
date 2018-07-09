package com.qingtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
/**
* @author: maqingtao
* @description:
 * 踩过的坑@EnableJpaRepositories：
 *  告诉JPA找到继承了repository的接口，
 *  并为它创建相应的实现类，JpaRepository也继承了repository。
* @date: 2018-7-9
* @modified:
*/

@EnableJpaRepositories("com.qingtao.repository")
@EnableScheduling
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
