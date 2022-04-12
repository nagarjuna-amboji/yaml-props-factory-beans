package io.amigos;

import io.amigos.beans.Passport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YamlPropertiesFactoryBean {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(YamlPropertiesFactoryBean.class, args);
        Passport passport = context.getBean(Passport.class);
        System.out.println(passport);

    }
}
