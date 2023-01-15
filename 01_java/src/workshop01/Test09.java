package workshop01;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("1. 정수 입력하세요.");
		int a = Integer.parseInt(kbd.nextLine());
		System.out.println("2. 정수 입력하세요.");
		int b = Integer.parseInt(kbd.nextLine());
		System.out.println("정수 "+a+"과 정수 "+b+" 중에서 최대값: "+(a > b ? a : b));
	}

}
