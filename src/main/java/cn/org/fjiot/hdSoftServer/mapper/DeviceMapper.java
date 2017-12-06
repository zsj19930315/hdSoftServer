/**   
* @Title: DeviceMapper.java 
* @Package cn.org.fjiot.hdSoftServer.mapper 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:39:32 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.mapper;

import java.util.List;

import cn.org.fjiot.hdSoftServer.entity.Device;
import cn.org.fjiot.hdSoftServer.entity.other.DeviceInfo;
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

	public void update(Device device);

//	public void delete(@Param("deviceNo")String deviceNo, @Param("userId")String userId);

	public List<Device> selectListByUserId(String userId);
	
	public List<DeviceInfo> selectInfoListByUserId(String userId);

}
