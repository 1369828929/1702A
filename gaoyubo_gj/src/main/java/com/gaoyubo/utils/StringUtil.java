package com.gaoyubo.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class StringUtil {
	// �ټ���
			static String[] Surname = { "��", "Ǯ", "��", "��", "��", "��", "֣", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
					"��", "��", "��", "��", "��", "ʩ", "��", "��", "��", "��", "��", "��", "κ", "��", "��", "��", "л", "��", "��", "��", "ˮ",
					"�", "��", "��", "��", "��", "��", "��", "��", "��", "��", "³", "Τ", "��", "��", "��", "��", "��", "��", "��", "��", "Ԭ",
					"��", "ۺ", "��", "ʷ", "��", "��", "��", "�", "Ѧ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
					"��", "��", "ʱ", "��", "Ƥ", "��", "��", "��", "��", "��", "Ԫ", "��", "��", "��", "ƽ", "��", "��", "��", "��", "��", "Ҧ",
					"��", "տ", "��", "��", "ë", "��", "��", "��", "��", "��", "�", "��", "��", "��", "��", "̸", "��", "é", "��", "��", "��",
					"��", "��", "��", "ף", "��", "��", "��", "��", "��", "��", "ϯ", "��", "��", "ǿ", "��", "·", "¦", "Σ", "��", "ͯ", "��",
					"��", "÷", "ʢ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "֧", "��",
					"��", "��", "¬", "Ī", "��", "��", "��", "��", "��", "��", "Ӧ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
					"��", "��", "ʯ", "��", "��", "ť", "��", "��", "��", "��", "��", "��", "½", "��", "��", "��", "��", "�", "��", "��", "�L",
					"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ɽ",
					"��", "��", "��", "�", "��", "ȫ", "ۭ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "б", "��", "��",
					"��", "��", "��", "��", "��", "ղ", "��", "��", "Ҷ", "��", "˾", "��", "۬", "��", "��", "��", "ӡ", "��", "��", "��", "��",
					"ۢ", "��", "��", "��", "��", "��", "��", "׿", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "˫", "��", "ݷ",
					"��", "��", "̷", "��", "��", "��", "��", "��", "��", "��", "Ƚ", "��", "۪", "Ӻ", "�S", "�", "ɣ", "��", "�", "ţ", "��",
					"ͨ", "��", "��", "��", "��", "ۣ", "��", "��", "ũ", "��", "��", "ׯ", "��", "��", "��", "��", "��", "Ľ", "��", "��", "ϰ",
					"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
					"��", "��", "��", "��", "»", "��", "��", "ŷ", "�", "��", "��", "ε", "Խ", "��", "¡", "ʦ", "��", "��", "��", "��", "��",
					"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ɳ", "ؿ", "��", "��", "��", "��", "��", "��", "��",
					"��", "��", "��", "��", "��", "��", "��", "Ȩ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "۳", "Ϳ", "��",
					"��", "˧", "��", "��", "��", "��", "��", "��", "��", "Ĳ", "��", "٦", "��", "��", "ī", "��", "��", "��", "��", "��", "��",
					"١", "��ٹ", "˾��", "�Ϲ�", "ŷ��", "�ĺ�", "���", "����", "����", "����", "�ʸ�", "ξ��", "����", "�̨", "��ұ", "����", "���", "����",
					"����", "̫��", "����", "����", "����", "��ԯ", "���", "����", "����", "����", "Ľ��", "����", "����", "˾ͽ", "˾��", "آ��", "˾��", "��",
					"��", "�ӳ�", "���", "��ľ", "����", "����", "���", "����", "����", "����", "�ذ�", "�й�", "�׸�", "����", "�θ�", "����", "����", "����",
					"����", "��", "��", "����", "΢��", "����", "����", "����", "����", "�Ϲ�" };

			/**
			 * 
			 * @Title: hasLength
			 * @Description:����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
			 * @param src ָ���ַ���
			 * @return
			 * @return: boolean
			 */
			//
			public static boolean hasLength(String src) {
				return src != null && src.length() > 0;
			}

			/**
			 * 
			 * @Title: hasText
			 * @Description:����2���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)�Ϳո�Ҳ��ûֵ (5��)
			 * @param src ָ���ַ���
			 * @return
			 * @return: boolean
			 */
			//
			public static boolean hasText(String src) {
				return src != null && src.trim().length() > 0;
			}

			/**
			 * 
			 * @Title: randomChineseString
			 * @Description: ����3�����ز���length�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
			 * @param length ָ������
			 * @return
			 * @throws UnsupportedEncodingException
			 * @return: String
			 */
			public static String randomChineseString(int length) throws UnsupportedEncodingException {
				String str = "";
				for (int i = 0; i < length; i++) {
					String s = randomChineseString();
					str += s;
				}
				return str;
			}

			/**
			 * 
			 * @Title: randomChineseString
			 * @Description: ����3�����ز����������ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
			 * @return
			 * @throws UnsupportedEncodingException
			 * @return: String
			 */

			public static String randomChineseString() throws UnsupportedEncodingException {
				Random random = new Random();
				String s = (char) (random.nextInt(40869 - 19968 + 1) + 19968) + "";
				if (s.equals(new String(s.getBytes("GB2312"), "GB2312"))) {
					return s;
				} else {
					return randomChineseString();
				}

			}

			/**
			 * 
			 * @Title: generateChineseName
			 * @Description: //
			 *               ����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
			 * 
			 * @return
			 * @throws UnsupportedEncodingException
			 * @return: String
			 */
			public static String generateChineseName() throws UnsupportedEncodingException {
				String name = "";
				int index = RandomUtil.random(0, Surname.length - 1);
				name += Surname[index];
				Random random = new Random();
				if (random.nextBoolean()) {
					name += randomChineseString(2);
				} else {
					name += randomChineseString(1);
				}
				return name;
			}
}
