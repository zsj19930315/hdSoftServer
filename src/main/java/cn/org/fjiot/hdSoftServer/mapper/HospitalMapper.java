/**   
* @Title: HospitalMapper.java 
* @Package cn.org.fjiot.hdSoftServer.mapper 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午4:26:42 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.mapper;

import java.util.List;

import cn.org.fjiot.hdSoftServer.entity.Hospital;
import cn.org.fjiot.hdSoftServer.framework.BaseMapper;

/** 
* @ClassName: HospitalMapper 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午4:26:42 
*  
*/
public interface HospitalMapper extends BaseMapper {
	
	public void addHospital(Hospital hospital);
	
	public List<Hospital> listHospital();

}
