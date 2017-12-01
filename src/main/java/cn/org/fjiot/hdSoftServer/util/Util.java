/**   
* @Title: Util.java 
* @Package cn.org.fjiot.hdSoftServer.util 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月1日 上午11:28:24 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.util;

/** 
* @ClassName: Util 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月1日 上午11:28:24 
*  
*/
public class Util {
	
	public static boolean isEqual(String a, String b) {
		if (null != a && null != b) {
			return a.equals(b);
		} else if (null == a && null == b) {
			return true;
		}
		return false;
	}

}
