package workshop03;

import java.util.Scanner;

public class ArrayTest06 {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.print("키의 최대값을 구합니다.\n사람 수 : ");
		int n = Integer.parseInt(kbd.nextLine());
		int[] humans = new int[n];
		int max_height = -1;
		for(int i=0;i<n;i++) {
			System.out.print("사람 "+(i+1)+": ");
			humans[i] = Integer.parseInt(kbd.nextLine());
			if(humans[i] > max_height)
				max_height = humans[i];
		}
		System.out.println("최대값은 "+max_height+"입니다.");
	}

}
