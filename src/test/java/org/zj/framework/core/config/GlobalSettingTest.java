/**
 * 
 */
package org.zj.framework.core.config;

import org.junit.Before;
import org.junit.Test;
import org.zj.framework.core.config.GlobalSettings;

/**
 * @Description
 * @author zj
 * @Date 2014年10月13日
 *	
 */
public class GlobalSettingTest{
	/**
	 * @Function
	 * @throws java.lang.Exception
	 * @author zj
	 * @Date 2014年8月5日
	 */
	@Before
	public void setUp() throws Exception{}

	@Test
	public void test(){
		GlobalSettings setting = GlobalSettings.getInstance();
		System.out.println(setting.isTimerEnabled());
		try {
			Thread.sleep(10000);
			System.out.println(setting.isTimerEnabled());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testGetLocale(){
		GlobalSettings setting = GlobalSettings.getInstance();
		System.out.println(setting.getDefaultLocale());
	}

	@Test
	public void testGetReloadInterval(){
		GlobalSettings setting = GlobalSettings.getInstance();
		System.out.println(setting.getMessageReloadInterval());
	}

	@Test
	public void testPropertyResourcesNames(){
		GlobalSettings setting = GlobalSettings.getInstance();
		System.out.println(setting.getPropertyResourcesNames()[0]);
	}
}
