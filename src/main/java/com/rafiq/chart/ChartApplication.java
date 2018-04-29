package com.rafiq.chart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.rafiq.chart.controller"})
@SpringBootApplication
public class ChartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChartApplication.class, args);
	}
}
