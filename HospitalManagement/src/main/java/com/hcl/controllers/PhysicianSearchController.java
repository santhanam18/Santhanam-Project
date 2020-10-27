package com.hcl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.entities.Physician;
import com.hcl.services.PatientServices;

@Controller
public class PhysicianSearchController {
	@Autowired
	private PatientServices service;

	@GetMapping("/physicianSearch")
	public String showPhysicianSearch() {
		return "physicianSearch";
	}
	@PostMapping("/psprocess")
	public String showPhysician(@RequestParam("phyState") String state)
	{
		List<Physician> physician=service.getPhysician(state);
		System.out.println(physician.get(1));
		return "admin";
	}
}
