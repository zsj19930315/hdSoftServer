package cn.org.fjiot.hdSoftServer.entity;

import cn.org.fjiot.hdSoftServer.framework.BaseEntityImpl;

public class HospitalDepartment extends BaseEntityImpl {
	
	private String id;

	private String hospitalId;

	private String departmentId;

	private String departmentPhone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentPhone() {
		return departmentPhone;
	}

	public void setDepartmentPhone(String departmentPhone) {
		this.departmentPhone = departmentPhone;
	}

}
