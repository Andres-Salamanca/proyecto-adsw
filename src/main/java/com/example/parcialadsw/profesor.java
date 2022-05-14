package com.example.parcialadsw;

import java.util.ArrayList;

public class profesor extends Empleado{
    protected int horas_trabajadas;
    protected String escalofon;
    ArrayList<Asignaturas> asignaturas ;


    public profesor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajadas, String escalofon, ArrayList<Asignaturas> asignaturas) {
        super(nombre, documento, dependencia, cargo, salariosMinimo);
        this.horas_trabajadas = horas_trabajadas;
        this.escalofon = escalofon;
        this.asignaturas = asignaturas;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getEscalofon() {
        return escalofon;
    }

    public void setEscalofon(String escalofon) {
        this.escalofon = escalofon;
    }

    public ArrayList<Asignaturas> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignaturas> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
