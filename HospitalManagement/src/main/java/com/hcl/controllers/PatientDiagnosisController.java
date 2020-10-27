package com.hcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.entities.PatientDiagnosis;
import com.hcl.services.PatientServices;

@Controller
public class PatientDiagnosisController {
	@Autowired
	private PatientServices service;

	@GetMapping("/patientDiagnosis")
	public String showPatientDiagnosispage() {
		return "patientDiagnosis";
	}

	@PostMapping("/dprocess")
	public String showPatientDiagnosis(@RequestParam("symptoms") String symptoms,
			@RequestParam("diagnosisProvided") String diagnosisProvided,
			@RequestParam("administeredBy") String administeredBy,
			@RequestParam("dateOfDiagnosis") String dateOfDiagnosis,
			@RequestParam("followUpRequired") String followUpRequired,
			@RequestParam("dateOfFollowUp") String dateOfFollowUp, @RequestParam("billAmount") String billAmount,
			@RequestParam("cardNumber") String cardNumber, @RequestParam("modeOfPayment") String modeOfPayment) {

		PatientDiagnosis diagnosis = new PatientDiagnosis();
		diagnosis.setSymptoms(symptoms);
		diagnosis.setDiagnosisProvided(diagnosisProvided);
		diagnosis.setAdministeredBy(administeredBy);
		diagnosis.setDateOfDiagnosis(dateOfDiagnosis);
		diagnosis.setFollowUpRequired(followUpRequired);
		diagnosis.setDateOfFollowUp(dateOfFollowUp);
		diagnosis.setBillAmount(billAmount);
		diagnosis.setCardNumber(cardNumber);
		diagnosis.setModeOfPayment(modeOfPayment);
		service.insertPatientDiagnosis(diagnosis);
		return "patientDiagnosis";
	}
}
