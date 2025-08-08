package com.tnsf.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
  ApplicationContext con=new ClassPathXmlApplicationContext("beancontext.xml");
    	
    	Customer c1=(Customer) con.getBean("customer1");
    	
    	c1.display();
    }
}
