package org.SRK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Person {

	
	private String name;
	private int age;
	@EmbeddedId
	private PersonID id;
	
	public PersonID getId() {
		return id;
	}
	public void setId(PersonID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
