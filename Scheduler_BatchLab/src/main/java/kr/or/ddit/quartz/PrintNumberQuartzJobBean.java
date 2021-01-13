package kr.or.ddit.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class PrintNumberQuartzJobBean extends QuartzJobBean{

	private int number;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		System.out.printf("%d - %s[%d]\n"
				, ++number
				, Thread.currentThread().getName()
				, Thread.activeCount());
	}
	
}
