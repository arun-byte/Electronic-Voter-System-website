<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
 <body background ="https://image.freepik.com/free-vector/voting-election-people-with-mask-campaign-candidates-list_24640-68516.jpg" style = "background-repeat: no-repeat; background-size: 100% 100%">

        <h1>Add Party</h1> 
         <head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script type="text/javascript">
    function isNumber(evt)
      {
         var charCode = (evt.which) ? evt.which : event.keyCode
         if (charCode > 31 && (charCode < 48 || charCode > 57))
        	 {
        	 alert("Must be Number!");
            return false;
        	 }
         return true;
      }
</script>
<script type="text/javascript" >
   function validate()
   {
	var a= document.getElementById("a").value;
	var b= document.getElementById("b").value;
	var c= document.getElementById("c").value;
	var d= document.getElementById("d").value;
	 if((a==null || a=="") || (b==null || b=="") || (c==null || c=="") || (d==null || d=="") )
	    {
	  		alert("Dont leave the field empty!");
	  		return false;
		}
    return true;
};
</script> 
 <center>
       <form:form method="post" action="add">    
        <table >    
         <tr>    
          <td><b>PartyId : </b></td>   
          <td><form:input path="PartyId" id="a" onkeypress="javascript:return isNumber(event)"/></td>  
         </tr>    
         <tr>    
          <td><b>Name :</b></td>    
          <td><form:input path="Name" id="b"/></td>  
         </tr>   
         <tr>    
          <td><b>Leader :</b></td>    
          <td><form:input path="Leader" id="c"/></td>  
         </tr>   
         <tr>    
         <td><b>Symbol:</b></td>    
          <td><form:input path="Symbol" id="d"/></td>  
         </tr>
       <tr>
          <td> </td> 
             
          <td><input type="submit" value="Save" onclick="return validate()"/></td>    
         </tr>    
        </table>    
       </form:form> 
    <a href="Admin.jsp"><b>Admin Page</b></a>
 
 </center>   
    </body>