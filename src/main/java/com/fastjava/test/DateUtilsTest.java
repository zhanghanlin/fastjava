package com.fastjava.test;

import java.util.Date;

import org.joda.time.DateTime;

import com.fastjava.util.DateUtils;

public class DateUtilsTest {

	public static void main(String[] args) {
		String str = "2014-01-15 11:34:55";
		String str2 = "2014-01-16 11:34:55";
		System.out.println("str:" + str);
		Date date = DateUtils.getDate(str);
		System.out.println("str2date:" + date.toString());
		DateTime dateTime = DateUtils.getDateTime(str2);
		System.out.println("str2dateTime:" + dateTime.toString());
		System.out.println("date format :" + DateUtils.format(date));
		System.out.println("datetime format :" + dateTime.toString(DateUtils.DEFAULT_FORMAT));
		boolean c = DateUtils.compare(date, DateUtils.getDate(str2));
		System.out.println("date compare str1 > str2 : " + c);
	}
}
