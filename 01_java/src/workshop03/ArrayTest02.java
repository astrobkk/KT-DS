package workshop03;

public class ArrayTest02 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int arr_sum = 0;
		for(int i=1;i<arr.length;i+=2)
			arr_sum += arr[i];
		System.out.println("sum="+arr_sum);
	}
}
