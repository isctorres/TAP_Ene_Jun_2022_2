package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.views.Loteria;

public class Main extends Application {

    private VBox vBox;
    private MenuBar mnbMenu;
    private Menu menCompetencia1, menCompetencia2;
    private MenuItem mitLoteria, mitBuscaminas;


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        mnbMenu = new MenuBar();
        menCompetencia1 = new Menu("Competencia 1");
        mitLoteria = new MenuItem("Loteria");
        mitLoteria.setOnAction(event -> eventoLoteria(1) );
        mitBuscaminas = new MenuItem("Buscaminas");
        mitBuscaminas.setOnAction(event -> eventoLoteria(2));


        menCompetencia1.getItems().addAll(mitLoteria);

        menCompetencia2 = new Menu("Competencia 2");
        mnbMenu.getMenus().addAll(menCompetencia1,menCompetencia2);

        vBox = new VBox();
        vBox.getChildren().addAll(mnbMenu);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(vBox, 300, 275));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    private void eventoLoteria(int opc) {

        switch(opc){
            case 1: new Loteria(); break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}