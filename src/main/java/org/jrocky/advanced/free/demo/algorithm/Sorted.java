package org.jrocky.advanced.free.demo.algorithm;

public class Sorted {
	
	static void mergeSort(int[] arr){
		/*int middle = arr.length/2;
		merge(arr,divide(arr,0,middle,middle+1,arr.length-1));*/
		
		
	}
	
	/*static int[] divide(int[] arr,int aStart,int aEnd,int bStart,int bEnd){
		int middle = arr.length/2;
	}
	
	static void mergeSort(int[] arr,int[] a,int[] b){
		mergeSort(arr,merge(),b);
	}*/
	
	static int[] merge(int[] arr,int aStart,int aEnd,int bStart,int bEnd){
		/*int aLen = aEnd-aStart;
		int bLen = bEnd-bStart;
		if(aLen > 1){
			int m = aLen/2;
			merge(arr,aStart,m,m+1,aEnd);
		}
		if(bLen > 1){
			int m = bLen/2;
			merge(arr,bStart,m,m+1,bEnd);
		}*/
//		ReentrantLock
		
		
		
		int[] newArr = new int[aEnd-aStart+bEnd-bStart];
		int i=0;
		int len = aEnd-aStart | bEnd-bStart;
		while(i<len){
			if(arr[aStart+i]>arr[bStart+i]){
				newArr[2*i]=arr[bStart+i];
				newArr[2*i+1]=arr[aStart+i];
			}else{
				newArr[2*i]=arr[aStart+i];
				newArr[2*i+1]=arr[bStart+i];
			}
			i++;
		}
		return newArr;
	}
	
	static void insertionSort(int[] arr){
		int index=0;
		while(index < arr.length-1){
			int x=0;
			while(arr[index+1]>arr[x])
				x++;
			
			if(x<(index+1)){
				int tmp=arr[index+1];
				for(int y=index;y>=x;y--)
					arr[y+1]=arr[y];
				arr[x]=tmp;
			}
			index++;
		}
	}

	static void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] < arr[i]){
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
	static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
	
	
	
	static void print(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] arr = new int[] {6,9,101,3,17,21,28,8,9,10};
		insertionSort(arr);
//		bubbleSort(arr);
//		selectionSort(arr);
		print(arr);
	}
}
