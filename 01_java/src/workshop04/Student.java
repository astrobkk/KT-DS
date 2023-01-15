package workshop04;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	
	public Student() {
		
	}
	
	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg() {
		double avg = ((double)this.korean + (double)this.english + (double)this.math + (double)this.science) / 4.0;
		return avg;
	}
	
	public String getGrade() {
		String grade = "";
		double avg = getAvg();
		if(avg <= 100 && avg >= 90) {
			grade = "A";
		}else if (avg >= 70) {
			grade = "B";
		}else if (avg >= 50) {
			grade = "C";
		}else if (avg >= 30) {
			grade = "B";
		}else {
			grade = "F";
		}
		return grade;
	}
	
	public String getName() {
		return this.name;
	}
	
	
}
