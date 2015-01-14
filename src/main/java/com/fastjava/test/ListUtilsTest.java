package com.fastjava.test;

import java.util.Comparator;
import java.util.List;

import com.fastjava.util.ListUtils;

public class ListUtilsTest {

	public static void main(String[] args) {
		String[] a = { "a", "b", "d", "c" };
		List<String> list = ListUtils.array2List(a);
		System.out.println("list toString : " + ListUtils.toString(list));
		System.out.println("list sort : " + ListUtils.sort(list));
		System.out.println("list reverse : " + ListUtils.reverse(list));
		System.out.println("list get max : " + ListUtils.max(list));
		System.out.println("list random : " + ListUtils.randomList(10000, 10));
		System.out.println("list repeat : " + ListUtils.repeat(list, 5, ","));

		Person person1 = new Person(1, "a");
		Person person2 = new Person(3, "b");
		Person person3 = new Person(21, "c");
		Person person4 = new Person(5, "d");
		Person[] ps = { person1, person2, person3, person4 };
		List<Person> pl = ListUtils.array2List(ps);
		System.out.println("list<Person> sort toString : " + ListUtils.sort(pl, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getAge().compareTo(o2.getAge());
			}
		}));
	}
}

class Person {
	public Person() {

	}

	public Person(Integer age, String name) {
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
