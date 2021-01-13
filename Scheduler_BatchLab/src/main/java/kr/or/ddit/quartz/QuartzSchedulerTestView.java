package kr.or.ddit.quartz;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzSchedulerTestView {
	public static void main(String[] args) {
		ConfigurableApplicationContext container = 
				new ClassPathXmlApplicationContext("kr/or/ddit/quartz/conf/quartz-context.xml");
		container.registerShutdownHook();
	}
}
