/**   
* @Title: Util.java 
* @Package cn.org.fjiot.hdSoftServer.util 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月1日 上午11:28:24 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/** 
* @ClassName: Util 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月1日 上午11:28:24 
*  
*/
public class Util {
	
	public static String getToken() {
		String time = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		String uuid = UUID.randomUUID().toString().replace("-", "").substring(28);
		String token = "NO" + time + uuid;
		return token;
	}
	
	public static boolean isEqual(String a, String b) {
		if (null != a && null != b) {
			return a.equals(b);
		} else if (null == a && null == b) {
			return true;
		}
		return false;
	}

}
