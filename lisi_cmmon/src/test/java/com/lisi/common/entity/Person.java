package com.lisi.common.entity;

import java.util.Date;

public class Person {
//姓名、 年龄、 介绍、 生成日期
	private Integer id;
	private String name;
	private Integer  age;
	private String text;
	private Date birthday;
	
	
	
	public Person(String name, Integer age, String text, Date birthday) {
		super();
		this.name = name;
		this.age = age;
		this.text = text;
		this.birthday = birthday;
	}
	public Person() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", text=" + text + ", birthday=" + birthday
				+ "]";
	}
	
	
}
