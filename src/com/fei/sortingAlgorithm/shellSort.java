package com.fei.sortingAlgorithm;

public class shellSort {

	public int[] shellsort1(int[] a, int n) {
		int i, j, gap;

		for (gap = n / 2; gap > 0; gap /= 2)//1.循环步长
			// 步长
			for (i = 0; i < gap; i++) // 直接插入排序   2.循环A组
			{
				for (j = i + gap; j < n; j += gap) //3.循环B组
					if (a[j] < a[j - gap]) { //4.直接插入排序
						int temp = a[j];
						int k = j - gap;
						while (k >= 0 && a[k] > temp) {
							a[k + gap] = a[k];
							k -= gap;
						}
						a[k + gap] = temp;
					}
			}
		return a;
	}

	public void shellsort2(int a[], int n) {
		int j, gap;

		for (gap = n / 2; gap > 0; gap /= 2)
			for (j = gap; j < n; j++)
				// 从数组第gap个元素开始
				if (a[j] < a[j - gap])// 每个元素与自己组内的数据进行直接插入排序
				{
					int temp = a[j];
					int k = j - gap;
					while (k >= 0 && a[k] > temp) {
						a[k + gap] = a[k];
						k -= gap;
					}
					a[k + gap] = temp;
				}
	}
	public int[] myshellsort(int[]a,int n){
		int i,j,grap;
		for(grap=n/2;grap>0;grap/=2){//1.循环步长
			for(i=0;i<grap;i++){//2.循环A组
				for(j=i+grap;j<n;j+=grap){//3.循环B组
					if(a[j]<a[j-grap]){//4.直接插入排序
						int k=j-grap;
						int temp=a[j];
						while(k>-1&&a[k]>temp){
							a[k+grap]=a[k];
							k-=grap;
						}
						a[k+grap]=temp;
					}
				}
			}
		}
		return a;
	}
	
}
