package com.gaoyubo.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	/**
	 * 
	 * @Title: random
	 * @Description:����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	/**
	 * 
	 * @Title: subRandom
	 * @Description://����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ���������� ������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ�(8��)
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	public static Set<Integer> subRandom(int min, int max, int subs) {

		// int[] num = new int[subs];
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != subs) {
			int i = random(min, max);
			set.add(i);
		}

		return set;
	}
	public static int[] subRandom1(int min, int max, int subs) {
		
		int[] num = new int[subs];
		int i = 0;
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != subs) {
			int a = random(min, max);
			boolean flag = set.add(a);
			if (flag) {
				num[i]=a;
				i++;
			}
		}
		
		return num;
	}

	/**
	 * 
	 * @Title: randomCharacter
	 * @Description: ����3������1��1-9,a-Z֮�������ַ��� (8��)
	 * @return
	 * @return: char
	 */
	//
	public static char randomCharacter() {
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		int index = random(0, str.length() - 1);
		char c = str.charAt(index);
		return c;
	}

	/**
	 * 
	 * @Title: randomString
	 * @Description:���ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	 * @param length ָ������
	 * @return
	 * @return: String
	 */
	// ����4��
	public static String randomString(int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str += randomCharacter();
		}
		return str;
	}
}
