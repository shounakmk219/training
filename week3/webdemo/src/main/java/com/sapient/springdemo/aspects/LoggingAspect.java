package com.sapient.springdemo.aspects;

import com.sapient.springdemo.model.Employee;
import com.sapient.springdemo.service.EmployeeService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.sapient.springdemo.service.EmployeeServiceImpl.*(..))")
    public void logBefore(JoinPoint target) {
        System.out.println("------------logging before the method is getting executed-------------------");
        System.out.println(target.getTarget() instanceof EmployeeService);
    }
}