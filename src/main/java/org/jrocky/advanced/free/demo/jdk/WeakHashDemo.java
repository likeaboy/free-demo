package org.jrocky.advanced.free.demo.jdk;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * 启动参数 -Xmx5M
 * @author Rocky.Wang
 *
 */
public class WeakHashDemo {
	
	public static void main(String[] args) {
		new WeakHashDemo().weakMap();
	}
	
	public void weakMap() {
		WeakHashMap weakMap = new WeakHashMap<Integer, byte[]>();
		for(int i = 0; i < 10000; i++){
		Integer ii = new Integer(i);
		weakMap.put(ii, new byte[i]);
		}
	}
	
	public void map() {
		HashMap map = new HashMap<Integer, byte[]>();
		for (int i = 0; i < 10000; i++) {
		  Integer ii = new Integer(i);
		  map.put(ii, new byte[i]);
		}
	}
}
