<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />

    <title>Welcome</title>
  </head>
  <style>
    * {
      box-sizing: border-box;
      margin: 0;
      border: 0;
      transition: 0.5s;
    }
    .navbar {
      width: 100vw;
      height: 100vh;
    }
    .nav-title {
      position: absolute;
      color: aliceblue;
      font-size: 2em;
      justify-content: center;
      align-items: center;
      background-color: #1da1f2;
      width: 50%;
      height: 100%;
      z-index: -1;
      border-radius: 50% 50% 40% 40% / 60% 60% 40% 40%;
      transform: rotate(90deg);
      left: -3%;
    }
    .ele {
      position: absolute;
      top: 45%;
      left: 30%;
      transform: rotate(-90deg);
    }
    .navbar-nav {
      position: absolute;
      list-style-type: none;
      color: black;
      text-decoration: none;
      top: 10%;
    }

    .navbar-nav > a {
      padding: 20%;
      width: 100%;
    }
    .navbar-nav > li {
      padding: 10%;
      width: 130%;
    }
    .navbar-nav a {
      text-decoration: none;
      color: black;
      font-size: 2em;
    }
    .navbar-nav > li:hover {
      background-color: #1da1f2;
      border-radius: 5%;
    }
    li:hover a {
      color: white;
    }
    .list-container {
      position: absolute;
      z-index: 111;
      padding: 15%;
      /* background-color: aliceblue; */
      /* overflow: hidden; */
      right: 15%;
      top: 20%;
    }
  </style>
  <body>
    <nav class="navbar">
      <div class="container">
        <div class="nav-title">
          <h3 class="ele">Electronic Voting <br />System</h3>
        </div>
        <div class="list-container">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="Admin.jsp">Voter</a>
            </li>
           
            <li class="nav-item">
              <a class="nav-link" href="Contactus.jsp">Contact</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="Aboutus.jsp">Aboutus</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </body>
</html>