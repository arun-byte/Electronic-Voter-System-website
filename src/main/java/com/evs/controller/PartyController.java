package com.evs.controller;	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.evs.bean.PartyBean;
	import com.evs.dao.PartyDao;

	@Controller
	public class PartyController {
		
		 @Autowired  
		PartyDao dao;
		 
		 
		 @RequestMapping("/Partyform")    
		    public String showform(Model m){    
		        m.addAttribute("command", new PartyBean());  
		        return "Partyform";   
		    }    
		      
		    @RequestMapping(value="/add",method = RequestMethod.POST)    
		    public String save(@ModelAttribute("party") PartyBean party){    
		        dao.save(party);    
		        return "redirect:/viewParty";    
		    }    
		    /* It provides list of employees in model object */    
		    @RequestMapping("/viewParty")    
		    public String viewElection(Model m){    
		        List<PartyBean> list=dao.getPartyBean();    
		        m.addAttribute("list",list);  
		        return "viewParty";    
		    }    
		      
		    @RequestMapping(value="/editParty/{PartyId}")    
		    public String edit(@PathVariable String PartyId, Model m){    
		       PartyBean party =dao.getPartyById(PartyId);    
		        m.addAttribute("command", party);  
		        return "Partyeditform";    
		    }    
		      
		    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
		    public String editsave(@ModelAttribute("party") PartyBean party){    
		        dao.update(party);    
		        return "redirect:/viewParty";    
		    }    
		    
		    @RequestMapping(value="/deleteParty/{PartyId}",method = RequestMethod.GET)    
		    public String delete(@PathVariable String PartyId){    
		        dao.delete(PartyId);    
		        return "redirect:/viewParty";    
		    }     

	}







