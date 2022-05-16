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
    public void addProfesor(Profesor pr){
        empleados.add(pr);

    }
    public void addMonitor(Monitor mo){
        empleados.add(mo);

    }
    public double calcularsalario(int doc){
        double sla =0;
        for(int i = 0 ;i <empleados.size();i++){
            if(empleados.get(i).getDocumento() == doc){
                sla = empleados.get(i).calcularSalario();

            }

        }
        return sla;

    }
}
