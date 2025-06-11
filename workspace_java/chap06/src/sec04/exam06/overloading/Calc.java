package sec04.exam06.overloading;

public class Calc {
	
	//형변환 안해도 되는 애들 이 우선적으로 실행된다 
	
	
	int plus(int b ,int a) {
		System.out.println("int int 실행");
		 return a + b;
	}
	// 전달인자 int ,int  로 같기 떄문에 오버로딩 적용안됨 
//	int plus(int a ,int b) {
//		 return a + b;
//	}
	double plus(double a, double b) {
		System.out.println("double double 실행");
		return a+b;
	}
	double plus(int a, double b) {
		System.out.println("int double 실행");
		return a+b;
	}
	
//	int plus(int b ,int a) {
//		System.out.println("int int 실행"); // 	 변수명은 상관없이 안됨
//		return a + b;
	
	int plus(int x) {
		return x+x;  // 타입 갯수가 다르면 가능
	}
}
