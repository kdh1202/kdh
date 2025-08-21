package sec02.exam01;

public class HumanException  extends Exception{
	
	HumanException(){
		System.out.println("HumanException 생성");
	}
	HumanException(String messege){
		super(messege);
		System.out.println("HumanException (String)생성");
	}
}
