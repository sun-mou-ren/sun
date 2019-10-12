package cn.com.ssm.dao;

import java.util.List;

import cn.com.ssm.entity.Computer;
/**
 * 
 * @remark
 * @author SN
 * @createTime 2019年10月9日
 * @version 1.0
 */
public interface ComputerDao {
	/**
	 * 查询所有
	 * @return 
	 */
	public List<Computer> query();
}
