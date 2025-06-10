package sec02.exam01.field;

public class Car {

	// 필드
	
	// 필드 의 선언과 동시에 초기화
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxspeed = 350;
	
	// 필드 선언 
	// 초기화 하지 않은경우
	// 생성할 떄 0, false ,null로 초기화한다
	int speed ;
	
	// 필드 영역에는 실행 (행동)하면 에러 
	//	speed = 10; // speed 의 값을 10으로  바꾸는 행동
	
}
