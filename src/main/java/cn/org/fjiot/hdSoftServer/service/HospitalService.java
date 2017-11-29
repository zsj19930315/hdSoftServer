/**   
* @Title: HospitalService.java 
* @Package cn.org.fjiot.hdSoftServer.service 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午4:47:41 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service;

import java.util.List;

import cn.org.fjiot.hdSoftServer.entity.Hospital;
import cn.org.fjiot.hdSoftServer.framework.BaseService;

/** 
* @ClassName: HospitalService 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午4:47:41 
*  
*/
public interface HospitalService extends BaseService {
	
	public void addHospital(Hospital hospital);
	
	public List<Hospital> listHospital();

}
