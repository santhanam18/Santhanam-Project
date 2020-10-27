package com.hcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.entities.Patient;
import com.hcl.services.PatientServices;

@Controller
public class PatientController {
	@Autowired
	private PatientServices service;

	@GetMapping("/patient")
	public String showPatientPage() {
		return "patient";
	}

	@PostMapping("/process")
	public String showPatient(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("password") String password, @RequestParam("dateOfBirth") String dateOfBirth,
			@RequestParam("email") String email, @RequestParam("contactNumber") String contactNumber,
			@RequestParam("state") String state, @RequestParam("insurancePlan") String insurancePlan) {
		Patient patient = new Patient();
		patient.setFirstName(firstName);
		patient.setLastName(lastName);
		patient.setPassword(password);
		patient.setDateOfBirth(dateOfBirth);
		patient.setEmail(email);
		patient.setContactNumber(contactNumber);
		patient.setState(state);
		patient.setInsurancePlan(insurancePlan);
		service.insertPatient(patient);
		return "patient";
	}

}
