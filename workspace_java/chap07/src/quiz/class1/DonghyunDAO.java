package quiz.class1;

import java.util.HashMap;

public class DonghyunDAO {

	HashMap map = new HashMap();
	
	DonghyunDAO(){
		map.put("사탕", "청포도");
		map.put( "점심", "맘스터치");
		map.put( "회식", "어디갑니까");
		map.put( "휴식", "녜");
	}
	
	String selectAnswer(String q) {
		return (String)map.get(q);
		
	}
}
