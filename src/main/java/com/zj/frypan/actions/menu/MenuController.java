/**
 * 
 */
package com.zj.frypan.actions.menu;

import org.zj.framework.web.struts2.actions.Struts2DefaultAction;

/**
 * @Description
 * @author zj
 * @Date 2014年10月31日
 *	
 */
public class MenuController extends Struts2DefaultAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7676621562994816516L;

	@Override
	public String execute(){
		return "menu";
	}

}
