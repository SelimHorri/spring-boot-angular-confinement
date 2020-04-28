package com.selimhorri.pack.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.springframework.data.annotation.Immutable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.selimhorri.pack.entities.read_only.PersonReadOnly;

@Entity
@Table(name = "person")
@Immutable
@JsonPropertyOrder(value = {"id", "fname", "lname", "email", "password"})
public final class Person implements Serializable, PersonReadOnly {
// Begin Class
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(value = "id")
	@Column(name = "id")
	private int id;
	
	@JsonProperty(value = "fname")
	@Column(name = "fname")
	private String fname;
	
	@JsonProperty(value = "lname")
	@Column(name = "lname")
	private String lname;
	
	@Email
	@JsonProperty(value = "email")
	@Column(name = "email")
	private String email;
	
	@JsonIgnore
	@JsonProperty(value = "password")
	@Column(name = "password")
	private String password;
	
	public Person() {
		
	}
	
	public Person(String fname, String lname, String email, String password) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
	}
	
	public Person(int id, String fname, String lname, String email, String password) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + "]";
	}
	
	@Override
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@Override
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
// End Class
}









