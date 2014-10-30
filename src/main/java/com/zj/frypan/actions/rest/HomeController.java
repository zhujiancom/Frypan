/**
 * 
 */
package com.zj.frypan.actions.rest;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.zj.framework.web.struts2.actions.RestAction;

/**
 * @Description
 * @author zj
 * @Date 2014年10月30日
 *	
 */
public class HomeController extends RestAction{

	public HttpHeaders index(){
		return new DefaultHttpHeaders("index.jsp").disableCaching();
	}
}
