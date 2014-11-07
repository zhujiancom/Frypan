/**
 * 
 */
package org.zj.framework.tools.i18n;

import org.junit.Test;

import rootest.AbstractTest;

/**
 * @Description
 * @author zj
 * @Date 2014年11月4日
 *	
 */
public class MessageUtilsTest extends AbstractTest{
	@Test
	public void testGetMessage(){
		System.out.println(MessageUtils.getMessage("i18n.tips.success"));
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(MessageUtils.getMessage("i18n.tips.success"));
	}
}
