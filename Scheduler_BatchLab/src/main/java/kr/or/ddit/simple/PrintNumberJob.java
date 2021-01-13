package kr.or.ddit.simple;

import java.util.TimerTask;

public class PrintNumberJob extends TimerTask {
	// 스레드 job을 하기 위해 최소한의 자원을 할당 받는 객체
	// 이것은 잡이니까 스레드가 필요하다는 소리
	
	private int number;

	@Override
	public void run() {
		System.out.printf("%d - %s[active count : %d]\n"
				, ++number
				, Thread.currentThread().getName()
				, Thread.activeCount());
		if(number==100) cancel();
	}
	
	// 종료 조건을 잡는 메서드 ? 
	
}
