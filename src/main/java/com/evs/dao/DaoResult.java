
package com.evs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.evs.bean.BeanResult;


public class DaoResult {
	
	JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(BeanResult c){    
	    String sql="insert into evs_tbl_voteresult (UserId,ElectionName,CandidateId) values ('"+c.getUserId()+"','"+c.getElectionName()+"','"+c.getCandidateId()+"')";   
	    return template.update(sql);    
	}     
	    
	public List<BeanResult> getBeanResult() {
		// TODO Auto-generated method stub
		return template.query("select * from  evs_tbl_voteresult ",new RowMapper<BeanResult>(){    
	        public BeanResult mapRow(ResultSet rs, int row) throws SQLException {    
	        	BeanResult e=new BeanResult(); 
	        	e.setUserId(rs.getString(1));
	        	e.setElectionName(rs.getString(2));
	        	e.setCandidateId(rs.getString(3));
	        	
	        	
	        	    
	            return e;    
	        }    
	    });    
	}
}      




 


