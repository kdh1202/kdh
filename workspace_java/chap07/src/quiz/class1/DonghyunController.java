package quiz.class1;

public class DonghyunController extends Student {

	DonghyunController(){
		super("동현");
		
	}
	
	DonghyunService donghyunservice = new DonghyunService();
	
	@Override
	String answer(String q) {
		String result = donghyunservice.getInfo(q);
		return result;
	}
	
}
