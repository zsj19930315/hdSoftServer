/**   
* @Title: DeviceMapper.java 
* @Package cn.org.fjiot.hdSoftServer.mapper 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:39:32 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.mapper;

import cn.org.fjiot.hdSoftServer.entity.Device;
import cn.org.fjiot.hdSoftServer.framework.BaseMapper;

/** 
* @ClassName: DeviceMapper 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:39:32 
*  
*/
public interface DeviceMapper extends BaseMapper {

	public Device selectOne(String deviceNo);

}
