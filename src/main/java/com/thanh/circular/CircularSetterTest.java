package com.thanh.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularSetterTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("circular_setter.xml");
        Father father = context.getBean(Father.class);
        father.printSon();
    }

}
