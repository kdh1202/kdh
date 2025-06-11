package sec04.exam03._return;

public class Calc {
	// 두수 를 입력받아 더한 결과를 돌려주는 메소드 plus
	int plus(int a ,int b) {
		 return a + b;
	}
		
	double avg(int x, int y) {
		int sum = plus (x,y);
		 double  result = (double) sum / 2;
		 return result;
	}
	
	void execute(int a1, int a2) {
		double result = avg(a1,a2);
		System.out.println(a1+"과"+a2+"의 평균은"+result);
	}
	
	
	// void 이클래스에서만 사용가능  다른클래스에서는 호출만 가능
}
