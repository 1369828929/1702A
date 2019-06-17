package com.gaoyubo.utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * 随机数工具类
 * @ClassName: RandomUtil 
 * @Description: TODO
 * @author: 高宇博
 * @date: 2019年6月17日 上午8:46:30
 */
public class RandomUtil {
	/**
	 * 
	 * @Title: random 
	 * @Description: TODO
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max){
		Random r=new Random();
		return r.nextInt(max-min+1)+min;
	}
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: TODO
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	public static int[] subRandom (int min, int max, int subs){
		int[] arr =new int[subs];
		Random r=new Random();
		for (int i = 0; i < subs; i++) {
			arr[i]+=r.nextInt(max-min+1)+min;
		}
		return arr;
	}
	/**
	 * 
	 * @Title: randomCharacter 
	 * @Description: TODO
	 * @return
	 * @return: char
	 */
	public static char randomCharacter (){
		String str = "123456789qwertyuiopasdfghjklzxcvbnm";
		int index = random(0, str.length()-1);
		return str.charAt(index);
	}
	public static String randomString(int length){
		String str = "123456789qwertyuiopasdfghjklzxcvbnm";
		String arr="";
		for (int i = 0; i < length; i++) {
			arr+=randomCharacter();
		}
		return arr;
	}
}
