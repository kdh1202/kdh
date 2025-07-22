package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {
		
//		child 르 생성 해서 
		Child child = new Child();
		System.out.println("---------------------");
//		print 를 실행		
		child.printName();
		
		System.out.println("child.name : "+child.name);
		System.out.println( child.getName() );
//		바뀐 이름
		child.setName("바뀐이름");
		System.out.println( child.getName() );
	}

}

