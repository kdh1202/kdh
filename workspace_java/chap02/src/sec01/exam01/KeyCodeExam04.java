package sec01.exam01;

import java.util.Scanner;

public class KeyCodeExam04 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		System.out.print(3);  //  옆으로 출력하는방법 print
		System.out.print(4);
		System.out.println();   // 이렇게하면 엔터가 가능하다
		System.out.println(5);
		System.out.println(6);
		
		
		System.out.printf("이름: %s", "감자바");
		System.out.printf("이름:%s, 나이: %d","감자바",  25);
		System.out.println();
		System.out.printf("이름:%6s, 나이: %04d","감자바",  25);
		System.out.println();
//		System.out.printf("이름: "+ name + ", 나이 :" + age );
		
		
		
		////////////////////////////////////////////////
		// 입력 
		/*	int keyCode;
		  scanner 연습하려고 주석처리
		try {		
	
			keyCode = System.in.read();
			System.out.println("keyCode:" + keyCode);	
		
			keyCode = System.in.read();
			System.out.println("keyCode:" + keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode:" + keyCode);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	
			
		Scanner scan = new Scanner(System.in);
		// 엔터 까지의 모든글씨
		String inputData = scan.nextLine();
		System.out.println("inputData:"+inputData);

		// 엔터 쳤을 때 띄어 쓰기 까지의 모든글씨
		String inputData2 = scan.next();
		System.out.println("inputData2:"+inputData2);
		
		// 엔터 쳤을 때 의 숫자 
		int input = scan.nextInt();
		System.out.println("input:"+ ( input*10));
		
		int input2 = scan.nextInt();
		System.out.println("x값을 입력하시오 :");
		System.out.println("입력한 x 값:"+ ( input2*10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
