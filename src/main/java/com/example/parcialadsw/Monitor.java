package com.example.parcialadsw;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Monitor extends Empleado{
    protected int horas_trabajas;
    ArrayList<Asignaturas> asignaturass ;

    public Monitor(String nombre, int documento, String dependencia, String cargo, float salariosMinimo, int horas_trabajas) {
        super(nombre, documento, dependencia, cargo, salariosMinimo);
        this.horas_trabajas = horas_trabajas;
        this.asignaturass= new ArrayList<Asignaturas>();
    }

    @XmlElement
    public int getHoras_trabajas() {
        return horas_trabajas;
    }

    public void setHoras_trabajas(int horas_trabajas) {
        this.horas_trabajas = horas_trabajas;
    }

    @XmlElement
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
        System.out.println("estas son las horas que tiene"+horas);
        double salario = horas * salariosMinimo * salarioMinimo;
        System.out.println("salario del monitor:"+salario);
        return salario;
    }

    /*public void addAsignatura(Asignaturas as){
        asignaturass.add(as);

    }*/
    public void anadir_asignatura(String nombreasignatura){
        Asignaturas asignatura_nueva = new Asignaturas(nombreasignatura );
        asignaturass.add(asignatura_nueva);
        for(int i = 0;i<asignaturass.size();i ++){
            System.out.println(asignaturass.get(i).getHoras() + asignaturass.get(i).getNombre());
        }
    }
}
