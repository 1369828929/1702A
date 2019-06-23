package com.lisi.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.lisi.common.entity.Person;

public class PersonTest {
	
	
	@Test
	public void testAdd() throws UnsupportedEncodingException {
		
	//	List<Person> p = new ArrayList<>();
		
		for(int i =0;i<=100;i++) {
			
			Person person = new Person(RandomStringUtil.getRandomChineseName(),
					RandomUtil.getRandomNumber(0, 120), RandomStringUtil.getRandomString(100), new Date());
			System.out.println(person);
		}
		
		
	}

}

