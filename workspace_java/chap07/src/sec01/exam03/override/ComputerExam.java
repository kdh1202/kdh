package sec01.exam03.override;

public class ComputerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc calc =	new Calc();
		System.out.println( calc.areaCicle(100) );
		
		Computer computer = new Computer();
		System.out.println( computer.areaCicle(100) );
		
		System.out.println( computer.plus(10, 20) );
		
	}

}
