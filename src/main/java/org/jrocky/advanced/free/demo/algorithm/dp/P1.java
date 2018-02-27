package org.jrocky.advanced.free.demo.algorithm.dp;
/**
 * 一组整型数中，有一个数字重复3遍，其它数字重复2遍，请找出这个重复3遍的数字。
 * 比如：[88, 459, 5262, 88, -17, 677, 88, 667, -17, 459, 5262], 结果为88。
 * 要求程序代码中额外申请的空间为O(1)，请给出一个平均时间复杂度不大于O(nlogn)的算法。
 * 请首先用文字阐述答题思路，然后用Java程序实现。
 * 
 * @author wangzhijie
 *
 */
public class P1 {

	/**
	 * 思路：先用快排平均时间复杂度为O(nlogn)将数组排序，然后线性遍历时间复杂度O(n)得出
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[]{88, 459, 5262, 88, -17, 677, 88, 667, -17, 459, 5262};
		
		quickSort(0,a.length-1,a);
		print(a);
		int c = a[0];
		int hit = 1;
		for(int i=1;i<a.length;i++){
			if(c == a[i]) hit++;
			else{
				c = a[i];
				hit = 1;
			}
			if(hit == 3) {
				System.out.println(a[i]);
				break;
			}
		}
	}
	
	public static void quickSort(int left,int right,int[] a){
		int l = left;
		int r = right;
		if(left >=right) return ;
		int base = a[l];
		left++;
		while(left <= right){
			while(a[left] < base && left <= right) left++;
			
			if(left <= right){
				int tmp = a[right];
				a[right] = a[left];
				a[left] = tmp;
				right--;
			}
			
			
			while(a[right] > base && left <= right) right--;
			
			if(left <= right){
				int tmp = a[right];
				a[right] = a[left];
				a[left] = tmp;
				left++;
			}
		}
		
		int tmp = a[l];
		a[l] = a[right];
		a[right] = tmp;
		
		int middle = right;
		quickSort(l, middle-1, a);
		quickSort(middle+1, r, a);
	}
	
	private static void print(int[] a){
		for(int e : a) System.out.print(e+" ");
		
		System.out.println();
	}
	
	
}
