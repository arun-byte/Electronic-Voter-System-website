<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign up</title>
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
	var birthday= document.getElementById("birthday").value;
	var e= document.getElementById("e").value;
	var f= document.getElementById("f").value;
	var g= document.getElementById("g").value;
	var h= document.getElementById("h").value;
	var i= document.getElementById("i").value;
	var j= document.getElementById("j").value;
	 if((a==null || a=="") || (b==null || b=="") || (c==null || c=="") || (birthday==null || birthday=="") || (e==null || e=="") || (f==null || f=="") || (g==null || g=="") || (h==null || h=="") || (i==null || i=="") || (j==null || j=="") )
	    {
	  		alert("Dont leave the field empty!");
	  		return false;
		}

	else if(j.length<=9)
    {
  		alert("Invalid Mobile Number!");
  		return false;
	}
	else if(i.length<=5)
    {
  		alert("Invalid Pincode!");
  		return false;
	}
	else if(c.length<=5)
    {
  		alert("Password must contain atleast 4 characters!");
  		return false;
	}
    return true;
};
</script>
</head>

<body background ="https://image.freepik.com/free-vector/voting-election-people-with-mask-campaign-candidates-list_24640-68516.jpg" style = "background-repeat: no-repeat; background-size: 100% 100%">
      
<form method="post" action="saved">
<style>
input[type="text"]:-ms-input-placeholder {
	text-align: center;
}

input[type="password"]:-ms-input-placeholder {
	text-align: center;
}

.img {
	height: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}
.topnav {
  overflow: hidden;
}

.topnav a {
  float: left;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
</style>
<div class="img">
<div class="topnav">

  <a href="Aboutus">About us</a>
    <a href="Contactus">Contact us</a>
  </div>
    <table align="center" >
				<tr>
					<th colspan="5" align="center" style="font-size: 30">Register</th><br>
				</tr>
     <tr>
     <td><b>Firstname :</b> </td>

     <td><input type= "text" name="Firstname" id="a" placeholder="Firstname"
							required style="width: 200; height: 30" /></td>

     </tr>
      <tr>
     <td><b>Lastname :</b> </td>

     <td><input type= "text" name="Lastname" id="b" placeholder="Lastname"
							required style="width: 200; height: 30" /> </td>
							

     </tr>
     <td><b>Password :</b> </td>

     <td><input type= "password" name="password" id="c" placeholder="Enter Password"
							required style="width: 200; height: 30" /> </td>
							

     </tr>
     <tr>
     <td><b>Date Of Birth : </b></td>

     <td><input type="date" id="birthday" name="dob" required style="width: 200;height:30"> </td>
							

     </tr>
     <tr>
     <td>
     <b>Gender:</b> </td>
      <td>Male <input type="radio" name="gender" value="male" checked="checked"/>
      Female <input type="radio" name="gender" value="female"/> </td>
     
     </tr>
     
     <tr>
     
     <td><b>Street: </b></td>

     <td><input type= "text" name="street" id="e" placeholder="Street"
							required style="width: 200; height: 30" /> </td>
							

     </tr>
     
     <tr>
     <td><b>Location: </b></td>

     <td><input type= "text" name="loc" id="f" placeholder="Location"
							required style="width: 200; height: 30" /> </td>
							

     </tr>
     
     <tr>
     
     <td><b>City:</b> </td>

     <td><input type= "text" name="city" id="g" placeholder="City"
							required style="width: 200; height: 30" /> </td>
							

     </tr>
     
     <tr>
     <td><b>State:</b> </td>

     <td><input type= "text" name="state" id="h" placeholder="State"
							required style="width: 200; height: 30" /> </td>
							

     </tr>
     
     <tr>
     <td><b>PinCode: </b></td>

     <td><input type= "text" name="pin" id="i" placeholder="Pincode"
							required style="width: 200; height: 30" onkeypress="javascript:return isNumber(event)" /> </td>
     </tr>
     
      <tr>
     <td><b>MobileNo: </b></td>

     <td><input type= "text" name="mob" id="j" placeholder="MobileNo"
							required style="width: 200; height: 30" onkeypress="javascript:return isNumber(event)"/> </td>
     </tr>
     
     <tr>
     <td><b>EmailId:</b> </td>

     <td><input type= "text" name="mail" id="k" placeholder="EmailId"
							required style="width: 200; height: 30" /> </td>
     </tr>
     
     <tr><td></td><td>
     <input type="submit" value="Sign Up" required style="width: 200; height: 30 ;text-align:center;" onclick="return validate()"> </td>
	 </tr>
</table>
</div>
</form>
		
	
</body>

</html>