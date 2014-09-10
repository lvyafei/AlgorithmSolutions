package com.fei.sortingAlgorithm;

/**
 * 1.在学了冒泡排序后，会发觉这种算法就是不断比较交换。虽简单直接，显然给人一种繁琐的感觉。
 *   那有没有更好一点的算法呢？这当然有啦：简单选择排序。
 * 2.这种算法的思想就是：待找到了最适合的那位数的位置我才选择与它进行交换
 *   在排序时找到合适的关键字再做交换，并且只移动一次就能完成相应关键字的排序定位
 * 3.选择排序是固定位置，找元素。相比于插入排序的固定元素找位置，是两种思维方式
 * @author lyf
 *
 */
public class simpleSelectionSort {

	public void simpleSelection(int[] a){
		int i,j;
		int min;
		for(i=0;i<a.length;i++){
			min=i;
			for(j=i+1;j<a.length;j++){
				if(a[min]>a[j]){
					min=j;
				}
			}
			if(min!=i){
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		for (int k : a) {
			System.out.print(k+" ");
		}
	}
}
