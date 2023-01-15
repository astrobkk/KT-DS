package workshop01;

public class Test13 {
	public static void main(String[] args) {
		String mesg = "     홍길동/이순신/유관순     ";
		System.out.println("문자열 길이(공백 포함): "+mesg.length());
		mesg = mesg.trim();
		System.out.println("공백 제거: "+mesg);
		System.out.println("공백 제거된 문자열 길이: "+mesg.length());
		System.out.println("부분열: "+mesg.substring(0, 7));
		String[] str = mesg.split("/");
		System.out.println("홍길동 출력: "+str[0]);
		System.out.println("유관순 출력: "+str[2]);
	}

}
