/**
 * 
 */
package com.hpe.service;

import com.hpe.pojo.Users;

/** 
 * 类描述：用户service接口
 * 作者：fanxindong
 * 创建日期：2019年9月4日
 * 修改人：
 * 修改日期：
 * 修改内容：
 * 版本号： 1.0.0   
 */
public interface IUserService {
	
	/**
	 * 
	 * 方法描述：用户登录
	 * @param name
	 * @param pwd
	 * @return	用户信息
	 */
	Users login(String name,String pwd);
	
}
