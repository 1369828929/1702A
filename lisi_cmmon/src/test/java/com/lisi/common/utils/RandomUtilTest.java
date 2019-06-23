package com.lisi.common.utils;

import java.util.Set;

import org.junit.Test;

public class RandomUtilTest {
	//返回指定个数中文汉字字符串，字符集必须在 GB2312(相当于中文简体)范围内；
	
	
	
	@Test //4
	public void testGetRandomStr2() {
		for(int i =1;i<10;i++) {
		String str = RandomUtil.getRandomStr(4);
		System.out.println(str);
		}
		
	}

	@Test //3
	public void testGetRandomStr() {
		String str="";
		for(int i =1;i<10;i++) {
		str = RandomUtil.getRandomStr();
		System.out.println(str);
		}
		
	}
	
	@Test //2
	public void testGetRandomNumber2() {
		for(int i =1;i<10;i++) {
		Set set = RandomUtil.getRandomNumber(1, 10, 5);
		System.out.println(set);
		}
	}
	

	@Test //1
	public void testGetRandomNumber() {
		for (int i =1;i<= 10; i++) {
			System.out.println(RandomUtil.getRandomNumber(2, 5));
		}
	
	}

}
