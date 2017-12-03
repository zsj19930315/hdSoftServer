/**   
* @Title: UserServiceImpl.java 
* @Package cn.org.fjiot.hdSoftServer.service.impl 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:50:23 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.org.fjiot.hdSoftServer.cache.UserSession;
import cn.org.fjiot.hdSoftServer.cache.UserSessionUtil;
import cn.org.fjiot.hdSoftServer.entity.Hospital;
import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.mapper.HospitalMapper;
import cn.org.fjiot.hdSoftServer.mapper.UserMapper;
import cn.org.fjiot.hdSoftServer.service.UserService;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;
import cn.org.fjiot.hdSoftServer.util.Util;

/** 
* @ClassName: UserServiceImpl 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:50:23 
*  
*/
@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	HospitalMapper hospitalMapper;

	@Override
	public AjaxResult login(User user) {
		String code = "0";
		String message = "";
		if (null == user || null == user.getName() || null == user.getPassword()) {
			message = "请输入用户信息";
			return new AjaxResult(code, message);
		}
		user = userMapper.selectOne(user.getName(), user.getPassword());
		if (null == user) {
			message = "账号密码错误";
			return new AjaxResult(code, message);
		}
		Hospital hospital = hospitalMapper.selectOne(user.getHospitalId(), "1");
		if (null == hospital) {
			message = "该医院权限未开放，请联系管理员";
			return new AjaxResult(code, message);
		}
		code = "1";
		String token = Util.getToken();
		UserSession userSession = UserSessionUtil.getUserSession(token);
		userSession.setAttribute("token", token);
		userSession.setAttribute("user", user);
		userSession.setAttribute("hospital", hospital);
		message = "登录成功";
		return new AjaxResult(code, message, token);
	}

	@Override
	public AjaxResult logout(String token) {
		UserSession userSession = UserSessionUtil.getUserSession(token);
		userSession.removeAllAttribute();
		UserSessionUtil.removeUserSession(token);
		return new AjaxResult("1", "登出成功");
	}

	@Override
	public void testAop() {
		LOGGER.error("testAop");
	}

	@Override
	public void testAop1() {
		LOGGER.error("testAop1");
	}

	@Override
	public void testAop1(String test) {
		LOGGER.error("testAop1"+test);
	}

	@Override
	public void testAop1(String test, String test1) {
		LOGGER.error("testAop1"+test+test1);
	}

}
