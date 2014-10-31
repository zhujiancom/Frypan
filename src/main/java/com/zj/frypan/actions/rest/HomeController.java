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

	/**
	 * 
	 */
	private static final long serialVersionUID = -653799723469902249L;

	public HttpHeaders index(){
		return new DefaultHttpHeaders("home").disableCaching();
	}

	/**
	 * @Function
	 * @return
	 * @author zj
	 * @Date 2014年10月31日
	 */
	@Override
	public Object getModel(){
		return null;
	}
}
