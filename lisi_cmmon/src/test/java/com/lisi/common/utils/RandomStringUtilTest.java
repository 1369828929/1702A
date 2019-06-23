package com.lisi.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class RandomStringUtilTest {

	@Test
	public void testGetRandomChineseName() throws UnsupportedEncodingException {
		String name = RandomStringUtil.getRandomChineseName();
		System.out.println(name);
	}

	@Test
	public void testGetRandomString() throws UnsupportedEncodingException {
		String name = RandomStringUtil.getRandomString(2);
		System.out.println(name);
	}

}
