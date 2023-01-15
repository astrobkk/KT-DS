package workshop01;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("주소를 입력하시오.");
		String juso = kbd.nextLine();
		int num = juso.length();
		String[] words = juso.split(" ");
		int word_len = words.length;
		System.out.println("문자 갯수(공백포함): "+num);
		System.out.println("단어 갯수: "+word_len);
	}
}
