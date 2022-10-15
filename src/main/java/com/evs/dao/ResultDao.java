package com.evs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.evs.bean.ResultBean;

public class ResultDao {
	
	JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
	public List<ResultBean> getResultBean(){    
	    return template.query("select * from evs_tbl_voteresult",new RowMapper<ResultBean>(){    
	        public ResultBean mapRow(ResultSet rs, int row) throws SQLException {    
	            ResultBean e=new ResultBean(); 
	           e.setUserId(rs.getString(1));
	           e.setElectionName(rs.getString(2));
	           e.setCandidateId(rs.getString(3));
	           
	            return e;    
	        }    
	    });    
	}    
	}   



