/**
 * 
 */
package com.zj.frypan.web.struts2.actions.frontend.restful;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.zj.framework.web.struts2.actions.BaseAction;

/**
 * @Description
 * @author zj
 * @Date 2014年10月24日
 *	
 */
@Results(@Result(name="success",type="redirectAction"))
public class HomeAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5078579438996837426L;

	public String init() throws Exception{
		return SUCCESS;
	}

}
