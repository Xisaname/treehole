/**
 * 
 */
package com.hpe.dao;

import com.hpe.pojo.Users;

/** 
 * 类描述：
 * 作者：fanxindong
 * 创建日期：2019年9月4日
 * 修改人：
 * 修改日期：
 * 修改内容：
 * 版本号： 1.0.0   
 */
public interface IUsersDao {
	/**
	 * 
	 * 方法描述：查询用户登陆
	 * @param name
	 * @param pwd
	 * @return 在数据库中找到的users
	 */
	Users login(String name,String pwd);
	/**
	 * 
	 * 方法描述：用户注册
	 * @param users
	 * @return
	 */
	int reg(Users users);
}
