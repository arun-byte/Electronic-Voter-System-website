package com.evs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.evs.bean.CandidateBean;
import com.evs.dao.CandidateDao;

@Controller
public class CandidateController {
	
	 @Autowired  
	CandidateDao dao;
	 
	 
	 @RequestMapping("/Candidateform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new CandidateBean());  
	        return "Candidateform";   
	    }    
	      
	    @RequestMapping(value="/adds",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("candidate") CandidateBean candidate){    
	        dao.save(candidate);    
	        return "redirect:/viewCandidate";    
	    }    
	    /* It provides list of employees in model object */    
	    @RequestMapping("/viewCandidate")    
	    public String viewSchedule(Model m){    
	        List<CandidateBean> list=dao.getCandidateBean();    
	        m.addAttribute("list",list);  
	        return "viewCandidate";    
	    }    
	      
	    @RequestMapping(value="/editCandidate/{CandidateId}")    
	    public String edit(@PathVariable String CandidateId, Model m){    
	        CandidateBean candidate=dao.getCandidateBeanById(CandidateId);    
	        m.addAttribute("command",candidate);  
	        return "Candidateeditform";    
	    }    
	      
	    @RequestMapping(value="/edsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("candidate") CandidateBean candidate){    
	        dao.update(candidate);    
	        return "redirect:/viewCandidate";    
	    }    
	    
	    @RequestMapping(value="/deleteCandidate/{CandidateId}",method = RequestMethod.GET)    
	    public String delete(@PathVariable String CandidateId){    
	        dao.delete(CandidateId);    
	        return "redirect:/viewCandidate";    
	    }     

}





