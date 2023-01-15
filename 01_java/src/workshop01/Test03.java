package workshop01;

public class Test03 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (ch >= 'a' && ch <='z') | (ch >= 'A' && ch <='Z');
		System.out.println(b);
	}
}
