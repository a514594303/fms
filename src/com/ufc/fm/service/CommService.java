package com.ufc.fm.service;

import java.util.Map;

/**
 * 
* @ClassName: CommService  
* @Description: TODO 
* @author: disp  
* @date 2015-10-30 上午9:28:44  
* @version 1.0  
*
 */
public interface CommService extends BaseService {

	public Map<String, Object> getDictlist(String dictListName);
	
}
