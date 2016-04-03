package crm.owlsgate.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Entry {
	@Id
	@GeneratedValue
	private Long id;
	
//	@NotNull
	private String jobTitle;
	
//	@NotNull
	private String company;
	
	private String rate;

	private Date datePosted;
	
	private Date contractStartDate;

	private int monthsDuration;

	private String notes;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Contact> contacts;

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public String getCompany() {
		return company;
	}

	public Date getContractStartDate() {
		return contractStartDate;
	}

	public Date getDatePosted() {
		return datePosted;
	}

	public Long getId() {
		return id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public int getMonthsDuration() {
		return monthsDuration;
	}

	public String getNotes() {
		return notes;
	}

	public String getRate() {
		return rate;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}
	

	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setMonthsDuration(int monthsDuration) {
		this.monthsDuration = monthsDuration;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}


}
