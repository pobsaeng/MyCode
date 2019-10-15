package com.app.java8;

import java.util.ArrayList;
import java.util.List;

public class General {
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		List<General> list = new ArrayList<>();
		General ger = new General();
		ger.setId("12121");
		ger.setName("Kraipob");
		list.add(ger);

		long count = list.stream().count();
		System.out.println(count);

		// filter
		list.stream().filter(i -> i.getName().equals("Kraipob")).forEach(i -> System.out.println("" + i.getName()));

		// for
		list.stream().forEach(s -> System.out.println("" + s.getId()));

	}

}
