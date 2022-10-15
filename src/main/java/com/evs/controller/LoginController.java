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
import org.springframework.web.bind.annotation.RequestParam;

import com.evs.bean.ProfileBean;
import com.evs.bean.CredentialsBean;
import com.evs.dao.CredentialsDao;
import com.evs.service.LoginService;
import com.evs.util.DbUtil;
import com.evs.util.User;

@Controller
public class LoginController {
	
	@Autowired
	private DbUtil db;
	@Autowired 
	CredentialsDao dao;
	
	@Autowired
	LoginService v;
	
	
	
	@RequestMapping("/login")
	public String login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		CredentialsBean cb = new CredentialsBean();
		cb.setuserID(username);
		cb.setPassword(password);
		User v = new User();
		String retValue =  v.login(cb, db);
		if(retValue.equals("A")) {
			return "index1";
		}
		else if(retValue.equals("C"))
		{
			return "index2";
		}
		else {
			return "index";
		}
	}
	
	@RequestMapping("/Contactus")
	public String contactus() {
		return "Contactus";
	}
	@RequestMapping("/chpas")
	public String chpass() {
		return "change";
	}
	@RequestMapping(value="/paw")  
	 public String chp(@RequestParam("uid") String uid,@RequestParam("password") String password,Model m){ 
		CredentialsBean ob=new CredentialsBean();
		ob.setPassword(password);
		ob.setuserID(uid);
		dao.chp(password, uid);
	  System.out.println("password changed");
	  return "index";
	      
	 }
	
	@RequestMapping("/Aboutus")
	public String aboutus() {
		return "Aboutus";
	}
	
	//New User Signup
	@RequestMapping("/NewVoterRegister")
	public String signup() {
		return "NewVoterRegister";
	}
	
	//Getting Details From the New User
	@RequestMapping("/saved")
	public String savedetails(HttpServletRequest req, Model m) {
		String fname,lname,gender,street,loc,city,state,mail,pss,dob;
		String pin,mob;
		
		fname = req.getParameter("Firstname");
		lname = req.getParameter("Lastname");
		gender = req.getParameter("gender");
		street = req.getParameter("street");
		loc = req.getParameter("location");
		city = req.getParameter("city");
		state = req.getParameter("state");
		mail = req.getParameter("mail");
		pss = req.getParameter("password");
		dob = req.getParameter("dob");
		pin = (req.getParameter("pin"));
		mob = (req.getParameter("mob"));
		
		ProfileBean p = new ProfileBean();
		p.setfirstName(fname);
		p.setlastName(lname);
		p.setGender(gender);
		p.setStreet(street);
		p.setLocation(loc);
		p.setCity(city);
		p.setState(state);
		p.setPincode(pin);
		p.setmobileNo(mob);
		p.setemailID(mail);
		p.setPassword(pss);
		p.setdateOfBirth(dob);
		User user = new User();
		user.register(p,db);
		String s =dao.getdetailsbyname(pss);

	    m.addAttribute("s",s);
	    
	    
		System.out.println("Registration successfull" +s);
		return "Thankyou";
	}
}