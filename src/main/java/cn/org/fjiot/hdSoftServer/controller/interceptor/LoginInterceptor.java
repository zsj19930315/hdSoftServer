/**   
* @Title: LoginInterceptor.java 
* @Package cn.org.fjiot.hdSoftServer.controller.interceptor 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月1日 下午2:52:40 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.org.fjiot.hdSoftServer.cache.UserSessionUtil;

/** 
* @ClassName: LoginInterceptor 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月1日 下午2:52:40 
*  
*/
public class LoginInterceptor implements HandlerInterceptor {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		if (uri.indexOf("/app/user/login.do") >= 0) {
			return true;
		}
		String token = request.getParameter("token");
		if (null != token && UserSessionUtil.containUserSession(token)) {
			return true;
		}
		LOGGER.error("token过期");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}
	
	

}
