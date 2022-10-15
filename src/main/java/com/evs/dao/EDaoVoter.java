package com.evs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.evs.bean.EElectionBean;

public class EDaoVoter {
	
	JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public List<EElectionBean> getEElectionBean(){    
	    return template.query("select * from evs_tbl_election",new RowMapper<EElectionBean>(){    
	        public EElectionBean mapRow(ResultSet rs, int row) throws SQLException {    
	            EElectionBean e =new EElectionBean();
	            
	            e.setName(rs.getString(2));  
	            e.setElectionDate(rs.getString(3));
	            e.setDistrict(rs.getString(4));    
	            e.setConstituency(rs.getString(5));
	            e.setCountingDate(rs.getString(6));
	            return e;    
	        }    
	    });    
	}    
	}   



