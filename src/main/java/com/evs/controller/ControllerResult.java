package com.evs.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;

import com.evs.bean.ProfileBean;
import com.evs.bean.BeanResult;
import com.evs.bean.CredentialsBean;
import com.evs.bean.ElectionBean;
import com.evs.dao.DaoResult;
import com.evs.util.DbUtil;
import com.evs.util.User;


@Controller
public class ControllerResult {
	
	@Autowired
	private DbUtil db1;
	
	@Autowired
	DaoResult dao;
	

	
	 @RequestMapping("/VoteSuccess")    
	    public String showform(@ModelAttribute ("bn") BeanResult br){ 
		
	        return "VoteSuccess";   
	    }    
	       
	       
	 @RequestMapping(value="/adds2")    
	    public String save(@ModelAttribute("bn") BeanResult br){    
	        dao.save(br);    
	        return "success";    
	    }    

	
	        
	     
		   
		

	}

	
		

