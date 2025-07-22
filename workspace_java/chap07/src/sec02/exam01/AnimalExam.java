package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.think();
		a1.eat();
		Cat cat = new Cat();
		cat.eat();
		cat.grooming();
		
		
		Animal a2 = (Animal)cat ;  // 자식이 부모가 될때 
		Animal a3 = cat ;		   // 형 변환 연산자 생략 가능(자동 타입 변환)   
		
		a2.eat();
//		a2.clean();  			   // Animal 과 cat이 둘다가지고있는것만 사용가능  
				
		Dog dog = new Dog();
		Animal a5 = dog;

		Animal a4 = new Dog();		// 부모 타입으로 바로 변환도 가능하다
		
		catMom(cat);				 // 밑에 캣맘이 스테이틱이 아닐떄 
									 // new로 이클래스 선언을해주면 사용이 가능하다
//		catMom(dog) 				 // 전달인자가 달라 사용이 불가 
		
		animalCare(a4);
		animalCare(new Cat());
	}
	
		static void catMom(Cat cat) {
		cat.eat();
		cat.grooming();
	}
		
		static void animalCare(Animal animal) {
			System.out.println("나이 :" + animal.age);
			animal.eat();
			animal.think();
			
		}
}
