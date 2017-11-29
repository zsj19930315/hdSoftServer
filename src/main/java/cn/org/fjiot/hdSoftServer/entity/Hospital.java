/**   
* @Title: Hospital.java 
* @Package cn.org.fjiot.hdSoftServer.entity 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午3:44:58 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.entity;

import cn.org.fjiot.hdSoftServer.framework.BaseEntityImpl;

/** 
* @ClassName: Hospital 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午3:44:58 
*  
*/
public class Hospital extends BaseEntityImpl {
	
	private String id;
	
	private String name;
	
	private String enable;
	
	private String phone;
	
	private String address;
	
	private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
