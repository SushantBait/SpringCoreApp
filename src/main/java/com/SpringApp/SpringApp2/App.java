package com.SpringApp.SpringApp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/Sushant/workspace/SpringApp2/beans.xml");

        Address std1 = (Address) context.getBean("Add1");
        Employee std2 = (Employee) context.getBean("Emp1");

        System.out.println(std1);
        System.out.println(std2);
    }
}
