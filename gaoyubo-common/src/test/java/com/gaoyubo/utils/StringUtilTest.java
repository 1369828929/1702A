package com.gaoyubo.utils;
/**
 * �ַ������������
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: admin
 * @date: 2019��6��17�� ����9:32:06
 */

import java.util.Random;

import org.junit.Test;

public class StringUtilTest {
	private static final int String = 0;
	/**
	 * �ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ
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
	 * �ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)�Ϳո�Ҳ��ûֵ
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
