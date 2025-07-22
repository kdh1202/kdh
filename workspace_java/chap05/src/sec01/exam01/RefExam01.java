package sec01.exam01;

public class RefExam01 {

	public static void main(String[] args) {

		
		int a = 10;
		int b = a;
		System.out.println(a+","+b);
		
		b = 12;
		System.out.println(a+","+b);
		
		
		String c = "김동현";
		// = 을 기준으로 오른쪽이 먼저 실행된다
		// "김동현" 를 힙 heap 영역에  비어있는 번지에 할당 (놓기)
		//  스택 stack 영역에 변수 c 에 방금 그번지를 저장 
		
		System.out.println("c:"+c);
		
		System.out.println(a == b);
		// == 또는 != 는 무조건 stack 의 값을 비교한다 
		
		String d = new String ("김동현");
		// String c = "김동현"; 는 축약버전 
		
		System.out.println(c == d);
		System.out.println(c.equals(d));
		// String 으로  비교할떈  equals() 사용 해야됨 
		
		String e = d ;
		//  스택 stack 영역에 변수 d 를  e에 저장  
		System.out.println(e == d);
		// == 은 stack 에 있는 값을 저장 하기 떄문에 
		
		
		String f0 = "김동현";
		System.out.println("c == f0:"+(c == f0));

		String f = "김"+"동현";
		System.out.println("c == f:"+(c == f));
		
		// a = null;
		//  기본타입에는 null 을 넣을수 없다 .
		
		// null : 참조하는 주소가 없는상태 
		String  g ="휴먼";
		System.out.println("g== null:"+ (g == null));
		System.out.println("g== null:"+ (g != null));
		
		String h =""; 
		System.out.println(h != null);
		// 공백은 null 이 아니다 공백이있다는 뜻
		
		g =null;
		System.out.println("g == null:"+(g == null));
		System.out.println("g+\"abc\":"+(g+"abc"));
		
		System.out.println(h.equals(g));
		if(g != null) { // 방어 코딩			
		System.out.println(g.equals(h));
		}
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
