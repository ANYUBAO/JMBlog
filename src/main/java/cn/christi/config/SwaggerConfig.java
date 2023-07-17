package cn.christi.config;/**
 * @author yubao.an
 */

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yubao.an
 * @Date: 2023/7/17
 * @Description: swagger
 **/

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("JMBLog API")
                        .version("V1.0")
                        .contact(new Contact().name("yubao.an").email("jmklsd@outlook.com").url("christi.cn"))
                        .description("JM博客 API")
                        .license(new License().name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")));
    }

}
