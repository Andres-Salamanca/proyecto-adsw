package com.example.parcialadsw;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

public class Nomina implements Serializable {


    public ArrayList <Empleado> empleados ;

    public Nomina() {
        this.empleados = new ArrayList<Empleado>();
    }

    public Nomina(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }



    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /*public void addEmpleado(Empleado em){
        empleados.add(em);

    }
    public void addProfesor(Profesor pr){
        empleados.add(pr);

    }
    public void addMonitor(Monitor mo){
        empleados.add(mo);

    }*/
    public double calcularsalario(int doc) throws Nominaexep , monitorexep , profesorexep,empleadoexep{
        double sla =0;
        int encontro = buscar_persona_calcularsalario(doc);
        if (encontro != -1){
            sla = empleados.get(encontro).calcularSalario();
        }
        else if (encontro ==-1) {
            throw new Nominaexep("No se puede calcular salario");
        }

        return sla;

    }
    public void crear_empleado(String no , int docume,String dep,String car, float sa) throws Nominaexep ,empleadoexep{
       boolean repetido = documento_repetido(docume);
       if (repetido == true){
           throw new empleadoexep("no se puede crear este empleado, documento ya existente");
       }
       else if (repetido == false) {
           Empleado emple = new Empleado(no , docume,dep,car,sa);
           empleados.add(emple);
       }



    }
    public void crear_monitor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajas)throws Nominaexep ,monitorexep{
        boolean repetido = documento_repetido(documento);
        if (repetido == true){
            throw new monitorexep("no se puede crear este empleado, documento ya existente");
        }
        else if (repetido == false) {
            Monitor moni = new Monitor(nombre,documento,dependencia,cargo,salariosMinimo,horas_trabajas);
            empleados.add(moni);

        }


    }
    public void crear_profesor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajadas , int escalofon) throws Nominaexep ,profesorexep{
        boolean repetido = documento_repetido(documento);
        if (repetido == true){
            throw new profesorexep("no se puede crear este empleado, documento ya existente");
        }
        else if(repetido == false){
            Profesor profe = new Profesor(nombre,documento,dependencia,cargo,salariosMinimo,horas_trabajadas,escalofon);
            empleados.add(profe);
        }


    }
    public int buscar_persona_calcularsalario(int documento )throws Nominaexep{
        int encontro = -1;
        for(int i = 0 ;i <empleados.size()  ;i++){
            if (empleados.get(i).getDocumento() == documento){
                encontro = i;
            }
            else if (empleados.get(i).getDocumento() != documento && empleados.size() == i) {

                throw new Nominaexep("No se encontro persona con el documento");
            }
        }

        return encontro;
    }
    public boolean documento_repetido(int docu) throws Nominaexep{
        boolean repetido= false;
        for(int i =0 ; i < empleados.size();i++){
            if(docu == empleados.get(i).getDocumento()){
                repetido = true;
                throw new Nominaexep("Este documento ya existe");
            }
            else{
                repetido = false;
            }
        }
        return repetido;

    }
    public void anadir_asig(int documento , String nombreasignatura)throws Nominaexep, profesorexep,monitorexep{
        int existe =buscar_persona_calcularsalario(documento) ;

        if(existe == -1){
            throw new profesorexep("no hay profesor para asignar asignatura");

        } else if (existe !=-1 && empleados.get(existe) instanceof Profesor) {
            ((Profesor) empleados.get(existe)).anadir_asignatura(nombreasignatura);
        } else if (existe !=-1 && empleados.get(existe) instanceof Monitor) {
            ((Monitor) empleados.get(existe)).anadir_asignatura(nombreasignatura);
        }
    }

}
