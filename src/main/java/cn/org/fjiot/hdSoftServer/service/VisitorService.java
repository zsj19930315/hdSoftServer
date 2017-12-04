/**   
* @Title: VisitorService.java 
* @Package cn.org.fjiot.hdSoftServer.service 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:50:37 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service;

import cn.org.fjiot.hdSoftServer.entity.Visitor;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
* @ClassName: VisitorService 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:50:37 
*  
*/
public interface VisitorService {

	public AjaxResult login(Visitor visitor);

	public AjaxResult device(String token, String deviceNo);

	public AjaxResult logout(String token);

}
