package com.example.parcialadsw;

import java.util.ArrayList;

public class Nomina {

    public ArrayList <Empleado> empleados = new ArrayList<Empleado>();

    public Nomina(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
