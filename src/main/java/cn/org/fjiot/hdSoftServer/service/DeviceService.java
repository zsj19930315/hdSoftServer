/**   
* @Title: DeviceService.java 
* @Package cn.org.fjiot.hdSoftServer.service 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:48:15 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service;

import cn.org.fjiot.hdSoftServer.entity.Device;

/** 
* @ClassName: DeviceService 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:48:15 
*  
*/
public interface DeviceService {

	public Device selectOne(String deviceNo);

}
