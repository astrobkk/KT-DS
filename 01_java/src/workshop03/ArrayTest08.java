package workshop03;

public class ArrayTest08 {
	public static void main(String[] args) {
		int[] score = {99, 34, 67, 22, 11, 9};
		int max_score = score[0];
		int min_score = score[0];
		
		for(int i=0;i<score.length;i++) {
			if(max_score < score[i])
				max_score = score[i];
			if(min_score > score[i])
				min_score = score[i];
		}
		System.out.println("최대값: "+max_score);
		System.out.println("최소값: "+min_score);
		
	}

}
