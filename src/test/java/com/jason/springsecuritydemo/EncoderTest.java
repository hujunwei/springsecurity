package com.jason.springsecuritydemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Description: com.jason.springsecuritydemo
 */

@SpringBootTest
public class EncoderTest {
    @Test
    public void test(){
        //创建解析器
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        //对密码进行加密
        String password = encoder.encode("123456");
        System.out.println("------------"+password + "|| " + password.length());

        //判断原字符加密后和内容是否匹配
        boolean result = encoder.matches("123456",password);
        System.out.println("============="+result);
    }
}
