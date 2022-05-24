package com.example.parcialadsw;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public interface manejadorarchivos2 {



    /*public static void escribirArchivoXML(String nombreArchivo, ArrayList<Empleado> emples) throws IOException {

        System.out.println("hola4");
        Nomina nom = new Nomina(emples);
        System.out.println("hola5");
        try(BufferedWriter salida = Files.newBufferedWriter(Paths.get(nombreArchivo))){

            System.out.println(salida.getClass().toString());
            System.out.println("hola6");
            JAXB.marshal(nom, salida);
            System.out.println("hola7");
            System.out.println("Escritura del archivo XML finalizada");
        }catch(IOException e) {
            System.out.println("eroor :"+e);
            System.out.println("hola8");
            System.err.println("Error al escribir el archivo XML: "+e.getMessage());
            e.printStackTrace();
        }
    }
    public static void escribir_xml(String nombreArchivo, ArrayList<Empleado> emples){

        try {
            BufferedWriter salida = Files.newBufferedWriter(Paths.get(nombreArchivo));
            JAXBContext con = JAXBContext.newInstance(Nomina.class);
            Marshaller mar = con.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            mar.marshal(emples, salida);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Empleado> leerArchivoXML(String nombreArchivo) throws IOException{
        ArrayList<Empleado> emples = new ArrayList<Empleado>();
        try(BufferedReader entrada = Files.newBufferedReader(Paths.get(nombreArchivo))){
            Nomina resultado = JAXB.unmarshal(entrada, Nomina.class);
            emples = resultado.getEmpleados();
            System.out.println("Lectura de archivo XML finalizada");
        }catch(IOException e) {
            System.err.println("Error al leer el archivo XML: "+e.getMessage());
            e.printStackTrace();
        }
        return emples;
    }*/

    public static void serializararchivo(String nom_archivo, Nomina nomi) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nom_archivo))) {
            out.writeObject(nomi);
            System.out.println(nomi);

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
    }

    public static Nomina deserializar(String nom_archivo) {
        Nomina nomi = null;
        try (ObjectInputStream inp = new ObjectInputStream(new FileInputStream(nom_archivo))) {
            nomi = (Nomina) inp.readObject();
        } catch (IOException e) {
            System.out.println("archivo no existe " + e);
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e);
        }
        return nomi;
    }

    public static void escribir_reporte(ArrayList<Empleado> emples) {

        try {
            Formatter output;
            output = new Formatter("Reporte2.txt"); // open the file
            for(int i = 0 ; i<emples.size();i++){
                String nom = emples.get(i).getNombre();
                int doc = emples.get(i).getDocumento();
                double sal = emples.get(i).calcularSalario();

                output.format("%s %s %d %s %s %f %n",nom ,
                        ",", doc, "," , "\\" , sal );
            }
            if(output != null){
                output.close();

            }
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }




    }
}
