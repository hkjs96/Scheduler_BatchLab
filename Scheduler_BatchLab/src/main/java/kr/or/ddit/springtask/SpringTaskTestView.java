package kr.or.ddit.springtask;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTaskTestView {
	public static void main(String[] args) {
		ConfigurableApplicationContext container = 
				new ClassPathXmlApplicationContext("kr/or/ddit/springtask/conf/task-context.xml");
		container.registerShutdownHook(); // 더이상 활성 스레드가 없을때 알아서 종료
		
	}
}
