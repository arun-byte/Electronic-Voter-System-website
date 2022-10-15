<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1 align="center">Add Candidate</h1> 
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
	var e= document.getElementById("e").value;
	var f= document.getElementById("f").value;
	var g= document.getElementById("g").value;
	var h= document.getElementById("h").value;
	var i= document.getElementById("i").value;
	var j= document.getElementById("j").value;
	 if((a==null || a=="") || (b==null || b=="") || (c==null || c=="") || (d==null || d=="") || (e==null || e=="") || (f==null || f=="") || (g==null || g=="") || (h==null || h=="") || (i==null || i=="") || (j==null || j=="") )
	    {
	  		alert("Dont leave the field empty!");
	  		return false;
		}

	else if(g.length<=9)
    {
  		alert("Invalid Mobile Number!");
  		return false;
	}
    return true;
};
</script>
</head> <body background ="https://image.freepik.com/free-vector/voting-election-people-with-mask-campaign-candidates-list_24640-68516.jpg" style = "background-repeat: no-repeat; background-size: 100% 100%">
      <center> <form:form method="post" action="adds">    
        <table >    
         <tr>    
          <td>CandidateId </td>   
          <td><form:input path="CandidateId" id="a" onkeypress="javascript:return isNumber(event)"/></td>  
         </tr>    
         <tr>    
          <td>Name:</td>    
          <td><form:input path="Name" id="j"/></td>  
         </tr>   
         <tr>    
          <td>ElectionId :</td>    
          <td><form:input path="ElectionId" id="b" onkeypress="javascript:return isNumber(event)"/></td>  
         </tr>   
         <tr>    
          <td>PartyId :</td>    
          <td><form:input path="PartyId" id="c" onkeypress="javascript:return isNumber(event)"/></td>  
         </tr>  
         <tr>    
          <td>District :</td>    
          <td><form:input path="District" id="d" /></td>  
         </tr>  
         <tr>    
          <td>Constituency:</td>    
          <td><form:input path="Constituency" id="e" /></td>  
         </tr>  
         <tr>    
          <td>DateofBirth :</td>    
          <td><form:input path="DateofBirth" id="f" /></td>  
         </tr>  
         <tr>    
          <td>MobileNo :</td>    
          <td><form:input path="MobileNo" id="g" onkeypress="javascript:return isNumber(event)"/></td>  
         </tr>  
         <tr>    
          <td>Address :</td>    
          <td><form:input path="Address" id="h"/></td>  
         </tr>  
         <tr>    
          <td>EmailId:</td>    
          <td><form:input path="EmailId" id="i"/></td>  
         </tr>  
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" onclick="return validate()" /></td>    
         </tr>    
        </table>    
       </form:form> 
       <a href="Admin.jsp">Admin page</a></center></body>