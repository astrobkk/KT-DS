package workshop01;

public class Test05 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A';
		ch = (char)(ch + b / a);
		float f = (float)c / (float)b;
		long l = (long)c * (long)c * (long)c * (long)a * (long)a * (long)a * (long)a * (long)a;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d == f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		/*
		 * 출력
		 * c=30
		 * ch=C
		 * f=1.5
		 * l=2700000000
		 * result=true
		 */
	}

}
