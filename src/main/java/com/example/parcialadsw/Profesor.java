package com.example.parcialadsw;

import java.util.ArrayList;

public class Profesor extends Empleado{
    protected int horas_trabajadas;
    protected int escalofon;
    ArrayList<Asignaturas> asignaturass ;


    public Profesor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajadas, int escalofon) {
        super(nombre, documento, dependencia, cargo, salariosMinimo);
        this.horas_trabajadas = horas_trabajadas;
        this.escalofon = escalofon;
        this.asignaturass = new ArrayList<Asignaturas>();
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getEscalofon() {
        return escalofon;
    }

    public void setEscalofon(int escalofon) {
        this.escalofon = escalofon;
    }

    public ArrayList<Asignaturas> getAsignaturas() {
        return asignaturass;
    }

    public void setAsignaturas(ArrayList<Asignaturas> asignaturas) {
        this.asignaturass = asignaturas;
    }

    @Override
    public double calcularSalario() {

        return super.calcularSalario();
        //este no esta completado
    }

    public void addAsignatura(Asignaturas as){
        asignaturass.add(as);

    }
}
