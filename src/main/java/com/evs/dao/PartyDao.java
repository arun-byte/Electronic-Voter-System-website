package com.evs.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.evs.bean.PartyBean;

public class PartyDao {
	
	JdbcTemplate template;    
    
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	public int save(PartyBean p){    
	    String sql="insert into EVS_TBL_Party(PartyId,Name,Leader,Symbol) values('"+p.getPartyId()+"','"+p.getName()+"','"+p.getLeader()+"','"+p.getSymbol()+"')";    
	    return template.update(sql);    
	}    
	public int update(PartyBean p){    
	    String sql="update EVS_TBL_Party set Name ='"+p.getName()+"', Leader='"+p.getLeader()+"',Symbol='"+p.getSymbol()+"' where PartyId="+p.getPartyId()+"";    
	    return template.update(sql);    
	}    
	public int delete(String PartyId ){    
	    String sql="delete from EVS_TBL_Party where PartyId='"+PartyId+"'";    
	    return template.update(sql);    
	}    
	public PartyBean getPartyById(String PartyId){    
	    String sql="select * from EVS_TBL_Party where PartyId=?";    
	    return template.queryForObject(sql, new Object[]{PartyId},new BeanPropertyRowMapper<PartyBean>(PartyBean.class));    
	}   
	public List<PartyBean> getPartyBean(){    
	    return template.query("select * from EVS_TBL_Party",new RowMapper<PartyBean>(){    
	        public PartyBean mapRow(ResultSet rs, int row) throws SQLException {    
	            PartyBean e=new PartyBean();    
	            e.setPartyId(rs.getString(1));
	            e.setName(rs.getNString(2));
	            e.setLeader(rs.getString(3));
	            e.setSymbol(rs.getString(4));
	            return e;    
	        }    
	    });    
	}    
	}   



