package com.tnf.IOC;

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
        ApplicationContext con=new ClassPathXmlApplicationContext("Beans.xml");
		Phone p1=con.getBean("phone",Phone.class);
		
		p1.calling();
		p1.internet();
    }
}
