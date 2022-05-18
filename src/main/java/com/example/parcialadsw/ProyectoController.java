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

    @FXML
    private Button bCargarArchivo;

    @FXML
    private Button bConsultarSal;

    @FXML
    private Button bCrearEmpleado;

    @FXML
    private Button bCrearMonitor;

    @FXML
    private ChoiceBox<String> bEscalafonoProfesor;

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
    private ComboBox<String> comboAsignaturasMonitor;

    @FXML
    private ComboBox<String> comboAsignaturasProfesor;

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
    void cargarArchivo(ActionEvent event) {

    }

    @FXML
    void consultarSalario(ActionEvent event) {

    }

    @FXML
    void crearEmpleado(ActionEvent event) {

    }

    @FXML
    void crearMonitor(ActionEvent event) {

    }

    @FXML
    void crearProfesor(ActionEvent event) {

    }

    @FXML
    void guardarArchivo(ActionEvent event) {

    }
    String [] asignaturas = {"POB","ADSw","BD","CYR","CDIO","CALCULO1","CALCULO2","ARQUITECTURA_PC"};
    String [] oficina = {"SUR","NORTE","CENTRAL","ORIENTE","OCCIDENTE", "H", "JB","NSDC"};
    String [] valEscalafono ={"1","2","3","4"};
    String [] cargos ={"ADMINISTRATIVO","SERVICIOS","ALIMENTACION","TESORERIA","CONSEJERIA"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bEscalafonoProfesor.getItems().addAll(valEscalafono);
        listaDependenciaProfesor.getItems().addAll(oficina);
        comboAsignaturasProfesor.getItems().addAll(asignaturas);
        listaDependenciaMonitor.getItems().addAll(oficina);
        comboAsignaturasMonitor.getItems().addAll(asignaturas);
        listaDependenciaEmpleado.getItems().addAll(oficina);
        lCargos.getItems().addAll(cargos);
    }
}
