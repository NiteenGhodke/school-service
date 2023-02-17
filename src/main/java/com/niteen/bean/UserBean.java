package com.niteen.bean;

public class UserBean {
	private String name;

	@Override
	public String toString() {
		return "UserBean [name=" + name + "]";
	}

	public UserBean() {
		super();
	}

	public UserBean(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
