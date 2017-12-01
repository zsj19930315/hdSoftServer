/**   
* @Title: UserMapper.java 
* @Package cn.org.fjiot.hdSoftServer.mapper 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:40:25 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.mapper;

import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.framework.BaseMapper;

/** 
* @ClassName: UserMapper 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:40:25 
*  
*/
public interface UserMapper extends BaseMapper {

	public void add(User user);
	
	public User selectOne(User user);

}
