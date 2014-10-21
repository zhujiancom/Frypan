/**
 * 
 */
package org.zj.framework.core.dao.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.junit.Test;
import org.zj.framework.core.entity.SysUserEntity;
import org.zj.framework.tools.EncryptUtils;

import rootest.AbstractTest;

/**
 * @Description
 * @author zj
 * @Date 2014年10月17日
 *	
 */
public class DefaultHibernateDAOFacadeImplTest extends AbstractTest{
	@Resource
	private DefaultHibernateDAOFacadeImpl<SysUserEntity, Long> userDAO;

	@Test
	public void testSave(){
		SysUserEntity user = new SysUserEntity();
		user.setName("zhujian13");
		user.setAccountNo("zhujiancom13");
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
		user1.setName("zhujian13");
		user1.setAccountNo("zhujiancom13");
		user1.setLoginTime(new Date(System.currentTimeMillis()));
		user1.setMobilephone("18502115372");
		user1.setEmail("zhujiancomnet@163.com");
		user1.setPassword(EncryptUtils.MD5("123456"));

		SysUserEntity user2 = new SysUserEntity();
		user2.setName("张三13");
		user2.setAccountNo("zhangsan13");
		user2.setLoginTime(new Date(System.currentTimeMillis()));
		user2.setMobilephone("12345678912");
		user2.setEmail("zhangsan@163.com");
		user2.setPassword(EncryptUtils.MD5("123456abc"));

		SysUserEntity user3 = new SysUserEntity();
		user3.setName("张三14");
		user3.setAccountNo("zhangsan14");
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

	@Test
	public void testDelete(){
		userDAO.delete(17L);
	}

	@Test
	public void testBatchDelete(){
		SysUserEntity user1 = userDAO.get(3L);
		SysUserEntity user2 = userDAO.get(4L);
		SysUserEntity user3 = userDAO.get(5L);
		SysUserEntity user4 = userDAO.get(6L);
		userDAO.delete(new SysUserEntity[]{user1,user2,user3,user4});
	}

	@Test
	public void testGetAll(){
		List<SysUserEntity> users = userDAO.getAll();
		System.out.println(users.size());
	}

	@Test
	public void testQueryListBySQL(){
		String sql = "select count(1) from c_sys_user";
		List<Map<String,Object>> results = userDAO.queryListBySQL(sql);
		for(Map<String,Object> item:results){
			for(Iterator<Entry<String,Object>> it = item.entrySet().iterator();it.hasNext();){
				Entry<String,Object> entry = it.next();
				System.out.println(entry.getKey()+" : "+entry.getValue());

			}
		}
	}
}
