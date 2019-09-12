<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Annuaire des Institutions</title>
<link rel="stylesheet" type="text/css" href="css/vueAnnuaire.css">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<ul class="nav nav-tabs" id="vuePrincipale" role="tablist" style="width=100%;">
  <li class="nav-item col-md-4">
    <a class="nav-link active " id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Annuaire Directe</a>
  </li>
  <li class="nav-item col-md-4">
    <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Annuaire Inverse</a>
  </li>
  <li class="nav-item col-md-4">
    <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">Découvrez Notre Carte</a>
  </li>
</ul>
<div class="tab-content" id="myTabContent">
  <div class="tab-pane fade " id="home" role="tabpanel" aria-labelledby="home-tab"> 
  <%@ include file="VueInstitutions.jsp" %> 
 </div>
  <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab" >
  <%@ include file="Inverse.jsp" %>  
  
  </div>
  <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">
 <%@ include file="map.jsp" %>  
</div>
</div>

</body>

</html>
