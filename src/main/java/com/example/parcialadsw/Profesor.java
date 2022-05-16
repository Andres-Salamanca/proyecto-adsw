package com.example.parcialadsw;

import java.util.ArrayList;

public class Profesor extends Empleado{
    protected int horas_trabajadas;
    protected int escalofon;
    ArrayList<Asignaturas> asignaturass ;


    public Profesor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajadas , int escalofon) {
        super(nombre, documento, dependencia, cargo, salariosMinimo);
        this.horas_trabajadas = horas_trabajadas;
        this.escalofon = escalofon;
        this.asignaturass = new ArrayList<Asignaturas>();
        if(this.escalofon == 1){
            this.salariosMinimo = 5;
        }
        else if (this.escalofon == 2){
            this.salariosMinimo = 2;
        }
        else if (this.escalofon == 3){
            this.salariosMinimo = 3;
        }
        else if (this.escalofon == 4){
            this.salariosMinimo = 7;
        }

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
        double horas=0;
        for (int i =0 ; i < asignaturass.size();i++){
            horas += asignaturass.get(i).getHoras() ;
        }
        double salario = (salariosMinimo * salarioMinimo * horas)*0.88;
        return salario;

    }

    public void addAsignatura(Asignaturas as){
        asignaturass.add(as);

    }
}
