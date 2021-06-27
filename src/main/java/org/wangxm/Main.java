package org.wangxm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("wangxm");
        System.out.println("id=>" + user.getId());
        System.out.println("userName=>" + user.getUserName());
        System.out.println("email=>" + user.getEmail());
    }
}
