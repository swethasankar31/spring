package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("configure.xml");
        JavaTrainer j=new JavaTrainer("smith");
        System.out.println(j);
        System.out.println(j.getName());
        
        WebTrainer w=new WebTrainer("joe");
        System.out.println(w);
        System.out.println(w.getName());
       
        
        SqlTrainer s=new SqlTrainer("harish");
        System.out.println(s);
        System.out.println(s.getName());
    }
}
