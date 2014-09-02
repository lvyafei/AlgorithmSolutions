package com.fei.test;

import org.junit.Test;

import com.fei.sortingAlgorithm.insertionSort;

public class mainTest {

	@Test
	public void testInsertSort(){
		//int[]a = {3,1,5,7,2,4,9,6};  
		int[]a={8,7,6,5,4,3,2,1};
		insertionSort sort=new insertionSort();
		//sort.InsertSort(a,8);  
		sort.myInsertSort(a);
	}
}
