package com.spring.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
    	Resource resource=new ClassPathResource("beans.xml");
    	BeanFactory factory=new XmlBeanFactory(resource);
        Human obj=(Human) factory.getBean("Human");
        System.out.println(obj.toString());
    }
}
