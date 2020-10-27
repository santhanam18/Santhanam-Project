package com.hcl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewPatientController {
	@GetMapping("/viewPatient")
	public String showViewPatient() {
		return "viewPatient";
	}

}
