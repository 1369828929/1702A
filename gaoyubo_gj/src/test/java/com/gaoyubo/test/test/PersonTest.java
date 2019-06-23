package com.gaoyubo.test.test;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import org.junit.Test;

import com.gaoyubo.test.entity.Person;
import com.gaoyubo.utils.RandomUtil;
import com.gaoyubo.utils.StringUtil;

public class PersonTest {

	// ����Person��
		@SuppressWarnings("deprecation")
		@Test
		public void utilsTest() throws UnsupportedEncodingException {
			// ����10000������
			for (int i = 0; i < 10000; i++) {
				// ע����������ֵģ��2010��1��1�������������ʱ�䣨4�֣�
				Date fromDate = new Date(110, 00, 01);
				System.out.println(fromDate);
				long srcTime = fromDate.getTime();
				Date endDate = new Date();
				long tarTime = endDate.getTime();
				endDate.setTime((long) (srcTime + Math.random() * (tarTime - srcTime)));
				// ��������ֵ����StringUtil.generateChineseName()������4�֣�
				// ��������ֵ����RandomUtil.random()������������1-120��֮�䣨4�֣�
				// ��������ֵ����StringUtil.randomChineseString()����������Ϊ140��������֣�4�֣�
				Person person = new Person(i, StringUtil.generateChineseName(), StringUtil.randomChineseString(140),
						RandomUtil.random(1, 120), endDate);
				System.out.println(person);
			}
		}

		@Test
		public void testDate() {
			Calendar c = Calendar.getInstance();
			// �·�0--11
			c.set(2010, 0, 1);
			// ��ȡ2010��1��1�յĺ�����
			long l = c.getTimeInMillis();
			System.out.println(l);
			// ��������ʱ��Ϊ��ǰ������
			c.setTime(new Date());
			// ��ǰʱ��ĺ�����
			long l2 = c.getTimeInMillis();
			System.out.println(l2);
			for (int i = 0; i < 1000; i++) {
				long x = l + (long) (Math.random() * (l2 - l));
				// �ú���������Ϊ��ǰ��������
				c.setTimeInMillis(x);
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				System.out.println(df.format(c.getTime()));
			}
		}

}
