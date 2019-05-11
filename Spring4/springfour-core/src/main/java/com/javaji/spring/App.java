package com.javaji.spring;

import com.javaji.spring.beans.Employee;
import com.javaji.spring.beans.HelloBean;
import com.javaji.spring.configuration.HelloConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context =  new AnnotationConfigApplicationContext(HelloConfiguration.class);
        HelloBean helloBean = (HelloBean) context.getBean("helloBean");

        String message = helloBean.sayHello();
        System.out.println(message);

        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp.getName());

        context.close();

    }
}
