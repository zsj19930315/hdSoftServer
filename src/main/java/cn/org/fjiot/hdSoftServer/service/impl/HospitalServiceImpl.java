/**   
* @Title: HospitalServiceImpl.java 
* @Package cn.org.fjiot.hdSoftServer.service.impl 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午4:54:16 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.org.fjiot.hdSoftServer.entity.Hospital;
import cn.org.fjiot.hdSoftServer.framework.BaseMapperImpl;
import cn.org.fjiot.hdSoftServer.mapper.HospitalMapper;
import cn.org.fjiot.hdSoftServer.service.HospitalService;

/** 
* @ClassName: HospitalServiceImpl 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午4:54:16 
*  
*/
@Service
public class HospitalServiceImpl extends BaseMapperImpl implements HospitalService {
	
	@Autowired
	HospitalMapper hospitalMapper;

	@Override
	public void addHospital(Hospital hospital) {
		hospitalMapper.addHospital(hospital);
	}

	@Override
	public List<Hospital> listHospital() {
		return hospitalMapper.listHospital();
	}

}
