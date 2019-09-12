	package web;

import java.util.ArrayList;
import java.util.List;

import metier.Institution;

public class InstitutionModel {
private String motCle;
private List<Institution> institutions = new ArrayList<Institution>();
public String getMotCle() {
	return motCle;
}
public void setMotCle(String motCle) {
	this.motCle = motCle;
}
public List<Institution> getInstitutions() {
	return institutions;
}
public void setInstitutions(List<Institution> institutions) {
	this.institutions = institutions;
}
}
