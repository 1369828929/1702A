package com.gaoyubo.test.test;

import java.util.Set;

import org.junit.Test;

import com.gaoyubo.utils.RandomUtil;

public class RandomUtilTest {

	//���������
		@Test
		public void testRandom() {
			for (int i = 0; i < 5; i++) {
				System.out.println(RandomUtil.random(0, 5));
			}
		}
	//���Բ�ͬ�����
		@Test
		public void testSubRandom() {
			for (int i = 0; i < 5; i++) {
				Set<Integer> subRandom = RandomUtil.subRandom(0, 5,5);
				for (int j : subRandom) {
					System.out.print(j+",");
				}
				System.out.println();
			}
		}

	//���Բ�ͬ�����
		@Test
		public void testSubRandom1() {
			for (int i = 0; i < 5; i++) {
				int[] random1 = RandomUtil.subRandom1(0, 5, 5);
				for (int j : random1) {
					System.out.print(j+",");
				}
				System.out.println();
			}
		}

	//��������ַ�
		@Test
		public void testRandomCharacter() {
			for (int i = 0; i < 5; i++) {
				System.out.println(RandomUtil.randomCharacter());
			}
		}
	//������֤��
		@Test
		public void testRandomString() {
			for (int i = 0; i < 5; i++) {
				System.out.println(RandomUtil.randomString(5));
			}
		}

}
