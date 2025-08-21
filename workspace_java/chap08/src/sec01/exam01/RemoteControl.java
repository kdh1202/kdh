/**
 * 
 */
package sec01.exam01;

/**
 * @author user
 *
 */
// new 못함
public interface RemoteControl {

		public static final int MAX_VOLUME = 10;
		// 모든 필드는 static final (상수) 이다 
		// 그래서 생략이 가능 하다 
		public int MIN_VOLUME = 0;
		
		public abstract void turnOn();
		// 기본적으로 메소드는 abstract(추상) 메소드다 
		public void turnOff();
		public void setVolume(int volume);
		
		default void mic(String text) {
		}
}
