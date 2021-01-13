package kr.or.ddit.simple;

public class SImpleThreadTest2 {
	public static void main(String[] args) {
		PrintNumberJobGenerator2 generator = new PrintNumberJobGenerator2();
		Thread generatorThread = new Thread(generator);
		generatorThread.start();
		System.out.println("메인 쓰레드 end");
	}
	
}
