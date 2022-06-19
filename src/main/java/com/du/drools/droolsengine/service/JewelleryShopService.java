package com.du.drools.droolsengine.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.du.drools.droolsengine.vo.Person;
@Service
public class JewelleryShopService {

	private final KieContainer kieContainer;

	@Autowired
	public JewelleryShopService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Person getProductDiscount(Person person) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(person);
		kieSession.fireAllRules();
		
		kieSession.dispose();
		return person;
	}}
