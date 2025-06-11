package sec04.exam06.overloading;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		calc.plus(1,2);
		calc.plus(1.5,2.7);
	
		System.out.println("문자");
		System.out.println(1);
	
		calc.plus(1,2.5);
	}
	

}
