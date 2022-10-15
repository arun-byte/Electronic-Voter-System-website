<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
        crossorigin="anonymous">
    <title>LOGINPAGE</title>
    <script type="text/javascript">
    function isNumber(evt)
      {
         var x = (evt.which) ? evt.which : event.keyCode
         if (x > 31 && (x < 48 || x > 57))
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

	 if((a==null || a=="") || (b==null || b=="") )
	    {
	  		alert("Dont leave the field empty!");
	  		return false;
		}
	 else if(b.length<4)
	    {
	  		alert("Password must contain atleast 4 characters!");
	  		return false;
		}
    return true;
};
</script>
<style>
 .gradient-custom-2 {
  /* fallback for old browsers */
  background: #fccb90;
  /* Chrome 10-25, Safari 5.1-6 */
  background: -webkit-linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593);
  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
  background: linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593);
}
@media (min-width: 768px) {
  .gradient-form {
    height: 100vh !important;
  }
}
@media (min-width: 769px) {
  .gradient-custom-2 {
    border-top-right-radius: .3rem;
    border-bottom-right-radius: .3rem;
  }
}
</style>
</head>
<section class="h-100 gradient-form" style="background-color: #eee;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-xl-10">
        <div class="card rounded-3 text-black">
          <div class="row g-0">
            <div class="col-lg-6">
              <div class="card-body p-md-5 mx-md-4">

                <div class="text-center">
                  <img src="https://mdbootstrap.com/img/Photos/new-templates/bootstrap-login-form/lotus.png" style="width: 185px;" alt="logo">
                  <h4 class="mt-1 mb-5 pb-1"><b><i>We are The Team-2</i></b></h4>
                </div>
                <form method="post" action="login">
                  <p>Please login to your account</p>
                  <div class="form-outline mb-4">
                  <label class="form-label" for="form2Example11">UserId :</label>
                    <input type="text" class="form-control" name="username" id="a" placeholder="Enter the User ID!" onkeypress="javascript:return isNumber(event)"/>                 
                  </div>
                  <div class="form-outline mb-4">
                  <label class="form-label" for="form2Example22">Password :</label>
                   <input type="password" name="password" class="form-control" id="b" placeholder="Enter the Password!" />                
                  </div>
                  <div class="text-center pt-1 mb-5 pb-1">
                    <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3" type="submit" onclick="return validate()">Log in</button>               
                  </div>
                  <div class="d-flex align-items-center justify-content-center pb-4">
                    <p class="mb-0 me-2">Don't have an account?</p>
                    <a href="NewVoterRegister"> Click here to register</a>
                  </div>
                  <div class="d-flex align-items-center justify-content-center pb-4">
                    <p class="mb-0 me-2">change password?</p>
                    <a href="chpas"> Click here to change password</a>
                  </div>
                </form>
              </div>
            </div>
            <div class="col-lg-6 d-flex align-items-center gradient-custom-2">
              <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                <h4 class="mb-4">We are more than just a team</h4>
                <p class="small mb-0"><strong><b>Asif </b></strong><br> <strong><b>Arun</b></strong> <br> <strong><b>Arul</b></strong> <br> <strong><b>Apurva</b></strong> <br><strong><b> Brundha</b></strong> <br><strong><b> Chalapathi </b></strong></p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</html>