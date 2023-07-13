package cn.christi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: yubao.an
 * @Date: 2023/7/13
 * @Description: Application
 **/

@SpringBootApplication
@MapperScan("cn.christi.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
