package com.example.basededatos;

public class Clases {
    String claseid, seccion, area, tema;

    // Constructor con parámetros
    public Clases(String claseid, String seccion, String area, String tema) {
        this.claseid = claseid;
        this.seccion = seccion;
        this.area = area;
        this.tema = tema;
    }
    // Getters
    public String getClaseid() {
        return claseid;
    }
    public String getSeccion() {
        return seccion;
    }
    public String getArea() {
        return area;
    }
    public String getTema() {
        return tema;
    }
}
