package sec05.exam05_final;

public class person {

	final String nation ="Korea";
	final String ssn;
	String name;
	
	
	// final
	// 값 이 할당된 경우 변경할 수 없게 막아줌 
	public person(){
		// final 의 값이 없던경우
		// 생성자에서 딱 한번 할당 할 수있다 
		this.ssn="주민번호";
		this.name = "이름";
//		this.nation = "다른나라";  // 바뀌지 못하게 막혔음
		
		
		
		this.name = "이름2";
//		this.ssn="주민번호2";
		
	}
	
	
	void test() {
		
//		this.ssm ="주민번호 "
		
	}
}
