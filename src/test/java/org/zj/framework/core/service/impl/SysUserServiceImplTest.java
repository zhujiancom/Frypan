/**
 * 
 */
package org.zj.framework.core.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.zj.framework.core.dto.SysUserDTO;
import org.zj.framework.core.service.ISysUserService;

import rootest.AbstractTest;

/**
 * @Description
 * @author zj
 * @Date 2014年10月13日
 *	
 */
public class SysUserServiceImplTest extends AbstractTest{
	@Resource(name="SysUserServiceImpl")
	private ISysUserService userService;
	@Test
	public void testget(){
		SysUserDTO vo = userService.getSysUser(1L);
		System.out.println(vo.getName());
	}

	@Test
	public void testrwUpdatePassword(){
		userService.rwUpdatePassword(25L,"testtest");
	}

	@Test
	public void testrwRegisterAccount(){
		SysUserDTO user = new SysUserDTO();
		user.setAccountNo("Test");
		user.setName("测试账户");
		userService.rwRegisterAccount(user,"test");
	}

	@Test
	public void testrwUpdateAccount(){
		SysUserDTO dto = new SysUserDTO();
		dto.setUserId(1L);
		dto.setEmail("thefrypan2014pt@163.com");
		dto.setMobilephone("18502115372");
		userService.rwUpdateAccount(dto);
	}
}
