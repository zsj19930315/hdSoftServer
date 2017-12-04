/**   
* @Title: DeviceServiceImpl.java 
* @Package cn.org.fjiot.hdSoftServer.service.impl 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:48:25 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.org.fjiot.hdSoftServer.entity.Device;
import cn.org.fjiot.hdSoftServer.mapper.DeviceMapper;
import cn.org.fjiot.hdSoftServer.service.DeviceService;

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

	@Override
	public Device selectOne(String deviceNo) {
		return deviceMapper.selectOne(deviceNo);
	}

}
