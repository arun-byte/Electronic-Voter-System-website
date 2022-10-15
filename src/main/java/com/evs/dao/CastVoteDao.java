package com.evs.dao;

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.List;

	// org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.BeanPropertyRowMapper;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.RowMapper;


	import com.evs.bean.CVoterBean;
import com.evs.bean.CVoterBean1;

	public class CastVoteDao {
		
		JdbcTemplate template;    
	    
		
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}    

		public List<CVoterBean1> getCVoterBean1(){    
		    return template.query("select * from  evs_tbl_candidate ",new RowMapper<CVoterBean1>(){    
		        public CVoterBean1 mapRow(ResultSet rs, int row) throws SQLException {    
		        	CVoterBean1 e=new CVoterBean1(); 
		        	e.setCandidateId(rs.getString(1));
		        	e.setName(rs.getString(2));
		        	e.setElectionId(rs.getString(3));
		        	e.setPartyId(rs.getString(4));
		        	e.setDistrict(rs.getString(5));
		        	e.setConstituency(rs.getString(6));
		        		        	    
		            return e;    
		        }    
		    });    
		}    
		}   




	 


