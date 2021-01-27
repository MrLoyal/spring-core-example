package com.thanh.thing;

import com.thanh.thing.ThingOne;
import com.thanh.thing.ThingTwo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ThingOne one = context.getBean("thingOne2",ThingOne.class);
        ThingTwo two = one.getThingTwo();
        System.out.println(two);
    }
}
