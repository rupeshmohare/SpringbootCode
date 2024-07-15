package com.Springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //List
        Question questionList = (Question) context.getBean("questionList");
        System.out.println(questionList);
        System.out.println();

        //Set
        Question questionSet = (Question) context.getBean("questionSet");
        System.out.println(questionSet);
        System.out.println();

        //Map
        Question questionMap = (Question) context.getBean("questionMap");
        System.out.println(questionMap);
    }
}
