package kr.or.ddit.simple;

import java.util.Timer;

public class SImpleThreadTest {
	public static void main(String[] args) {
		PrintNumberJobGenerator generator = new PrintNumberJobGenerator();
//		Thread generatorThread = new Thread(generator);
//		generatorThread.start();
		Timer timer = new Timer();
		timer.schedule(generator, 0, 2000);
		System.out.println("메인 쓰레드 end");
	}
	
}
