package com.example.prediction;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class PrintData<String>  implements Initializable {
    @FXML
    private TableColumn<DataRecord, String> employees;

    @FXML
    private TableView<DataRecord> predictionTable;

    @FXML
    private TableColumn<DataRecord, String> tExpenditure;

    @FXML
    private TableColumn<DataRecord, String> tSalary;

    @FXML
    private TableColumn<DataRecord, String> year;

    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    ObservableList<DataRecord> DataRecordListAvailable = FXCollections.observableArrayList();


    public void refreshTable(){
        try {
            DataRecordListAvailable.clear();
            query = (String) "SELECT `year`, `number_of_employees`, `total_salary`, `total_expenditure` FROM `yearlyPrediction` WHERE 1";
            preparedStatement = connection.prepareStatement((java.lang.String) query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                DataRecordListAvailable.add(new DataRecord(
                        resultSet.getInt("year"),
                        resultSet.getInt("number_of_employees"),
                        resultSet.getDouble("total_salary"),
                        resultSet.getDouble("total_expenditure")));
                predictionTable.setItems(DataRecordListAvailable);
            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }



    public void loadData() {
        DBConnaction dbConnaction =  new DBConnaction();
        connection = dbConnaction.getConnection();
        refreshTable();
        year.setCellValueFactory(new PropertyValueFactory<>("year"));
        employees.setCellValueFactory(new PropertyValueFactory<>("employees"));
        tSalary.setCellValueFactory(new PropertyValueFactory<>("totalSalary"));
        tExpenditure.setCellValueFactory(new PropertyValueFactory<>("totalExpenditure"));

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadData();
    }
}
