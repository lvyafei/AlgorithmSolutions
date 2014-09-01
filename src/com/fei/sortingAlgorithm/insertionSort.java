package com.fei.sortingAlgorithm;
/**
 * ֱ�Ӳ�������Insertion Sort��
 * 
 * ʱ�临�Ӷȣ�O��n^2��
 * �ռ临�Ӷȣ�O(1)
 * 
 * ��һ����¼���뵽������õ�������У��Ӷ��õ�һ���£���¼����1�������
 * �����Ƚ����еĵ�1����¼������һ������������У�Ȼ��ӵ�2����¼������в��룬
 * ֱ��������������Ϊֹ��
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
			if (a[i] < a[i - 1]) { // ����i��Ԫ�ش���i-1Ԫ�أ�ֱ�Ӳ��롣С�ڵĻ����ƶ����������
				int j = i - 1;
				int x = a[i]; // ����Ϊ�ڱ������洢������Ԫ��
				a[i] = a[i - 1]; // �Ⱥ���һ��Ԫ��
				while (j>-1&&x < a[j]) { // �����������Ĳ���λ��
					a[j + 1] = a[j];
					j--; // Ԫ�غ���
				}
				a[j + 1] = x; // ���뵽��ȷλ��
			}
			print(a, n, i); // ��ӡÿ������Ľ��
		}
	}
}
