package sec03.exam02;

public abstract class Windows {

	
	void boot() {
		System.out.println("CMOS 실행");
		System.out.println("윈도우 실행");
		start();
		System.out.println("마우스 커서는 로딩중...........");
	}

	
	abstract void start();
	
//	abstract void desktop();  // 나중에 추가하면 위험하게 될수도있음 
	void desktop() {
		
	}
}
