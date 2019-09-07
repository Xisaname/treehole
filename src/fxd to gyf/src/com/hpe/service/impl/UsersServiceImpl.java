/**
 * 
 */
package com.hpe.service.impl;

import com.hpe.dao.IUsersDao;
import com.hpe.dao.impl.UsersDaoImpl;
import com.hpe.pojo.Users;
import com.hpe.service.IUserService;

/** 
 * 类描述：
 * 作者：fanxindong
 * 创建日期：2019年9月4日
 * 修改人：
 * 修改日期：
 * 修改内容：
 * 版本号： 1.0.0   
 */
public class UsersServiceImpl implements IUserService {
	
	private IUsersDao usersDao=new UsersDaoImpl();
	public Users login(String name, String pwd) {
		
		return usersDao.login(name, pwd);
	}

}
