package com.hcl.services;

import java.util.List;

import com.hcl.entities.Patient;
import com.hcl.entities.PatientDiagnosis;
import com.hcl.entities.Physician;

public interface PatientServices {

	public boolean insertPatient(Patient patient);

	public boolean insertPhysician(Physician physician);

	public boolean insertPatientDiagnosis(PatientDiagnosis diagnosis);
	
	public List<Physician> getPhysician(String state);

}
