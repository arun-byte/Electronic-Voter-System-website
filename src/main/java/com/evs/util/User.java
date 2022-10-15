package com.evs.util;

import com.evs.bean.BeanResult;
import com.evs.bean.CredentialsBean;
import com.evs.bean.ProfileBean;
import com.evs.dao.CredentialsDao;
import com.evs.dao.DaoResult;
import com.evs.dao.ProfileDao;

public class User {
	public String login(CredentialsBean c,DbUtil db) {
		CredentialsDao dao = new CredentialsDao();
		dao.setTemplate(db.getTemplate());
		try {
			CredentialsBean cb = dao.getOrderById(c.getuserID());
			if(cb.getPassword().equals(c.getPassword())) {
				cb.setloginStatus(1);
				
				if(cb.getuserType().equals("admin")) {
					return "A";
				}
				else {
					return "C";
				}
			}
			return "INVALID";
			
		}
		 catch(Exception e){
			 System.out.println(e);
			 return "INVALID";
			
		}
	}
	public String changePassword(CredentialsBean c,String password,DbUtil db) {
		CredentialsDao dao = new CredentialsDao();
		dao.setTemplate(db.getTemplate());
		c.setPassword(password);
		int i = dao.update(c);
		if(i>0) {
			return "SUCESS";
		}
		else {
			return "FAIL";
		}
	}
	public String register(ProfileBean p,DbUtil db) {
		CredentialsBean cb = new CredentialsBean();
		cb.setPassword(p.getPassword());
		CredentialsDao dao = new CredentialsDao();
		dao.setTemplate(db.getTemplate());
		dao.saveProfile(p.getPassword());
		ProfileDao pdao = new ProfileDao();
		pdao.setTemplate(db.getTemplate());
		pdao.save(p);
		return "";
	}
	


}
