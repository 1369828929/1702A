package com.gaoyubo.test.test;

import java.io.UnsupportedEncodingException;


import org.junit.Test;

import com.gaoyubo.utils.StringUtil;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		System.out.println(StringUtil.hasLength(""));
		
		System.out.println(StringUtil.hasLength(" "));
		
		System.out.println(StringUtil.hasLength("dsa"));
	}

	// �����Ƿ�������
	@Test
	public void testHasText() {
		System.out.println(StringUtil.hasText(""));
		System.out.println(StringUtil.hasText(" "));
		System.out.println(StringUtil.hasText("dsa"));
	}

	// ����ָ����������
	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
		for (int i = 0; i < 10; i++) {

			System.out.println(StringUtil.randomChineseString(i));
		}
	}

	// ������������
	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
		for (int i = 0; i < 10; i++) {
			System.out.println(StringUtil.generateChineseName());
		}
	}

}

