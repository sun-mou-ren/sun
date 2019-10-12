package cn.com.ssm.service;

import java.util.List;

import cn.com.ssm.entity.Computer;
/**
 * 
 * @remark
 * @author SN
 * @createTime 2019年10月9日
 * @version 1.0
 */
public interface ComputerService {
	/**
	 * 查询所有
	 * @return
	 */
	public List<Computer> query();
}
