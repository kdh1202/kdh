package sec05.exam02_static;

import java.util.ArrayList;

//import java.util.ArrayList;
//import java.util.*;
public class CalcExam {

	int a =0; // 여기서 선언해서 static 안에서 사용할수없다
	
	public static void main(String[] args) {
		
		
//		java.util.ArrayList list = new  java.util.ArrayList(); 길어서 안씀
//		ArrayList list = new ArrayList ();
		
// 여기서 Calc 는    왜 되냐? 
		System.out.println("c1.pi : "+ Calc.pi);
//		여기서 Calc 는 유일무이한 것 ?
//		메소드 영역에서 바로 오는것 
//		Calc c1 = new Calc();
//		c1.color = "블랙";
//		System.out.println("c1.pi : "+ c1.pi);
//		이럴시 heap 영역에 들렸다 없는거 확인하고 다시 메소드영역으로감
//		변경할시 양쪽다 변경된다 
		
		
		
		Calc c1 = new Calc();
		c1.color = "블랙";
		System.out.println("c1.pi : "+ c1.pi);
		
		
		Calc c2 = new Calc();
		c2.color = "초록";
		System.out.println("c2.pi : "+ c2.pi);
		
//		System.out.println("Calc.pi : "+ Calc.pi);
//		이렇게 쓰라는거다 
		System.out.println(Math.PI);
	
//		2 test 메소드 사용하기 
	
		
		Calc ce =new Calc();

		
		
	// 메소드명 test 만들기
	// 전달인자 리턴타입 없음
	}	
	// 아무말이나 출력
	
	
	static  void test(){
		System.out.println("아무말");
	}
	
	
	
	
	
	
	
}
