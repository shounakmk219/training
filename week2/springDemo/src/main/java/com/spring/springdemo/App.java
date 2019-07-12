package com.spring.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Resource resource=new ClassPathResource("beans.xml");
//    	BeanFactory factory=new XmlBeanFactory(resource);
    	
    	ApplicationContext factory=new ClassPathXmlApplicationContext("beans.xml");
        Human obj=(Human) factory.getBean("woman");
        System.out.println(obj.toString());
    }
}
