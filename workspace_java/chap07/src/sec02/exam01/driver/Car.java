package sec02.exam01.driver;

public class Car extends Object {

	Car(){
		super();
	}
	void start() {
		System.out.println("엔진 가열");
	}
	
	void run() {
		System.out.println("주행중.... ");
	}
	
	void stop() {
		System.out.println("시동 끄기");
	}
}
