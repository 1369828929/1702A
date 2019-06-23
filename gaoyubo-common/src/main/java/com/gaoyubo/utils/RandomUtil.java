package com.lisi.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	
	
	
	
	
	
	
	//④	返回参数指定个数的随机字符串(应用场景如：验证码)
	//③获取 1 个 1-9,a-Z 之间的随机字符
		public static  String getRandomStr(int i){
			String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
			String dest="";
			for(int j=0;j<i;j++) {
			Integer index = getRandomNumber(0, str.length() -1);
			dest+=str.charAt(index);
			}
			return dest ;
		}
	
	
	
	//③获取 1 个 1-9,a-Z 之间的随机字符
	public static  String getRandomStr(){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Integer index = getRandomNumber(0, str.length()-1);
		return  str.charAt(index)+"";
	}
	

	
	/**
	 * //2 获取最小最大区间多个不重复随机数；
	 * @Title: getRandomNumber2 
	 * @Description: TODO
	 * @param min
	 * @param max
	 * @param num  需要的数据个数
	 * @return
	 * @return: Set<Integer>
	 */
	public static  Set<Integer> getRandomNumber(Integer min,Integer max,int num) {
		//初始化一个set集合
		Set<Integer> set = new HashSet<Integer>();
		//set集合和需要的大小比较,
		while(set.size()!=num) {
			Random r = new Random();
			set.add(r.nextInt(max - min + 1)+min);
		}
		return set;
		
	} 
	//①获取最小最大区间的随机数 2-10
	public static  Integer getRandomNumber(Integer min,Integer max) {
		Random r = new Random();
		return r.nextInt(max - min + 1)+min;
		
	} 

	
	
}
