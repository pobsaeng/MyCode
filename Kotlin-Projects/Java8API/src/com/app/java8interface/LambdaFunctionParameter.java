package com.app.java8interface;

import java.util.function.Function;

public class LambdaFunctionParameter {

	public static void main(String[] args) {
		LambdaFunctionParameter lamb = new LambdaFunctionParameter();
		String rs1 = lamb.getPeopleDetail(e->e.getFirstName());
		String rs2 = lamb.getPeopleDetail(e->e.getLastName());
		String rs3 = lamb.getPeopleDetail(e->e.getAge().toString()); //age and 'getPeopleDetail' are type of string
		
		System.out.println(rs1+", "+rs2+", "+rs3 );
		
		System.out.println(lamb.funcOOP.apply("Hey!"));
	}
	private String getPeopleDetail(Function<People, String> peopleDetail) {
		return peopleDetail.apply( new People("Kraipob", "Saengkhunthuod", 20) );
	}
	
	Function<String, String> funcOOP = string->{
		People people = new People(string, "Satany", 30);
		return people.getFirstName()+", "+people.getLastName();
	};
	
	private String getORM(Function<String, String> strLam) {
		People people = new People("John", "Petacy", 29);
		String value = strLam.apply(people.getFirstName());
		return value;
	}
}

class People {
	private String firstName;
	private String lastName;
	private Integer age;

	public People(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public Integer getAge() { return age; }
}