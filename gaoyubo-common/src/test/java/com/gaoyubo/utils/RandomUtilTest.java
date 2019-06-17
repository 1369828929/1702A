package com.gaoyubo.utils;

import org.junit.Test;

/**
 * 测试随机数工具类
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: 高宇博
 * @date: 2019年6月17日 上午8:51:36
 */
public class RandomUtilTest {
	/**
	 * 返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对
	 * @Title: random 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void random() {
		System.out.println(RandomUtil.random(1, 3));
	}
	/**
	 * 在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取
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
	 * 返回1个1-9,a-Z之间的随机字符
	 * @Title: randomCharacter 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void randomCharacter () {
		System.out.println(RandomUtil.randomCharacter());
	}
	/**
	 * 返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 
	 * @Title: randomString 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void randomString() {
		System.out.println(RandomUtil.randomString(6));
	}
	
	
}
