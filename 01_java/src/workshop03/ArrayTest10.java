package workshop03;

public class ArrayTest10 {

	public static void main(String[] args) {
		int n = args.length;
		if(n != 2) {
			System.out.println("다시 입력 하세요");
		}else{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			if(!(a>=1 && a<= 5 && b>=1 && b<=5)) {
				System.out.println("숫자를 확인 하세요");
			}else {
				int[][] nums = {{a, b}, {a, b}};
				int hap = 0;
				nums[1][0] = (int)(Math.random()*5) + 1;
				nums[1][1] = (int)(Math.random()*5) + 1;
				
				for(int i=0;i<nums.length;i++) {
					for(int j=0;j<nums[0].length;j++) {
						System.out.print(nums[i][j]+" ");
						hap += nums[i][j];
					}
					System.out.println();
				}
				System.out.println();
				
				float avg = (float)hap / (float)nums.length / (float)nums[0].length;
				System.out.println("sum="+hap);
				System.out.println("avg="+avg);
			}
		}
	}

}
