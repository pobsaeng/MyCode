package com.multibank.model.json.request;

import java.util.ArrayList;
import java.util.List;

import com.multibank.domain.entity.ListItems;

public class SignUpRequest {
	private Integer user_id;
	private String fullname;
	private String username;
	private String email;
	private String password;
	private String privilege;
	
	private List<ListItems> items = new ArrayList<ListItems>();
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<ListItems> getItems() {
		return items;
	}
	public void setItems(List<ListItems> items) {
		this.items = items;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	@Override
	public String toString() {
		return "SignUpRequest [user_id=" + user_id + ", fullname=" + fullname + ", username=" + username + ", email="
				+ email + ", password=" + password + ", privilege=" + privilege + ", items=" + items + "]";
	}
}
