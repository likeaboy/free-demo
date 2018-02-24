package org.jrocky.advanced.free.demo.algorithm;

public class DP {
	
	//1,3,5面值，凑11至少需要多少枚硬币
	private static void coin1(int s,int[] coinVals){
		//迭代
		int minCoins = 0;
		while(s > 0){
			for(int j=coinVals.length-1;j>=0;j--)
				if(s>=coinVals[j]){
					s-=coinVals[j];
					minCoins++;
					break;
				} 
		}
		System.out.println(minCoins);
	}
	//递归
	private static int d(int s,int[] coinVals){
		if(s == 0) return 0;
		for(int j=coinVals.length-1;j>=0;j--)
			if(s >= coinVals[j]) return d(s-coinVals[j],coinVals)+1;
		return -1;
	}
	
	//LIS
	public static void lis(){
		
	}
	
	public static void main(String[] args) {
		int[] coinVals = new int[]{1,3,5};
		coin1(23,coinVals);
		System.out.println(d(23,coinVals));
	}
	
	
	
	/*private static void coin(){
		int[] coinVals = new int[]{1,3,5};
		int min = 0;
		int s = 11;
		while(s > 0 ){
			for(int j=coinVals.length-1;j>=0;j--){
				if(s > coinVals[j]){
					
				}
			}
		}
	}
	
	private static int d(int s,int min){
		return min+1;
	}*/
}
