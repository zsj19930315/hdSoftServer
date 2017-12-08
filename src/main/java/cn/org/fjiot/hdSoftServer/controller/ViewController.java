/**   
* @Title: ViewController.java 
* @Package cn.org.fjiot.hdSoftServer.controller 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月7日 下午4:56:00 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.org.fjiot.hdSoftServer.framework.BaseControllerImpl;

/** 
* @ClassName: ViewController 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月7日 下午4:56:00 
*  
*/
@Controller()
@RequestMapping("/view")
public class ViewController extends BaseControllerImpl {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ViewController.class);
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(String token) {
		LOGGER.warn(token);
		return "index";
	}

}
