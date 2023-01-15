package workshop01;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("주소를 입력하시오.");
		String[] juso = kbd.nextLine().split(" ");
		System.out.println("도명: "+juso[0]);
		System.out.println("시명: "+juso[1]);
		System.out.println("구명: "+juso[2]);
	}
}
