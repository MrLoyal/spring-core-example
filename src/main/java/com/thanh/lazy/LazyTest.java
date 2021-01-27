package com.thanh.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyTest {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("lazy.xml");

        Thread.sleep(2000);
        System.out.println("Now request a real sloth to trigger lazy initialization");
        context.getBean(RealSloth.class);
    }
}
