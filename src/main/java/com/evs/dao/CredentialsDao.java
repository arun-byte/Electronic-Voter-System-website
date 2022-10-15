package com.evs.dao;
    
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;

import com.evs.bean.CredentialsBean;
import com.evs.bean.ProfileBean;   
    
public class CredentialsDao 
{    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public int saveProfile(String password) {
	String sql = "insert into evs_tbl_user_credentials (password,usertype,loginstatus) values('"+password+"','voter',1)";
	return template.update(sql);
}
public int save(CredentialsBean p){    
    String sql="insert into evs_tbl_user_credentials; values('"+p.getuserID()+"','"+p.getPassword()+"','"+p.getuserType()+"',"+p.getloginStatus()+")";
    return template.update(sql);    
}  
public int delete(int UserID){    
    String sql="delete from evs_tbl_user_credentials; where id="+UserID+"";    
    return template.update(sql);    
}    
public int update(CredentialsBean p){    
    String sql="update evs_tbl_user_credentials; set UserID="+p.getuserID()+",Password="+p.getPassword()+",Usertype="+p.getuserType()+",Loginstatus="+p.getloginStatus()+"";    
    return template.update(sql);    
}
public CredentialsBean getOrderById(String UserID){    
    String sql="select * from evs_tbl_user_credentials where UserId=?";     
    return template.queryForObject(sql, new Object[]{UserID},new BeanPropertyRowMapper<CredentialsBean>(CredentialsBean.class));    
}    
public List<CredentialsBean> getOrder(){    
    return template.query("select * from evs_tbl_user_credentials;",new RowMapper<CredentialsBean>(){    
        public CredentialsBean mapRow(ResultSet rs, int row) throws SQLException {    
            CredentialsBean e=new CredentialsBean();    
            e.setuserID(rs.getString(1));    
            e.setPassword(rs.getString(2));    
            e.setuserType(rs.getString(3));    
            e.setloginStatus(rs.getInt(4));
            return e;    
        }    
    });
}
    
    public int chp(String z,String y) {
    	
    	String sql="update EVS_TBL_user_credentials set password='"+z+"' where userid='"+y+"'";
    	  return template.update(sql);
}
	public String  getdetailsbyname(String fname) {
		// TODO Auto-generated method stub
		String surname = (String) this.template.queryForObject(
		        "select userId from evs_tbl_user_credentials where password= ?", 
		        new Object[] {fname}, String.class);
			System.out.println(surname);
				return surname;
	}    
}