package kr.or.ddit.simple;

import java.util.Timer;
import java.util.TimerTask;

public class PrintNumberJobGenerator extends TimerTask {

	private int jobCount;
	
	@Override
	public void run() {
		PrintNumberJob job = new PrintNumberJob();		// 순수하게 해야할 일
		Timer timer = new Timer();
		timer.schedule(job, 0, 1000);		// 스케줄이 빠져나온 것
		// 빠져 나간 스케줄링 개념을 Timer API를 이용
	}
	
}
