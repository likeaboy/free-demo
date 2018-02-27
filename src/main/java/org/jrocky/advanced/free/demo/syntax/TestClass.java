package org.jrocky.advanced.free.demo.syntax;

/**
 * 
 * @author wangzhijie
 *http://www.100mian.com/mianshi/alibaba/4853.html
 */
public class TestClass {

	private static void testMethod(){
		System.out.println("testMethod");
	}
	
	public static void main(String[] args) {
		((TestClass)null).testMethod();
	}
}
