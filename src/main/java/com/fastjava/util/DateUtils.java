package com.fastjava.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class DateUtils {

	/**
	 * Default format
	 */
	public final static String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * get now Date
	 * 
	 * @return
	 */
	public static Date getDate() {
		return getDateTime(new Date()).toDate();
	}

	/**
	 * get now Calendar
	 * 
	 * @return
	 */
	public static Calendar getCalendar() {
		return getCalendar(new Date());
	}

	/**
	 * get Calendar by obj
	 * 
	 * @param obj
	 * @return
	 */
	public static Calendar getCalendar(Object obj) {
		return getDateTime(obj).toCalendar(Locale.getDefault());
	}

	/**
	 * get DateTime
	 * 
	 * @param object
	 * @return
	 */
	public static DateTime getDateTime() {
		return getDateTime(new Date());
	}

	/**
	 * get DateTime
	 * 
	 * @param object
	 * @return
	 */
	public static DateTime getDateTime(Object object) {
		DateTime dateTime = null;
		if (object instanceof String) {
			dateTime = new DateTime(object.toString().trim().replace(" ", "T"));
		} else if (object instanceof Date) {
			dateTime = new DateTime(object);
		}
		return dateTime;
	}

	/**
	 * get date
	 * 
	 * 
	 * @param str
	 *            yyyy-MM-ddTHH:mm:ss,yyyy-MM-dd HH:mm:ss,yyyy-MM-dd
	 * @return
	 */
	public static Date getDate(String str) {
		return getDateTime(str).toDate();
	}

	/**
	 * Default format
	 * 
	 * @param date
	 * @return
	 */
	public static String format(Date date) {
		return format(date, DEFAULT_FORMAT);
	}

	/**
	 * format
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String format(Date date, String format) {
		return getDateTime(date).toString(format);
	}

	/**
	 * compare Date
	 * 
	 * @param d1
	 * @param d2
	 * @return d1 > d2 return true ;d1 <= d2 : false
	 */
	public static boolean compare(Date d1, Date d2) {
		return compare(getDateTime(d1), getDateTime(d2));
	}

	/**
	 * compare DateTime
	 * 
	 * 
	 * 
	 * 
	 * @param d1
	 * @param d2
	 * @return d1 > d2 return true ;d1 <= d2 : false
	 */
	public static boolean compare(DateTime d1, DateTime d2) {
		if (d1.isAfter(d2) || d1.isEqual(d2)) {
			return false;
		}
		return true;
	}

	/**
	 * return week chinese
	 * 
	 * @param dt
	 * @return
	 */
	public static String getWeekZh(Date dt) {
		return getWeekZh(getDateTime(dt));
	}

	/**
	 * return week chinese
	 * 
	 * @param dt
	 * @return
	 */
	public static String getWeekZh(DateTime dt) {
		String week = "";
		switch (dt.getDayOfWeek()) {
		case DateTimeConstants.SUNDAY:
			week = "日";
			break;
		case DateTimeConstants.MONDAY:
			week = "一";
			break;
		case DateTimeConstants.TUESDAY:
			week = "二";
			break;
		case DateTimeConstants.WEDNESDAY:
			week = "三";
			break;
		case DateTimeConstants.THURSDAY:
			week = "四";
			break;
		case DateTimeConstants.FRIDAY:
			week = "五";
			break;
		case DateTimeConstants.SATURDAY:
			week = "六";
			break;
		}
		return week;
	}

	public static void main(String[] args) {
		String str = "2015-04-15";
		String str2 = "2015-04-14";
		boolean c = compare(getDate(str), getDate(str2));
		System.out.println(c);
	}
}
