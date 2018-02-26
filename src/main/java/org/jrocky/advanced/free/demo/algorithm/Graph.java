package org.jrocky.advanced.free.demo.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 图加权最有路径
 * @author wangzhijie
 *
 */
public class Graph {
	static int n = 5;
	static int arr[][] = new int[][]{{0,3,5,0,0},
			{0,0,2,1,0},
			{0,0,0,0,6},
			{0,0,0,0,2},
			{0,0,0,0,0}};
	static int[] map = new int[]{'A','B','C','D','E'};
	
	static Map<String,Integer> pathResult = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		function(0,4);
//		function(0,3);
//		function(0,2);
	}
	
	public static void function(int i,int j){
//		List<Node> list = new ArrayList<Node>();
		Node minValPath = null;
		int minVal = -1;
		int ti=i;
		int tj=j;
		
		if(arr[ti][tj] > 0){
			StringBuilder rst = new StringBuilder();
			rst.append((char)map[ti]);
			rst.append((char)map[tj]);
			rst.append(",");
			rst.append(arr[ti][tj]);
			System.out.println(rst.toString());
			return;
		}
		
		
		Node head = new Node(null,null,i,j,0);
		Node tail = head;
		while(head != null){
			Node c = head;
			if(c.pv == 0){
				i = c.s;j=0;
				while(j<n){
					if(arr[i][j] > 0){
						tail.next = new Node(c,null,i,j,arr[i][j]);
						tail = tail.next;
					}
					j++;
				}
			}else {
				//find end
				if(c.e == tj){
					if(minVal == -1){
						minVal = c.pv;
						minValPath = c;
					}else{
						if(c.pv < minVal){
							minVal = c.pv;
							minValPath = c;
						}
					}
				}else{
					i=c.e;j=0;
					while(j<n){
						if(arr[i][j] > 0){
							tail.next = new Node(c,null,i,j,c.pv+arr[i][j]);
							tail = tail.next;
						}
						j++;
					}
				}
			}
			head=head.next;
		}
		StringBuilder builder = new StringBuilder();
		while(minValPath != null){
			builder.append((char)map[minValPath.e]);
			minValPath = minValPath.pre;
		}
		builder = new StringBuilder(builder.substring(0, builder.length()-1));
		builder.append((char)map[ti]);
		System.out.println(builder.reverse().toString()+","+minVal);
		
//		int minPv = -1;
		//back trace
		//O(n)
		/*for(Node n : list){
			StringBuilder builder = new StringBuilder("E");
			int pv = n.pv;
			if(minPv == -1) minPv = pv;
			else if(minPv > pv) minPv = pv;
			
			while(n!=null){
				builder.append((char)map[n.s]);
				n = n.pre;
			}
			String path = builder.reverse().deleteCharAt(0).toString();
			System.out.println(path+","+pv);
			pathResult.put(path, pv);
		}*/
		//O(n)
		/*for(String k : pathResult.keySet())
			if(pathResult.get(k) == minPv)
				System.out.println(k);*/
	}

	private static class Node {
		Node pre;
		Node next;
		int s;
		int e;
		int pv;
		public Node(Node pre, Node next, int s, int e, int pv) {
			super();
			this.pre = pre;
			this.next = next;
			this.s = s;
			this.e = e;
			this.pv = pv;
		}
	}
}
