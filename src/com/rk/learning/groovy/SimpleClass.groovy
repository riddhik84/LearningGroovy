package com.rk.learning.groovy

class SimpleClass {
	String name
	String address
	int age
	def company
	
	static void main(def args){
		SimpleClass v = new SimpleClass()
		
		v.setName("Riddhi")
		v.setAddress("Lake Town")
		v.setAge(30)
		v.setCompany("Avaya")
		
		println ("Name: " +v.getName() + "\n" + "Address: " + v.getAddress() + "\n" + "Company: " + v.getCompany());
	}
}
