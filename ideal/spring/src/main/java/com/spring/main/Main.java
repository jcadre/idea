package com.spring.main;

import com.spring.interfaces.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JC on 2017/12/24.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        Bean bean = (Bean) ctx.getBean("testBean");
        bean.perform();
    }
}
