package sec01.exam03.override;

public class Calc  {

	double areaCicle(double r) {
		System.out.println("Calc 객체의 areaCicle() 실행");
		return r*r*Math.PI;
	}
	public int plus (int x, int y) {
		 System.out.println("Calc의 plus 실행");
		 return x + y;
	}
}
