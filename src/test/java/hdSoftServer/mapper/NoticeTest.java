/**   
* @Title: NoticeTest.java 
* @Package hdSoftServer.mapper 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2018年1月5日 下午1:57:42 
* @version V1.0   
*/
package hdSoftServer.mapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cn.org.fjiot.hdSoftServer.controller.NoticeController;

/** 
* @ClassName: NoticeTest 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2018年1月5日 下午1:57:42 
*  
*/
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
public class NoticeTest {
	
//	private MockMvc mvc;
//	
//	@Before
//	public void setup() {
//		mvc = MockMvcBuilders.standaloneSetup(new NoticeController()).build();
//	}
//	
//	@Test
//    public void getHello() throws Exception {
//    mvc.perform(MockMvcRequestBuilders.get("/app/notice/add").accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();
//    }

}
