package com.fastjava.test;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Test;

import com.fastjava.util.DateUtils;
import com.fastjava.util.ListUtils;

public class JavaTest {

	@Test
	public void dateUtilsTest() {
		System.out.println("date begin--------------------");
		String str = "2014-01-15 11:34:55";
		String str2 = "2014-01-16 11:34:55";
		System.out.println("str:" + str);
		Date date = DateUtils.getDate(str);
		System.out.println("str2date:" + date.toString());
		DateTime dateTime = DateUtils.getDateTime(str2);
		System.out.println("str2dateTime:" + dateTime.toString());
		System.out.println("date format :" + DateUtils.format(date));
		System.out.println("datetime format :"
				+ dateTime.toString(DateUtils.DEFAULT_FORMAT));
		boolean c = DateUtils.compare(date, DateUtils.getDate(str2));
		System.out.println("date compare str1 > str2 : " + c);
		System.out.println("date end----------------------");
		System.out.println();
	}

	@Test
	public void listUtilsTest() {
		System.out.println("list begin--------------------");
		String[] a = { "a", "b", "d", "c" };
		List<String> list = ListUtils.array2List(a);
		System.out.println("list toString : " + ListUtils.toString(list));
		System.out.println("list sort : " + ListUtils.sort(list));
		System.out.println("list reverse : " + ListUtils.reverse(list));
		System.out.println("list get max : " + ListUtils.max(list));
		System.out.println("list random : " + ListUtils.randomList(10000, 10));
		System.out.println("list repeat : " + ListUtils.repeat(list, 5, ","));

		ListUtilBean ListUtilBean1 = new ListUtilBean(1, "a");
		ListUtilBean ListUtilBean2 = new ListUtilBean(3, "b");
		ListUtilBean ListUtilBean3 = new ListUtilBean(21, "c");
		ListUtilBean ListUtilBean4 = new ListUtilBean(5, "d");
		ListUtilBean[] ps = { ListUtilBean1, ListUtilBean2, ListUtilBean3,
				ListUtilBean4 };
		List<ListUtilBean> pl = ListUtils.array2List(ps);
		System.out.println("list<ListUtilBean> sort toString : "
				+ ListUtils.sort(pl, new Comparator<ListUtilBean>() {
					public int compare(ListUtilBean o1, ListUtilBean o2) {
						// TODO Auto-generated method stub
						return o1.getAge().compareTo(o2.getAge());
					}
				}));
		System.out.println("list end----------------------");
		System.out.println();
	}
}

class ListUtilBean {
	public ListUtilBean() {

	}

	public ListUtilBean(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	private Integer age;
	private String name;

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "{\"name\":\"" + name + "\",\"age=\"" + age + "}";
	}
}
