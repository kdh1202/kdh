package sec02.exam01.driver;

public class DriverExam {

	public static void main(String[] args) {

		M4 m4 = new M4();
		Driver driver = new Driver();
		
		driver.driveM4(m4);
	
		Ferrari f = new Ferrari();
		Car c1 = (Car) f;
		driver.drive(c1);
		
		Bugatti b = new Bugatti();
		driver.drive(b);
		
		driver.drive((Car) new M4());
	}

}
