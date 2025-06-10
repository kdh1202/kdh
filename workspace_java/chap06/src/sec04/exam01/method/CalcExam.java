package sec04.exam01.method;

public class CalcExam {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
	
		calc.powerOn();
		
		calc.powerOff();
		
		int sum = calc.plus(5, 7);
		System.out.println("sum :"+sum);
		
		int x =5;
		int sum2 = calc.plus(x, 7);
		System.out.println("sum2 :"+sum2);
	
		double b =calc.divide(10, 1);
		System.out.println("나누기 결과:"+b);
		
		
		
	}

}
