package kr.or.ddit.pooling;

import java.util.TimerTask;
import java.util.concurrent.ThreadPoolExecutor;

public class PrintNumberJobGenerator extends TimerTask {

	private int jobCount;
	private ThreadPoolExecutor executor;
	public PrintNumberJobGenerator(ThreadPoolExecutor executor) {
		this.executor = executor;
	}


	@Override
	public void run() {
		while(true) {
			PrintNumberJob job = new PrintNumberJob("printJob-"+ ++jobCount);
			executor.execute(job);
//			Thread t = new Thread(job);
//			t.start();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
