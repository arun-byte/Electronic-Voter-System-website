<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Party List</h1> 
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
  
<tr><th>PartyId</th><th>Name</th><th>Leader</th><th>Symbol</th><th>Edit</th><th>Delete</th></tr>  
    <c:forEach var="party" items="${list}">   
   <tr>  
   <td>${party.partyId }</td>  
   <td>${party.name }</td> 
   <td>${party.leader }</td>  
   <td>${party.symbol }</td>  
    
   <td><a href="editParty/${party.partyId }">Edit</a></td>  
   <td><a href="deleteParty/${party.partyId }">Delete</a></td>  
   </tr>  
   </c:forEach> 
   </table>  
   <br/>  
   <a href="Partyform">Add Party</a> 
   <a href="Admin.jsp">Home page</a> 