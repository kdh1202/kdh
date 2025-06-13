package sec03.exam01.constuctot;

public class Car {
	
//	Car(){	// 생성자는 클래스 이름과 동일 하게 지어야 한다
//			// 리턴 타입이 없다
//			// 클래스를 실행할떄 무조건 실행되야  하는것을 넣어 놓는 메소드
//	System.out.println("Car 생성자 실행");
//	
//	}
	// 생성자를 생략한 경우  (생성자가 하나도 없는경우)
	// 기본 생성자가 자동 완성된다
	// 기본 생성자
	// 생성자가 하나라도 선언되어 있으면
	
	// 기본 생성자는 만들어지지 않는다 
	
	String model = "아반떼";
	String color ;
	int maxSpeed;
	CarExam carExam = new CarExam();
//	
//	Car(){
//	// 보통 생성자는 필드 값 초기화 하는데 많이 사용된다
//		color ="빨강";
////		if
////		for
////		test()
//	}
	
//	Car(String c){
//		color = c;
//	}
	Car(String c){
//		color = c;
//		model = "아반떼";
//		maxSpeed = 240;
//		this() 전달인자가 없는 생성자를 사용할 때 이렇게 사용한다
		this("아반떼",c,240);
//		다른생성자를 호출한는 방법 
//    this 는 무조건 첫번째 줄에 있어야됨 
	
	}
	
	
	Car(String m, String c , int ms){
		model = m;
		color = c;
		maxSpeed = ms;
	}
	
	
//	void setColor(String c) {
//		String color  ;
//		color = "빨강";
//	}
	void setColor(String color) {
//		this.color = "빨강";
		this.color = color;
//		
	}
	//fruit << 과일
	
	
	



}
