/**   
* @Title: UserService.java 
* @Package cn.org.fjiot.hdSoftServer.service 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:50:15 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service;

import cn.org.fjiot.hdSoftServer.entity.User;

/** 
* @ClassName: UserService 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:50:15 
*  
*/
public interface UserService {

	public Object login(User user);

}
