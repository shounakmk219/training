package com.pack.lombokdemo;

import lombok.NonNull;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee emp1=new Employee("Shounak",21,60000,"programmer");
        Employee emp2=new Employee("Shounak",21,60000,"programmer");
        System.out.println(emp1.equals(emp2));
        emp2=null;
        display(emp1);
        display(emp2);
    }
    
    static void display(@NonNull Employee emp) {
    	System.out.println(emp);
    }
}
