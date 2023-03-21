package com.exam.util.login;

import java.util.UUID;

public class JWTFunctionalInterfaceImplementation {

	public String getToken(String username, String password) {
		JWTFunctionalInterface jwt = (u, p) -> {
			return UUID.randomUUID().toString();
		};
		String recveToen = jwt.getJWTToken(username, password);
		return recveToen;
	}

	public static void main(String args[]) {

		JWTFunctionalInterfaceImplementation jwt = new JWTFunctionalInterfaceImplementation();
		String recveToen = jwt.getToken("a", "v");
		System.out.println(recveToen);
	}
}
