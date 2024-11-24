package com.example.projecto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.sql.SQLException;

public class ProveedoresController {
    @FXML private TextField nombreField;
    @FXML private TextField contactoField;
    @FXML private TextField direccionField;
    @FXML private TableView<Proveedor> proveedoresTable;
    @FXML private TableColumn<Proveedor, Integer> idColumn;
    @FXML private TableColumn<Proveedor, String> nombreColumn;
    @FXML private TableColumn<Proveedor, String> contactoColumn;
    @FXML private TableColumn<Proveedor, String> direccionColumn;

    private ProveedorDAO proveedorDAO;
    private ObservableList<Proveedor> proveedoresList;

    public void initialize() {
        proveedorDAO = new ProveedorDAO();
        proveedoresList = FXCollections.observableArrayList();

        idColumn.setCellValueFactory(data -> data.getValue().getId().asObject());
        nombreColumn.setCellValueFactory(data -> data.getValue().getNombre());
        contactoColumn.setCellValueFactory(data -> data.getValue().getContacto());
        direccionColumn.setCellValueFactory(data -> data.getValue().getDireccion());

        cargarProveedores();
    }

    private void cargarProveedores() {
        try {
            proveedoresList.setAll(proveedorDAO.listarProveedores());
            proveedoresTable.setItems(proveedoresList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void agregarProveedor() {
        Proveedor proveedor = new Proveedor(0, nombreField.getText(), contactoField.getText(), direccionField.getText());
        try {
            proveedorDAO.agregarProveedor(proveedor);
            cargarProveedores();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void editarProveedor() {
        
    }

    @FXML
    private void eliminarProveedor() {
        
    }
}
