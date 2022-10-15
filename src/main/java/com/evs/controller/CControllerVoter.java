 package com.evs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.evs.bean.CVoterBean1;
import com.evs.bean.CVoterBean;
import com.evs.dao.CDaoVoter;
import com.evs.dao.CastVoteDao;


@Controller
public class CControllerVoter {
	
	 @Autowired  
	CDaoVoter dao1;	
	 
	 @RequestMapping("/ViewCandidate_Voter")    
	 public String CVoterBean(Model m){    
	        List<CVoterBean> list=dao1.getCVoterBean();    
	        m.addAttribute("list",list);  
	        return "ViewCandidate_Voter";    
	 }     
}





