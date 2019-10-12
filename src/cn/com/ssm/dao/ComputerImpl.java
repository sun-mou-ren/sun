package cn.com.ssm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import cn.com.ssm.entity.Computer;
/**
 * 
 * @remark
 * @author SN
 * @createTime 2019年10月9日
 * @version 1.0
 */
public class ComputerImpl implements ComputerDao{
	 private SqlSessionFactory sessionFactory;
		public SqlSessionFactory getSessionFactory() {
			return sessionFactory;
		}
		public void setSessionFactory(SqlSessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
		/**
		 * 查询
		 */
		public List<Computer> query() {
			 return this.sessionFactory.openSession().selectList("ComputerMapper.selectComputer");
		}
}
