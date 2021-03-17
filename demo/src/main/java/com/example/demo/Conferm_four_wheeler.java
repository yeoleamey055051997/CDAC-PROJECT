package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conferm_four_wheeler {

	@Id
	int id;
	int floar;
	String name;
	String email;
	String date1;
	public Conferm_four_wheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conferm_four_wheeler(int id, int floar, String name, String email, String date1) {
		super();
		this.id = id;
		this.floar = floar;
		this.name = name;
		this.email = email;
		this.date1 = date1;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFloar() {
		return floar;
	}
	public void setFloar(int floar) {
		this.floar = floar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date1 == null) ? 0 : date1.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + floar;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conferm_four_wheeler other = (Conferm_four_wheeler) obj;
		if (date1 == null) {
			if (other.date1 != null)
				return false;
		} else if (!date1.equals(other.date1))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (floar != other.floar)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conferm_four_wheeler [id=");
		builder.append(id);
		builder.append(", floar=");
		builder.append(floar);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", date1=");
		builder.append(date1);
		builder.append("]");
		return builder.toString();
	}
	public Conferm_four_wheeler(int id, int floar, String name, String email) {
		super();
		this.id = id;
		this.floar = floar;
		this.name = name;
		this.email = email;
	}
	
	
}
