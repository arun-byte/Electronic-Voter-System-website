package com.evs.util;
import org.springframework.beans.factory.annotation.Autowired;

import com.evs.bean.*;
import com.evs.dao.*;

public class Authentication {
	@Autowired
	private CredentialsDao dao;

	public void setDao(CredentialsDao dao) {
		this.dao = dao;
	}
	public void authorize(CredentialsBean cb) {
		dao.update(cb);
		
	}
	public boolean vlog(CredentialsBean c) {
		try {
			CredentialsBean cb = dao.getOrderById(c.getuserID());
			if(cb.getPassword().equals(c.getPassword())) {
				cb.setloginStatus(1);
				authorize(cb);
				if(cb.getuserType().equals("admin")) {
					return true;
				}
			}
			return false;
		}
		 catch(Exception e){
			 System.out.println(e);
			 return false;	
		}	
	}
}
