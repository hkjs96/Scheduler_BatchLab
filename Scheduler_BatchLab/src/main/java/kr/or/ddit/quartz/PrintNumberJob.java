package kr.or.ddit.quartz;

public class PrintNumberJob {
	
	private int number;

	public void printNumber() {
		System.out.printf("%d - %s[%d]\n"
				, ++number
				, Thread.currentThread().getName()
				, Thread.activeCount());
	}
	
}
