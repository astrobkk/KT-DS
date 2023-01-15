package workshop03;

public class ArrayTest01 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int arr_sum = 0;
		float arr_avg = 0;
		for(int i=0;i<arr.length;i++)
			arr_sum += arr[i];
		arr_avg = (float)arr_sum / (float)arr.length;
		System.out.println("sum="+arr_sum);
		System.out.println("avg="+arr_avg);
	}

}
