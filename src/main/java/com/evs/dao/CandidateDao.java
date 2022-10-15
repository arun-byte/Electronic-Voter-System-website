package com.evs.dao;

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.List;

	// org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.BeanPropertyRowMapper;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.RowMapper;


	import com.evs.bean.CandidateBean;

	public class CandidateDao {
		
		JdbcTemplate template;    
	    
		
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}    
		public int save(CandidateBean c){    
		    String sql="insert into evs_tbl_candidate (CandidateId,Name,ElectionId,PartyId,District,Constituency,Dateofbirth,MobileNo,Address,Emailid) values ('"+c.getCandidateId()+"','"+c.getName()+"','"+c.getElectionId()+"','"+c.getPartyId()+"','"+c.getDistrict()+"','"+c.getConstituency()+"','"+c.getDateofBirth()+"','"+c.getMobileNo()+"','"+c.getAddress()+"','"+c.getEmailId()+"')";   
		    return template.update(sql);    
		}    
		public int update(CandidateBean c){    
		    String sql="update into evs_tbl_candidate set Name='"+c.getName()+"', ElectionId='"+c.getElectionId()+"',PartyId='"+c.getPartyId()+"',District='"+c.getDistrict()+"',Constituency='"+c.getConstituency()+"',Dateofbirth='"+c.getDateofBirth()+"',MobileNo='"+c.getMobileNo()+"',Address='"+c.getAddress()+"',Emailid='"+c.getEmailId()+"' where CandidateId='"+c.getCandidateId()+"";   
		    return template.update(sql);    
		}    
		public int delete(String CandidateId){    
		    String sql="delete from evs_tbl_candidate where CandidateId='"+CandidateId+"'"; 
		    return template.update(sql);    
		}    
		public CandidateBean getCandidateBeanById(String CandidateId){    
		    String sql="select * from evs_tbl_candidate where CandidateId=?";   
		    return template.queryForObject(sql, new Object[]{CandidateId},new BeanPropertyRowMapper<CandidateBean>(CandidateBean.class));    
		}   
		public List<CandidateBean> getCandidateBean(){    
		    return template.query("select * from  evs_tbl_candidate ",new RowMapper<CandidateBean>(){    
		        public CandidateBean mapRow(ResultSet rs, int row) throws SQLException {    
		        	CandidateBean e=new CandidateBean(); 
		        	e.setCandidateId(rs.getString(1));
		        	e.setName(rs.getString(2));
		        	e.setElectionId(rs.getString(3));
		        	e.setPartyId(rs.getString(4));
		        	e.setDistrict(rs.getString(5));
		        	e.setConstituency(rs.getString(6));
		        	e.setDateofBirth(rs.getString(7));
		        	e.setMobileNo(rs.getString(7));
		        	e.setAddress(rs.getString(8));
		        	e.setEmailId(rs.getString(9));
		        	    
		            return e;    
		        }    
		    });    
		}    
		}   




	 


