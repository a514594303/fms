package com.ufc.fm.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.springframework.web.servlet.view.AbstractView;



public class ChartView extends AbstractView {  
	  
    @Override  
    protected void renderMergedOutputModel(Map<String, Object> map,  
            HttpServletRequest request, HttpServletResponse response)  
            throws Exception {  
    	
    	//可以自定义类型
        JFreeChart chart=getChartBar(map);  

        //图片的输出  
        ChartUtilities.writeChartAsJPEG(response.getOutputStream(), chart, 200,200);  
    }  
    
    private JFreeChart getChartBar(Map<String, Object> map){  
    	
        JFreeChart chart = ChartFactory.createBarChart3D("产品销量图", "产品名称", "销量",  
                (CategoryDataset)map.get("CHARDATASET"), PlotOrientation.VERTICAL, true, true, false);  

        return chart;  
    }  
}  