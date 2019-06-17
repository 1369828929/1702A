package com.gaoyubo.utils;
/**
 * Person类
 * @ClassName: Person 
 * @Description: TODO
 * @author: admin
 * @date: 2019年6月17日 上午10:21:52
 */
public class Person {
	//Person类，里面有姓名(name)、年龄(age)、介绍(about)、注册日期(created)
	private String name;
	private int age;
	private String about;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + "]";
	}
	public Person(String name, int age, String about) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
	}
	
}
