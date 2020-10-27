package com.hcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.entities.Physician;
import com.hcl.services.PatientServices;

@Controller
public class PhysicianController {
	@Autowired
	private PatientServices service;

	@GetMapping("/physician")
	public String showPhysicianPage() {
		return "physician";
	}

	@PostMapping("/pprocess")
	public String showPhysician(@RequestParam("phyFirstName") String phyFirstName,
			@RequestParam("phyLastName") String phyLastName, @RequestParam("department") String department,
			@RequestParam("educationalQualification") String educationalQualification,
			@RequestParam("yearsOfExperience") int yearsOfExperience, @RequestParam("phyState") String phyState,
			@RequestParam("phyInsurancePlan") String phyInsurancePlan) {
		Physician physician = new Physician();
		physician.setPhyFirstName(phyFirstName);
		physician.setPhyLastName(phyLastName);
		physician.setDepartment(department);
		physician.setEducationalQualification(educationalQualification);
		physician.setYearsOfExperience(yearsOfExperience);
		physician.setPhyState(phyState);
		physician.setPhyInsurancePlan(phyInsurancePlan);
		service.insertPhysician(physician);
		return "physician";
	}
}
