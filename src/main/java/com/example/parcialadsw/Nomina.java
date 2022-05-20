package com.example.parcialadsw;

import java.util.ArrayList;

public class Nomina {

    public ArrayList <Empleado> empleados ;

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
    public void crear_empleado(String no , int docume,String dep,String car, float sa){

        Empleado emple = new Empleado(no , docume,dep,car,sa);
        empleados.add(emple);

    }
    public void crear_monitor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajas){

        Monitor moni = new Monitor(nombre,documento,dependencia,cargo,salariosMinimo,horas_trabajas);
        empleados.add(moni);
    }
    public void crear_profesor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajadas , int escalofon){
        Profesor profe = new Profesor(nombre,documento,dependencia,cargo,salariosMinimo,horas_trabajadas,escalofon);
        empleados.add(profe);

    }
}
