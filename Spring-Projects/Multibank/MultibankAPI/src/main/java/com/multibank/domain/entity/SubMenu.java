package com.multibank.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sub_menu")
public class SubMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sub_menu_id;
	private Integer menu_id;
	private String type;
	private String icon;
	private String name;
	private String route_name;
	private String level;
	
	public Integer getSub_menu_id() {
		return sub_menu_id;
	}

	public void setSub_menu_id(Integer sub_menu_id) {
		this.sub_menu_id = sub_menu_id;
	}

	public Integer getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(Integer treemenu_id) {
		this.menu_id = treemenu_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoute_name() {
		return route_name;
	}

	public void setRoute_name(String route_name) {
		this.route_name = route_name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "SubMenu [sub_menu_id=" + sub_menu_id + ", menu_id=" + menu_id + ", type=" + type + ", icon=" + icon
				+ ", name=" + name + ", route_name=" + route_name + ", level=" + level + "]";
	}
}
