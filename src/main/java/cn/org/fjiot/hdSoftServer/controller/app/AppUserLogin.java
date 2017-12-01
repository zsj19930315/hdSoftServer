/**   
* @Title: AppUserLogin.java 
* @Package cn.org.fjiot.hdSoftServer.controller.app 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月1日 上午11:01:15 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.service.UserService;

/** 
* @ClassName: AppUserLogin 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月1日 上午11:01:15 
*  
*/
@RestController
@RequestMapping("/app/user")
public class AppUserLogin {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public Object login(User user) {
		userService.login(user);
		return null;
	}

}
