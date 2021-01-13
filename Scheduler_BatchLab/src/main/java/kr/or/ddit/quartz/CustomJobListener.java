package kr.or.ddit.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.listeners.JobListenerSupport;

public class CustomJobListener extends JobListenerSupport{

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}
	
	// 트리거가 거절 했을때?
	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		System.err.println("작업 거절");
	}
	
	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		System.err.println("작업 실행");
	}
	
	// 작업 끝
	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		System.err.println("작업 완료");
	}
	
}
