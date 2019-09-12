<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<%@page contentType="text/html;charset=UTF-8" %>
<meta charset="UTF-8">
<title>Annuaire des Institutions</title>
<link rel="stylesheet" type="text/css" href="css/annuaireInverse.css">
<link type="text/jsp" href="annuaire/VueAnnuaire.jsp">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.0/umd/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<br>
<div class="contenu1 row">
<div class="institution col-md-9">
<form action="controleur" method="post">
<input type="text" class="form-control" id="inst" placeholder="Rechercher... " name="motCle"> <br>
<button type="submit" class="button1" value="chercher">Rechercher</button>
</form>
<ul>
<c:forEach items="${model.institutions}" var="inst">
<li class="list-group-item">
<div class="card border-dark mb-3">
  <div class="row no-gutters inst">
    <div class="col-md-4">
      <img src="..." class="card-img" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">${inst.nom_fr}</h5>
        <p class="card-text"></p>

      </div>
    </div>
  </div>
</div></li>
</c:forEach></ul>
</div>
<div class="col-md-3" >
<a href="http://localhost:8018/annuaire/VueAnnuaire.jsp#contact">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Algeria_location_map.svg/773px-Algeria_location_map.svg.png" class="rounded float-left" alt="carte" style="float:right;width:200px;height:200px;z-index : 1; padding-bottom: 12px;">
</a>
<br>
<button type="button" class="button2" data-toggle="modal" data-target="#instForm">Ajouter institution</button>
</div>
</div>
<!-- Modal -->
  <div class="modal fade" id="instForm" role="dialog" >
    <div class="modal-dialog modal-lg" >
    <div class="modal-content">
     <div class="modal-header">
        <h5 class="modal-title">Ajouter Institution</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button></div>
        <div class="modal-body big">
    <div class="contenuFormulaire"  >
<form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label>Nom complet en français</label>
      <input type="text" class="form-control" id="nomFR" placeholder="Nom en français">
    </div>
    <div dir="rtl" lang="ar"  class="form-group col-md-6">
      <label >الاسم باللغة العربية</label>
      <input type="text" class="form-control" id="nomAR" placeholder="الاسم باللغة العربية">
    </div>
  </div>
  
  <div class="form-row">
    <div class="form-group col-md-3">
      <label>Sigle</label>
      <input type="text" class="form-control" id="sigle" placeholder="Sigle">
    </div>
    <div class="form-group col-md-3">
      <label >Statut</label>
      <select class="form-control" id="statut">
      <option selected="selected" > Statut </option>
      <option> Privée </option>
      <option> Public </option>
    </select>
    </div>
    <div class="form-group col-md-6">
      <label >Domaine</label>
      <select class="form-control" id="domaine">
      <option selected="selected"> Domaine </option>
      <option> Alimentation </option>
      <option> Agriculture </option>
      <option> Microbiologique </option>
      <option> Marin </option>
    </select>
    </div>
  </div>
  <br>
  <div class="form-row">
  <div class="form-group col-md-6">
      <label >Type</label>
      <select class="form-control" id="type">
      <option selected="selected"> Type </option>
      <option> Laboratoire de recherche </option>
      <option> Etablissement d'enseignement </option>
      <option> opt3 </option>
    </select>
    </div>
    <div class="form-group col-md-3">
      <label > Wilaya </label>
      <select class="form-control" id="wilaya">
      <option selected="selected"> -- </option>
      <option> 1- Adrar</option>
      <option> 2- Chlef </option>
      <option> 3- Laghouat </option>
      <option> 4- Oum El Bouaghi</option>
      <option> 5- Batna </option>
      <option> 6- Bejaia </option>
    </select>
    </div>
    
     <div class="form-group col-md-3">
      <label >Commune</label>
      <select class="form-control" id="commune">
      <option selected="selected"> -- </option>
      <option> 1- </option>
      <option> 2-  </option>
      <option> 3-  </option>
      <option> 4- </option>
      <option> 5-  </option>
      <option> 6-  </option>
    </select>
    </div>
   
    </div>
  <div class="form-group col-md-12">
    <label for="inputAddress"> Adresse</label>
    <input type="text" class="form-control" id="adresse" placeholder="Oued Smar, Alger, Algérie">
  </div>
  <div class="form-row">
  <div class="form-group col-md-6">
    <label>Téléphone</label>
    <input type="tel" class="form-control" id="tel" placeholder="Veuillez entrer le numéro de téléphone">
  </div>
  <div class="form-group col-md-6">
    <label>Fax</label>
    <input type="tel" class="form-control " id="fax" placeholder="Veuillez entrer le numéro du Fax">
  </div></div>
  <br>
  
  <div class="form-row ">
  <div class="form-group col-md-6 ">
    <label>E-mail</label>
    <input type="email" class="form-control" id="email" placeholder="Veuillez entrer l'e-mail">
  </div>
  <div class="form-group col-md-6">
    <label>Site Web</label>
    <input type="url" class="form-control" id="site" placeholder="Lien">
  </div></div>
  <br>
  	
  <div class="form-row">
    <div class="form-group col-md-12">
      <label >Description</label>
      <input type="text" class="form-control" id="description">
    </div>
    
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Valider les information
      </label>
    </div>
  </div>
 
</form>
</div>
     </div>
    <div class="modal-footer">
          <button type="button" class="button1">Ajouter</button>
          <button type="button" class="btn btn-secondary" data-dismiss="modal" style="padding-left:30px;padding-right:30px; margin-right:10px;  width: 150px;height: 40px; cursor: pointer;border-radius: 8px">Annuler</button>
        </div>
    </div>
    
    
    </div></div>
</body>

</html>
