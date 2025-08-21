package sec01.exam01;

public class Tv extends Display implements RemoteControl, OTT {

	int vol;

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv 를 끕니다 ");

	}

	@Override
	public void setVolume(int vol) {
//		// TODO Auto-generated method stub
//		if(vol > RemoteControl.MAX_VOLUME) {
//			System.out.println(RemoteControl.MAX_VOLUME+"이하만 가능합니다");
//		} else if(vol < RemoteControl.MAX_VOLUME) {
//			System.out.println(RemoteControl.MIN_VOLUME+"이상만 가능합니다");
//		} else {		
//			this.vol= vol;
//		}	
//	}
		if (vol > RemoteControl.MAX_VOLUME)
			vol = RemoteControl.MAX_VOLUME;
		else if (vol < RemoteControl.MIN_VOLUME)
			vol = RemoteControl.MIN_VOLUME;
		this.vol = vol;
	}

	@Override
	public void netflix() {
		// TODO Auto-generated method stub
		System.out.println("넷플릭스 시청");
	}

}
