<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Form</h1>  
       <form:form  action="adds2" modelAttribute="bn">    
        <table > 
        <tr>    
          <td>UserID :</td>    
          <td><form:input path="UserId" /></td>  
         </tr>
        <tr>    
          <td>Election Name:</td>    
          <td><form:input path="ElectionName" /></td>  
         </tr>   
         <tr>    
          <td>CandidateId </td>   
          <td><form:input path="CandidateId" /></td>  
         </tr>    
          <tr>
          <td></td>
          <td>
          <input type="submit"  value="vote" >
          </td>
          </tr>  
         
            
        </table>    
       </form:form> 
       
   