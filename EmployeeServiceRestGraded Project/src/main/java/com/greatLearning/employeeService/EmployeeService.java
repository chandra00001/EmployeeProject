package com.greatLearning.employeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.greatLearning.employeeService","com.greatLearning.employeeService.controller","com.greatLearning.employeeService.entity","com.greatLearning.employeeService.dao","com.greatLearning.employeeService.security","com.greatLearning.employeeService.service"})
//@ComponentScan("com.greatLearning.employeeService")
public class EmployeeService {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeService.class, args);
	}
}
