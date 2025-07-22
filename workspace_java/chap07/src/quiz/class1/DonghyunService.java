package quiz.class1;

public class DonghyunService {
	
	DonghyunDAO donghyunDAO = new DonghyunDAO();

	// 머리속
	String getInfo(String q) {
		String result = donghyunDAO.selectAnswer(q);
		if(result == null) {
			result ="(침묵)";
		} else {
			result = "저는 "+ result +"이거요";
		}
		return result;
			
	}
	// gpt
	//노션
	
}
