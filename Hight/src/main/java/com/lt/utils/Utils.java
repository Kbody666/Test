package com.lt.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {
	public static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	/**
	 * 获取新的表的Id
	 * @return
	 */
	public static String getNewId() {
		return format.format(new Date())+getRandom(6);
	}
	
	/**
	 * 获取随机数
	 * @param length
	 * @return
	 */
	public static String getRandom(int length) {
		Random r = new Random();
		String str = "";
		for(int i=0;i<length;i++) {
			str = str + r.nextInt(9);
		}
		return str;
	}

}
