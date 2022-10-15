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
import com.evs.dao.CastVoteDao;
@Controller
public class CastVoteController {
	 
	 @Autowired  
	CastVoteDao dao2;
	 	
	 @RequestMapping("/CastVote")    
	 public String CVoterBean1(Model m){    
		     List<CVoterBean1> list=dao2.getCVoterBean1();    
		        m.addAttribute("list",list);  
		        return "CastVote";    
		    }  
}