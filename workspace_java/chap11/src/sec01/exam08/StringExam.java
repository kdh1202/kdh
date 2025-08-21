package sec01.exam08;

public class StringExam {

	public static void main(String[] args) {

		// 가비지 컬렉터 사용
		System.gc();

		String s1 = "영일이삼사오육칠팔구삼사";

//		char c = s1.charAt(100);   // 범위를 넘어가서 에러 남
		char qwe = s1.charAt(9);
		System.out.println(qwe);

		int i1 = s1.indexOf("삼사");
		System.out.println(i1);
		int i2 = s1.lastIndexOf("삼사");
		System.out.println(i2);

		int i3 = s1.indexOf("a");
		System.out.println("없을떄 :" + i3);

		// 이메일 양식 점검
		// @와 .이 하나 이상있는가
		String email = "ehdgus951202@naver.com";

		if (email.indexOf("@") != -1 && email.indexOf(".") >= 0) {
			System.out.println("이메일맞");
		} else {
			System.out.println("이메일아님");
		}

		int idx = -1;
		// indexof 구현
		// email에 첫 @가 몇번째에 있는지
		System.out.println("idx:" + idx);
		for (int i = 0; i < email.length(); i++) {
			char t = email.charAt(i);
			if (email.charAt(i) == '0') {
				idx = i;
				break;
			}
		}
		System.out.println(idx);
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);

		String s3 = s1.substring(5, 8);
		System.out.println("s3" + s3);

		// 주민 번호로 남지인지 여자인지 출력
		String ssn = "1234567-1234567 ";
		int start = ssn.indexOf("-") + 1;
		int end = start + 1;
		String s4 = ssn.substring(start, end);
		if (s4.equals("1") || s4.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}

//		문제1 blog.naver.co.kr 에서 naver만 추출하기
		String q1 = "blog.naver.co.kr";

		String q11 = q1.substring(5, 10);
		System.out.println(q11);

//		문제 2 응원 전광판
//		"hello world"
//		"ello world h"
//		"llo world he"
//		
		String q2 = "hello world ";
		String q22 = "ello world";
//		
//		String a = q2.substring(0,1);
//		
//		
//		String b =q2.substring(1,12);
//		System.out.println(b+a);
////////////////////////////////////////////////////////////
//		String c = q2.substring(0,2);
//		
//		String b1 =q2.substring(2,12);
//		System.out.println(b1+c);

		for (int i = 0; i < q2.length(); i++) {
			String a = q2.substring(0, i);
			String b = q2.substring(i, 12);
			System.out.println(b + a);

		}

//		문제3 마스킹
//		humanec@naver.com 이걸 
//		hu*****@naver.com 이렇게 

//		love@naver.com 이걸
//		lo**@naver.com  이렇게?

		String q3 = "*****";
		String q31 = "humance@naver.com";
		String q32 = "love@naver.com";

//		문제4번 검색어 찾기 

		String s5 = "     go   go     ";

		System.out.println("[" + s5.trim() + "]");

		String menu = "김밥,라면,돈까스,제육덮밥";
		String[] menus = menu.split(",");
		for (String m : menus) {
			System.out.println(m);
		}

		String url = "blog.naver.com";
		// split 정규 표현식을 사용 (String 아님에 주의)
		// .은 정규표현식에서 사용하는 의미있는 예약어
		// 문자. 으로 인식하지 않는다
//		String[] urls = url.split(".");

		// .을표현하는 1번방법
		String[] urlf = url.split("[.]");
		System.out.println(urlf.length);

		// .을표현하는 2번방법
		String[] urls = url.split("\\.");
		System.out.println(urls.length);

		String a = "a";
		a += "b";
		a = a + "c";

		// StringBuffer
		// 메모리를 효율적으로 사용
		// StringBuilder 보다 쪼끔 느림
		// 스레드 에 안전하다 (Thread-safe)
		StringBuffer sb = new StringBuffer("a");
		sb.append("b");
		sb.append("c");
		String d = sb.toString();

		
		// 스레드에 안전하지 않다
		StringBuilder sbb = new StringBuilder("a");
		sbb.append("b");
		String d2 = sbb.toString();

	}

}
