package sec04.exam03._return;

public class Car2 {

	int gas;	// 필드 변수  
	int speed;
	
	void setSpeed(int s) {
		speed = s;
		System.out.println("속도를 "+ speed+" 바꾼다 ");
	}
	
	void setGas(int g) {
		gas = g;
	}

	 boolean isLeftGas() {
		 if(gas == 0 ) {
			 System.out.println("gas가 없습니다");
			 return false;
			 // return 하는 순간에 메소드 종료!
		 } else {
			 // else  가 있다는건 무조건 하나는 실행되는 것을 보장!
			 System.out.println("gas가 있습니다");
			 return true;
		 }
	 }
			 
//		 System.out.println("gas가 있습니다");
//		 return true;
		 
	 
	 boolean isLeftGas2() {
		 boolean result =false;
		 
		 if (gas ==0 ) {
			 System.out.println("gas가 없습니다");
			 result = false ;	
		 } else { 
			 System.out.println("gas가 없습니다");
			 result = true ;	
		 }
		 return result;
	 }	
	 
	 boolean isLeftGas3() {
		 return gas != 0;
	 }
//	 boolean isLeftGas3() {
//		 boolean result = (gas != 0);
//		 return result;
//	 }
	 
	 
	 
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다! 잔량:"+gas);
				gas--;
				setSpeed(gas*10);
			} else {
				System.out.println("멈춰 ! 잔량:"+gas);
				return;
			}
		}
	}
	 
	 
	 
	 
	 
	 
}
