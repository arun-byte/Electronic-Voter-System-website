package com.evs.controller;	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.evs.bean.ResultBean;
	import com.evs.dao.ResultDao;


	@Controller
	public class ResultController {
		
		 @Autowired  
		 ResultDao dao;
		 
		 
	
		    /* It provides list of employees in model object */    
		    @RequestMapping("/viewResult")    
		    public String viewResultBean(Model m){    
		        List<ResultBean> list=dao.getResultBean();    
		        m.addAttribute("list",list);  
		        return "viewResult";    
		    }    
		 
		    
		    

	}







