package workshop01;

public class Test14 {
	public static void main(String[] args) {
		String mesg = "100/200";
		String[] str = mesg.split("/");
		int hap = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
		System.out.println("정수값 합계: "+hap);
	}

}
