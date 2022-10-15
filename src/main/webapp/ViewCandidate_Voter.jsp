<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Candidate List</h1>  
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
  
<tr><th>ElectionId</th><th>PartyId</th><th>CandidateId</th><th>Name</th><th>District</th><th>Constituency</th></tr>  
    <c:forEach var="candidate" items="${list}">   
   <tr>  
   <td>${candidate.electionId }</td>    
   <td>${candidate.partyId}</td>
   <td>${candidate.candidateId }</td>
   <td>${candidate.name}</td>  
     
   <td>${candidate.district }</td>
   <td>${candidate.constituency }</td>  
 
   </tr>  
   </c:forEach> 
   </table>  
   <br/>  
  <!-- <a href="Candidateform"> Add Candidate</a> --> 