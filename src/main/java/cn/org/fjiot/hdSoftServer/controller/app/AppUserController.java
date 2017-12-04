/**   
* @Title: AppUserLogin.java 
* @Package cn.org.fjiot.hdSoftServer.controller.app 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月1日 上午11:01:15 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.controller.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.service.UserService;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
* @ClassName: AppUserController 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月1日 上午11:01:15 
*  
*/
@RestController
@RequestMapping("/app/user")
public class AppUserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppUserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public AjaxResult login(User user) {
		AjaxResult result = userService.login(user);
		return result;
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public AjaxResult logout(String token) {
		AjaxResult result = userService.logout(token);
		return result;
	}

}
