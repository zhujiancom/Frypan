/**
 * 
 */
package org.zj.framework.tools.i18n;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.zj.framework.core.constants.ArrayConstants;

/**
 * @Description
 * @author zj
 * @Date 2014年8月11日
 *	
 */
public class PathMatchingBundleMessageSource extends ResourceBundleMessageSource{
	private ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();

	private String[] messageResourceFiles = ArrayConstants.EMPTY_STRING_ARRAY;
	public PathMatchingBundleMessageSource(String[] messageResourceFiles){
		super();
		this.messageResourceFiles = messageResourceFiles;
	}

}
