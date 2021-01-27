package com.thanh.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularTest {
    public static void main(String[] args) {

        // This should throw org.springframework.beans.factory.BeanCurrentlyInCreationException
        new ClassPathXmlApplicationContext("circular.xml");
    }
}
