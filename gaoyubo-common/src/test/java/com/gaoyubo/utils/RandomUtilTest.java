package com.gaoyubo.utils;

import org.junit.Test;

/**
 * ���������������
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: ���
 * @date: 2019��6��17�� ����8:51:36
 */
public class RandomUtilTest {
	/**
	 * ����min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ���
	 * @Title: random 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void random() {
		System.out.println(RandomUtil.random(1, 3));
	}
	/**
	 * ����Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ
	 * @Title: subRandom 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void subRandom (){
		int[] subRandom = RandomUtil.subRandom(1, 10, 3);
		int[] arr =new int[subRandom.length];
		for (int i = 0; i < subRandom.length; i++) {
			arr[i] += subRandom[i];
			System.out.println(arr[i]);
		}
	}
	/**
	 * ����1��1-9,a-Z֮�������ַ�
	 * @Title: randomCharacter 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void randomCharacter () {
		System.out.println(RandomUtil.randomCharacter());
	}
	/**
	 * ���ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� 
	 * @Title: randomString 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void randomString() {
		System.out.println(RandomUtil.randomString(6));
	}
	
	
}
