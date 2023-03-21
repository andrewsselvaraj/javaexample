package com.exam.util.login;

public class LoginLamdaExpression {
	boolean loginFunction(String username,String password)
	{
	LoginInterface loginInterface = (u,p)->{
		return true;
	};
	boolean flag = loginInterface.login(username, password);
	return flag;
	}
}
