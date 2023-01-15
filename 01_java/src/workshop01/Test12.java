package workshop01;

public class Test12 {
	public static void main(String[] args) {
		String mesg = "heLLO";
		System.out.println("대문자로: "+mesg.toUpperCase());
		System.out.println("소문자로: "+mesg.toLowerCase());
		System.out.println("문자열 길이: "+mesg.length());
		System.out.println("1번째 위치 문자: "+mesg.charAt(1));
		System.out.println("문자열 연결: "+mesg+" ~~~");
		System.out.println("h 문자열 포함 여부: "+mesg.contains("h"));
		System.out.println("he 문자열 포함 여부: "+mesg.contains("he"));
		System.out.println("hw 문자열 포함 여부: "+mesg.contains("hw"));
		System.out.println("h 문자로 끝나는지 여부: "+(mesg.charAt(mesg.length()-1) == 'h'));
		System.out.println("h 문자로 시작하는지 여부: "+(mesg.charAt(0) == 'h'));
		System.out.println("O 문자를 X 문자로 변경: "+mesg.replace("O", "X"));
		System.out.println("HELLO 문자열인지 비교: "+mesg.equals("HELLO"));
		System.out.println("HELLO 문자열인지 비교(대소문자 무시): "+(mesg.toUpperCase()).equals("HELLO"));
	}

}
