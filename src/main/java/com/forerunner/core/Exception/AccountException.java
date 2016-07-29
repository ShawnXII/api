package com.forerunner.core.Exception;

import org.apache.commons.lang.StringUtils;
/**
 * 用户登录错误
 * @author Administrator
 */
public class AccountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 689769613496867395L;
	
	private ErrorType type;
	
	private String errorMsg;
	
	public AccountException(ErrorType type) {
		this(null,type,null);
	}

	public AccountException(Throwable t,ErrorType type,String msg) {		
		super(t);
		if(type!=null){
			this.type=type;
		}
		if(!StringUtils.isBlank(msg)){
			this.errorMsg=msg;
		}
	}
	
	public AccountException(ErrorType type,String msg){
		this(null,type,msg);
	}
	
	public ErrorType getType() {
		return type;
	}
	public void setType(ErrorType type) {
		this.type = type;
	}

	public String getErrorMsg() {
		if(StringUtils.isBlank(this.errorMsg)){
			if(this.type!=null){
				return type.getMessage();
			}
		}
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * AccountNonExpired
	 * isAccountNonLocked
	 * isCredentialsNonExpired
	 * isEnabled
	 * @author Administrator
	 *
	 */
	public enum ErrorType{
		/**
		 * 站好认证错误
		 */
		ACCOUNT_AUTH("03001","帐号认证错误"),
		/**
		 * 帐号已经删除
		 */
		ACCOUNT_DELETE("03002","帐号已经删除"),
		/**
		 * 帐号已经禁用
		 */
		ACCOUNT_ENABLEAD("03003","帐号被禁用"),
		/**
		 * 手机号码没通过验证
		 */
		ACCOUNT_VERIFIED_MOBILE("03004","手机没有验证"),
		/**
		 * 邮箱没通过验证
		 */
		ACCOUNT_VERIFIED_EMAIL("03005","邮箱没有验证"),
		/**
		 * 帐号已经过期(需要重新激活)
		 */
		ACCOUNT_NON_EXPIRED("03006","账户已经过期"),
		/**
		 * 帐号已经被锁定(安全机制,需要重新验证解锁)
		 */
		ACCOUNT_NON_LOCKED("03007","帐号已经锁定"),
		/**
		 * 凭证已经过期(设置过自动登录的才会有该错误)
		 */
		ACCOUNT_CREDENTIALS_NON_EXPIRED("03008","凭证已经过期");
		
		private String code;
		private String message;
		
		private ErrorType(String code,String message){
			this.code=code;
			this.message=message;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}		
		
	}

}
