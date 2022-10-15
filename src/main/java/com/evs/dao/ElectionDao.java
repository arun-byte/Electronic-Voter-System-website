package com.evs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.evs.bean.ElectionBean;

public class ElectionDao {
	
	JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(ElectionBean e){    
	    String sql="insert into evs_tbl_election (ElectionId,Name,Electiondate,District,Constituency,Countingdate) values('"+e.getElectionId()+"','"+e.getName()+"','"+e.getElectionDate()+"','"+e.getDistrict()+"','"+e.getConstituency()+"','"+e.getCountingDate()+"')";    
	    return template.update(sql);    
	}    
	public int update(ElectionBean e){    
	    String sql="update evs_tbl_election set  Name='"+e.getName()+"',ElectionDate='"+e.getDistrict()+"',District='"+e.getDistrict()+"',Constituency='"+e.getConstituency()+"', Countingdate= '"+e.getCountingDate()+"' where ElectionId='"+e.getElectionId()+"'";    
	    return template.update(sql);    
	}    
	public int delete(String ElectionId){    
	    String sql="delete from evs_tbl_election where ElectionId='"+ElectionId+"'";    
	    return template.update(sql);    
	}    
	public ElectionBean getElectionBeanById(String ElectionId){    
	    String sql="select * from evs_tbl_election where ElectionId=?";    
	    return template.queryForObject(sql, new Object[]{ElectionId},new BeanPropertyRowMapper<ElectionBean>(ElectionBean.class));    
	}   
	public List<ElectionBean> getElectionBean(){    
	    return template.query("select * from evs_tbl_election",new RowMapper<ElectionBean>(){    
	        public ElectionBean mapRow(ResultSet rs, int row) throws SQLException {    
	            ElectionBean e =new ElectionBean();
	            e.setElectionId(rs.getString(1));   
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



