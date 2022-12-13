package com.zjmx.core.spring.ioc.is;

/**
 * 这里模拟了如果使用了ioc进行帮我们控制对象的生命周期和对象的注入使用,将使我们的系统耦合降低,提供可测试性和可维护性(可单独去测试维护其他bean)
 */
public class IsIOCTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        System.out.println(userService.findAll());
    }
}
