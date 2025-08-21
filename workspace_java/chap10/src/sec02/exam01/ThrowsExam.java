package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {

	public static void main(String[] args) {

		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			test2(50);
		} catch (HumanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());

			String errorCode = e.getMessage();
			if (errorCode.equals("EV10")) {
				System.out.println("10이하만");
			}
		}

		// try-with-resources
		// close() 를 자동실행 시켜준다
		// closeable 인터페이스가 있는 클래스만 ()안에 넣을 수 있다
		try (FileInputStream fis2 = new FileInputStream("c:\\tmp\\text.txt");) {
			System.out.println("뭔가함");
			System.out.println(fis2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\tmp\\text.txt");
			// 뭔가함
			// 예외가 발생 할 수 있다

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {

				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	static void test() throws ClassNotFoundException, IOException {
		Class.forName("짝짝");
	}

	static void test2(int vol) throws HumanException {

		if (vol > 10) {
			throw new HumanException("EV10");
		} else if (vol < 0) {
			throw new HumanException("EV0");
		}
		System.out.println("vol:" + vol);
	}
	static void test3() {
		try {
			//코딩
			"a".equals(null);			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
