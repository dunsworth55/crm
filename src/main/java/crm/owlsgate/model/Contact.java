package crm.owlsgate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue
	private Long id;
	
	private String forename, surname;
	private String mobilePhoneNumber, officePhoneNumber;
	
	public String getForename() {
		return forename;
	}
	public Long getId() {
		return id;
	}
	
	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}
	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}
	public String getSurname() {
		return surname;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}
	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
