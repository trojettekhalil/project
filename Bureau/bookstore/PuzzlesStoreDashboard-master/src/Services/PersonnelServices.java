package Services;
import Entities.Personnel;
import Utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PersonnelServices {




	
	private Connection cnx;

    public PersonnelServices() {
        cnx = MyConnection.getInstance().getConnection();
    }

    public void addPersonnel(Personnel p) throws SQLException {
        String request = "INSERT INTO `Personnel` (`id`,`cin`,`role`, `nom`, `prenom`,`numero`,`mail`,`mdp`,`adresse`,`date_sign`,`salaire`,`solde_conge`)"
                + " VALUES (NULL, '" + p.getCin() + "', '" + p.getRole() + "', '" + p.getNom() + "', '" + p.getPrenom() + "', '" +
        		p.getNumero() + "', '" + p.getMail() + "', '" + p.getMdp() + "', '" + p.getAdresse() + "', '" + p.getDateSignature() + "', '" + p.getSalaire() + "', '" + p.getSoldeConge() + "')";

        Statement stm = cnx.createStatement();
        stm.executeUpdate(request);
    }

    public ArrayList<Personnel> getPersonnels() throws SQLException {
        ArrayList<Personnel> results = new ArrayList<>();
        String request = "SELECT * FROM `Personnel`";
        Statement stm = cnx.createStatement();
        ResultSet rst = stm.executeQuery(request);

        while (rst.next()) {
            Personnel p = new Personnel();
            p.setId(rst.getInt("Id"));
            p.setCin(rst.getInt(2));
            p.setRole(rst.getString(3));
            p.setNom(rst.getString(4));
            p.setPrenom(rst.getString(5));
            p.setNumero(rst.getInt(6));
            p.setMail(rst.getString(7));
            p.setMdp(rst.getString(8));
            p.setAdresse(rst.getString(9));
            p.setDateSignature(rst.getDate(10));
            p.setSalaire(rst.getInt(11));
            p.setSoldeConge(rst.getInt(12));
            results.add(p);
        }

        return results;
    }

    public Personnel getPersonnel(int id) throws SQLException {
        String request = "SELECT * FROM `Personne` WHERE id =" + id;
        Statement stm = cnx.createStatement();
        ResultSet rst = stm.executeQuery(request);

        if (rst.next()) {
            Personnel p = new Personnel();
            p.setId(rst.getInt("Id"));
            p.setCin(rst.getInt(2));
            p.setRole(rst.getString(3));
            p.setNom(rst.getString(4));
            p.setPrenom(rst.getString(5));
            p.setNumero(rst.getInt(6));
            p.setMail(rst.getNString(7));
            p.setMdp(rst.getNString(8));
            p.setAdresse(rst.getString(9));
            p.setDateSignature(rst.getDate(10));
            p.setSalaire(rst.getInt(11));
            p.setSoldeConge(rst.getInt(12));
            return p;
        }

        return null;
    }

    public void updatePersonnel(Personnel p) throws SQLException {
        String request = "UPDATE `Personne` SET `role`=?, `nom`=?, `prenom`=?,`numero`=?,`mail`=?,`mdp`=?,"
        		+ "`adresse`=?,`date_sign`=?,`salaire`=?,`solde_conge`=?"
                + "WHERE `cin` = ?";
        PreparedStatement pst = cnx.prepareStatement(request);

        pst.setString(1, p.getRole());
        pst.setString(2, p.getNom());
        pst.setString(3, p.getPrenom());
        pst.setInt(4, p.getNumero());
        pst.setString(5, p.getMail());
        pst.setString(6, p.getMdp());
        pst.setString(7, p.getAdresse());
        pst.setString(5, p.getMail());
        pst.setString(6, p.getMdp());
        pst.setDate(8, (java.sql.Date) p.getDateSignature());
        pst.setInt(9, p.getSalaire());
        pst.setInt(10, p.getSoldeConge());
        pst.setInt(11, p.getCin());
        
        
        pst.executeUpdate();

    }

    public void deletePersonne(int cin) throws SQLException {
        String request = "DELETE FROM `Personnel` WHERE cin =" + cin;
        Statement stm = cnx.createStatement();
        stm.executeUpdate(request);
	

}
}
