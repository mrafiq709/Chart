package com.rafiq.chart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartController {

	@GetMapping("/index-label")
	public String Index() {
		return "index-label";
	}
}
