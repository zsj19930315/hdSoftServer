/**   
* @Title: HospitalTest.java 
* @Package hdSoftServer.mapper 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月1日 下午2:22:38 
* @version V1.0   
*/
package hdSoftServer.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.org.fjiot.hdSoftServer.entity.Hospital;
import cn.org.fjiot.hdSoftServer.mapper.HospitalMapper;

/** 
* @ClassName: HospitalTest 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月1日 下午2:22:38 
*  
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class HospitalTest {
	
	@Autowired
	HospitalMapper hospitalMapper;
	
	@Test
	public void selectOne() {
		String id = "1";
		String enable = "1";
		Hospital hospital = hospitalMapper.selectOne(id, enable);
		System.out.println(hospital);
	}

}
