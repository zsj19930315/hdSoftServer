/**   
* @Title: NoticeMapper.java 
* @Package cn.org.fjiot.hdSoftServer.mapper 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:40:07 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.org.fjiot.hdSoftServer.entity.Notice;
import cn.org.fjiot.hdSoftServer.framework.BaseMapper;

/** 
* @ClassName: NoticeMapper 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:40:07 
*  
*/
public interface NoticeMapper extends BaseMapper {

	public void add(Notice notice);

	/**
	 * @return  
	* @Title: list 
	* @Description: TODO
	* @param @param hospitalId
	* @param @param departmentId    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public List<Notice> list(@Param("hospitalId")String hospitalId, @Param("departmentId")String departmentId);

}
