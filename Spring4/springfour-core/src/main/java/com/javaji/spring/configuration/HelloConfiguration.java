package com.javaji.spring.configuration;

import com.javaji.spring.beans.Employee;
import com.javaji.spring.beans.EmployeeImpl;
import com.javaji.spring.beans.HelloBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class HelloConfiguration {

    @Bean(name="helloBean")
    @Description("this is sample hello Bean")
    public HelloBean helloBean(){
        return new HelloBean();
    }

    @Bean(name="employee")
    public Employee getEmployee(){
        return new EmployeeImpl();
    }
}
