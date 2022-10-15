<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1> Result</h1>  
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
  
<tr><th>VoterId</th><th>ElectionName</th><th>CandidateId</th></tr>  
    <c:forEach var="result" items="${list}">   
   <tr>  
   <td>${result.userId}</td>  
   <td>${result.electionName}</td> 
   <td>${result.candidateId}</td>     
   </tr>  
   </c:forEach> 
   </table>  
   <br/>  
   <a href="Admin.jsp">Admin</a> 
   