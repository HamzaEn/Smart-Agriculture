package Model;

import java.io.Serializable;

public class Capteur implements Serializable {
	static final long serialVersionUID = 1L;
	public Capteur(String designation, String type, double prix, String image) {
		super();
		Designation = designation;
		setType(type);
		Prix = prix;
		this.setImage(image);
	}

	protected int id_Capteur;
	protected String Designation;
	private String Type;
	private String image;
	protected double Prix;
	
	public Capteur(int id_Capteur, String designation, String type, double prix, String img) {
		this.id_Capteur = id_Capteur;
		Designation = designation;
		setType(type);
		Prix = prix;
		this.setImage(image);
	}

	public int getId_Capteur() {
		return id_Capteur;
	}

	public void setId_Capteur(int id_Capteur) {
		this.id_Capteur = id_Capteur;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	public String getImage() {
		return image;
	}

	protected void setImage(String image) {
		this.image = image;
	}
	
	
	
}
