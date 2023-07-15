package com.du.drools.droolsengine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.du.drools.droolsengine.service.JewelleryShopService;
//import com.du.drools.droolsengine.vo.Product;
@RestController
public class JewelleryShopController {

	private final JewelleryShopService jewelleryShopService;

	@Autowired
	public JewelleryShopController(JewelleryShopService jewelleryShopService) {
		this.jewelleryShopService = jewelleryShopService;
	}

	/*@RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
	public Product getQuestions(@RequestParam(required = true) String type) {

		Product product = new Product();
		product.setType(type);

		jewelleryShopService.getProductDiscount(product);

		return product;
	}*/
	
	
	public int add(int n1, int n2) {
		int result = 0;
		if (n1 > n2) {
			result = n1 + n2;
		} else {
			result = n2 - n1;
		}
		return result;
	}
	
	public int mul(int n1, int n2) {
		
		return n1*n2;
	}
	public int newmul(int n1, int n2) {
		
		
		return n1/n2;
	}

}
