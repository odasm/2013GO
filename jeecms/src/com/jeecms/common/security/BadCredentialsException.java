package com.jeecms.common.security;

/**
 * 认证信息错误异常。如：密码错误。
 * 
 * @author coco
 * 
 */
@SuppressWarnings("serial")
public class BadCredentialsException extends AuthenticationException {
	public BadCredentialsException() {
	}

	public BadCredentialsException(String msg) {
		super(msg);
	}
}