package kr.or.ddit.pooling;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolingTest {
	public static void main(String[] args) {
		// 생성자를 통해서 polling 정책을 결정한다.
		ThreadPoolExecutor executor =
				new ThreadPoolExecutor(3, 5, 2, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10));
		
		// 감당할 수 없을 경우에 대한 처리를 핸들러로 완성할 수 있따.
		executor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
			
			@Override
			public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
				// r 더이상 실행할 수 없는 JOB - PrintNumberJob
				System.err.println(r);
				
			}
		});
		
		PrintNumberJobGenerator generator = new PrintNumberJobGenerator(executor);
		executor.execute(generator);
//		Thread geT = new Thread(generator);
//		geT.start();
		
	}
}
