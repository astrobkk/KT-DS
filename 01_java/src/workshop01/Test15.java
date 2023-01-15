package workshop01;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int[] nums = new int[3];
		for(int i=0;i<=2;i++) {
			System.out.println((i+1)+". 정수 입력하세요.");
			nums[i] = Integer.parseInt(kbd.nextLine());
		}
		int max_num = nums[0] > nums[1] ? (nums[0] > nums[2] ? nums[0] : nums[2]) : (nums[1] > nums[2] ? nums[1] : nums[2]);
		System.out.println("정수 "+nums[0]+"과 정수 "+nums[1]+", 정수 "+nums[2]+" 중에서 최대값: "+max_num);
	}

}
