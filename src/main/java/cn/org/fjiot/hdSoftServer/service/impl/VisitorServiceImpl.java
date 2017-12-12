/**   
* @Title: VisitorServiceImpl.java 
* @Package cn.org.fjiot.hdSoftServer.service.impl 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:50:45 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.org.fjiot.hdSoftServer.cache.UserSession;
import cn.org.fjiot.hdSoftServer.cache.UserSessionUtil;
import cn.org.fjiot.hdSoftServer.entity.Visitor;
import cn.org.fjiot.hdSoftServer.entity.other.DeviceInfo;
import cn.org.fjiot.hdSoftServer.mapper.VisitorMapper;
import cn.org.fjiot.hdSoftServer.service.DeviceService;
import cn.org.fjiot.hdSoftServer.service.VisitorService;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;
import cn.org.fjiot.hdSoftServer.util.Util;

/** 
* @ClassName: VisitorServiceImpl 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:50:45 
*  
*/
@Service
public class VisitorServiceImpl implements VisitorService {
	
	@Autowired
	VisitorMapper visitorMapper;
	
	@Autowired
	DeviceService deviceService;

	@Override
	public AjaxResult login(Visitor visitor) {
		String code = "0";
		String message = "";
		if (null == visitor || null == visitor.getTag()) {
			message = "请输入相关信息";
			return new AjaxResult(code, message);
		}
		Visitor exitVisitor = visitorMapper.selectOne(visitor.getTag());
		if (null == exitVisitor) {
			visitorMapper.add(visitor);
		} else {
			visitor = exitVisitor;
		}
		code = "1";
		message = "登录成功";
		String token = Util.getToken();
		UserSession userSession = UserSessionUtil.getUserSession(token);
		userSession.setAttribute("token", token);
		userSession.setAttribute("visitor", visitor);
		return new AjaxResult(code, message, token);
	}

	@Override
	public AjaxResult device(String token, String deviceNo) {
		String code = "0";
		String message = "";
		if (null == deviceNo) {
			message = "请输入相关信息";
			return new AjaxResult(code, message);
		}
		DeviceInfo deviceInfo = deviceService.selectInfoOne(deviceNo);
		if (null == deviceInfo) {
			message = "数据库未找到该设备，请联系管理员";
			return new AjaxResult(code, message);
		}
		code = "1";
		message = "请求成功";
		UserSession userSession = UserSessionUtil.getUserSession(token);
		Visitor visitor = (Visitor) userSession.getAttribute("visitor");
		visitor.setDeviceNo(deviceNo);
		visitorMapper.update(visitor);
		userSession.setAttribute("visitor", visitor);
		userSession.setAttribute("deviceInfo", deviceInfo);
		return new AjaxResult(code, message, deviceInfo);
	}

	@Override
	public AjaxResult logout(String token) {
		UserSessionUtil.removeUserSession(token);
		return new AjaxResult("1", "登出成功");
	}

}
