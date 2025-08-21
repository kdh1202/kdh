package sec01.exam03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list.isEmpty());

		// 추가
		list.add(123);
		list.add("글씨");

		// 중간에 삽입
		list.add(1, "삽입");
		System.out.println(list);

		System.out.println(list.contains(123));
		System.out.println(list.get(1));
		// String 한정으로 tostring 가능
		String a = (String) list.get(1);
		String b = list.get(1).toString();

		list.remove(1);
		System.out.println(list);

		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());

		System.out.println("--------------------------");
		Map map = new HashMap();

		// 추가
		map.put("k1", "v1");
		map.put("list", list);
		// key 가 같은경우 덮어쓴다
		map.put("k1", "v2");

		// 가져오기
		String k1 = (String) map.get("k1");
		List list2 = (List) map.get("list");

		System.out.println(map);
		System.out.println("--------------------------");

		list = new ArrayList();
		map = new HashMap();
		map.put("제목", "golden");
		map.put("가수", "헌트릭스");
		list.add(map);
		System.out.println(list);

		System.out.println("--------------------------");
		// 마지막 값만 여러번 나온다면 new 해줘야함
		// 얕은 복사 때문에
		map = new HashMap();

		map.put("제목", "문어의꿈");
		map.put("가수", "안예은");
		list.add(map);
		System.out.println(list);

		// 제네릭 : <Stirng, Integer> 다이아몬드 태그라고도함
		// 10점 설명 : 노란줄 없애기
		// 60점 설명 : 추가할 자료형을 제한 한다
		// 100점 설명 : 전달인자나 리턴타입의 자료형을 동적으로 변경한다

		List<String> list3 = new ArrayList<String>();

//		list3.add(123);
		list3.add("123");
		String s = list3.get(0);
		
		// 제네릭의 원시타입은 사용할 수 없고 , wrapper 클래스 사용
//		Map<String, int> map2 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("str", 123);
		int c = map2.get("str");
		System.out.println(c);
	}
}
