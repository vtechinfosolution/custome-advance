package com.custome;

public class Student {
	
	private String name;
	private String code;
	

	public Student(String str){
		this.name = str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", code=" + code + "]";
	}
	
	

}
