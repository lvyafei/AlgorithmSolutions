package com.fei.test;

import org.junit.Test;

import com.fei.sortingAlgorithm.insertionSort;
import com.fei.sortingAlgorithm.shellSort;

public class mainTest {

	@Test
	public void testInsertSort(){
		//int[]a = {3,1,5,7,2,4,9,6};  
		int[]a={8,7,6,5,4,3,2,1};
		insertionSort sort=new insertionSort();
		//sort.InsertSort(a,8);  
		sort.myInsertSort(a);
	}
	@Test
	public void testShellSort(){
		int[]a={49, 38, 65, 97, 26, 13, 27, 49, 55, 4};
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		shellSort shell=new shellSort();
		a=shell.myshellsort(a, 10);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
