package com.example.reifenwechselapp;

public class UserHelperClass {

    String vorname, nachname, straße, plz, stadt, email, auto, modell;

    public UserHelperClass() {

    }

    public UserHelperClass(String vorname, String nachname, String straße, String plz, String stadt, String email, String auto, String modell) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.straße = straße;
        this.plz = plz;
        this.stadt = stadt;
        this.email = email;
        this.auto = auto;
        this.modell = modell;
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

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}
