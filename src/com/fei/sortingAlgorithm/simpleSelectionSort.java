package com.fei.sortingAlgorithm;

/**
 * 1.��ѧ��ð������󣬻ᷢ�������㷨���ǲ��ϱȽϽ��������ֱ�ӣ���Ȼ����һ�ַ����ĸо���
 *   ����û�и���һ����㷨�أ��⵱Ȼ��������ѡ������
 * 2.�����㷨��˼����ǣ����ҵ������ʺϵ���λ����λ���Ҳ�ѡ���������н���
 *   ������ʱ�ҵ����ʵĹؼ�����������������ֻ�ƶ�һ�ξ��������Ӧ�ؼ��ֵ�����λ
 * 3.ѡ�������ǹ̶�λ�ã���Ԫ�ء�����ڲ�������Ĺ̶�Ԫ����λ�ã�������˼ά��ʽ
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
