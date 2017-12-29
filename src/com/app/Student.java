package com.app;

public class Student {
	public int stdId;
	public String stdName;
	public double stdSal;

	// ctrl+space:::Default Constructor
	public Student() {
	}

	// Alt+shift+s-r sel all:::Setters And Getters
	public int getstdId() {
		return stdId;
	}

	public void setstdId(int stdId) {
		this.stdId = stdId;
	}

	public String getstdName() {
		return stdName;
	}

	public void setstdName(String stdName) {
		this.stdName = stdName;
	}

	public double getstdSal() {
		return stdSal;
	}

	public void setstdSal(double stdSal) {
		this.stdSal = stdSal;
	}

	// Alt+shift+s-s sel all:::toString()
	@Override
	public String toString() {
		return "stdloyee [stdId=" + stdId + ", stdName=" + stdName
				+ ", stdSal=" + stdSal + "]";
	}

	// Alt+shift+s-o sel all:::Consts for all fields
	public Student(int stdId, String stdName, double stdSal) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdSal = stdSal;
	}

	// Alt+shift+s-o sel all:::hashCode And equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stdId;
		result = prime * result + ((stdName == null) ? 0 : stdName.hashCode());
		long tstd;
		tstd = Double.doubleToLongBits(stdSal);
		result = prime * result + (int) (tstd ^ (tstd >>> 32));
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
		Student other = (Student) obj;
		if (stdId != other.stdId)
			return false;
		if (stdName == null) {
			if (other.stdName != null)
				return false;
		} else if (!stdName.equals(other.stdName))
			return false;
		if (Double.doubleToLongBits(stdSal) != Double
				.doubleToLongBits(other.stdSal))
			return false;
		return true;
	}

}// class
