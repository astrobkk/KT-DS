package workshop03;

import java.util.Random;

public class ArrayTest09 {
	public static void main(String[] args) {
		int[] arr3 = new int[5];
		Random rd = new Random();
		int hap = 0;
		
		for(int i=0;i<arr3.length;i++) {
			arr3[i] = rd.nextInt(10)+1;
			hap += arr3[i];
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		float avg = (float)hap / (float)arr3.length;
		
		System.out.println("sum="+hap);
		System.out.println("avg="+avg);
		
	}
}
