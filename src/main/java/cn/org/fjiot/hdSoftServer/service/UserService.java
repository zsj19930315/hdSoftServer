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
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
* @ClassName: UserService 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:50:15 
*  
*/
public interface UserService {

	public AjaxResult login(User user);

	public AjaxResult logout(String token);
	
	//测试用，后期删掉
	public void testAop();

	public void testAop1();

	public void testAop1(String test);

	public void testAop1(String test, String test1);
	//测试到此为止

	public AjaxResult info(String token);

}
