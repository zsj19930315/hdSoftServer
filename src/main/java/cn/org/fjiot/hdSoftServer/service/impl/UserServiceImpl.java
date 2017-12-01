/**   
* @Title: UserServiceImpl.java 
* @Package cn.org.fjiot.hdSoftServer.service.impl 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:50:23 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.org.fjiot.hdSoftServer.cache.UserSession;
import cn.org.fjiot.hdSoftServer.cache.UserSessionUtil;
import cn.org.fjiot.hdSoftServer.entity.Hospital;
import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.mapper.HospitalMapper;
import cn.org.fjiot.hdSoftServer.mapper.UserMapper;
import cn.org.fjiot.hdSoftServer.service.UserService;
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
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	HospitalMapper hospitalMapper;

	@Override
	public String login(User user) {
		if (null == user || null == user.getName() || null == user.getPassword()) {
			return "请输入用户信息";
		}
		user = userMapper.selectOne(user.getName(), user.getPassword());
		if (null == user) {
			return "账号密码错误";
		}
		Hospital hospital = hospitalMapper.selectOne(user.getHospitalId(), "1");
		if (null == hospital) {
			return "该医院权限未开放，请联系管理员";
		}
		String token = Util.getToken();
		UserSession userSession = UserSessionUtil.getUserSession(token);
		userSession.setAttribute("token", token);
		userSession.setAttribute("user", user);
		userSession.setAttribute("hospital", hospital);
		return "登录成功";
	}

}
