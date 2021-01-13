package kr.or.ddit.springtask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class PrintNumberJob {

	private int number;

	// 픽스드 딜레이, 마지막 작업을 기준으로 얼마나 걸리나?, 픽스드 릴레이 시작 지점에서 ??
	// 바로실행 (initialDelay=0)
//	@Scheduled(initialDelay=0, fixedRate=1000)
	
	// cron 표현식 ? 
	// 2초마다   월요일 ~ 금요일 실행
//	@Scheduled(cron="/2 * * * * MON-FRI")
	@Schedules({
		@Scheduled(initialDelay=0, fixedRate=1000)
		, @Scheduled(cron="*/2 * * * * MON-FRI")
	})
	public void printNumber() {
		System.out.printf("%d - %s[%d]\n"
				, ++number
				, Thread.currentThread().getName()
				, Thread.activeCount());
	}
	
	
}
