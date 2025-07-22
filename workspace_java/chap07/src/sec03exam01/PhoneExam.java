package sec03exam01;

public class PhoneExam {

	public static void main(String[] args) {
		
		// abstract 클래스는 new 할수없다
//		Phone phone = new Phone();
		
		SmartPhone sp = new SmartPhone();
		
		Phone phone = (Phone)sp;
	}

}
