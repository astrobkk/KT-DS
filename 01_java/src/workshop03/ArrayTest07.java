package workshop03;

import java.util.Scanner;
import java.util.Random;

public class ArrayTest07 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner kbd = new Scanner(System.in);
		System.out.print("키의 최대값을 구합니다. \n사람 수 : ");
		int num = Integer.parseInt(kbd.nextLine());
		int[] humans = new int[num];
		int max_height = -1;
		for(int i=0;i<num;i++) {
			humans[i] = rd.nextInt(50) + 150;
			System.out.println("사람 "+(i+1)+": "+humans[i]);
			if(humans[i] > max_height)
				max_height = humans[i];
		}
		System.out.println("최대값은 "+max_height+"입니다.");
		
	}

}
