package com.hcl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.PatientDao;
import com.hcl.entities.Patient;
import com.hcl.entities.PatientDiagnosis;
import com.hcl.entities.Physician;

@Service
public class PatientServicesImpl implements PatientServices {
	@Autowired
	PatientDao dao;

	@Override
	@Transactional
	public boolean insertPatient(Patient patient) {
		boolean b = dao.insert(patient);
		return b;
	}

	@Override
	public boolean insertPhysician(Physician physician) {
		boolean b = dao.insert(physician);
		return b;
	}

	@Override
	public boolean insertPatientDiagnosis(PatientDiagnosis diagnosis) {
		boolean b = dao.insert(diagnosis);
		return b;
	}

	@Override
	public List<Physician> getPhysician(String state) {
		List<Physician> physician = dao.getPhysician(state);
		return physician;
	}

}
