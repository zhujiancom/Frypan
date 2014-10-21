/**
 * 
 */
package rootest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @Description
 * @author zj
 * @Date 2014年10月13日
 *	
 */
@ContextConfiguration({"classpath:spring/frypan-DAO.xml","classpath:spring/frypan-COMMON.xml"})
public class AbstractTest extends AbstractJUnit4SpringContextTests{
}
