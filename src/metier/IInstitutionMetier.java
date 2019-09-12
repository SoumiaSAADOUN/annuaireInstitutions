package metier;

import java.util.List;

public interface IInstitutionMetier {
public void addInstitution (Institution institution);
public List<Institution> listInstitution(); // consulter l'annuaire
public List<Institution> institutionMotCle(String mc); // consulter l'annuairen par mot clé (nom)
public Institution getInstitution (String idInstitution); // consulter une institution
public void updateInstitution (Institution institution);
public void deletInstitution(String idInstitution);

}
