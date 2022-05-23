package com.example.parcialadsw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

public class ProyectoController implements Initializable, manejadorarchivos2 {

    Nomina minomina = new Nomina();


    @FXML
    private Button bCargarArchivo;

    @FXML
    private Button bConsultarSal;

    @FXML
    private Button bCrearEmpleado;

    @FXML
    private Button bCrearMonitor;
    @FXML
    private Button bGenerarNomina;

    @FXML
    private ChoiceBox<String> bEscalafonoProfesor;
    @FXML
    private Button bAgregarAsignatura;
    @FXML
    private Button bGuardarArchivo;

    @FXML
    private Button botonCrearProfesor;

    @FXML
    private TextField campoCantSalMinEmpleado;

    @FXML
    private TextField campoCantSalMinMonitor;

    @FXML
    private TextField campoCantSalMinProfesor;

    @FXML
    private TextField campoIDEmpleado;

    @FXML
    private TextField campoIDMonitor;

    @FXML
    private TextField campoIDProfesor;

    @FXML
    private TextField campoNombreMonitor;

    @FXML
    private TextField campoNombrePEmpleado;

    @FXML
    private TextField campoNombreProfesor;
    @FXML
    private ComboBox<String> comboAsignaturas;
    @FXML
    private ComboBox<String> lCargos;

    @FXML
    private ListView<String> listaDependenciaEmpleado;

    @FXML
    private ListView<String> listaDependenciaMonitor;

    @FXML
    private ListView<String> listaDependenciaProfesor;
    @FXML
    private Text mError;
    @FXML
    private Text mErrorpro;
    @FXML
    private Text mErrorem;
    @FXML
    private Text mErrorsa;
    @FXML
    private Text mErrorasi;
    @FXML
    private TextField salarioArchivo;

    @FXML
    private TextField salarioDocumento;

    @FXML
    private TextField salarioNombre;
    @FXML
    private TextField documentoIDAsignaturas;

    @FXML
    void cargarArchivo(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        FileChooser.ExtensionFilter extensiones = new FileChooser.ExtensionFilter("Text files" , "*.xml");
        chooser.getExtensionFilters().add(extensiones);
        File archnomi = chooser.showOpenDialog(null);
        String sarchivo = archnomi.toString();
        System.out.println(sarchivo);
        if (archnomi != null){
            try{
                minomina = new Nomina(manejadorarchivos2.leerArchivoXML(sarchivo));

            }
            catch (Exception e){
                System.out.println("error");

            }

        }
    }

    @FXML
    void consultarSalario(ActionEvent event) {

        try{

            int documen = Integer.parseInt(salarioDocumento.getText());
            double salario = minomina.calcularsalario(documen);
            salarioArchivo.setText(String.valueOf(salario));
            int posicion = minomina.buscar_persona_calcularsalario(documen);
            salarioNombre.setText(minomina.empleados.get(posicion).getNombre());
        }
        catch(Nominaexep e){
            mErrorsa.setText(e.toString());
            System.out.println("mensaje: "+ e);
        }
        catch(profesorexep e){
            mErrorsa.setText(e.toString());
            System.out.println("mensaje: "+ e);

        }
        catch(monitorexep e){
            mErrorsa.setText(e.toString());
            System.out.println("mensaje: "+ e);

        }
        catch(empleadoexep e){
            mErrorsa.setText(e.toString());
            System.out.println("mensaje: "+ e);

        }

    }
    @FXML
    void agregarAsignatura(ActionEvent event) {
        try {
            String asig =comboAsignaturas.getValue();
            int docum = Integer.parseInt(documentoIDAsignaturas.getText());
            minomina.anadir_asig(docum,asig);
        }
        catch (Nominaexep e){
            mErrorasi.setText(e.toString());
            System.out.println("mensaje: "+ e);
        }
        catch (profesorexep e){
            mErrorasi.setText(e.toString());
            System.out.println("mensaje: "+ e);
        }
        catch (monitorexep e){
            mErrorasi.setText(e.toString());
            System.out.println("mensaje: "+ e);
        }
        catch(NumberFormatException e){
            mErrorasi.setText("Documento invalido");
            System.out.println("mensaje: "+ e);
        }
        catch (Exception e){
            mErrorasi.setText(e.toString());
            System.out.println("mensaje: "+ e);
        }



    }

