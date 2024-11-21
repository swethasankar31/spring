package com.spring.spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")//singleton it has one copy of the object it shows the same address for the all new variables created.
@Scope("prototype") //different objects can be created
public class Employee {
     private String name;
     private int experience;
     @Autowired
	public Employee(@Value ("Virat")String name, @Value("15")int experience) {
		super();
		this.name = name;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
     
	
     
}
