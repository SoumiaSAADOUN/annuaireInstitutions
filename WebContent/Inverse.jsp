<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Annuaire des Institutions</title>
<link rel="stylesheet" type="text/css" href="css/annuaireInverse.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.0/umd/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<br>
<div class="contenu1" >
 <div class="input-container">
 <span class="glyphicon glyphicon-book icon"></span>
<label style="color:"> Rechercher dans l'annuaire </label>
</div><br> <br>
<form action="controleur" method="post" style="max-width:500px;margin:auto">
    <input type="text" class="form-control elem" id="numTel" name="motCle" placeholder=" Numéro de téléphone">

<br> <br>
    <input type="text" class="form-control" id="adress" placeholder=" Adresse">
<br> <br>
    <select class="form-control" id="statut">
      <option selected="selected" > Statut </option>
      <option> Privée </option>
      <option> Public </option>
    </select>
    <br> <br>
    <select class="form-control" id="type">
    <option selected="selected"> Type </option>
      <option> Laboratoire de recherche </option>
      <option> Etablissement d'enseignement </option>
      <option> choix 3  </option>
    </select>
    <br> <br>
    <select class="form-control" id="domaine">
    <option selected="selected"> Domaine </option>
      <option> Alimentation </option>
      <option> Agriculture </option>
      <option> Microbiologique </option>
      <option> Marin </option>
    </select>
    <br> <br>
  <button type="submit" value="chercher" class="button"> Rechercher </button>
</form>
</div>

</body>

</html>
