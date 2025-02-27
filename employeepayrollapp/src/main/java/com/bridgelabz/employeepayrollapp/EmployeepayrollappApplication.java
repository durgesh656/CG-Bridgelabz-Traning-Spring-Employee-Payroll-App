package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class EmployeepayrollappApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EmployeepayrollappApplication.class, args);
		log.info("Employee Payroll App Started in {} environment", context.getEnvironment().getProperty("environment"));
	}

}
