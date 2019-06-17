package com.gaoyubo.utils;

import org.junit.Test;

public class PersonTest {
	@Test
	public void person() {
		for (int i = 0; i < 20; i++) {
			Person persons = new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 99), StringUtil.randomChineseString(140));
			System.out.println(persons);
		}
		
	}
}
