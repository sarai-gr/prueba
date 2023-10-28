/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class AdminPageController implements Initializable {

      @FXML
    private Button cerrarSesion_Btn;

    @FXML
    private Button empleados_Btn;

    @FXML
    private TableColumn<?, ?> empleados_ColApellido;

    @FXML
    private TableColumn<?, ?> empleados_ColContraseña;

    @FXML
    private TableColumn<?, ?> empleados_ColId;

    @FXML
    private TableColumn<?, ?> empleados_ColNombre;

    @FXML
    private TableColumn<?, ?> empleados_ColPermisos;

    @FXML
    private TableColumn<?, ?> empleados_ColUsuario;

    @FXML
    private Label empleados_EmpleadosLbl;

    @FXML
    private AnchorPane empleados_Form;

    @FXML
    private Button empleados_RefrescarBtn;

    @FXML
    private TableView<?> empleados_TablaEmpleados;

    @FXML
    private AnchorPane main_Form;

    @FXML
    private TextField registroEmpleados_ApellidoField;

    @FXML
    private Label registroEmpleados_ApellidoLbl;

    @FXML
    private Button registroEmpleados_Btn;

    @FXML
    private TextField registroEmpleados_ContraseñaField;

    @FXML
    private Label registroEmpleados_ContraseñaLbl;

    @FXML
    private AnchorPane registroEmpleados_Form;

    @FXML
    private TextField registroEmpleados_NombreField;

    @FXML
    private Label registroEmpleados_NombreLbl;

    @FXML
    private ComboBox<?> registroEmpleados_PermisosCombo;

    @FXML
    private Label registroEmpleados_PermisosLbl;

    @FXML
    private Label registroEmpleados_titulo;

    @FXML
    private TextField registroVehiculos_AñoField;

    @FXML
    private Label registroVehiculos_AñoLbl;

    @FXML
    private Button registroVehiculos_Btn;

    @FXML
    private Button registroVehiculos_CancelarBtn;

    @FXML
    private TextField registroVehiculos_ColorField;

    @FXML
    private AnchorPane registroVehiculos_Form;

    @FXML
    private Button registroVehiculos_GuardarBtn;

    @FXML
    private TextField registroVehiculos_MarcaField;

    @FXML
    private Label registroVehiculos_MarcaLbl;

    @FXML
    private TextField registroVehiculos_ModeloField;

    @FXML
    private TextField registroVehiculos_PlacaField;

    @FXML
    private Label registroVehiculos_RegistroLbl;

    @FXML
    private TextField registroVehiculos_TarjetaField;

    @FXML
    private Label registroVehiculos_TarjetaLbl;

    @FXML
    private ComboBox<?> registroVehiculos_TipoCombo;

    @FXML
    private Button reportes_Btn;

    @FXML
    private Button vehiculos_Btn;

    @FXML
    private TableColumn<?, ?> vehiculos_ColAño;

    @FXML
    private TableColumn<?, ?> vehiculos_ColColor;

    @FXML
    private TableColumn<?, ?> vehiculos_ColMarca;

    @FXML
    private TableColumn<?, ?> vehiculos_ColModelo;

    @FXML
    private TableColumn<?, ?> vehiculos_ColPlaca;

    @FXML
    private TableColumn<?, ?> vehiculos_ColTarjeta;

    @FXML
    private TableColumn<?, ?> vehiculos_ColTipo;

    @FXML
    private ComboBox<?> vehiculos_DisponibleCombo;

    @FXML
    private AnchorPane vehiculos_Form;

    @FXML
    private Button vehiculos_RefrescarBtn;

    @FXML
    private TableView<?> vehiculos_TablaCatalogo;

    @FXML
    private ComboBox<?> vehiculos_tipoField;
    
    public void close(){
        System.exit(0);
    }
    public void minimize(){
        Stage stage = (Stage)main_Form.getScene().getWindow();
        stage.setIconified(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
