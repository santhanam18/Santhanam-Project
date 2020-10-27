package com.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/*@NamedQueries({
		@NamedQuery(name = "findPhysicianByState", query = "from Physician physician where physician.state =:state") })*/
@Entity
public class Physician {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phyID;
	private String phyFirstName;
	private String phyLastName;
	private String department;
	private String educationalQualification;
	private int yearsOfExperience;
	private String phyState;
	private String phyInsurancePlan;

	public Physician() {
		// TODO Auto-generated constructor stub
	}

	public int getPhyID() {
		return phyID;
	}

	public void setPhyID(int phyID) {
		this.phyID = phyID;
	}

	public String getPhyFirstName() {
		return phyFirstName;
	}

	public void setPhyFirstName(String phyFirstName) {
		this.phyFirstName = phyFirstName;
	}

	public String getPhyLastName() {
		return phyLastName;
	}

	public void setPhyLastName(String phyLastName) {
		this.phyLastName = phyLastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEducationalQualification() {
		return educationalQualification;
	}

	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getPhyState() {
		return phyState;
	}

	public void setPhyState(String phyState) {
		this.phyState = phyState;
	}

	public String getPhyInsurancePlan() {
		return phyInsurancePlan;
	}

	public void setPhyInsurancePlan(String phyInsurancePlan) {
		this.phyInsurancePlan = phyInsurancePlan;
	}

}
