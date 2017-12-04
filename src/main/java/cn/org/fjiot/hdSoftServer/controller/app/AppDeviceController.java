/**   
* @Title: AppDeviceController.java 
* @Package cn.org.fjiot.hdSoftServer.controller.app 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月4日 下午2:17:58 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.org.fjiot.hdSoftServer.service.DeviceService;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
* @ClassName: AppDeviceController 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月4日 下午2:17:58 
*  
*/
@RestController
@RequestMapping("/app/device")
public class AppDeviceController {
	
	@Autowired
	DeviceService deviceService;
	
	@RequestMapping(value="/associat", method=RequestMethod.GET)
	public AjaxResult associat(String token, String deviceNo) {
		AjaxResult result = deviceService.associat(token, deviceNo);
		return result;
	}
	
	@RequestMapping(value="/unAssociat", method=RequestMethod.GET)
	public AjaxResult unAssociat(String token, String deviceNo) {
		AjaxResult result = deviceService.unAssociat(token, deviceNo);
		return result;
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public AjaxResult list(String token) {
		AjaxResult result = deviceService.list(token);
		return result;
	}

}
