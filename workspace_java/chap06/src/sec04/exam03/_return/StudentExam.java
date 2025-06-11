package sec04.exam03._return;

public class StudentExam {

	public static void main(String[] args) {

		
		
		Student student =  new Student();
		Student student2 = new Student();
		
		student.name ="김동현";
		System.out.println(student.name);

		student2.name ="김동현 클론";
		System.out.println(student2.name);
		
		student.old = 30;
		System.out.println(student.old);
		
		student2.old = 31;
		System.out.println(student2.old);
		System.out.println("이름:"+student.name+" "+"나이 :"+student.old);
		System.out.println("이름:"+student2.name+" "+"나이 :"+student2.old);
		
		student.setName("박춘보");
		
		String name = student.getName();
		System.out.println("name: "+ name);
		
//		 필드
//		학생 클래스 를 만들고 
//		이름과 나이 필드만든다
//		학생 Exam 클래스 만들고 
//		학생  2명을 각각 등륵하고
//		두 학생의 정보를각각 출력
		
		
//		메소드
//		메소드를 통해서 이름과 나이를 전달해서 저장하고
//		메소드를 통해서 이름과 나이를 돌려받아서 출력하기
		
		
	}  

}
