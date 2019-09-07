/**
 * 
 */
package com.hpe.dao.impl;

import com.hpe.dao.IUsersDao;
import com.hpe.pojo.Users;
import com.hpe.util.DBUtil;

/** 
 * 类描述：
 * 作者：fanxindong
 * 创建日期：2019年9月4日
 * 修改人：
 * 修改日期：
 * 修改内容：
 * 版本号： 1.0.0   
 */
public class UsersDaoImpl implements IUsersDao {

	DBUtil dbutil=new DBUtil();
	public Users login(String name, String pwd) {
		String sql="select * from users where name=? and pwd=?";
		Object[] param={name,pwd};
		Users user=null;
		try {
			user = (Users) dbutil.getObject(Users.class, sql, param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	/* (non-Javadoc)
	 * @see com.hpe.dao.IUsersDao#reg(com.hpe.pojo.Users)
	 */
	@Override
	public int reg(Users users) {
		String sql="insert into users(name,pwd,realname,sex,age,card,address,phone,email,code)"
				+ " values(?,?,?,?,?,?,?,?,?,?)";
		Object[] param={users.getName(),users.getPwd(),users.getRealname(),users.getSex(),users.getAge(),users.getCard(),users.getAddress(),users.getPhone(),users.getEmail(),users.getCode()};
		int result=0;
		try {
			result = dbutil.execute(sql, param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	

}
