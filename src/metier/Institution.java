package metier;

import java.io.Serializable;
import java.util.List;

public class Institution implements Serializable {
	// atributs
	private String id_Institution;
	private String nom_fr;
	private String nom_ar;
	private String sigle;
	private String adresse;
	private String statut; // public privé
	private String type; // labo, ecole ...
	private String domaine; // agriculture,batata ...
	private String tel;
	private String fax;
	private String email;
	private String site_web;
	private String description;
	private List <Ressource> ressources;
	public List<Ressource> getRessources() {
		return ressources;
	}
	public void setRessources(List<Ressource> ressources) {
		this.ressources = ressources;
	}
	public String getId_Institution() {
		return id_Institution;
	}
	public void setId_Institution(String id_Institution) {
		this.id_Institution = id_Institution;
	}
	public String getNom_fr() {
		return nom_fr;
	}
	public void setNom_fr(String nom_fr) {
		this.nom_fr = nom_fr;
	}
	public String getNom_ar() {
		return nom_ar;
	}
	public void setNom_ar(String nom_ar) {
		this.nom_ar = nom_ar;
	}
	public String getSigle() {
		return sigle;
	}
	public void setSigle(String sigle) {
		this.sigle = sigle;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSite_web() {
		return site_web;
	}
	public void setSite_web(String site_web) {
		this.site_web = site_web;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Institution() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Institution(String id_Institution, String nom_fr, String nom_ar, String sigle, String adresse, String statut,
			String type, String domaine, String tel, String fax, String email, String site_web, String description) {
		super();
		this.id_Institution = id_Institution;
		this.nom_fr = nom_fr;
		this.nom_ar = nom_ar;
		this.sigle = sigle;
		this.adresse = adresse;
		this.statut = statut;
		this.type = type;
		this.domaine = domaine;
		this.tel = tel;
		this.fax = fax;
		this.email = email;
		this.site_web = site_web;
		this.description = description;
	}
	
	

}
