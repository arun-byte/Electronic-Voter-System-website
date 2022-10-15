<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Election List</h1>  
<body background ="https://image.freepik.com/free-vector/voting-election-people-with-mask-campaign-candidates-list_24640-68516.jpg" style = "background-repeat: no-repeat; background-size: 100% 100%">
<style>  
table, th, td {  
    border: 1px solid black;  
    border-collapse: collapse;  
}  
th, td {  
    padding: 10px;  
}  
table#alter tr:nth-child(even) {  
    background-color: #eee;  
}  
table#alter tr:nth-child(odd) {  
    background-color: #fff;  
}  
table#alter th {  
    color: white;  
    background-color: gray;  
}  
</style>  
<table border="1"  id="alter" width="100%" cellpadding="2">
  
<tr><th>ElectionId</th><th>ElectionName</th><th>ElectionDate</th><th>District</th><th>Constituency</th><th>CountingDate</th><th>Edit</th><th>Delete</th></tr>  
    <c:forEach var="election" items="${list}">   
   <tr>  
   <td>${election.electionId}</td>  
   <td>${election.name}</td>
   <td>${election.electionDate }</td>   
   <td>${election.district}</td>  
   <td>${election.constituency}</td>
   <td>${election.countingDate}</td>   
   <td><a href="editElectionform/${election.electionId }">Edit</a></td>  
   <td><a href="deleteElectionform/${election.electionId }">Delete</a></td>  
   </tr>  
   </c:forEach> 
   </table>  
   <br/>  
   <a href="Electionform">Add Election</a> 
   <a href="Admin.jsp">Home page</a> 
   