package sec05.exam02_static;

public class Calc {

	String color;
	
	// 선발대 고기없이 야채만 먹는 채식주의자
	// 삐딱 하게 되어있는건 static 이라고 알려주는것
	// static 이긴 하지만 그래봤자 필드 다 
	// Static 은  공통으로 사용하는 변수다 
	static  double pi =3.14;
	static  int price;
//	price =10 ; 이건안됨 행동이라 불가능 
	
	static  {
		System.out.println("값을 입력하시오");
		price =100;
	}
	
	
	
	
}
