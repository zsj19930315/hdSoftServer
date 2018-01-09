/**   
* @Title: NoticeService.java 
* @Package cn.org.fjiot.hdSoftServer.service 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:49:29 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service;

import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
* @ClassName: NoticeService 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:49:29 
*  
*/
public interface NoticeService {

	/** 
	* @Title: add 
	* @Description: TODO
	* @param @param user
	* @param @param title
	* @param @param content
	* @param @return    设定文件 
	* @return AjaxResult    返回类型 
	* @throws 
	*/
	public AjaxResult add(User user, String title, String content);

	/** 
	* @Title: list 
	* @Description: TODO
	* @param @param user
	* @param @return    设定文件 
	* @return AjaxResult    返回类型 
	* @throws 
	*/
	public AjaxResult list(User user);

}
