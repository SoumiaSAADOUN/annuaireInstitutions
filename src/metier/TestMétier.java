package metier;

import java.util.List;

public class TestMétier {

	public static void main(String[] args) {
		
		Institution institution=new Institution();
		institution.setId_Institution("inst2");
		institution.setAdresse("adr");
		institution.setNom_ar("مدرسة");
		institution.setNom_fr("nom");
		institution.setSigle("kj");
		IInstitutionMetier metier = new IInstitutionMetierImp();
		//metier.addInstitution(new Institution("inst1","ina","مدرستي","sdg","gds","dsggs","ezgt","ezgt","et","e","e","",""));
		//metier.addInstitution(institution);
		//metier.deletInstitution("{lll}");
		//metier.listInstitution();
		
		List<Institution> insts = metier.listInstitution(); 
		for (Institution inst:insts) {
			System.out.println(inst.getNom_fr());	}
		System.out.println("--------------------------");
		List<Institution> instss = metier.institutionMotCle("d"); 
		for (Institution inst:instss) {
			System.out.println(inst.getNom_fr());	}

	}

}
