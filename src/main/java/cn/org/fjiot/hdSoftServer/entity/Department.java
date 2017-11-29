/**   
* @Title: Department.java 
* @Package cn.org.fjiot.hdSoftServer.entity 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:32:58 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.entity;

import cn.org.fjiot.hdSoftServer.framework.BaseEntityImpl;

/** 
* @ClassName: Department 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:32:58 
*  
*/
public class Department extends BaseEntityImpl {
	
	private String id;
	
	private String name;
	
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
