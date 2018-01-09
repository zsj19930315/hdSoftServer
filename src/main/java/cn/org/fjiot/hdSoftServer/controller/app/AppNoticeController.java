/**   
 * @Title: AppNoticeController.java 
 * @Package cn.org.fjiot.hdSoftServer.controller.app 
 * @Description: TODO
 * @author zhengshaojian fjiot   
 * @date 2018年1月5日 上午8:34:40 
 * @version V1.0   
 */
package cn.org.fjiot.hdSoftServer.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.org.fjiot.hdSoftServer.cache.UserSession;
import cn.org.fjiot.hdSoftServer.cache.UserSessionUtil;
import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.service.NoticeService;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
 * @ClassName: AppNoticeController 
 * @Description: TODO
 * @author zhengshaojian fjiot 
 * @date 2018年1月5日 上午8:34:40 
 *  
 */
@RestController
@RequestMapping("/app/notice")
public class AppNoticeController {
	
	@Autowired
	NoticeService noticeService;
	
	@RequestMapping(value="/list")
	public AjaxResult list(String token) {
		UserSession userSession = UserSessionUtil.getUserSession(token);
		User user = (User) userSession.getAttribute("user");
		return noticeService.list(user);
	}
	
	@RequestMapping(value="/add")
	public AjaxResult add(String token, String title, String content) {
		UserSession userSession = UserSessionUtil.getUserSession(token);
		User user = (User) userSession.getAttribute("user");
		AjaxResult result = noticeService.add(user, title, content);
		return result;
	}
	
	@RequestMapping(value="/info")
	public AjaxResult info() {
		return null;
	}

}
