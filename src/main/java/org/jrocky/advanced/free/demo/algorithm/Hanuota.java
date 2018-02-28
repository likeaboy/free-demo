package org.jrocky.advanced.free.demo.algorithm;
/**
 * 汉诺塔
 * @author wangzhijie
 *
 */
public class Hanuota {
	public static void main(String[] args) {
//		System.out.println(hanuota(4));
		
		move(4,'A','B','C');
	}
	//计算步数
	public static int hanuota(int n){
		if(n==1)return 1;
		return 2*hanuota(n-1)+1;
	}
	//打印全过程
	public static void move(int n,char a,char b,char c){
		if(n==0) return;
		move(n-1,a,c,b);
		System.out.println(a+"-->"+c);
		move(n-1,b,a,c);
	}
}
