package sec01.exam01;

public class RemoconExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv();
		tv.setVolume(7);
		System.out.println(tv.vol);
		
		//추상 클래스이기 떄문에 new가안됨
//		new RemoteControl();
		RemoteControl rc1 = (RemoteControl)tv;
                      		RemoteControl rc2 = tv;
	}

 static	void powerOn(RemoteControl rc) {
		rc.turnOn();
	}
}
