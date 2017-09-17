package org.jrocky.advanced.free.demo.algorithm;
/**
 * 回文字符串
 * @author Rocky.Wang
 *
 */
public class PalindromeString {
	
public static void main(String[] args) {
	String t1 = "chinaxanihc";
	String t2 = "abccba";
	String t3 = "abcdebad";
	String t4 = "abcdefghigklmnmlkgihgfedcba";
	System.out.println(isPalindrome(t1));
	System.out.println(isPalindrome(t2));
	System.out.println(isPalindrome(t3));
	System.out.println(isPalindrome(t4));
//	System.out.println(isPalindrome(t2,0,t2.length()));
//	System.out.println(isPalindrome(t3,0,t3.length()));
}


/**
 * 递归判断是否为回文字符串
 */
public static boolean isPalindrome(String target) {
	if(target.length() == 0 ||target.length() == 1) return true;
	String head = target.substring(0,1);
	String tail = target.substring(target.length()-1,target.length());
	if(head.equals(tail)) {
		target = target.substring(1, target.length()-1);
		return isPalindrome(target);
	}else {
		return false;
	}
}
}
