/**   
* @Title: VisitorMapper.java 
* @Package cn.org.fjiot.hdSoftServer.mapper 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:40:34 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.mapper;

import cn.org.fjiot.hdSoftServer.entity.Visitor;
import cn.org.fjiot.hdSoftServer.framework.BaseMapper;

/** 
* @ClassName: VisitorMapper 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:40:34 
*  
*/
public interface VisitorMapper extends BaseMapper {
	
	public void add(Visitor visitor);
	
	public void update(Visitor visitor);

	public Visitor selectOne(String tag);

}
