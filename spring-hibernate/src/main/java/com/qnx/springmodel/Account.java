package com.qnx.springmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
  @Table(name="account")
  public class Account{
	  @Column(name="name")
	  private String name;
	  @Id
	  @Column(name="username")
	  private String username;
	  
	  @Column(name="password")
	  private String password;
	  
	  @Column(name="email")
	  private String email;
	  
	  public Account(String name,String username,String password,String email) {
		  super();
		  this.name=name;
		  this.username=username;
		  this.password=password;
		  this.email=email;
	  }
	  public Account() {
		  
	  }
	  

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
 
}
