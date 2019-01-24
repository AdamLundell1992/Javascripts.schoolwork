package week14;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.util.Optional;

/**
 * Created by u1853373 on 21/01/2019.
 */


public class JavaFXMenuDemo extends Application {

    // A class to demo JavaFX menus, information alerts, and custom dialogs

    private MenuBar menuBar;

    private Menu fileMenu;
    private Menu helpMenu;

    private MenuItem factoryPopUpMI;
    private MenuItem myDialogMI;
    private MenuItem exitMI;
    private MenuItem aboutMI;
    private MenuItem SaveResultsMI;
    private Optional<String> result;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // initialise all the GUI components
        menuBar = new MenuBar();

        fileMenu = new Menu("File");
        helpMenu = new Menu("Help");

        factoryPopUpMI = new MenuItem("Factory PopUp...");
        myDialogMI = new MenuItem("Custom Dialog Box");
        SaveResultsMI = new MenuItem("Save");
        exitMI = new MenuItem("Exit");
        aboutMI = new MenuItem("About...");

        // add menu items to menus and menus to the menu bar
        fileMenu.getItems().add(factoryPopUpMI);
        fileMenu.getItems().add(myDialogMI);
        fileMenu.getItems().add(SaveResultsMI);
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(exitMI);

        helpMenu.getItems().add(aboutMI);

        menuBar.getMenus().addAll(fileMenu, helpMenu);


        // add listeners to the menu items to make things happen
        exitMI.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        SaveResultsMI.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Alert factoryAlert = new Alert(Alert.AlertType.INFORMATION);
                factoryAlert.setTitle("Message to user");
                factoryAlert.setContentText("S.A.V.E.D");
                factoryAlert.setHeaderText("Your changes are successfully ");
                factoryAlert.showAndWait();
            }
        });
        //
        factoryPopUpMI.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TextInputDialog dialog = new TextInputDialog("Type fruit");

                dialog.setTitle("Question");
                dialog.setHeaderText("What is your favorite fruit:");
                dialog.setContentText("Fruit:");
                result = dialog.showAndWait();

                result.ifPresent(name -> {
                    System.out.println(result.get());
                });
                //Alert factoryAlert = new Alert(Alert.AlertType.INFORMATION);
                //factoryAlert.setTitle("Factory Message");
                //factoryAlert.setContentText("I come in many canned forms");
                //factoryAlert.setHeaderText("Factory Information");
                //factoryAlert.showAndWait();
            }
        });

        myDialogMI.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ExampleDialog dialog = new ExampleDialog(result.get());
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                dialog.show();

            }

        });


        // create a VBox, and add the menu bar to it
        VBox vb = new VBox();
        vb.getChildren().add(menuBar);

        // add the VBox to a 'scene'...
        Scene scene = new Scene(vb, 350,150);

        // ... and add the scene to the primary stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Menu Demo");
        primaryStage.show();

    }
}
