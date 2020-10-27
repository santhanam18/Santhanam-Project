package com.hcl.dao;

import java.util.List;

import com.hcl.entities.Patient;
import com.hcl.entities.PatientDiagnosis;
import com.hcl.entities.Physician;

public interface PatientDao {

	public boolean insert(Patient patient);
	public boolean insert(Physician physician);
	public boolean insert(PatientDiagnosis diagnosis);
	public List<Physician> getPhysician(String state);

}
