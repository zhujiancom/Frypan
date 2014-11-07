/**
 * 
 */
package com.zj.frypan.actions.backend;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Value;
import org.zj.framework.web.struts2.actions.UploadAction;

/**
 * @Description
 * @author zj
 * @Date 2014年11月7日
 *	
 */
public class MainAction extends UploadAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3522866312476328060L;

	@Value("#{envConfig['image.home.ad.path']}")
	private String uploadDir;

	//	@Action("/ad/rotator") url只要有多层结构的话，不管url是不是全局限定名，namespace都是/，即有action annotation 决定
	@Action("rotator")  //如果url不是全局限定名，则namespace 是由java package 的层级决定的。如果是全局限定名，则namespace由action annotation 决定
	public void uploadImg(){
		upload();
	}
	/**
	 * @Function
	 * @return
	 * @author zj
	 * @Date 2014年11月7日
	 */
	@Override
	protected String getDestinationPath(){
		return uploadDir;
	}
}
