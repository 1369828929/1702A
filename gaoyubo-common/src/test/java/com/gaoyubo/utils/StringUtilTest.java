package com.gaoyubo.utils;
/**
 * 字符串工具类测试
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: admin
 * @date: 2019年6月17日 上午9:32:06
 */

import java.util.Random;

import org.junit.Test;

public class StringUtilTest {
	private static final int String = 0;
	/**
	 * 判断源字符串是否有值，空引号(空白字符串)也算没值
	 * @Title: hasLength 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void hasLength() {
		System.out.println(StringUtil.hasLength("aaa"));
		System.out.println(StringUtil.hasLength(""));
		System.out.println(StringUtil.hasLength(" "));
	}
	/**
	 * 判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	 * @Title: hasText 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void hasText() {
		System.out.println(StringUtil.hasText("aaa"));
		System.out.println(StringUtil.hasText(""));
		System.out.println(StringUtil.hasText(" "));
	}
	@Test
	public void randomChineseString() {
		System.out.println(StringUtil.randomChineseString(1));
	}
	@Test
	public void generateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}
}
