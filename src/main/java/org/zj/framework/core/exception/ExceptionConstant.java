/**
 * 
 */
package org.zj.framework.core.exception;

/**
 * @Description
 * @author zj
 * @Date 2014年7月24日
 *	
 */
public class ExceptionConstant{
	public enum DAO{
		CREATE,UPDATE,DELETE,QUERY,SQL,BATCH_SAVE,BATCH_UPDATE,BATCH_DELETE,GETALL
	}

	public enum SERVICE{
		LOGIN,LOGOUT
	}

	public enum Tools{
		LOAD_GLOBAL_PROPERTIES,LOAD_MESSAGE_RESOURCE,LOAD_PROPERTIES_RESOURCE
	}

	public enum SQL{
		GENERATOR_SQL
	}
}
