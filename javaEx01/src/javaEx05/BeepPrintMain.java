package javaEx05;

public class BeepPrintMain {

	public static void main(String[] args) {
		// Runnable 객체 구현
		Runnable beepTask = new BeepTask();
		
		// 작업 스레드 생성
		Thread thread = new Thread(beepTask);
		
		// start() 메소드를 호출해야만 실행
		thread.start(); // BeepTask 객체의 run()메소드 실행
		
		// 땡 다섯번 출력
		for(int i=0; i<5; i++) {
			System.out.println("땡");
			try { Thread.sleep(500);} catch (Exception e) { } 
		}
	}

}
