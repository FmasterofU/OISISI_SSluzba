package gui.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5260140464028562379L;
	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String adresa;
	private String telefon;
	private String eMail;
	private String brIndeksa;
	private String datumUpisa;
	private short godStudija;
	private NacinFinansiranja finansiranje;
	private double prosecnaOcena;
	private ArrayList<Predmet> slusaPredmete;
	
	public Student(String ime, String prezime, String datumRodjenja, String adresa, String telefon, String eMail,
			String brIndeksa, String datumUpisa, short godStudija, NacinFinansiranja finansiranje, double prosecnaOcena) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.adresa = adresa;
		this.telefon = telefon;
		this.eMail = eMail;
		this.brIndeksa = brIndeksa;
		this.datumUpisa = datumUpisa;
		this.godStudija = godStudija;
		this.finansiranje = finansiranje;
		this.prosecnaOcena = prosecnaOcena;
		this.slusaPredmete = new ArrayList<Predmet>();
	}
	
	public Student(String ime, String prezime, String datumRodjenja, String adresa, String telefon, String eMail, String brIndeksa, 
			String datumUpisa, short godStudija, NacinFinansiranja finansiranje, double prosecnaOcena, ArrayList<Predmet> slusaPredmete) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.adresa = adresa;
		this.telefon = telefon;
		this.eMail = eMail;
		this.brIndeksa = brIndeksa;
		this.datumUpisa = datumUpisa;
		this.godStudija = godStudija;
		this.finansiranje = finansiranje;
		this.prosecnaOcena = prosecnaOcena;
		this.slusaPredmete = slusaPredmete;
	}
	
	public Student() {
		super();
		this.ime = "Pera";
		this.prezime = "Peric";
		this.datumRodjenja = "01.01.1950.";
		this.adresa = "Bulevar Oslobodjenja 1, Novi Sad";
		this.telefon = "060/111-111";
		this.eMail = "pera.peric@gmail.com";
		this.brIndeksa = "BR-1/2000";
		this.datumUpisa = "01.10.2000.";
		this.godStudija = 1;
		this.finansiranje = NacinFinansiranja.BUDZET;
		this.prosecnaOcena = 5.0;
		this.slusaPredmete = new ArrayList<Predmet>();
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public String getDatumUpisa() {
		return datumUpisa;
	}

	public void setDatumUpisa(String datumUpisa) {
		this.datumUpisa = datumUpisa;
	}

	public short getGodStudija() {
		return godStudija;
	}

	public void setGodStudija(short godStudija) {
		this.godStudija = godStudija;
	}

	public NacinFinansiranja getFinansiranje() {
		return finansiranje;
	}

	public void setFinansiranje(NacinFinansiranja finansiranje) {
		this.finansiranje = finansiranje;
	}

	public double getProsecnaOcena() {
		return prosecnaOcena;
	}

	public void setProsecnaOcena(double prosecnaOcena) {
		this.prosecnaOcena = prosecnaOcena;
	}

	public ArrayList<Predmet> getSlusaPredmete() {
		return slusaPredmete;
	}

	public void setSlusaPredmete(ArrayList<Predmet> slusaPredmete) {
		this.slusaPredmete = slusaPredmete;
	}

	@Override
	public String toString() {
		String ret =  "Student [ime=" + ime + ", prezime=" + prezime + ", datumRodjenja=" + datumRodjenja + ", adresa="
				+ adresa + ", telefon=" + telefon + ", eMail=" + eMail + ", brIndeksa=" + brIndeksa + ", datumUpisa="
				+ datumUpisa + ", godStudija=" + godStudija + ", finansiranje=" + finansiranje + ", prosecnaOcena=" + prosecnaOcena
				+ ".\n\t\tSlusa predmete sa siframa: ";
		if(slusaPredmete.isEmpty())		ret += "Ne slusa niti jedan predmet! ";
		else
		{
			for(Predmet s : slusaPredmete)
			{
				ret += s.getSifra() + " ";
			}
		}
		ret += "]";
		return ret;
	}

}
