/**   
* @Title: UserInfo.java 
* @Package cn.org.fjiot.hdSoftServer.entity.other 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年12月6日 上午10:26:15 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.entity.other;

import cn.org.fjiot.hdSoftServer.entity.Department;
import cn.org.fjiot.hdSoftServer.framework.BaseEntityImpl;

/** 
* @ClassName: UserInfo 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年12月6日 上午10:26:15 
*  
*/
public class UserInfo extends BaseEntityImpl {
	
	private String id;

	private String name;

	private String password;

	private String nickname;

	private String sex;

	private String phone;

	private String email;

	private Department department;

	private String remark;

	private String hospitalId;

	private String permission;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
