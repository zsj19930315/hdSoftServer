package cn.org.fjiot.hdSoftServer.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserAspect.class);
	
	@Around(value="execution(* cn.org.fjiot.hdSoftServer.service.UserService.testAop1(String,String))")
	public Object testAop(ProceedingJoinPoint joinPoint) throws Throwable {
		LOGGER.error("start log:"+joinPoint.getSignature().getName());
		Object object = joinPoint.proceed();
		LOGGER.error("end log:"+joinPoint.getSignature().getName());
		return object;
	}

}
