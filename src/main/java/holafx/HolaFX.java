package holafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class HolaFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Label saludoLabel = new Label(); // Creamos una etiqueta
        saludoLabel.setText("Aqui saldra el texto"); //Texto que nos aparece en pantalla
        saludoLabel.setLayoutX(20); //Coordenadas del texto
        saludoLabel.setLayoutY(20); //Coordenadas del texto

        Pane root = new Pane();
        root.setStyle("-fx-background-color: cyan"); //Establece un estilo al fondo de pantalla
        root.getChildren().add(saludoLabel);

        Button boton = new Button("Pulsar"); //Creacion de boton
        boton.setDefaultButton(true);
        boton.setPrefSize(100,20);//Tamaño del boton
        boton.setLayoutX(100); //Coordenadas del boton
        boton.setLayoutY(100); //Coordenadas del boton

        //CREACION DE UN EVENTO EN EL BOTON

        boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Me has visto"); //Al pulsar, se muestra en la consola el mensaje
            }
        });

        root.getChildren().add(boton);//Agregamos a la escena el boton

        Scene scene = new Scene(root, 320,200);

        stage.setScene(scene);
        stage.setTitle("HolaFX"); //Añade un titulo a la pantalla
        stage.setResizable(false); //Permite redimensionar la pantalla
        stage.show(); //Muestra la pantalla
    }
}
