<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Annuaire des Institutions</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>
<div>
<form action="controleur" method="post">
<table>
<tr>
<td>Institution</td>
<td> <input type="text" name="motCle"> </td>
<td> <input type="submit" value="chercher"> </td>
 </tr>
</table>
</form>
<table>
<tr>
<th>id </th> <th>Sigle</th><th>nom_fr</th>
</tr>
 <c:forEach items="${model.institutions}" var="inst">
 <tr> <td>${inst.id_Institution}</td><td>${inst.sigle}</td><td>${inst.nom_fr}</td></tr>
 </c:forEach>
</table>
</div>

</body>
</html>