package com.example.parcialadsw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ProyectoController implements Initializable {

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
    private TextField salarioArchivo;

    @FXML
    private TextField salarioDocumento;

    @FXML
    private TextField salarioNombre;
    @FXML
    private TextField documentoIDAsignaturas;

    @FXML
    void cargarArchivo(ActionEvent event) {

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
            System.out.println("mensaje:"+e);
        }
        catch(profesorexep e){
            System.out.println("mensaje:"+e);

        }
        catch(monitorexep e){
            System.out.println("mensaje:"+e);

        }
        catch(empleadoexep e){
            System.out.println("mensaje:"+e);

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
            System.out.println("mensaje: "+ e);
        }
        catch (profesorexep e){
            System.out.println("mensaje: "+ e);
        }
        catch (monitorexep e){
            System.out.println("mensaje: "+ e);
        }
        catch (Exception e){
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
            System.out.println("mensaje:" + e);
           /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch (Nominaexep e  ){
            System.out.println("mensaje:" + e);
            /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch (Exception e){
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
            System.out.println("mensaje:" + e);
            /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/
        }
        catch (Nominaexep e ){
            System.out.println("mensaje:" + e);
            /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch (Exception e ){

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

            System.out.println(nombre +""+documento+""+dependencia+""+escalafono+""+salariosMinimo);
            minomina.crear_profesor(nombre,documento,dependencia,cargo,salariosMinimo,0,escalafono);

        }
        catch (profesorexep e){
            System.out.println("mensaje:" + e);
           /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch (Nominaexep e){
            System.out.println("mensaje:" + e);
            /*for(int i =0 ; i < minomina.empleados.size();i++){
                System.out.println(minomina.empleados.get(i).documento);
            }*/

        }
        catch (Exception e){

        }


    }
    @FXML
    void generarNomina(ActionEvent event) {

    }

    @FXML
    void guardarArchivo(ActionEvent event) {

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
