package com.gaoyubo.utils;
/**
 * Person��
 * @ClassName: Person 
 * @Description: TODO
 * @author: admin
 * @date: 2019��6��17�� ����10:21:52
 */
public class Person {
	//Person�࣬����������(name)������(age)������(about)��ע������(created)
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
