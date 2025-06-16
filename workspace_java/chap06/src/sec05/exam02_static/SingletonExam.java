package sec05.exam02_static;

public class SingletonExam {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//
		if(s1 ==s2 ) {
			System.out.println("같은객체");
		}
	}

}
