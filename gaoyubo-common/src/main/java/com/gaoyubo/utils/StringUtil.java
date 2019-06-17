package com.gaoyubo.utils;

import java.util.Random;

/**
 * �ַ���������
 * @ClassName: StringUtil 
 * @Description: TODO
 * @author: admin
 * @date: 2019��6��17�� ����9:31:53
 */
public class StringUtil {
	/**
	 * �ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ
	 * @Title: hasLength 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean hasLength(String src){
		return null!=src&&src.length()>0;
	}
	/**
	 * �ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)�Ϳո�Ҳ��ûֵ
	 * @Title: hasText 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean hasText(String src){
		return null!=src&&src.trim().length()>0;
	}
	public static String randomChineseString(int length){
		Random random = new Random();
		StringBuffer buffer = new StringBuffer();
		String str="";
		for (int i = 0; i < length; i++) {
			str+=(char)(random.nextInt(40869-19968+1)+19968);
		}
		if (random.nextBoolean()) {
			return buffer.append(str).toString();
		}
		return randomChineseString(length);
	}
	
 	public static String generateChineseName(){
 		String[] strName= {"��","Ǯ","��","��","��","��","֣","��","��",
 				"��","��","��","��","��","��","��","��","��","��","��",
 				"��","��","ʩ","��","��","��","��","��","��","κ","��","��",
 				"��","л","��","��","��","ˮ","�","��","��","��","��","��","��",
 				"��","��","��","³","Τ","��","��","��","��","��","��","��",
 				"��","Ԭ","��","ۺ","��","ʷ","��","��","��","�","Ѧ","��",
 				"��","��","��","��","��","��","��","��","��","��","��",
 				"��","��","ʱ","��","Ƥ","��","��","��","��","��","Ԫ",
 				"��","��","��","ƽ","��","��","��","��","��","Ҧ","��","տ",
 				"��","��","ë","��","��","��","��","��","�","��","��","��","��",
 				"̸","��","é","��","��","��","��","��","��","ף","��","��",
 				"��","��","��","��","ϯ","��","��","ǿ","��","·","¦","Σ",
 				"��","ͯ","��","��","÷","ʢ","��","��","��","��","��",
 				"��","��","��","��","��","��","��","��","��","��","��","֧",
 				"��","��","��","¬","Ī","��","��","��","��","��","��","Ӧ",
 				"��","��","��","��","��","��","��","��","��","��","��","��",
 				"ʯ","��","��","ť","��","��","��","��","��","��","½","��",
 				"��","��","��","�","��","��","�L","��","��","��","��","��",
 				"��","��","��","��","��","��","��","��","��","��","��","��",
 				"��","��","��","ɽ","��","��","��","�","��","ȫ","ۭ","��",
 				"��","��","��","��","��","��","��","��","��","��","б","��",
 				"��","��","��","��","��","��","ղ","��","��","Ҷ",
 				"��","˾","��","۬","��","��","��","ӡ","��","��",
 				"��","��","ۢ","��","��","��","��","��","��","׿",
 				"��","��","��","��","��","��","��","��","��","��",
 				"˫","��","ݷ","��","��","̷","��","��","��","��",
 				"��","��","��","Ƚ","��","۪","Ӻ","�S","�","ɣ",
 				"��","�","ţ","��","ͨ","��","��","��","��","ۣ",
 				"��","��","ũ","��","��","ׯ","��","��","��","��",
 				"��","Ľ","��","��","ϰ","��","��","��","��","��",
 				"��","��","��","��","��","��","��","��","��","��",
 				"��","��","��","��","��","��","��","��","��","��",
 				"»","��","��","ŷ","�","��","��","ε","Խ","��",
 				"¡","ʦ","��","��","��","��","��","��","��","��",
 				"��","��","��","��","��","��","��","��","��","ɳ",
 				"ؿ","��","��","��","��","��","��","��","��","��",
 				"��","��","��","��","��","Ȩ","��","��","��","��",
 				"��","��","��","��","��","��","۳","Ϳ","��","��",
 				"˧","��","��","��","��","��","��","��","Ĳ","��",
 				"٦","��","��","ī","��","��","��","��","��","��",
 				"١","��ٹ","˾��","�Ϲ�","ŷ��","�ĺ�","���","����",
 				"����","����","�ʸ�","ξ��","����","�̨","��ұ","����",
 				"���","����","����","̫��","����","����","����","��ԯ",
 				"���","����","����","����","Ľ��","����","����","˾ͽ",
 				"˾��","آ��","˾��","��","��","�ӳ�","���","��ľ","����",
 				"����","���","����","����","����","�ذ�","�й�","�׸�",
 				"����","�θ�","����","����","����","����","��","��","����",
 				"΢��","����","����","����","����","�Ϲ�"};
 		Random random = new Random();
 		int index = RandomUtil.random(0, strName.length-1);
		return strName[index]+randomChineseString(random.nextInt(2-1+1)+1);
	}
	
}