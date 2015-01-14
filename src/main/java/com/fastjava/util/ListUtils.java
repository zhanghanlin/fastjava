package com.fastjava.util;

import static org.bitbucket.dollar.Dollar.$;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * 集合帮助类
 * 
 * @author zhanghanlin
 *
 */
public class ListUtils {

	/**
	 * array[] to List
	 * 
	 * @param e
	 * @return
	 */
	public static <E> List<E> array2List(E[] e) {
		return $(e).toList();
	}

	/**
	 * $ List Max
	 * 
	 * @param list
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <E> E max(List<E> list) {
		return (E) $(list).toComparableArrayWrapper().max();
	}

	/**
	 * sort
	 * 
	 * @param list
	 * @return
	 */
	public static <E> List<E> sort(List<E> list) {
		return $(list).sort().toList();
	}

	/**
	 * the reversed order
	 * 
	 * @param list
	 * @return
	 */
	public static <E> List<E> reverse(List<E> list) {
		return $(list).reverse().toList();
	}

	/**
	 * sort by comparator
	 * 
	 * @param list
	 * @param comparator
	 * @return
	 */
	public static <E> List<E> sort(List<E> list, Comparator<E> comparator) {
		return $(list).sort(comparator).toList();
	}

	/**
	 * get List min
	 * 
	 * @param list
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <E> E min(List<E> list) {
		return (E) $(list).toComparableArrayWrapper().min();
	}

	/**
	 * List join on split
	 * 
	 * @param list
	 * @param split
	 * @return
	 */
	public static <E> String join(List<E> list, String split) {
		return $(list).join(split);
	}

	/**
	 * build a sorted random list of count integers up to max
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <E> List<E> randomList(int max, int count) {
		return (List<E>) $(new Random(), max + 1).samples(count).sort()
				.toList();
	}

	/**
	 * repeat a String
	 * 
	 * @param list
	 * @param n
	 * @param split
	 * @return
	 */
	public static <E> String repeat(List<E> list, int n, String split) {
		return $(list).repeat(n).join(split);
	}

	/**
	 * List toString
	 * 
	 * @param list
	 * @return
	 */
	public static <E> String toString(List<E> list) {
		return $(list).toString();
	}
}