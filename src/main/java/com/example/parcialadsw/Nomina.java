package com.example.parcialadsw;

import java.util.ArrayList;

public class Nomina {

    public ArrayList <Empleado> empleados = new ArrayList<Empleado>();

    public Nomina() {
        this.empleados = new ArrayList<Empleado>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado em){
        empleados.add(em);

    }
    public void addProfesor(profesor pr){
        empleados.add(pr);

    }
    public void addMonitor(Monitor mo){
        empleados.add(mo);

    }
}
