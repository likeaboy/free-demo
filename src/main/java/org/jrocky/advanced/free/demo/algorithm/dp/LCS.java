package org.jrocky.advanced.free.demo.algorithm.dp;

/**
 * 最长公共子序列问题
 * 
 * @author wangzhijie
 * 
 *         参考：https://segmentfault.com/a/1190000002641054
 *         https://github.com/julycoding/The-Art-Of-Programming-By-July/blob/master/ebook/zh/%E6%9C%80%E9%95%BF%E5%85%AC%E5%85%B1%E5%AD%90%E5%BA%8F%E5%88%97.md
 */
public class LCS {

	// BDCABA ABCBDAB
	public static int[][] lengthofLCS(char[] X, char[] Y) {
		int[][] c = new int[X.length + 1][Y.length + 1];
		for (int i = 1; i <= X.length; i++) {
			for (int j = 1; j <= Y.length; j++) {
				if (X[i - 1] == Y[j - 1]) {
					c[i][j] = c[i - 1][j - 1] + 1;
				}
				else if (c[i - 1][j] > c[i][j - 1])
					c[i][j] = c[i - 1][j];
				else
					c[i][j] = c[i][j - 1];
			}
		}

		// 打印C数组
		for (int i = 0; i <= X.length; i++) {
			for (int j = 0; j <= Y.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		return c;
	}

	// 输出LCS序列
	public static void print(int[][] arr, char[] X, char[] Y, int i, int j,StringBuilder rst) {
		if (i == 0 || j == 0)
			return;
		if (X[i - 1] == Y[j - 1]) {
			rst.append(X[i - 1]);
//			System.out.print("element " + X[i - 1] + " ");
			// 寻找的
			print(arr, X, Y, i - 1, j - 1,rst);
		} else if (arr[i - 1][j] >= arr[i][j - 1]) {
			print(arr, X, Y, i - 1, j,rst);
		} else {
			print(arr, X, Y, i, j - 1,rst);
		}
	}

	public static void main(String[] args) {
		char[] X = new char[] { 'A', 'B', 'C', 'B', 'D', 'A', 'B' };
		char[] Y = new char[] { 'B', 'D', 'C', 'A', 'B', 'A' };
		StringBuilder rst = new StringBuilder();
		int[][] c = lengthofLCS(X, Y);
		print(c, X, Y, X.length, Y.length,rst);
		System.out.println(rst.reverse().toString());
		
	}
}
