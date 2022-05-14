package com.example.parcialadsw;

import java.util.ArrayList;

public class Monitor extends Empleado{
    protected int horas_trabajas;
    ArrayList<Asignaturas> asignaturas ;

    public Monitor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajas, ArrayList<Asignaturas> asignaturas) {
        super(nombre, documento, dependencia, cargo, salariosMinimo);
        this.horas_trabajas = horas_trabajas;
        this.asignaturas = asignaturas;
    }

    public int getHoras_trabajas() {
        return horas_trabajas;
    }

    public void setHoras_trabajas(int horas_trabajas) {
        this.horas_trabajas = horas_trabajas;
    }

    public ArrayList<Asignaturas> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignaturas> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
