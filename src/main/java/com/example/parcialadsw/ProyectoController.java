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
    private Button bCrearMonitor;

    @FXML
    private ChoiceBox<String> bEscalafonoProfesor;

    @FXML
    private Button bGuardarArchivo;

    @FXML
    private Button botonCrearProfesor;

    @FXML
    private TextField campoCantSalMinMonitor;

    @FXML
    private TextField campoCantSalMinProfesor;

    @FXML
    private TextField campoIDMonitor;

    @FXML
    private TextField campoIDProfesor;

    @FXML
    private TextField campoNombreMonitor;

    @FXML
    private TextField campoNombreProfesor;

    @FXML
    private ComboBox<String> comboAsignaturasMonitor;

    @FXML
    private ComboBox<String> comboAsignaturasProfesor;

    @FXML
    private ListView<String> listaDependenciaMonitor;

    @FXML
    private ListView<String> listaDependenciaProfesor;

    @FXML
    void cargarArchivo(ActionEvent event) {

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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bEscalafonoProfesor.getItems().addAll(valEscalafono);
        listaDependenciaProfesor.getItems().addAll(oficina);
        comboAsignaturasProfesor.getItems().addAll(asignaturas);
        listaDependenciaMonitor.getItems().addAll(oficina);
        comboAsignaturasMonitor.getItems().addAll(asignaturas);
    }
}
