package com.lt.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="sys_user")
public class User {
	@Id
	private String id;
	
	private Integer age;
	
	private String name;
	
	private String sex;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
