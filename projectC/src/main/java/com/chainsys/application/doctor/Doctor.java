package com.chainsys.application.doctor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name="Doctor")
public class Doctor {
	 @Id
	 private int id ;
		private String name; 
		private Date dob ; 
		private String speciality ;
		private String city; 
		private long phone_no; 
		@Column(name="Standard_fees")
		private float Standard_fees;
		
	    
	    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}


	public float getStandard_fees() {
		return Standard_fees;
	}


	public void setStandard_fees(float standard_fees) {
		this.Standard_fees = standard_fees;
	}


	  
	    @Override
	    public String toString() {
	        return String.format("%d, %s, %s, %s, %d",id,name,dob,city,phone_no);
	    }


}
