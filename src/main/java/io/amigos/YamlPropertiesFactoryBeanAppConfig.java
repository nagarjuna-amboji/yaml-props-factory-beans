package io.amigos;

import io.amigos.beans.Passport;
import io.amigos.factory.YamlPropertySourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(name = "global", value = "classpath:app-global.yml", factory = YamlPropertySourceFactory.class)
public class YamlPropertiesFactoryBeanAppConfig {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(YamlPropertiesFactoryBeanAppConfig.class, args);
        Passport passport = context.getBean(Passport.class);
        System.out.println(passport);

    }
}
