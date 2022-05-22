package com.example.parcialadsw;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Asignaturas {
    private String nombre;
    private int horas;

    public Asignaturas(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }
    public Asignaturas(String nombre){
        this.nombre = nombre;

        if (nombre.equalsIgnoreCase("POO")){
            this.horas = 16;
        }
        else if (nombre.equalsIgnoreCase("ADSw")){
            this.horas = 16;
        } else if (nombre.equalsIgnoreCase("BD")) {
            this.horas = 16;
        } else if (nombre.equalsIgnoreCase("CYR")) {
            this.horas = 24;
        } else if (nombre.equalsIgnoreCase("CDIO")) {
            this.horas = 12;
        }else if (nombre.equalsIgnoreCase("CALCULO1")) {
            this.horas = 24;
        }else if (nombre.equalsIgnoreCase("CALCULO2")) {
            this.horas = 24;
        }
        else if (nombre.equalsIgnoreCase("ARQUITECTURA_PC")) {
            this.horas = 12;
        }

    }

    @XmlAttribute
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
