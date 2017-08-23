package com.dudu;


public class LoginServiceImpl implements LoginServiceInterface {

	@Override
	public String hello(String username, String password) {
		return username + " logged in successfully!";
	}
}
