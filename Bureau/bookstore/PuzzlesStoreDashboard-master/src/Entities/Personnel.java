package Entities;


import java.util.Date;

public class Personnel {
	int id ;
	
	int cin;
	String nom;
	String prenom;
	String adresse;
	int numero;
	Date dateSignature;
	int salaire;
	String role;
	int soldeConge;
	String mail ;
	String mdp ;
	

	public Personnel() {
		
	}
	public Personnel(int cin, String nom, String prenom, String adresse, int numero, Date dateSignature, int salaire,
			String role, int soldeConge) {
	
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numero = numero;
		this.dateSignature = dateSignature;
		this.salaire = salaire;
		this.role = role;
		this.soldeConge = soldeConge;
	}
	@Override
	public String toString() {
		return "Personnel [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numero="
				+ numero + ", dateSignature=" + dateSignature + ", salaire=" + salaire + ", role=" + role
				+ ", soldeConge=" + soldeConge + "]";
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDateSignature() {
		return dateSignature;
	}
	public void setDateSignature(Date dateSignature) {
		this.dateSignature = dateSignature;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSoldeConge() {
		return soldeConge;
	}
	public void setSoldeConge(int soldeConge) {
		this.soldeConge = soldeConge;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
