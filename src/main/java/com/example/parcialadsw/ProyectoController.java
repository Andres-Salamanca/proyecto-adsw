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
    private ChoiceBox<String> bEscalafonoProfesor;
    String [] valEscalafono ={"1","2","3","4"};

    @FXML
    private Button bGuardarArchivo;

    @FXML
    private Button botonCrearProfesor;

    @FXML
    private TextField campoCantSalMinProfesor;

    @FXML
    private TextField campoIDProfesor;

    @FXML
    private TextField campoNombreProfesor;

    @FXML
    private ComboBox<String> comboAsignaturasProfesor;
    String [] asignaturas = {"POB","ADSw","BD","CYR","CDIO","CALCULO1","CALCULO2","ARQUITECTURA_PC"};

    @FXML
    private ListView<String> listaDependenciaProfesor;
    String [] oficina = {"SUR","NORTE","CENTRAL","ORIENTE","OCCIDENTE", "H", "JB","NSDC"};

    @FXML
    void cargarArchivo(ActionEvent event) {

    }

    @FXML
    void crearProfesor(ActionEvent event) {

    }

    @FXML
    void guardarArchivo(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bEscalafonoProfesor.getItems().addAll(valEscalafono);
        listaDependenciaProfesor.getItems().addAll(oficina);
        comboAsignaturasProfesor.getItems().addAll(asignaturas);
    }
}
