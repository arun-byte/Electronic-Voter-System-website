package com.evs.dao;
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;

import com.evs.bean.ProfileBean;    
    
public class ProfileDao {    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public int save(ProfileBean p){    
    String sql="insert into evs_tbl_user_profile (firstName,lastName,Gender,Street,Location,City,State,Pincode,mobileNo,emailID,Password,dateOfBirth) values('"+p.getfirstName()+"','"+p.getlastName()+"','"+p.getGender()+"','"+p.getStreet()+"','"+p.getLocation()+"','"+p.getCity()+"','"+p.getState()+"','"+p.getPincode()+"','"+p.getmobileNo()+"','"+p.getemailID()+"','"+p.getPassword()+"','"+p.getdateOfBirth()+"')";
    return template.update(sql);    
}  
public int update(ProfileBean p){    
    String sql="update evs_tbl_user_profile set FirstName="+p.getfirstName()+",LastName="+p.getlastName()+",Gender="+p.getGender()+",Street="+p.getStreet()+",Location="+p.getLocation()+",City="+p.getCity()+",State="+p.getState()+",Pincode="+p.getPincode()+",MobileNo="+p.getmobileNo()+",EmailID="+p.getemailID()+",Password="+p.getPassword()+",DateOfBirth="+p.getdateOfBirth()+" where UserId="+p.getuserID()+"";    
    return template.update(sql);    
}
public int delete(int UserID){    
    String sql="delete from evs_tbl_user_profile where UserId="+UserID+"";    
    return template.update(sql);    
}    
public ProfileBean getProfileByUserId(int UserID){    
    String sql="select * from evs_tbl_user_profile where UserId=?";    
    return template.queryForObject(sql, new Object[]{UserID},new BeanPropertyRowMapper<ProfileBean>(ProfileBean.class));    
}    
public List<ProfileBean> getOrder(){    
    return template.query("select * from evs_tbl_user_profile",new RowMapper<ProfileBean>(){    
        public ProfileBean mapRow(ResultSet rs, int row) throws SQLException {    
            ProfileBean e=new ProfileBean();    
            e.setuserID(rs.getString(1));    
            e.setfirstName(rs.getString(2));    
            e.setlastName(rs.getString(3));    
            e.setGender(rs.getString(4));
            e.setStreet(rs.getString(5));
            e.setLocation(rs.getString(6));
            e.setCity(rs.getString(7));
            e.setState(rs.getString(8));
            e.setPincode(rs.getString(9));
            e.setmobileNo(rs.getString(10));
            e.setemailID(rs.getString(11));
            e.setPassword(rs.getString(12));
            return e;    
        }    
    });    
}    
}