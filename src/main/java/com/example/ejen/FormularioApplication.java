package com.example.ejen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase principal de la aplicación JavaFX que inicia la interfaz gráfica de usuario.
 * La aplicación carga un archivo FXML para construir la interfaz de un formulario de registro.
 */
public class FormularioApplication extends Application {

    /**
     * Método principal de inicio de la aplicación JavaFX.
     *
     * @param primaryStage la ventana principal de la aplicación donde se cargará la interfaz gráfica.
     * @throws Exception si hay algún error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar el archivo FXML que define la interfaz de usuario
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Formulario.fxml"));

        // Crear la escena a partir del archivo FXML cargado
        Scene scene = new Scene(loader.load());

        // Configurar el título de la ventana principal
        primaryStage.setTitle("Formulario de Registro");

        // Asignar la escena al escenario (ventana principal) y mostrarla
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Método principal que lanza la aplicación JavaFX.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        launch(args);
    }
}
