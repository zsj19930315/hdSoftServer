/**   
* @Title: UserTest.java 
* @Package hdSoftServer.mapper 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月1日 上午11:49:50 
* @version V1.0   
*/
package hdSoftServer.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;

/** 
* @ClassName: UserTest 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月1日 上午11:49:50 
*  
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void add() {
		User user = new User();
		user.setName("zsj");
		user.setPassword("zsj");
		userMapper.add(user);
	}
	
	@Test
	public void selectOne() {
		User user = new User();
		user.setName("lishumei");
		user.setPassword("123456");
		user = userMapper.selectOne(user.getName(), user.getPassword());
		System.out.println(user);
	}

}
