/**   
* @Title: UserController.java 
* @Package cn.org.fjiot.hdSoftServer.controller 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:53:34 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.framework.BaseControllerImpl;

/** 
* @ClassName: UserController 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:53:34 
*  
*/
@Controller
@RequestMapping("/user")
public class UserController extends BaseControllerImpl {
	
	@RequestMapping("/login")
	public void login(User user) {
		
	}

}
