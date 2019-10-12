package cn.com.ssm.service;

import java.util.List;

import cn.com.ssm.dao.ComputerDao;
import cn.com.ssm.entity.Computer;
/**
 * 
 * @remark
 * @author SN
 * @createTime 2019年10月9日
 * @version 1.0
 */
public class ComputerServiceImpl implements ComputerService{
	private ComputerDao computerDao;
	public ComputerDao getComputerDao() {
		return computerDao;
	}
	public void setComputerDao(ComputerDao computerDao) {
		this.computerDao = computerDao;
	}
	@Override
	public List<Computer> query() {
		return computerDao.query();
	}

}
