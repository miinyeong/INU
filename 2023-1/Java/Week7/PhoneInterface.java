// 인터페이스 만들기
interface PhoneInterface {
	int TIMEOUT = 10;			// public static final 생략
	void sendCall();			// public abstract 생략
	void receiveCall();			// public abstract 생략
	default void printLogo() {	// public 생략
		System.out.println("** Phone **");
	}
}
