package Corejava;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = { 20, 10, 15, 21, 23 };
		int temp=0;
		
		 for(int i=0; i<list.length-1; i++) {
			 for(int j=i+1; j<list.length; j++) {
				 
				 if(list[i]>list[j]){
					 temp=list[i];	//temp=20;
					 list[i]=list[j];	//list[i]=10
					 list[j]=temp;	//list[j]=20
				 }
			 }
		 }
		 print(list);
	}

	
	
	public static void print(int[] list) {
		for (int i : list) {
			System.out.println(i);
		}
	}
}
