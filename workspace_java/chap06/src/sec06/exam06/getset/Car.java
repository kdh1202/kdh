package sec06.exam06.getset;

public class Car {
	
	
	
	
	
	//필드는 private 로 지정해서
	//직접 읽고 쓰는걸 방지
	private int speed;
	private boolean stop;
	

	
	// 이렇게 만들어도되는데
	public int test() {
		return this.speed;
	}

	//getter
	//보통 필드 값을 돌려주는 기능
	//메소드명 : get + 필드명 (대문자로 시작)
	//전달인자 :없음
	//리턴타입 : 필드의 타입
	
	public int getSpeed() {
		return this.speed;
	}

	
	// setter
	// 보통 필드 값을 수정 하는 기능
	// 메소드명 : set + 필드명 (대문자로시작 )
	// 전달인자 : 필드의 타입 
	// 리턴타입 : void
	
	void setSpeed(int speed) {
		if(speed >= 0) {
		}
		this.speed = speed;
	}
	
	
	//getter 중에서 boolean 타입의 경우
	// get 대신 is 를 사용 하기도함
	// isStop , getStop 둘다 허용인데 
	// 일부에서는 get만 사용 가능한 경우가있다 
	
	 public boolean isStop() {
		 return this.stop;
	 }
	 public boolean getStop() {
		 return this.stop;
	 }
	
//	public void setStop(boolean stop ) {
//		this.stop;
//	}
	
	
	
	
	
	
	
	
	private String color;
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getGas() {
		return gas;
	}
	
	public void setGas(double gas) {
		this.gas = gas;
	}
	
	private double gas;
	
	
	
	
	
}
