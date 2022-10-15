package com.evs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.evs.bean.ElectionBean;
import com.evs.dao.ElectionDao;

@Controller
public class ElectionController {
	
	 @Autowired  
	ElectionDao dao;
	 
	 
	 @RequestMapping("/Electionform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new ElectionBean());  
	        return "Electionform";   
	    }    
	      
	    @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("election") ElectionBean Election){    
	        dao.save(Election);    
	        return "redirect:/viewElection";    
	    }    
	    /* It provides list of employees in model object */    
	    @RequestMapping("/viewElection")    
	    public String viewShip(Model m){    
	        List<ElectionBean> list=dao.getElectionBean();    
	        m.addAttribute("list",list);  
	        return "viewElection";    
	    }    
	      
	    @RequestMapping(value="/editElectionform/{ElectionId}")    
	    public String edit(@PathVariable String ElectionId, Model m){    
	        ElectionBean election =dao.getElectionBeanById(ElectionId);    
	        m.addAttribute("command",election);  
	        return "Electioneditform";    
	    }    
	      
	    @RequestMapping(value="editsave1",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("election") ElectionBean election){    
	        dao.update(election);    
	        return "redirect:/viewElection";    
	    }    
	    
	    @RequestMapping(value="/deleteElectionform/{ElectionId}",method = RequestMethod.GET)    
	    public String delete(@PathVariable String ElectionId){    
	        dao.delete(ElectionId);    
	        return "redirect:/viewElection";    
	    }     

}




