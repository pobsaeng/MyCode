package com.multibank.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menu_bak")
public class Menu {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer menu_id;
	private String type;
	private String icon;
	private String name;
	private String route_name;
	private String level;
	private String privilege;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "menu_item",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "sub_menu_id"))
    private List<SubMenu> subMenu = new ArrayList<>();
	
	public List<SubMenu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<SubMenu> subMenu) {
		this.subMenu = subMenu;
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
	
	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", type=" + type + ", icon=" + icon + ", name=" + name + ", route_name="
				+ route_name + ", level=" + level + ", subMenu=" + subMenu + "]";
	}
}
