package kr.or.ddit.simple;

public class PrintNumberJobGenerator2 implements Runnable {

	private int jobCount;
	
	@Override
	public void run() {
		while(jobCount++ < 10) {
			PrintNumberJob2 job = new PrintNumberJob2();
//			CPU 하나를 선점할 수 있는 구조. 아직 시작X.
			Thread jobThread = new Thread(job);	
//			나 이제 CPU 필요해 선언
			jobThread.start();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
