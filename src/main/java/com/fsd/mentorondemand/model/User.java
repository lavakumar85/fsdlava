package com.fsd.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {

	public  User() {

	}
	
	public User(int id, String userName) {
		super();
		this.id = id;
		this.username = userName;
		
	}

	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	private int id;

	private String username;
	private String firstName;
	private String lastName;
	private Long contactNumber;
	//private Date reg_DateTime;
	private int reg_Code;
	private boolean forceRestPwd;
	private boolean isActive;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	/*
	 * public Date getReg_DateTime() { return reg_DateTime; } public void
	 * setReg_DateTime(Date reg_DateTime) { this.reg_DateTime = reg_DateTime; }
	 */
	public int getReg_Code() {
		return reg_Code;
	}
	public void setReg_Code(int reg_Code) {
		this.reg_Code = reg_Code;
	}
	public boolean isForceRestPwd() {
		return forceRestPwd;
	}
	public void setForceRestPwd(boolean forceRestPwd) {
		this.forceRestPwd = forceRestPwd;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

	public User(int id, String userName, String firstName, String lastName, Long contactNumber,
			int reg_Code, boolean forceRestPwd, boolean isActive) {
		super();
		this.id = id;
		this.username = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		//this.reg_DateTime = reg_DateTime;
		this.reg_Code = reg_Code;
		this.forceRestPwd = forceRestPwd;
		this.isActive = isActive;
	}
	
	

}
