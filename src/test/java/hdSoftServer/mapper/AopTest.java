package hdSoftServer.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.org.fjiot.hdSoftServer.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
	
	@Autowired
	UserService userService;
	
	@Test
	public void test() {
		userService.testAop();
		userService.testAop1();
		userService.testAop1("hello");
		userService.testAop1("hello", "world");
	}

}
