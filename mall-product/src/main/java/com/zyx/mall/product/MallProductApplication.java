package com.zyx.mall.product;

import com.zyx.mall.product.service.BrandService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zyx.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }


}




/*
1.整合Mybatis-plus：
    1.导入依赖
    2.配置
        配置数据源：1.导入数据库的驱动   2.在application.yml配置数据源相关信息
        配置mybatis-plus：
            1.使用@MapperScan
            2.告诉mybatis-plus映射文件位置
 */
