package org.jrocky.advanced.free.demo.algorithm.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * 最长递增子序列
 * @author wangzhijie
 *
 */
public class LIS {
	//LIS
	//5,3,4,8,6,7（必须连续）
	public static void lis(int[] A){
//		List<List<Integer>> rst = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<Integer>();
		int maxLen = 1;
		List<Integer> longest = null;
		for(int i=0;i<A.length;i++){
			tmp.add(A[i]);
			if(i+1 > A.length-1) break;
			if(A[i] > A[i+1]){
				if(tmp.size() > maxLen) {
					maxLen = tmp.size();
					longest = tmp;
				}
//				rst.add(tmp);
				tmp = new ArrayList<Integer>();
			}
		}
		System.out.println(maxLen);
		print(longest);
	}
	//错误的解法
	/*public static void lis2(int[] A){
		int[] d = new int[A.length];
		int maxLen = 1;
		
		for(int i=0;i<A.length;i++){
			d[i]=1;
			for(int j=0;j<i;j++){
				if(A[j] <= A[i] && d[j]+1>d[i]){
					d[i]=d[j]+1;
				}
			}
			if(d[i]>maxLen)maxLen=d[i];
		}
		System.out.println(maxLen);
	} */
	
	private static void print(List<Integer> list){
		for(Integer e : list)
			System.out.print(e+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] A = new int[]{5,3,4,7,6,8};
//		int[] A = new int[]{1,3,5,5,6,9,2,7};
		System.out.println("lis:");
		lis(A);
		/*System.out.println("lis2:");
		lis2(A);*/
	}
}
