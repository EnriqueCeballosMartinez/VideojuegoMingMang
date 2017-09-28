/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author cebal
 */
public class FXMLDocumentController implements Initializable {

    @FXML private Label lbBienvenida;
    @FXML private Label lbUsuario;
    @FXML private Label lbPassword;
    @FXML private Button btIngresar;
    @FXML private Button btSalir;
    @FXML private Label lbCuenta;
    @FXML private Hyperlink hpRegistrarse;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       lbBienvenida.setText(java.util.ResourceBundle.getBundle("juego/InicioSesion").getString("Bienvenida"));
       lbUsuario.setText(java.util.ResourceBundle.getBundle("juego/InicioSesion").getString("Usuario"));
       lbPassword.setText(java.util.ResourceBundle.getBundle("juego/InicioSesion").getString("Password"));
       btIngresar.setText(java.util.ResourceBundle.getBundle("juego/InicioSesion").getString("Ingresar"));
       btSalir.setText(java.util.ResourceBundle.getBundle("juego/InicioSesion").getString("Salir"));
       lbCuenta.setText(java.util.ResourceBundle.getBundle("juego/InicioSesion").getString("Registrate"));
       hpRegistrarse.setText(java.util.ResourceBundle.getBundle("juego/InicioSesion").getString("Registrate"));
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
}
