<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Election</h1>  
        <body background ="https://image.freepik.com/free-vector/voting-election-people-with-mask-campaign-candidates-list_24640-68516.jpg" style = "background-repeat: no-repeat; background-size: 100% 100%">
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

	 if((a==null || a=="") || (b==null || b=="") || (c==null || c=="") || (d==null || d=="") || (e==null || e=="") || (f==null || f==""))
	    {
	  		alert("Dont leave the field empty!");
	  		return false;
		}

    return true;
};
</script>
</head>  
       <form:form method="POST" action="/abd/editsave1">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="ElectionId" id="a" onkeypress="javascript:return isNumber(event)"/></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="Name"  id="b"/></td>  
         </tr>    
         <tr>    
          <td>ElectionDate :</td>    
          <td><form:input path="ElectionDate" id="c"/></td>  
         </tr>   
         <tr>    
          <td>District :</td>    
          <td><form:input path="District" id="d"/></td>  
         </tr>   
         <tr>    
          <td>Constituency:</td>    
          <td><form:input path="Constituency" id="e"/></td>  
         </tr>
         <tr>    
          <td>CountingDate :</td>    
          <td><form:input path="CountingDate" id="f"/></td>  
         </tr>
         <tr>    
          <td> </td>    
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" onclick="return validate()"/></td>    
         </tr>    
        </table>    
       </form:form>  
       