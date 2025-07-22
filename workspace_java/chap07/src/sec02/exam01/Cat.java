package sec02.exam01;

public class Cat extends Animal {
	
	int age = 3;
	
	@Override
	void eat() {
		System.out.println(" 츄르 먹는중 ");
	}
	
	@Override
	void think() {
	System.out.println(" 모르겠다 ");	
	}
	
	void clean() {	
		System.out.println(" 배변 정리 ");	
	}
	
	void grooming () {		
		System.out.println(" 그루밍 하는중 ");		
	}
	
}
