package com.ufc.fm.view;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractCachingViewResolver;

/**
 * 
* @ClassName: JsonViewResolver  
* @Description: TODO 
* @author: disp  
* @date 2015-9-28 上午10:49:46  
* @version 1.0  
*
 */

public class JsonViewResolver extends AbstractCachingViewResolver {

	private String jsonSuffix;// 后缀
	private JsonView jsonView;
	private boolean formatPrint;

	@Override
	protected View loadView(String viewName, Locale locale) throws Exception {
		JsonView view = null;
		if (viewName.endsWith(this.getJsonSuffix())) {
			view = this.getJsonView();
			view.setFormatPrint(isFormatPrint());
			
		}
		return view;
	}

	public String getJsonSuffix() {
		return jsonSuffix;
	}

	public void setJsonSuffix(String jsonSuffix) {
		this.jsonSuffix = jsonSuffix;
	}

	public JsonView getJsonView() {
		return jsonView;
	}

	public void setJsonView(JsonView jsonView) {
		this.jsonView = jsonView;
	}

	public boolean isFormatPrint() {
		return formatPrint;
	}

	public void setFormatPrint(boolean formatPrint) {
		this.formatPrint = formatPrint;
	}	

}
