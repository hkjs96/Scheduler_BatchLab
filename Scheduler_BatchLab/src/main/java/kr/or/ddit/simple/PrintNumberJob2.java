package kr.or.ddit.simple;

public class PrintNumberJob2 implements Runnable {
	// 스레드 job을 하기 위해 최소한의 자원을 할당 받는 객체
	// 이것은 잡이니까 스레드가 필요하다는 소리
	
	private int number;
	
	@Override
	public void run() {
		while(number<101) {
			System.out.printf("%d - %s[active count : %d]\n", ++number,
					Thread.currentThread().getName(), Thread.activeCount());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
