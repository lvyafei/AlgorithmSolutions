package com.fei.test;

import org.junit.Test;

import com.fei.sortingAlgorithm.insertionSort;

public class mainTest {

	@Test
	public void testInsertSort(){
		int[]a = {3,1,5,7,2,4,9,6};  
		insertionSort sort=new insertionSort();
		sort.InsertSort(a,8);  
		sort.print(a,8,8); 
	}
}
