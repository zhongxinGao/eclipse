package com.bean;

public class CheckUser {
	protected User user;

	public CheckUser(User user) {
		super();
		this.user = user;
	}
	public boolean validate() {
		String name = user.getName();
		String password = user.getPassword();
		//实际应用中用查询数据库验证用户和密码
		if("zhang".equals(name) && "123".equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
