package javaEx05;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// 비프음 5번 연속 출력
		for(int i=0; i<5; i++) {
			toolkit.beep(); // 비프음 발생
			try { Thread.sleep(500);} catch (Exception e) { } // 5초간 정지
		}
	}

}
