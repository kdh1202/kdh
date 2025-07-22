package sec02.exam01.driver;

public class Driver {

	void driveM4 (M4 m4) {
	System.out.println("오직 M4");
		m4.run();
		m4.air();
	}
	void drive(Car car) {
		System.out.println("run 할게요 손님");
		car.start();
		car.run();
		
		
		if(car instanceof M4 ) {
			System.out.println(" 어 뭐여");
			M4 m4 = (M4)car;
			m4.air();
			
			((M4)car).air();
		}
		
		car.stop();
		
		
		
	}
}
