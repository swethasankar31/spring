package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("configure.xml");
        Employee  e=(Employee)cpx.getBean("employee");
        System.out.println(e);
        System.out.println(e.getName());
        System.out.println(e.getExperience());
        
        Employee  e2=(Employee)cpx.getBean("employee");
        System.out.println(e2);
        System.out.println(e2.getName());
        System.out.println(e2.getExperience());
    }
}
