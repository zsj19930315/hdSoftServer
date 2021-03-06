/**   
* @Title: DeviceServiceImpl.java 
* @Package cn.org.fjiot.hdSoftServer.service.impl 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:48:25 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.org.fjiot.hdSoftServer.cache.UserSession;
import cn.org.fjiot.hdSoftServer.cache.UserSessionUtil;
import cn.org.fjiot.hdSoftServer.entity.Device;
import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.entity.other.DeviceInfo;
import cn.org.fjiot.hdSoftServer.mapper.DeviceMapper;
import cn.org.fjiot.hdSoftServer.service.DeviceService;
import cn.org.fjiot.hdSoftServer.service.UserService;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
* @ClassName: DeviceServiceImpl 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:48:25 
*  
*/
@Service
public class DeviceServiceImpl implements DeviceService {
	
	@Autowired
	DeviceMapper deviceMapper;
	
	@Autowired
	UserService userService;

	@Override
	public Device selectOne(String deviceNo) {
		return deviceMapper.selectOne(deviceNo);
	}

	@Override
	public AjaxResult associat(String token, String deviceNo) {
		String code = "0";
		String message = "";
		if (null == deviceNo) {
			message = "请输入相关信息";
			return new AjaxResult(code, message);
		}
		UserSession userSession = UserSessionUtil.getUserSession(token);
		User user = (User) userSession.getAttribute("user");
		Device device = deviceMapper.selectOne(deviceNo);
		if (null == device) {
			message = "数据库未找到该设备:"+deviceNo+"，请联系管理员";
			return new AjaxResult(code, message);
		}
		String userId = device.getUserId();
		if (null != userId) {
			String nickName = userService.selectOne(userId).getNickname();
			message = "该设备已被"+nickName+"绑定";
			return new AjaxResult(code, message);
		}
		code = "1";
		message = "绑定成功";
		device.setUserId(user.getId());
		deviceMapper.update(device);
		return new AjaxResult(code, message);
	}

	@Override
	public AjaxResult unAssociat(String token, String deviceNo) {
		String code = "0";
		String message = "";
		if (null == deviceNo) {
			message = "请输入相关信息";
			return new AjaxResult(code, message);
		}
		Device device = deviceMapper.selectOne(deviceNo);
		if (null == device) {
			message = "数据库未找到该设备，请联系管理员";
			return new AjaxResult(code, message);
		}
		code = "1";
		message = "请求成功";
		device.setUserId(null);
		deviceMapper.update(device);
		return new AjaxResult(code, message);
	}

	@Override
	public AjaxResult list(String token) {
		UserSession userSession = UserSessionUtil.getUserSession(token);
		User user = (User) userSession.getAttribute("user");
		List<DeviceInfo> deviceInfos = deviceMapper.selectInfoListByUserId(user.getId());
		return new AjaxResult("1", "请求成功", deviceInfos);
	}

	@Override
	public AjaxResult edit(String token, String deviceNo, String roomBed) {
		String code = "0";
		String message = "";
		if (null == deviceNo) {
			message = "请输入相关信息";
			return new AjaxResult(code, message);
		}
		Device device = deviceMapper.selectOne(deviceNo);
		if (null == device) {
			message = "数据库未找到该设备，请联系管理员";
			return new AjaxResult(code, message);
		}
		code = "1";
		message = "请求成功";
		device.setRoomBed(roomBed);
		deviceMapper.update(device);
		return new AjaxResult(code, message);
	}

	@Override
	public DeviceInfo selectInfoOne(String deviceNo) {
		return deviceMapper.selectInfoOne(deviceNo);
	}

	@Override
	public List<Device> listDevice(String userId) {
		return deviceMapper.selectListByUserId(userId);
	}

}
