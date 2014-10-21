/**
 * 
 */
package org.zj.framework.core.dao.impl;

import java.util.Date;
import javax.annotation.Resource;

import org.junit.Test;
import org.zj.framework.core.entity.SysUserEntity;
import org.zj.framework.tools.EncryptUtils;

import rootest.AbstractTest;

/**
 * @Description
 * @author zj
 * @Date 2014年10月13日
 *	
 */
public class BaseDAOImplTest extends AbstractTest{
	@Resource
	private DefaultHibernateDAOFacadeImpl<SysUserEntity, Long> userDAO;

	@Test
	public void testSave(){
		SysUserEntity user = new SysUserEntity();
		user.setName("zhujian12");
		user.setAccountNo("zhujiancom12");
		user.setLoginTime(new Date(System.currentTimeMillis()));
		user.setMobilephone("18502115372");
		user.setEmail("zhujiancomnet@163.com");
		user.setPassword(EncryptUtils.MD5("123456"));
		//		user.setName("张三");
		//		user.setAccountNo("zhangsan");
		//		user.setLoginTime(new Date(System.currentTimeMillis()));
		//		user.setMobilephone("12345678912");
		//		user.setEmail("zhangsan@163.com");
		//		user.setPassword(EncryptUtils.MD5("123456abc"));
		userDAO.save(user);
	}

	@Test
	public void testBatchSave(){
		SysUserEntity user1 = new SysUserEntity();
		user1.setName("zhujian2");
		user1.setAccountNo("zhujiancom2");
		user1.setLoginTime(new Date(System.currentTimeMillis()));
		user1.setMobilephone("18502115372");
		user1.setEmail("zhujiancomnet@163.com");
		user1.setPassword(EncryptUtils.MD5("123456"));

		SysUserEntity user2 = new SysUserEntity();
		user2.setName("张三2");
		user2.setAccountNo("zhangsan2");
		user2.setLoginTime(new Date(System.currentTimeMillis()));
		user2.setMobilephone("12345678912");
		user2.setEmail("zhangsan@163.com");
		user2.setPassword(EncryptUtils.MD5("123456abc"));

		SysUserEntity user3 = new SysUserEntity();
		user3.setName("张三2");
		user3.setAccountNo("zhangsan2");
		user3.setLoginTime(new Date(System.currentTimeMillis()));
		user3.setMobilephone("12345678912");
		user3.setEmail("zhangsan@163.com");
		user3.setPassword(EncryptUtils.MD5("123456abc"));

		SysUserEntity[] b = new SysUserEntity[3];
		b[0] = user1;
		b[1] = user2;
		b[2] = user3;
		userDAO.save(b);
	}

	//	@Test
	//	public void testBatchUpdate(){
	//		SysUserEntity user1 = userDAO.get(12L);
	//		user1.setName("zhujian12");
	//		user1.setAccountNo("zhujiancom12");
	//
	//		SysUserEntity user2 = userDAO.get(13L);
	//		user2.setName("张三13");
	//		user2.setAccountNo("zhangsan13");
	//
	//		SysUserEntity[] b = new SysUserEntity[2];
	//		b[0] = user1;
	//		b[1] = user2;
	//		userDAO.update(b);
	//	}
	//
	//	@Test
	//	public void testGet(){
	//		SysUserEntity user = userDAO.get(2L);
	//		Assert.assertEquals("zhujiancom",user.getAccountNo());
	//		Assert.assertEquals(EncryptUtils.MD5("123456"),user.getPassword());
	//	}
	//
	//	@Test
	//	public void testUpdate(){
	//		SysUserEntity user = userDAO.get(1L);
	//		user.setCreator(1L);
	//		user.setCreateTime(new Date(System.currentTimeMillis()));
	//		user.setModifier(1L);
	//		user.setModifyTime(new Date(System.currentTimeMillis()));
	//		userDAO.update(user);
	//	}
	//
	//	@Test
	//	public void testGetAll(){
	//		List<SysUserEntity> users = userDAO.getAll(SysUserEntity.class);
	//		System.out.println(users);
	//	}
	//
	//	@Test
	//	public void testDelete(){
	//		userDAO.delete(12L);
	//		Assert.assertNull(userDAO.get(12L));
	//	}
}
