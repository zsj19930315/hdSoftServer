/**   
* @Title: DepartmentService.java 
* @Package cn.org.fjiot.hdSoftServer.service 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:47:48 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service;

import org.springframework.stereotype.Service;

import cn.org.fjiot.hdSoftServer.entity.Department;

/** 
* @ClassName: DepartmentService 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:47:48 
*  
*/
@Service
public interface DepartmentService {

	/** 
	* @Title: selectOneById 
	* @Description: TODO
	* @param @param departmentId
	* @param @return    设定文件 
	* @return Department    返回类型 
	* @throws 
	*/
	Department selectOne(String id);

}
