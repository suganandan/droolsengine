package com.du.drools.droolsengine.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.du.drools.droolsengine.service.JewelleryShopService;

class JewelleryShopControllerTest {

	@Test
	void testAdd() {
		JewelleryShopService js=new JewelleryShopService(null);
		JewelleryShopController appl = new JewelleryShopController(js);
		assertEquals(10, appl.add(6, 4));
	}
	@Test
	void testAdd1() {
		JewelleryShopService js=new JewelleryShopService(null);
		JewelleryShopController appl = new JewelleryShopController(js);
		assertEquals(15, appl.add(5, 20));
	}
	@Test
	void testMul() {
		JewelleryShopService js=new JewelleryShopService(null);
		JewelleryShopController appl = new JewelleryShopController(js);
		assertEquals(100, appl.mul(5, 20));
	}

}
