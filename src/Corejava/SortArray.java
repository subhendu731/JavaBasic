package Corejava;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list= {4,1,3};
		System.out.println(Arrays.toString(list));
		
		for(int i=0; i<list.length-1; i++) {
			int temp=0;
			for(int j=i+1; j<list.length; j++) {
				if(list[i]>list[j]) {
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
					System.out.println(Arrays.toString(list));
				}
			}
		}
		System.out.println("_____Sorted______");
		System.out.println(Arrays.toString(list));
	}
}
