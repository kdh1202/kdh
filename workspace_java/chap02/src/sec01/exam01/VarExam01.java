package sec01.exam01;

public class VarExam01 {

	public static void main(String[] args) {

		int value; // 변수선언
		value = 5; // 변수는 = 5 라는뜻
		value = 6; // 덮어쓰기 되는거임
		int result = value + 10; //

		System.out.println(result);

		int hour = 3;
		int minute = 5;

		System.out.println(hour + "시간" + minute + "분");

		value = value + 5;
		System.out.println("value : " + value);

		// 이클립스 단축키
		/*
		 *  한줄 지우기 : ctrl + d 
		 *  한줄 복사 : ctrl + alt +위 아래 방향키
		 *  주석 단축키 : ctrl + / 
		 *  한줄 이동 :alt+위아래 방향키
		 *  자동 정렬 : ctrl + shift +f
		 */

		// 변수 a 를 선언과 동시에 10으로 초기화
		int a = 10;
		int b; // 변수선언
//		System.out.println(b);

//		System.out.println(x);   // 위에서부터 인식해서 밑에 써야 인식이가능 
		int x = 10;
		int y = x;
//		int x= 10000;              
		System.out.println(x);

		{
// 			int = 3;  - 로컬변수(지역변수) 로컬 이
			System.out.println(x); // 중가로가 끝나면 변수가 사라짐
			int z = 5;
			System.out.println("z:" + z);
		}
		int z = 55;
		System.out.println("z:" + z);

		int x1 = 26845;
		int x2 = 684684;

		System.out.println("x1:" + x1); // 684684
		System.out.println("x2:" + x2); // 26845


		/*
		 * int x1 = 26845; 
		 * int x2 = 684684; 
		 * int x3 = x1;
		 *  x1 = x2; 
		 *  x2 = x3;
		 * System.out.println("x1:"+ x1); //684684 
		 * System.out.println("x2:"+ x2); //26845
		 */
         
		
		// user + info
		//
		// userInfo  : 카멜 케이스 camel case
		// user_info : snake case
		// user-info : 캐밥 kebab case
		// nUserInfo, sUserInfo : 헝가리언 표기법
		
		
		
		
	}

}
