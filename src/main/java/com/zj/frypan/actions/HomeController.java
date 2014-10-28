/**
 * 
 */
package com.zj.frypan.actions;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.zj.framework.web.struts2.actions.BaseAction;

/**
 * @Description
 * @author zj
 * @Date 2014年10月24日
 *	
 */
@Results(@Result(name="success",type="redirectAction",params = {"actionName" , "home"}))
public class HomeController extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5078579438996837426L;

	private int id;

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	// 处理不带 id 参数的 GET 请求
	// 进入首页
	public HttpHeaders index()
	{
		return new DefaultHttpHeaders("index").disableCaching();
	}
}
