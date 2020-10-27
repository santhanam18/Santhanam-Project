package com.hcl.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entities.Patient;
import com.hcl.entities.PatientDiagnosis;
import com.hcl.entities.Physician;

@Repository
public class PatientDaoImpl implements PatientDao {
	@Autowired
	SessionFactory factory;

	@Override
	public boolean insert(Patient patient) {
		boolean b = false;
		Session session = factory.openSession();
		Integer i = (Integer) session.save(patient);
		if (i == patient.getPatientID())
			b = true;
		session.close();
		return b;
	}

	@Override
	public boolean insert(Physician physician) {
		boolean b = false;
		Session session = factory.openSession();
		Integer i = (Integer) session.save(physician);
		if (i == physician.getPhyID())
			b = true;
		session.close();
		return b;
	}

	@Override
	public boolean insert(PatientDiagnosis diagnosis) {
		boolean b = false;
		Session session = factory.openSession();
		Integer i = (Integer) session.save(diagnosis);
		if (i == diagnosis.getDiagnosisID())
			b = true;
		session.close();
		return b;
	}

	@Override
	public List<Physician> getPhysician(String state) {
		Session session = factory.openSession();
		TypedQuery query = session.getNamedQuery("select *from Physician physician where physician.state =:state");
		query.setParameter("state", state);
		List<Physician> physician=query.getResultList();
		session.close();
		return physician;
	}

}
