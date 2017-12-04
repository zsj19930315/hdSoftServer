/**   
* @Title: AppVisitorController.java 
* @Package cn.org.fjiot.hdSoftServer.controller.app 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月4日 上午10:25:41 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.org.fjiot.hdSoftServer.entity.Visitor;
import cn.org.fjiot.hdSoftServer.mapper.VisitorMapper;
import cn.org.fjiot.hdSoftServer.service.VisitorService;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
* @ClassName: AppVisitorController 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月4日 上午10:25:41 
*  
*/
@RestController
@RequestMapping("/app/visitor")
public class AppVisitorController {
	
	@Autowired
	VisitorService visitorService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public AjaxResult login(Visitor visitor) {
		AjaxResult result = visitorService.login(visitor);
		return result;
	}

	@RequestMapping(value="/device", method=RequestMethod.GET)
	public AjaxResult device(String token, String deviceNo) {
		AjaxResult result = visitorService.device(token, deviceNo);
		return result;
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public AjaxResult logout(String token) {
		AjaxResult result = visitorService.logout(token);
		return result;
	}

}
