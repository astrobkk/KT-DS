package workshop03;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[][] arr2 = {
			{5, 5, 5, 5, 5},
			{10, 10, 10, 10, 10},
			{20, 20, 20, 20, 20},
			{30, 30, 30, 30, 30}
		};
		int total_sum = 0;
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++)
				total_sum += arr2[i][j];
		}
		
		float total_avg = (float)total_sum / (float)(arr2.length * arr2[0].length);
		
		System.out.println("total="+total_sum);
		System.out.println("average="+total_avg);
		
	}

}
