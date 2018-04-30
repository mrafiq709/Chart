package com.rafiq.chart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartController {

	@GetMapping("/index-label")
	public String Index() {
		return "index-label";
	}
	
	@GetMapping("/multi-series")
	public String MultiSeries() {
		return "multi-series";
	}
	
	@GetMapping("/zoom-pane")
	public String ZoomPane() {
		return "zoom-pane";
	}
	
	@GetMapping("/pie")
	public String Pie() {
		return "pie";
	}
	
	@GetMapping("/image-overlay")
	public String Image() {
		return "image-overlay";
	}
	
	@GetMapping("/null-data")
	public String NullData() {
		return "null-data";
	}
	
	@GetMapping("/dynamic-data")
	public String DynamicData() {
		return "dynamic-data";
	}
	
	@GetMapping("/algorithmic-axis")
	public String AlgorithmicAxis() {
		return "algorithmic-axis";
	}
	
	@GetMapping("/json-data")
	public String JSONData() {
		return "json-data";
	}
}
