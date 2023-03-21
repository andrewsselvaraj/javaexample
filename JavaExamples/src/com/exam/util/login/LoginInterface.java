package com.exam.util.login;

@FunctionalInterface
public interface LoginInterface {
    boolean login(String username, String password);
}