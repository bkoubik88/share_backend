package com.sharing;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class UserMD {

	private String _id;
	private String vorname;
	private String nachname;
	private String anzeigeName;
	private String email;
	private Boolean hatKonto;
	private String paypaylId;
	private String betrag;
	private String latitude;
	private String longtitude;
	private String bild;
	private String passwort;
	private String[] gemerkt;
	private String[] bemerkung;
	private String[] angefragt;
	private String[] wurdeAngefragtVonWem;
	private String[] wurdeAngefragt;
	private String[] gehnemigteAnfragen;
	private String[] nichtGehnemigteAnfragen;
	private String[] eingestellteArtikel;
	private String tel;
	private String strasse;
	private String ort;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getAnzeigeName() {
		return anzeigeName;
	}

	public void setAnzeigeName(String anzeigeName) {
		this.anzeigeName = anzeigeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getHatKonto() {
		return hatKonto;
	}

	public void setHatKonto(Boolean hatKonto) {
		this.hatKonto = hatKonto;
	}

	public String getPaypaylId() {
		return paypaylId;
	}

	public void setPaypaylId(String paypaylId) {
		this.paypaylId = paypaylId;
	}

	public String getBetrag() {
		return betrag;
	}

	public void setBetrag(String betrag) {
		this.betrag = betrag;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

	public String getBild() {
		return bild;
	}

	public void setBild(String bild) {
		this.bild = bild;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public String[] getGemerkt() {
		return gemerkt;
	}

	public void setGemerkt(String[] gemerkt) {
		this.gemerkt = gemerkt;
	}

	public String[] getBemerkung() {
		return bemerkung;
	}

	public void setBemerkung(String[] bemerkung) {
		this.bemerkung = bemerkung;
	}

	public String[] getAngefragt() {
		return angefragt;
	}

	public void setAngefragt(String[] angefragt) {
		this.angefragt = angefragt;
	}

	public String[] getWurdeAngefragtVonWem() {
		return wurdeAngefragtVonWem;
	}

	public void setWurdeAngefragtVonWem(String[] wurdeAngefragtVonWem) {
		this.wurdeAngefragtVonWem = wurdeAngefragtVonWem;
	}

	public String[] getWurdeAngefragt() {
		return wurdeAngefragt;
	}

	public void setWurdeAngefragt(String[] wurdeAngefragt) {
		this.wurdeAngefragt = wurdeAngefragt;
	}

	public String[] getGehnemigteAnfragen() {
		return gehnemigteAnfragen;
	}

	public void setGehnemigteAnfragen(String[] gehnemigteAnfragen) {
		this.gehnemigteAnfragen = gehnemigteAnfragen;
	}

	public String[] getNichtGehnemigteAnfragen() {
		return nichtGehnemigteAnfragen;
	}

	public void setNichtGehnemigteAnfragen(String[] nichtGehnemigteAnfragen) {
		this.nichtGehnemigteAnfragen = nichtGehnemigteAnfragen;
	}

	public String[] getEingestellteArtikel() {
		return eingestellteArtikel;
	}

	public void setEingestellteArtikel(String[] eingestellteArtikel) {
		this.eingestellteArtikel = eingestellteArtikel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public UserMD(String _id, String vorname, String nachname, String anzeigeName, String email, Boolean hatKonto,
			String paypaylId, String betrag, String latitude, String longtitude, String bild, String passwort,
			String[] gemerkt, String[] bemerkung, String[] angefragt, String[] wurdeAngefragtVonWem,
			String[] wurdeAngefragt, String[] gehnemigteAnfragen, String[] nichtGehnemigteAnfragen,
			String[] eingestellteArtikel, String tel, String strasse, String ort) {
		super();
		this._id = _id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.anzeigeName = anzeigeName;
		this.email = email;
		this.hatKonto = hatKonto;
		this.paypaylId = paypaylId;
		this.betrag = betrag;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.bild = bild;
		this.passwort = passwort;
		this.gemerkt = gemerkt;
		this.bemerkung = bemerkung;
		this.angefragt = angefragt;
		this.wurdeAngefragtVonWem = wurdeAngefragtVonWem;
		this.wurdeAngefragt = wurdeAngefragt;
		this.gehnemigteAnfragen = gehnemigteAnfragen;
		this.nichtGehnemigteAnfragen = nichtGehnemigteAnfragen;
		this.eingestellteArtikel = eingestellteArtikel;
		this.tel = tel;
		this.strasse = strasse;
		this.ort = ort;
	}

}
