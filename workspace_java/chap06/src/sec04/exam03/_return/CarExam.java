package sec04.exam03._return;

public class CarExam {

	public static void main(String[] args) {
		
		Car car = new Car ();
		boolean status = car.isLeftGas();
		System.out.println("가스 남았나? "+ status);
		
		car.gas = 3;
		car.setGas(5);
		
		status = car.isLeftGas();
		System.out.println("가스 남았나?"+ status);
		
		if(status) {
			System.out.println("출발");
			car.run();
			
		}
	
		
//		 필드
// 		학생 클래스 를 만들고 
//		이름과 나이 필드만든다
//		학생 Exam 클래스 만들고 
//		학생  2명을 각각 등륵하고
//		두 학생의 정보를각각 출력
		
//		메소드
//		메소드를 통해서 이름과 나이를 전달해서 저장하고
//		메소드를 통해서 이름과 나이를 돌려받아서 출력하기
		
		
		
		Car2 c2 = new Car2();
		c2.setGas(3);
		c2.run();
		
	}

}
