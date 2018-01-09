/**   
* @Title: DepartmentServiceImpl.java 
* @Package cn.org.fjiot.hdSoftServer.service.impl 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:48:01 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.org.fjiot.hdSoftServer.entity.Department;
import cn.org.fjiot.hdSoftServer.mapper.DepartmentMapper;
import cn.org.fjiot.hdSoftServer.service.DepartmentService;

/** 
* @ClassName: DepartmentServiceImpl 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:48:01 
*  
*/
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public Department selectOne(String id) {
		return departmentMapper.selectOne(id);
	}

}
