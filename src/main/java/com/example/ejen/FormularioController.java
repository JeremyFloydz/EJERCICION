package com.example.ejen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controlador para la interfaz gráfica del formulario de registro.
 * Maneja los eventos de los botones y la validación de los datos ingresados.
 */
public class FormularioController {

    /** Campo de texto para ingresar el nombre. */
    @FXML
    private TextField nombre;

    /** Campo de texto para ingresar el primer apellido. */
    @FXML
    private TextField apellido1;

    /** Campo de texto para ingresar el segundo apellido. */
    @FXML
    private TextField apellido2;

    /** Campo de texto para ingresar la profesión. */
    @FXML
    private TextField profesion;

    /**
     * Maneja el evento del botón "Aceptar".
     * Valida los campos, guarda los datos ingresados y limpia el formulario para permitir agregar otra persona.
     *
     * @param event el evento que dispara esta acción.
     */
    @FXML
    private void handleAceptarAction(ActionEvent event) {
        // Validar los campos
        if (validarCampos()) {
            // Obtener los valores de los campos
            String nombreText = nombre.getText();
            String apellido1Text = apellido1.getText();
            String apellido2Text = apellido2.getText();
            String profesionText = profesion.getText();

            // Simular guardar los datos (puedes implementar tu lógica aquí)
            System.out.println("Datos guardados:");
            System.out.println("Nombre: " + nombreText);
            System.out.println("Apellido 1: " + apellido1Text);
            System.out.println("Apellido 2: " + apellido2Text);
            System.out.println("Profesión: " + profesionText);

            // Mostrar un mensaje de éxito
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Datos Guardados");
            alerta.setHeaderText(null);
            alerta.setContentText("Los datos se han guardado correctamente. Puedes agregar a otra persona.");
            alerta.showAndWait();

            // Vaciar los campos para agregar a alguien más
            limpiarCampos();
        }
    }

    /**
     * Maneja el evento del botón "Cancelar".
     * Cierra la ventana de la aplicación.
     *
     * @param event el evento que dispara esta acción.
     */
    @FXML
    private void handleCancelarAction(ActionEvent event) {
        // Cerrar la ventana actual
        Stage stage = (Stage) nombre.getScene().getWindow();
        stage.close();
    }

    /**
     * Valida que todos los campos de texto estén completados.
     *
     * @return {@code true} si todos los campos están llenos; {@code false} de lo contrario.
     */
    private boolean validarCampos() {
        // Verificar si los campos están vacíos
        if (nombre.getText().isEmpty() || apellido1.getText().isEmpty() ||
                apellido2.getText().isEmpty() || profesion.getText().isEmpty()) {
            // Mostrar un mensaje de error
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Validación");
            alerta.setHeaderText("Faltan datos por completar");
            alerta.setContentText("Por favor, complete todos los campos.");
            alerta.showAndWait();
            return false;
        }
        return true;
    }

    /**
     * Limpia los campos de texto del formulario.
     */
    private void limpiarCampos() {
        // Vaciar todos los campos de texto
        nombre.clear();
        apellido1.clear();
        apellido2.clear();
        profesion.clear();
    }
}
