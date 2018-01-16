/**   
* @Title: NoticeServiceImpl.java 
* @Package cn.org.fjiot.hdSoftServer.service.impl 
* @Description: TODO
* @author zhengshaojian fjiot   
* @date 2017年11月28日 下午5:49:37 
* @version V1.0   
*/
package cn.org.fjiot.hdSoftServer.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.org.fjiot.hdSoftServer.entity.Notice;
import cn.org.fjiot.hdSoftServer.entity.User;
import cn.org.fjiot.hdSoftServer.mapper.NoticeMapper;
import cn.org.fjiot.hdSoftServer.service.NoticeService;
import cn.org.fjiot.hdSoftServer.util.AjaxResult;

/** 
* @ClassName: NoticeServiceImpl 
* @Description: TODO
* @author zhengshaojian fjiot 
* @date 2017年11月28日 下午5:49:37 
*  
*/
@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	NoticeMapper noticeMapper;

	public AjaxResult add(User user, String title, String content) {
		Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContent(content);
		notice.setDepartmentId(user.getDepartmentId());
		notice.setHospitalId(user.getHospitalId());
		notice.setIsTop("0");
		String time = new SimpleDateFormat("YYYY-MM-DD HH:MM:ss").format(new Date());
		notice.setTime(time);
		notice.setUserId(user.getId());
		notice.setName(user.getNickname());
		noticeMapper.add(notice);
		return new AjaxResult("1", "创建成功");
	}

	public AjaxResult list(User user) {
		List<Notice> notices = noticeMapper.list(user.getHospitalId(), user.getDepartmentId());
		return new AjaxResult("1", "请求成功", notices);
	}

}
