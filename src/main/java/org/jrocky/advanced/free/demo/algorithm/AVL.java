package org.jrocky.advanced.free.demo.algorithm;

public class AVL {
	
	public static void createTree(TreeNode node ,char[] arr,int i){
		if(i<arr.length){
			node.left = new TreeNode(null,null,arr[i]);
			i++;
			createTree(node.left,arr,i);
		}
		if(i<arr.length){
			node.right = new TreeNode(null,null,arr[i]);
			i++;
			createTree(node.right,arr,i);
		}
	}
	
	public static void preReverse(TreeNode t){
		if(t == null) return;
		System.out.print(t.v+",");
		if(t.left != null){
			preReverse(t.left);
		}
		if(t.right != null){
			preReverse(t.right);
		}
	}
	
	public static void main(String[] args) {
		char arr[] = new char[]{7,13,5,2,9,3,4,2,8,2,9};
		TreeNode root = new TreeNode(null,null,7);
		createTree(root,arr,1);
		preReverse(root);
	}
	
	private static class TreeNode {
		TreeNode left;
		TreeNode right;
		int v;
		public TreeNode(TreeNode left, TreeNode right, int v) {
			super();
			this.left = left;
			this.right = right;
			this.v = v;
		}
		
	}
}
