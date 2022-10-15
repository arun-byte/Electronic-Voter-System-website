package com.evs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.evs.bean.EElectionBean;
import com.evs.dao.EDaoVoter;

@Controller
public class EControllerVoter {
	
	 @Autowired  
	EDaoVoter dao;
	 
	  
	      
	   
	    /* It provides list of employees in model object */    
	    @RequestMapping("/ViewElection_Voter")    
	    public String viewShip(Model m){    
	        List<EElectionBean> list=dao.getEElectionBean();    
	        m.addAttribute("list",list);  
	        return "ViewElection_Voter";    
	    }    
	  

}




