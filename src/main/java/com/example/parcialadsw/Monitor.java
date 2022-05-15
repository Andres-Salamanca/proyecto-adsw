package com.example.parcialadsw;

import java.util.ArrayList;

public class Monitor extends Empleado{
    protected int horas_trabajas;
    ArrayList<Asignaturas> asignaturass ;

    public Monitor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajas) {
        super(nombre, documento, dependencia, cargo, salariosMinimo);
        this.horas_trabajas = horas_trabajas;
        this.asignaturass= new ArrayList<Asignaturas>();
    }

    public int getHoras_trabajas() {
        return horas_trabajas;
    }

    public void setHoras_trabajas(int horas_trabajas) {
        this.horas_trabajas = horas_trabajas;
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
        //no esta completado
    }

    public void addAsignatura(Asignaturas as){
        asignaturass.add(as);

    }
}
