package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Parking_details {
	
	@Id
	int id;
	
	int floar;
	String vehicle_type;
	int capacity;
	public Parking_details() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Parking_details(int id, int floar, String vehicle_type, int capacity) {
		super();
		this.id = id;
		this.floar = floar;
		this.vehicle_type = vehicle_type;
		this.capacity = capacity;
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
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + floar;
		result = prime * result + id;
		result = prime * result + ((vehicle_type == null) ? 0 : vehicle_type.hashCode());
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
		Parking_details other = (Parking_details) obj;
		if (capacity != other.capacity)
			return false;
		if (floar != other.floar)
			return false;
		if (id != other.id)
			return false;
		if (vehicle_type == null) {
			if (other.vehicle_type != null)
				return false;
		} else if (!vehicle_type.equals(other.vehicle_type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parking_details [id=");
		builder.append(id);
		builder.append(", floar=");
		builder.append(floar);
		builder.append(", vehicle_type=");
		builder.append(vehicle_type);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append("]");
		return builder.toString();
	}

	public Parking_details(int id) {
		
		this.id = id;
	}

	public Parking_details(int id, int floar) {
		super();
		this.id = id;
		this.floar = floar;
	}

	
	
}
