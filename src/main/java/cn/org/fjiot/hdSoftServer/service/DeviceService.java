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
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
* @ClassName: DeviceService 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:48:15 
*  
*/
public interface DeviceService {

	public Device selectOne(String deviceNo);

	public AjaxResult associat(String token, String deviceNo);

	public AjaxResult unAssociat(String token, String deviceNo);
	
	public AjaxResult list(String token);

	public AjaxResult edit(String token, String deviceNo, String roomBed);

}
