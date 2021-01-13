package kr.or.ddit.springtask;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)	// Spring과 JUnit 연동
@ContextConfiguration("file:src/main/resources/kr/or/ddit/springtask/conf/task-context.xml")	//컨테이너 객체 생성(주입?)
public class SpringTaskTest {	// 웹이 아니기 때문에 @WebAppConfiguration 쓰지 않았다.

	@Inject
	private PrintNumberJob job;
			
	@Test
	public void test() {
		job.printNumber();	// 컨테이너가 사라지면서  GBC 대상이 되었다.
	}

}
