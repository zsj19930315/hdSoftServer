/**   
* @Title: UserController.java 
* @Package cn.org.fjiot.hdSoftServer.controller 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:53:34 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.framework.BaseControllerImpl;
import cn.org.fjiot.hdSoftServer.service.UserService;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

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
	
	@Autowired
	UserService userService;
	
	@ResponseBody
	@RequestMapping("/login")
	public AjaxResult login(User user) {
		AjaxResult result = userService.login(user);
		return result;
	}

}
