package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Two_w {

	@Id
	int id;
	int floar;
	boolean booking_status;

	public Two_w() {

		// TODO Auto-generated constructor stub
	}

	public Two_w(int id, int floar, boolean booking_status) {
		super();
		this.id = id;
		this.floar = floar;
		this.booking_status = booking_status;
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

	public void setFloor(int floar) {
		this.floar = floar;
	}

	public boolean isBooking_status() {
		return booking_status;
	}

	public void setBooking_status(boolean booking_status) {
		this.booking_status = booking_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (booking_status ? 1231 : 1237);
		result = prime * result + floar;
		result = prime * result + id;
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
		Two_w other = (Two_w) obj;
		if (booking_status != other.booking_status)
			return false;
		if (floar != other.floar)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Two_w [id=");
		builder.append(id);
		builder.append(", floar=");
		builder.append(floar);
		builder.append(", booking_status=");
		builder.append(booking_status);
		builder.append("]");
		return builder.toString();
	}

	public Two_w(int id) {
		super();
		this.id = id;
	}

	public Two_w(int id, int floar) {
		super();
		this.id = id;
		this.floar = floar;
	}

}