    @FXML
    void crearEmpleado(ActionEvent event) {
        System.out.println("entro");
        try {
            System.out.println("entro2");
            String nombre ="";
            int documento =0;
            String dependencia;
            String cargo ="";
            float salariosMinimo;

            nombre = campoNombrePEmpleado.getText();
            documento = Integer.parseInt(campoIDEmpleado.getText());
            dependencia = listaDependenciaEmpleado.getSelectionModel().getSelectedItem();
            cargo = lCargos.getSelectionModel().getSelectedItem();
            salariosMinimo = Float.parseFloat(campoCantSalMinEmpleado.getText());
            System.out.println(nombre +""+documento+""+dependencia+""+cargo+""+salariosMinimo);
            minomina.crear_empleado(nombre,documento,dependencia,cargo,salariosMinimo);

        }
        catch (empleadoexep e ){
            mErrorem.setText(e.toString());
            System.out.println("mensaje:" + e);
           /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch (Nominaexep e  ){
            mErrorem.setText(e.toString());
            System.out.println("mensaje:" + e);
            /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch(NumberFormatException e){
            mErrorem.setText("Documento invalido");
            System.out.println("mensaje: "+ e);
        }
        catch (Exception e){
            mErrorem.setText(e.toString());
            System.out.println("mensaje:" + e);
        }



    }

    @FXML
    void crearMonitor(ActionEvent event) {
        try {
            String nombre ="";
            int documento =0;
            String dependencia;

            float salariosMinimo;
            String cargo = "monitor";
            nombre = campoNombreMonitor.getText();
            documento = Integer.parseInt(campoIDMonitor.getText());
            dependencia = listaDependenciaMonitor.getSelectionModel().getSelectedItem();
            salariosMinimo = Float.parseFloat(campoCantSalMinMonitor.getText());
            System.out.println(nombre +""+documento+""+dependencia+""+salariosMinimo);
            minomina.crear_monitor(nombre,documento,dependencia,cargo,salariosMinimo,0);

        }
        catch (monitorexep e ){
            mError.setText(e.toString());
            System.out.println("mensaje:" + e);
            /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/
        }
        catch (Nominaexep e ){
            mError.setText(e.toString());
            System.out.println("mensaje:" + e);
            /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch(NumberFormatException e){
            mError.setText("Documento invalido");
            System.out.println("mensaje: "+ e);
        }
        catch (Exception e ){
            mError.setText(e.toString());

        }

    }

    @FXML
    void crearProfesor(ActionEvent event) {
        try {
            String nombre ="";
            int documento =0;
            String dependencia;
            int escalafono;
            float salariosMinimo;
            String cargo = "profesor";
            nombre = campoNombreProfesor.getText();
            documento = Integer.parseInt(campoIDProfesor.getText());
            dependencia = listaDependenciaProfesor.getSelectionModel().getSelectedItem();
            escalafono =  Integer.parseInt(bEscalafonoProfesor.getValue());
            salariosMinimo = Float.parseFloat(campoCantSalMinProfesor.getText());

            System.out.println(nombre +" "+documento+" "+dependencia+" "+escalafono+" "+salariosMinimo);
            minomina.crear_profesor(nombre,documento,dependencia,cargo,salariosMinimo,0,escalafono);

        }
        catch (profesorexep e){
            mError.setText(e.toString());
            System.out.println("mensaje:" + e);
           /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch (Nominaexep e){
            mErrorpro.setText(e.toString());
            System.out.println("mensaje:" + e);
            /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch(NumberFormatException e){
            mErrorpro.setText("Documento invalido o SMVM invalidos");
            System.out.println("mensaje: "+ e);
        }
        catch (Exception e){
            mErrorpro.setText(e.toString());
        }


    }
    @FXML
    void generarNomina(ActionEvent event) {

        File Reporte;
        try {
            Reporte = new File("Reporte.txt");
            System.out.println("ayuda");
            if (Reporte.createNewFile()) {
                System.out.println("se ha creado el archivo reporte");
            }
    } catch (Throwable e) {
        System.err.println("no se creo el archivo REPORTE" + e);
    }
        System.out.println("si no salio error, el archivo esta creado");


}

    @FXML
    void guardarArchivo(ActionEvent event) {

        String nombrearchivo2= "Nomina.xml";
        //String nombrearchivo= "C:\\Users\\hijitos\\Documents\\tercer semestre\\analisis y diseño de software\\proyectofinal\\proyecto-adsw\\src\\main\\resources\\com\\example\\parcialadsw\\Nomina.xml";
        System.out.println(nombrearchivo2);
        //manejadorarchivos2.escribir_xml(nombrearchivo,minomina.getEmpleados());
        System.out.println("hola");
        try {
            System.out.println("hola2");
            manejadorarchivos2.escribirArchivoXML(nombrearchivo2,minomina.getEmpleados());
            System.out.println("hola3");
        } catch (IOException e) {
            System.out.println(e.getCause());
            throw new RuntimeException(e);

        }






    }

    String [] asignaturas = {"POO","ADSw","BD","CYR","CDIO","CALCULO1","CALCULO2","ARQUITECTURA_PC"};
    String [] oficina = {"SUR","NORTE","CENTRAL","ORIENTE","OCCIDENTE", "H", "JB","NSDC"};
    String [] valEscalafono ={"1","2","3","4"};
    String [] cargos ={"ADMINISTRATIVO","SERVICIOS","ALIMENTACION","TESORERIA","CONSEJERIA","CLERIGO"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bEscalafonoProfesor.getItems().addAll(valEscalafono);
        listaDependenciaProfesor.getItems().addAll(oficina);
        comboAsignaturas.getItems().addAll(asignaturas);
        listaDependenciaMonitor.getItems().addAll(oficina);
        listaDependenciaEmpleado.getItems().addAll(oficina);
        lCargos.getItems().addAll(cargos);
    }
}
