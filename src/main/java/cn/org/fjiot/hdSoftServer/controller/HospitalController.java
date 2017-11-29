/**   
* @Title: HospitalController.java 
* @Package cn.org.fjiot.hdSoftServer.controller 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:01:54 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.org.fjiot.hdSoftServer.entity.Hospital;
import cn.org.fjiot.hdSoftServer.framework.BaseControllerImpl;
import cn.org.fjiot.hdSoftServer.service.HospitalService;

/** 
* @ClassName: HospitalController 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:01:54 
*  
*/
@Controller
@RequestMapping("/hospital")
public class HospitalController extends BaseControllerImpl {
	
	@Autowired
	HospitalService hospitalService;
	
	@RequestMapping(value="/addHospital")
	public void addHospital(Hospital hospital) {
		hospitalService.addHospital(hospital);
	}
	
	@ResponseBody
	@RequestMapping(value="/listHospital")
	public List<Hospital> listHospital() {
		return hospitalService.listHospital();
	}

}
