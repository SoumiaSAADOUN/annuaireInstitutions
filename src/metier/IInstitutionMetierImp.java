package metier;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IInstitutionMetierImp implements IInstitutionMetier {

	@Override
	public void addInstitution(Institution institution) {
		Connection conn= SingletonConnection.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("insert into \"INSTITUTIONS\" (\"id_Institution\", \"NOM_FR\", \"NOM_AR\", \"SIGLE\", \"ADRESSE\", \"STATUT\", \"TYPE\", \"DOMAINE\", \"TEL\", \"FAX\", \"EMAIL\", \"SITE_WEB\", \"DESCRIPTION\", \"RESSOURCES\") values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,institution.getId_Institution());
			ps.setString(2, institution.getNom_fr());
			ps.setString(3, institution.getNom_ar());
			ps.setString(4, institution.getSigle());
			ps.setString(5, institution.getAdresse());
			ps.setString(6, institution.getStatut());
			ps.setString(7, institution.getType());
			ps.setString(8, institution.getDomaine());
			ps.setString(9, institution.getTel());
			ps.setString(10, institution.getFax());
			ps.setString(11, institution.getEmail());
			ps.setString(12, institution.getSite_web());
			ps.setString(13, institution.getDescription());
			ps.setArray(14, (Array) institution.getRessources());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	@Override
	public List<Institution> listInstitution() {
		List<Institution> insts= new ArrayList<Institution>();
		// TODO Auto-generated method stub
		Connection conn= SingletonConnection.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("select * from \"INSTITUTIONS\"");
			ResultSet rs =ps.executeQuery();
			while (rs.next()) {
				Institution inst= new Institution();
				inst.setId_Institution(rs.getString("id_Institution"));
				inst.setNom_fr(rs.getString("nom_fr"));
				inst.setNom_ar(rs.getString("nom_ar"));
				inst.setSigle(rs.getString("sigle"));
				inst.setAdresse(rs.getString("adresse"));
				inst.setStatut(rs.getString("statut"));
				inst.setType(rs.getString("type"));
				inst.setDomaine(rs.getString("domaine"));
				inst.setTel(rs.getString("tel"));
				inst.setFax(rs.getString("fax"));
				inst.setEmail(rs.getString("email"));
				inst.setSite_web(rs.getString("site_web"));
				inst.setDescription(rs.getString("description"));
				//inst.setRessources((List<Ressource>) rs.getArray("ressouces"));
				insts.add(inst);					
			}
			ps.close();
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insts;
	}

	@Override
	public List<Institution> institutionMotCle(String mc) {
		// TODO Auto-generated method stub
		List<Institution> insts= new ArrayList<Institution>();
		// TODO Auto-generated method stub
		Connection conn= SingletonConnection.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("select * from \"INSTITUTIONS\" where \"DESCRIPTION\" like ?");
			ps.setString(1, "%"+mc+"%");
			ResultSet rs =ps.executeQuery();
			while (rs.next()) {
				Institution inst= new Institution();
				inst.setId_Institution(rs.getString("id_Institution"));
				inst.setNom_fr(rs.getString("nom_fr"));
				inst.setNom_ar(rs.getString("nom_ar"));
				inst.setSigle(rs.getString("sigle"));
				inst.setAdresse(rs.getString("adresse"));
				inst.setStatut(rs.getString("statut"));
				inst.setType(rs.getString("type"));
				inst.setDomaine(rs.getString("domaine"));
				inst.setTel(rs.getString("tel"));
				inst.setFax(rs.getString("fax"));
				inst.setEmail(rs.getString("email"));
				inst.setSite_web(rs.getString("site_web"));
				inst.setDescription(rs.getString("description"));
				//inst.setRessources((List<Ressource>) rs.getArray("ressouces"));
				insts.add(inst);					
			}
			ps.close();
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insts;
	}

	@Override
	public Institution getInstitution(String idInstitution) {
	Institution inst = null;
		// TODO Auto-generated method stub
		Connection conn= SingletonConnection.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("select * from \"INSTITUTIONS\" where \"id_Institution\"=?");
			ps.setString(1, idInstitution);
			ResultSet rs =ps.executeQuery();
			if (rs.next()) {
			 inst= new Institution();
				inst.setId_Institution(rs.getString("id_Institution"));
				inst.setNom_fr(rs.getString("nom_fr"));
				inst.setNom_ar(rs.getString("nom_ar"));
				inst.setSigle(rs.getString("sigle"));
				inst.setAdresse(rs.getString("adresse"));
				inst.setStatut(rs.getString("statut"));
				inst.setType(rs.getString("type"));
				inst.setDomaine(rs.getString("domaine"));
				inst.setTel(rs.getString("tel"));
				inst.setFax(rs.getString("fax"));
				inst.setEmail(rs.getString("email"));
				inst.setSite_web(rs.getString("site_web"));
				inst.setDescription(rs.getString("description"));
				//inst.setRessources((List<Ressource>) rs.getArray("ressouces"));
									
			}
			ps.close();
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (inst==null) throw new RuntimeException("Institution introuvable");
		return inst;
	}

	@Override
	public void updateInstitution(Institution institution) {
		Connection conn= SingletonConnection.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("update \"INSTITUTIONS\" set into (\"NOM_FR\",\"NOM_AR\",\"SIGLE\",\"ADRESSE\",\"STATUT\",\"TYPE\",\"DOMAINE\",\"TEL\",\"FAX\",\"EMAIL\",\"SITE_WEB\",\"DESCRIPTION\",\"RESSOURCES\") values (?,?,?,?,?,?,?,?,?,?,?,?,? ");
			
			ps.setString(1, institution.getNom_fr());
			ps.setString(2, institution.getNom_ar());
			ps.setString(3, institution.getSigle());
			ps.setString(4, institution.getAdresse());
			ps.setString(5, institution.getStatut());
			ps.setString(6, institution.getType());
			ps.setString(7, institution.getDomaine());
			ps.setString(8, institution.getTel());
			ps.setString(9, institution.getFax());
			ps.setString(10, institution.getEmail());
			ps.setString(11, institution.getSite_web());
			ps.setString(12, institution.getDescription());
			ps.setArray(13, (Array) institution.getRessources());
			ps.setString(14, institution.getId_Institution());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	@Override
	public void deletInstitution(String idInstitution) {
		Connection conn= SingletonConnection.getConnection();
		try {
			PreparedStatement ps= conn.prepareStatement("delete from \"INSTITUTIONS\" where  \"id_Institution\"=?");
			ps.setString(1, idInstitution);
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
