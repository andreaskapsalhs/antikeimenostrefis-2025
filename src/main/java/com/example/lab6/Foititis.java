package com.example.lab6;

import java.util.Objects;

public class Foititis {
    private String onoma;
    private String eponymo;
    private short arithmosMitrwou;
    private short etosEisagwgis;

    public Foititis(String onoma, String eponymo, short arithmosMitrwou, short etosEisagwgis) {
        this.onoma = onoma;
        this.eponymo = eponymo;
        this.arithmosMitrwou = arithmosMitrwou;
        this.etosEisagwgis = etosEisagwgis;
    }

    public Foititis(String onoma, String eponymo) {
        this.onoma = onoma;
        this.eponymo = eponymo;
    }

    @Override
    public String toString() {
        return (
                "\nOnoma: " + this.onoma +
                        "\nEponymo: " + this.eponymo +
                        "\nAM: " + this.arithmosMitrwou +
                        "\nEtos Eisagwgis: " + this.etosEisagwgis + "\n"
        );
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getEponymo());
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEponymo() {
        return eponymo;
    }

    public void setEponymo(String eponymo) {
        this.eponymo = eponymo;
    }

    public short getArithmosMitrwou() {
        return arithmosMitrwou;
    }

    public void setArithmosMitrwou(short arithmosMitrwou) {
        this.arithmosMitrwou = arithmosMitrwou;
    }

    public short getEtosEisagwgis() {
        return etosEisagwgis;
    }

    public void setEtosEisagwgis(short etosEisagwgis) {
        this.etosEisagwgis = etosEisagwgis;
    }
}
