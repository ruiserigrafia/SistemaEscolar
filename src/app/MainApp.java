package app;

import controller.AppController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Rui Guilherme
 */
public class MainApp extends Application {
    
    private Stage estagio;
    private Scene cena;
    private Parent root;
    private FXMLLoader loader;
    private AppController controller;
            
    @Override
    public void start(Stage stage) throws Exception {        
        iniciarComponetes();
        configurarComponentes();
        iniciarEstagio();
        stage = getStagio();        
        stage.show();
    }
    
    /**
     * 
     * @return - <i>Pega o objeto {@link Stage}  estagio</i> 
     */
    public Stage getStagio() {
        return estagio;
    }
    
    /** 
     * Iniciar todos os componentes da Classe {@link  MainApp}
     */   
    private void iniciarComponetes() {        
        loader = new FXMLLoader();
        root = new BorderPane();
        cena = new Scene(root, 400, 300);
        estagio = new Stage();
    }
    
    private void configurarComponentes() throws IOException {
        loader.setLocation(MainApp.class.getResource("/view/AppFXML.fxml"));        
        root = (BorderPane)loader.load();
        loader.setRoot(this);
        loader.setController(controller);
        cena.getStylesheets().add(getClass().getResource("estilo.css").toExternalForm());
    }
    
    private void iniciarEstagio() {
        estagio.setTitle("Sistema Escolar");
        estagio.centerOnScreen();
        estagio.setScene(cena);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
