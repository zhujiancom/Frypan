/**
 * 
 */
package com.zj.frypan.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Description
 * @author zj
 * @Date 2014年10月30日
 *	
 */
public class HelloWorld extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1866818612899249556L;
	private String message;

	public String getMessage() {
		return message;
	}

	@Override
	public String execute() {
		message = "Hello World!";
		return SUCCESS;
	}
}
