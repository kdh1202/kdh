package sec04.exam03._return;

public class Student {
	
	String name  ;
	
	int old ;
	
	
	// 이름값을 전달 받아서 필드에 저장하는 메소드 
	//	메소드 명 :setName
	//  전달 인자 : String
	//	리턴 타입 : void 
	
	void setName ( String n ) {
		name = n;
//		name = "[출처]"+n;
//		return;  //리턴이 생략 됬다
	}
	
	
	// 필드의 이름을 돌려주는 메소드 
		  
	// 이름값을 전달 받아서 필드에 저장하는 메소드 
	//	메소드 명 :getName
	//  전달 인자 : 없음 
	//	리턴 타입 : String
	String getName(){
		return name;
	}
	
	//
	//	메소드 명 : setInf
	//  전달 인자 : String n , int a 
	//	리턴 타입 : void
	void setInfo(String n, int a) {
		name = n;
		old = a;
	}
	
	
//	String getInfo() {
////		return name;
////		return old;
//	}
	
//	메소드
//	메소드를 통해서 이름과 나이를 전달해서 저장하고
//	메소드를 통해서 이름과 나이를 돌려받아서 출력하기
	
	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
//	 필드
//	학생 클래스 를 만들고  1
//	이름과 나이 필드만든다 1
//	학생 Exam 클래스 만들고 1
//	학생  2명을 각각 등륵하고1
//	두 학생의 정보를각각 출력
	
	
	

}
