package com.fei.sortingAlgorithm;
/**
 * 直接插入排序（Insertion Sort）
 * 
 * 时间复杂度：O（n^2）
 * 空间复杂度：O(1)
 * 
 * 将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。
 * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，
 * 直至整个序列有序为止。
 * 
 * @author lyf
 *
 */
public class insertionSort {

	public void print(int[] a, int n, int i) {
		System.out.println(String.valueOf(i) + ":");
		String result="";
		for (int j = 0; j < 8; j++) {
			result+=String.valueOf(a[j]) + " ";
		}
		System.out.println(result);
	}

	public void InsertSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) { // 若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
				int j = i - 1;
				int x = a[i]; // 复制为哨兵，即存储待排序元素
				a[i] = a[i - 1]; // 先后移一个元素
				while (j>-1&&x < a[j]) { // 查找在有序表的插入位置
					a[j + 1] = a[j];
					j--; // 元素后移
				}
				a[j + 1] = x; // 插入到正确位置
			}
			print(a, n, i); // 打印每趟排序的结果
		}
	}
}
