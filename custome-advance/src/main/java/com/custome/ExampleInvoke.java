package com.custome;

public class ExampleInvoke {
	public String code;
	public String company;
	
	public String getName(){
		System.out.println("Sample Invoke getname method..."+getCompany());
		return "Hello, Vikash: Your Company is:"+getCompany();
	}
	
	public String getName(String name){
		System.out.println("Sample Invoke getname with P method..."+getCompany());
		return "Hello, "+name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
