package org.jrocky.advanced.free.demo.algorithm;

import java.util.ArrayList;
import java.util.List;

public class TreeSearch {
	public static void main(String[] args) {
		TreeNode n5 = new TreeNode(null,null,3);
		TreeNode n4 = new TreeNode(null,null,2);
		TreeNode n3 = new TreeNode(null,null,4);
		TreeNode n2 = new TreeNode(n4,n5,2);
		TreeNode n1 = new TreeNode(n2,n3,1);
		List<List<Integer>> rst = new TreeSearch().binaryTreePathSum(n1,5);
		int j=0;
		for(List<Integer> path : rst){
			System.out.print("path"+j + ":");
			for(Integer i : path){
				System.out.print(i+" ");
			}
			j++;
			System.out.println();
		}
	}
    /** 
     * @param root the root of binary tree 
     * @param target an integer 
     * @return all valid paths 
     */  
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {  
        // Write your code here  
        List<List<Integer>> result = new ArrayList<List<Integer>>();  
        List<Integer> path = new ArrayList<Integer>();  
        search(root, target, path, result);  
        return result;  
    }  
      
    private void search(TreeNode root, int target, List<Integer> path, List<List<Integer>> result) {  
        if (root == null) return;  
  
        if (root.left == null && root.right == null && root.val == target) {  
            path.add(root.val);  
            result.add(path);  
            return;  
        }  
        if (root.left != null) {  
            List<Integer> left= new ArrayList<Integer>(path);  
            left.add(root.val);  
            search(root.left, target - root.val, left, result);  
        }  
        if (root.right != null) {  
            List<Integer> right= new ArrayList<Integer>(path);  
            right.add(root.val);              
            search(root.right, target - root.val, right, result);  
        }  
          
    }  
    
    private static class TreeNode{
    	TreeNode left = null;
    	TreeNode right = null;
    	int val;
    	
    	public TreeNode(TreeNode left,TreeNode right,int val){
    		this.left = left;
    		this.right = right;
    		this.val = val;
    	}
    }
}
