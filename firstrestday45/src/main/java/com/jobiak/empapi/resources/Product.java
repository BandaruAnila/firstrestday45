package com.jobiak.empapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class Product {
	
	@GetMapping("/mobile")
	public String showCatalog() {
		
		return new String("Apple Iphone 12,Liadar camera, A15Boinic Chip, 6GB RAM, 128GB ROM, 109000,Security Matter");
	}
	
	@GetMapping("/intro")
	public String introduction() {
		
		return new String("Manufactured in India And Assembled in California");
	}
	
	@GetMapping("/search/{modelId}")
	public String search(@PathVariable(value="modelId")String modelId) {
		
		return new String(modelId+" is available in Product Red and Green only and delevery with in 24 hours with no charges");
		
	}
	
	@GetMapping("/search/{modelId}/brand/{brand}")
	public String search(@PathVariable(value="modelId")String modelId,@PathVariable(value="brand")String brand) {
		
		return new String(modelId+brand+" is currently not available in your loation");
	}

}
