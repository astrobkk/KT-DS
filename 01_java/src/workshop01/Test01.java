package workshop01;

class Test01 {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "2";
		boolean bnx = false;
		char c1 = 'A';
		char c2 = 'B';
		char c3 = '1';
		char c4 = '2';
		int inx = 2;
		
		System.out.println(c1 - c3 - inx - inx);
		System.out.println(!bnx);
		System.out.println(c1 + c2);
		System.out.println(c3 + inx);
		System.out.println(c3 + c4);
		
		/*
		 * 이용 가능한 아스키 코드값
		 * 'A' : 65   'B' : 66
		 * '1' : 49   '2' : 50
		 * 
		 * 출력값
		 * 12
		 * true
		 * 131
		 * 51
		 * 99
		 */
	}

}
