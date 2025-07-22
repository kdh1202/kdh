package sec01.exam01;

public class Child  extends Parent {
	
	
	void printName() {
		System.out.println("Child 의 print 실행");
		System.out.println("this.name :"+ this.name);
		String pName = getName();
		System.out.println("pName:"+ pName);
		System.out.println("super.name:"+ super.name);
	}
//	전달인자가  필드를 가리는 현상을 쉐도우 
//	shadow 
	void setName(String name) {
		this.name = name;
	}
//	부모의 필드를 가리는 현상 
//	overshadow
	String name = "Child 의 name";
	
	
//	Child(){
//		super();
//	}
	
	Child(){
//		super();  // 부모의 생성자 (생략가능)
				  // 첫줄에 적어야 한다 
		super(1); // 전달인자를 맞춰주어야한다 
//		this(1)   // super(), this() 
		 		  // 모두 첫줄에 적어야해서 
				  // 같이 사용할수 없다
		System.out.println("Child생성자");
	}
	Child(int a){
		super(1);
	}
	String getName(){
		System.out.println("child의 getName 실행");
		return this.name;
	}
}
