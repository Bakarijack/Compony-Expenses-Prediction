package com.example.prediction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.sql.Connection;
import java.sql.Statement;
import java.text.DecimalFormat;

public class HelloController {
    @FXML
    private TextField empCurrentNo;

    @FXML
    private Label empCurrentNoMessage;

    @FXML
    private TextField empDecreaseInterval;

    @FXML
    private BorderPane mainPane;

    @FXML
    private Label empDecreaseIntervalMessage;

    @FXML
    private TextField empDecreaseNo;

    @FXML
    private Label empDecreaseNoMessage;

    @FXML
    private TextField empIncreaseInterval;

    @FXML
    private Label empIncreaseIntervalMessage;

    @FXML
    private Label predictMessage;

    @FXML
    private Label empIncreaseMessage;

    @FXML
    private TextField empIncreaseNo;

    @FXML
    private TextField expConstantAmount;

    @FXML
    private Label expConstantAmountMessage;

    @FXML
    private TextField expConstantInterval;

    @FXML
    private Label expConstantIntervalMessage;

    @FXML
    private TextField expEmpSalaryIncrease;

    @FXML
    private TextField expEmpSalaryIncreaseInterval;

    @FXML
    private Label expEmpSalaryIncreaseIntervalMessage;

    @FXML
    private Label expEmpSalaryMessage;

    @FXML
    private Label expEmpSalasyIncreaseMessage;

    @FXML
    private TextField expeEmpSalary;

    @FXML
    private TextField predictAfter;

    @FXML
    private Label predictAfterMessage;


    public void predictButtonOnAction(ActionEvent event){
        if(!empCurrentNo.getText().isBlank()){
            if(!empIncreaseNo.getText().isBlank()){
                if(!empIncreaseInterval.getText().isBlank()){
                    if(!empDecreaseNo.getText().isBlank()){
                        if(!empDecreaseInterval.getText().isBlank()){
                            if(!expeEmpSalary.getText().isBlank()){
                                if(!expEmpSalaryIncrease.getText().isBlank()){
                                    if(!expEmpSalaryIncreaseInterval.getText().isBlank()){
                                        if(!expConstantAmount.getText().isBlank()){
                                            if(!expConstantInterval.getText().isBlank()){
                                                if(!predictAfter.getText().isBlank()){
                                                    //test the input
                                                    if(checkInput(empCurrentNo) == true){
                                                        if(checkInput(empIncreaseNo) == true){
                                                            if(checkInput(empIncreaseInterval) == true){
                                                                if(checkInput(empDecreaseNo) == true){
                                                                    if(checkInput(empDecreaseInterval) == true){
                                                                        if(checkInputForDouble(expeEmpSalary) == true){
                                                                            if(checkInputForDouble(expEmpSalaryIncrease) == true){
                                                                                if(checkInput(expEmpSalaryIncreaseInterval) == true){
                                                                                    if(checkInputForDouble(expConstantAmount) ==true){
                                                                                        if(checkInput(expConstantInterval) == true){
                                                                                            if(checkInput(predictAfter) == true){
                                                                                                deleteAllData();
                                                                                                calculateExpenditure();
                                                                                                empCurrentNoMessage.setText("");
                                                                                                empIncreaseMessage.setText("");
                                                                                                empIncreaseIntervalMessage.setText("");
                                                                                                empDecreaseNoMessage.setText("");
                                                                                                empDecreaseIntervalMessage.setText("");
                                                                                                expEmpSalaryMessage.setText("");
                                                                                                expEmpSalasyIncreaseMessage.setText("");
                                                                                                expEmpSalaryIncreaseIntervalMessage.setText("");
                                                                                                expConstantAmountMessage.setText("");
                                                                                                expConstantIntervalMessage.setText("");
                                                                                                predictAfterMessage.setText("");
                                                                                                predictMessage.setText("Report Successfully Generated");

                                                                                                //show the result window
                                                                                                FileLoader object = new FileLoader();
                                                                                                Pane view = object.getPage("printData");
                                                                                                mainPane.setRight(view);
                                                                                            }else{
                                                                                                empCurrentNoMessage.setText("");
                                                                                                empIncreaseMessage.setText("");
                                                                                                empIncreaseIntervalMessage.setText("");
                                                                                                empDecreaseNoMessage.setText("");
                                                                                                empDecreaseIntervalMessage.setText("");
                                                                                                expEmpSalaryMessage.setText("");
                                                                                                expEmpSalasyIncreaseMessage.setText("");
                                                                                                expEmpSalaryIncreaseIntervalMessage.setText("");
                                                                                                expConstantAmountMessage.setText("");
                                                                                                expConstantIntervalMessage.setText("");
                                                                                                predictAfterMessage.setText("number is required");
                                                                                                predictMessage.setText("");
                                                                                            }

                                                                                        }else{
                                                                                            empCurrentNoMessage.setText("");
                                                                                            empIncreaseMessage.setText("");
                                                                                            empIncreaseIntervalMessage.setText("");
                                                                                            empDecreaseNoMessage.setText("");
                                                                                            empDecreaseIntervalMessage.setText("");
                                                                                            expEmpSalaryMessage.setText("");
                                                                                            expEmpSalasyIncreaseMessage.setText("");
                                                                                            expEmpSalaryIncreaseIntervalMessage.setText("");
                                                                                            expConstantAmountMessage.setText("");
                                                                                            expConstantIntervalMessage.setText("number is required");
                                                                                            predictAfterMessage.setText("");
                                                                                            predictMessage.setText("");
                                                                                        }

                                                                                    }else{
                                                                                        empCurrentNoMessage.setText("");
                                                                                        empIncreaseMessage.setText("");
                                                                                        empIncreaseIntervalMessage.setText("");
                                                                                        empDecreaseNoMessage.setText("");
                                                                                        empDecreaseIntervalMessage.setText("");
                                                                                        expEmpSalaryMessage.setText("");
                                                                                        expEmpSalasyIncreaseMessage.setText("");
                                                                                        expEmpSalaryIncreaseIntervalMessage.setText("");
                                                                                        expConstantAmountMessage.setText("number is required");
                                                                                        expConstantIntervalMessage.setText("");
                                                                                        predictAfterMessage.setText("");
                                                                                        predictMessage.setText("");
                                                                                    }

                                                                                }else{
                                                                                    empCurrentNoMessage.setText("");
                                                                                    empIncreaseMessage.setText("");
                                                                                    empIncreaseIntervalMessage.setText("");
                                                                                    empDecreaseNoMessage.setText("");
                                                                                    empDecreaseIntervalMessage.setText("");
                                                                                    expEmpSalaryMessage.setText("");
                                                                                    expEmpSalasyIncreaseMessage.setText("");
                                                                                    expEmpSalaryIncreaseIntervalMessage.setText("number is required");
                                                                                    expConstantAmountMessage.setText("");
                                                                                    expConstantIntervalMessage.setText("");
                                                                                    predictAfterMessage.setText("");
                                                                                    predictMessage.setText("");
                                                                                }

                                                                            }else{
                                                                                empCurrentNoMessage.setText("");
                                                                                empIncreaseMessage.setText("");
                                                                                empIncreaseIntervalMessage.setText("");
                                                                                empDecreaseNoMessage.setText("");
                                                                                empDecreaseIntervalMessage.setText("");
                                                                                expEmpSalaryMessage.setText("");
                                                                                expEmpSalasyIncreaseMessage.setText("number is required");
                                                                                expEmpSalaryIncreaseIntervalMessage.setText("");
                                                                                expConstantAmountMessage.setText("");
                                                                                expConstantIntervalMessage.setText("");
                                                                                predictAfterMessage.setText("");
                                                                                predictMessage.setText("");
                                                                            }

                                                                        }else {
                                                                            empCurrentNoMessage.setText("");
                                                                            empIncreaseMessage.setText("");
                                                                            empIncreaseIntervalMessage.setText("");
                                                                            empDecreaseNoMessage.setText("");
                                                                            empDecreaseIntervalMessage.setText("");
                                                                            expEmpSalaryMessage.setText("number is required");
                                                                            expEmpSalasyIncreaseMessage.setText("");
                                                                            expEmpSalaryIncreaseIntervalMessage.setText("");
                                                                            expConstantAmountMessage.setText("");
                                                                            expConstantIntervalMessage.setText("");
                                                                            predictAfterMessage.setText("");
                                                                            predictMessage.setText("");
                                                                        }

                                                                    }else{
                                                                        empCurrentNoMessage.setText("");
                                                                        empIncreaseMessage.setText("");
                                                                        empIncreaseIntervalMessage.setText("");
                                                                        empDecreaseNoMessage.setText("");
                                                                        empDecreaseIntervalMessage.setText("number is required");
                                                                        expEmpSalaryMessage.setText("");
                                                                        expEmpSalasyIncreaseMessage.setText("");
                                                                        expEmpSalaryIncreaseIntervalMessage.setText("");
                                                                        expConstantAmountMessage.setText("");
                                                                        expConstantIntervalMessage.setText("");
                                                                        predictAfterMessage.setText("");
                                                                        predictMessage.setText("");
                                                                    }

                                                                }else{
                                                                    empCurrentNoMessage.setText("");
                                                                    empIncreaseMessage.setText("");
                                                                    empIncreaseIntervalMessage.setText("");
                                                                    empDecreaseNoMessage.setText("number is required");
                                                                    empDecreaseIntervalMessage.setText("");
                                                                    expEmpSalaryMessage.setText("");
                                                                    expEmpSalasyIncreaseMessage.setText("");
                                                                    expEmpSalaryIncreaseIntervalMessage.setText("");
                                                                    expConstantAmountMessage.setText("");
                                                                    expConstantIntervalMessage.setText("");
                                                                    predictAfterMessage.setText("");
                                                                    predictMessage.setText("");
                                                                }

                                                            }else {
                                                                empCurrentNoMessage.setText("Fill text field");
                                                                empIncreaseMessage.setText("");
                                                                empIncreaseIntervalMessage.setText("number is required");
                                                                empDecreaseNoMessage.setText("");
                                                                empDecreaseIntervalMessage.setText("");
                                                                expEmpSalaryMessage.setText("");
                                                                expEmpSalasyIncreaseMessage.setText("");
                                                                expEmpSalaryIncreaseIntervalMessage.setText("");
                                                                expConstantAmountMessage.setText("");
                                                                expConstantIntervalMessage.setText("");
                                                                predictAfterMessage.setText("");
                                                                predictMessage.setText("");
                                                            }

                                                        }else{
                                                            empCurrentNoMessage.setText("");
                                                            empIncreaseMessage.setText("number is required");
                                                            empIncreaseIntervalMessage.setText("");
                                                            empDecreaseNoMessage.setText("");
                                                            empDecreaseIntervalMessage.setText("");
                                                            expEmpSalaryMessage.setText("");
                                                            expEmpSalasyIncreaseMessage.setText("");
                                                            expEmpSalaryIncreaseIntervalMessage.setText("");
                                                            expConstantAmountMessage.setText("");
                                                            expConstantIntervalMessage.setText("");
                                                            predictAfterMessage.setText("");
                                                            predictMessage.setText("");
                                                        }

                                                    }else{
                                                        empCurrentNoMessage.setText("number is required");
                                                        empIncreaseMessage.setText("");
                                                        empIncreaseIntervalMessage.setText("");
                                                        empDecreaseNoMessage.setText("");
                                                        empDecreaseIntervalMessage.setText("");
                                                        expEmpSalaryMessage.setText("");
                                                        expEmpSalasyIncreaseMessage.setText("");
                                                        expEmpSalaryIncreaseIntervalMessage.setText("");
                                                        expConstantAmountMessage.setText("");
                                                        expConstantIntervalMessage.setText("");
                                                        predictAfterMessage.setText("");
                                                        predictMessage.setText("");
                                                    }

                                                }else {
                                                    empCurrentNoMessage.setText("");
                                                    empIncreaseMessage.setText("");
                                                    empIncreaseIntervalMessage.setText("");
                                                    empDecreaseNoMessage.setText("");
                                                    empDecreaseIntervalMessage.setText("");
                                                    expEmpSalaryMessage.setText("");
                                                    expEmpSalasyIncreaseMessage.setText("");
                                                    expEmpSalaryIncreaseIntervalMessage.setText("");
                                                    expConstantAmountMessage.setText("");
                                                    expConstantIntervalMessage.setText("");
                                                    predictAfterMessage.setText("fill here!");
                                                    predictMessage.setText("");
                                                }

                                            }else{
                                                empCurrentNoMessage.setText("");
                                                empIncreaseMessage.setText("");
                                                empIncreaseIntervalMessage.setText("");
                                                empDecreaseNoMessage.setText("");
                                                empDecreaseIntervalMessage.setText("");
                                                expEmpSalaryMessage.setText("");
                                                expEmpSalasyIncreaseMessage.setText("");
                                                expEmpSalaryIncreaseIntervalMessage.setText("");
                                                expConstantAmountMessage.setText("");
                                                expConstantIntervalMessage.setText("fill here!");
                                                predictAfterMessage.setText("");
                                                predictMessage.setText("");
                                            }

                                        }else{
                                            empCurrentNoMessage.setText("");
                                            empIncreaseMessage.setText("");
                                            empIncreaseIntervalMessage.setText("");
                                            empDecreaseNoMessage.setText("");
                                            empDecreaseIntervalMessage.setText("");
                                            expEmpSalaryMessage.setText("");
                                            expEmpSalasyIncreaseMessage.setText("");
                                            expEmpSalaryIncreaseIntervalMessage.setText("");
                                            expConstantAmountMessage.setText("Fill here first!");
                                            expConstantIntervalMessage.setText("");
                                            predictAfterMessage.setText("");
                                            predictMessage.setText("");
                                        }

                                    }else{
                                        empCurrentNoMessage.setText("");
                                        empIncreaseMessage.setText("");
                                        empIncreaseIntervalMessage.setText("");
                                        empDecreaseNoMessage.setText("");
                                        empDecreaseIntervalMessage.setText("");
                                        expEmpSalaryMessage.setText("");
                                        expEmpSalasyIncreaseMessage.setText("");
                                        expEmpSalaryIncreaseIntervalMessage.setText("fill here!");
                                        expConstantAmountMessage.setText("");
                                        expConstantIntervalMessage.setText("");
                                        predictAfterMessage.setText("");
                                        predictMessage.setText("");
                                    }

                                }else{
                                    empCurrentNoMessage.setText("");
                                    empIncreaseMessage.setText("");
                                    empIncreaseIntervalMessage.setText("");
                                    empDecreaseNoMessage.setText("");
                                    empDecreaseIntervalMessage.setText("");
                                    expEmpSalaryMessage.setText("");
                                    expEmpSalasyIncreaseMessage.setText("fill here!");
                                    expEmpSalaryIncreaseIntervalMessage.setText("");
                                    expConstantAmountMessage.setText("");
                                    expConstantIntervalMessage.setText("");
                                    predictAfterMessage.setText("");
                                    predictMessage.setText("");
                                }

                            }else{
                                empCurrentNoMessage.setText("");
                                empIncreaseMessage.setText("");
                                empIncreaseIntervalMessage.setText("");
                                empDecreaseNoMessage.setText("");
                                empDecreaseIntervalMessage.setText("");
                                expEmpSalaryMessage.setText("fill here first");
                                expEmpSalasyIncreaseMessage.setText("");
                                expEmpSalaryIncreaseIntervalMessage.setText("");
                                expConstantAmountMessage.setText("");
                                expConstantIntervalMessage.setText("");
                                predictAfterMessage.setText("");
                                predictMessage.setText("");
                            }

                        }else{
                            empCurrentNoMessage.setText("");
                            empIncreaseMessage.setText("");
                            empIncreaseIntervalMessage.setText("");
                            empDecreaseNoMessage.setText("");
                            empDecreaseIntervalMessage.setText("fill here!");
                            expEmpSalaryMessage.setText("");
                            expEmpSalasyIncreaseMessage.setText("");
                            expEmpSalaryIncreaseIntervalMessage.setText("");
                            expConstantAmountMessage.setText("");
                            expConstantIntervalMessage.setText("");
                            predictAfterMessage.setText("");
                            predictMessage.setText("");
                        }

                    }else{
                        empCurrentNoMessage.setText("");
                        empIncreaseMessage.setText("");
                        empIncreaseIntervalMessage.setText("");
                        empDecreaseNoMessage.setText("fill here!");
                        empDecreaseIntervalMessage.setText("");
                        expEmpSalaryMessage.setText("");
                        expEmpSalasyIncreaseMessage.setText("");
                        expEmpSalaryIncreaseIntervalMessage.setText("");
                        expConstantAmountMessage.setText("");
                        expConstantIntervalMessage.setText("");
                        predictAfterMessage.setText("");
                        predictMessage.setText("");
                    }

                }else{
                    empCurrentNoMessage.setText("");
                    empIncreaseMessage.setText("");
                    empIncreaseIntervalMessage.setText("fill here");
                    empDecreaseNoMessage.setText("");
                    empDecreaseIntervalMessage.setText("");
                    expEmpSalaryMessage.setText("");
                    expEmpSalasyIncreaseMessage.setText("");
                    expEmpSalaryIncreaseIntervalMessage.setText("");
                    expConstantAmountMessage.setText("");
                    expConstantIntervalMessage.setText("");
                    predictAfterMessage.setText("");
                    predictMessage.setText("");
                }

            }else{
                empCurrentNoMessage.setText("");
                empIncreaseMessage.setText("fill here!");
                empIncreaseIntervalMessage.setText("");
                empDecreaseNoMessage.setText("");
                empDecreaseIntervalMessage.setText("");
                expEmpSalaryMessage.setText("");
                expEmpSalasyIncreaseMessage.setText("");
                expEmpSalaryIncreaseIntervalMessage.setText("");
                expConstantAmountMessage.setText("");
                expConstantIntervalMessage.setText("");
                predictAfterMessage.setText("");
                predictMessage.setText("");
            }

        }else{
            empCurrentNoMessage.setText("Fill text field");
            empIncreaseMessage.setText("");
            empIncreaseIntervalMessage.setText("");
            empDecreaseNoMessage.setText("");
            empDecreaseIntervalMessage.setText("");
            expEmpSalaryMessage.setText("");
            expEmpSalasyIncreaseMessage.setText("");
            expEmpSalaryIncreaseIntervalMessage.setText("");
            expConstantAmountMessage.setText("");
            expConstantIntervalMessage.setText("");
            predictAfterMessage.setText("");
            predictMessage.setText("");
        }
    }


    public void calculateExpenditure(){
        double salaryPerEmp = Double.parseDouble(expeEmpSalary.getText());
        int empCount = Integer.parseInt(empCurrentNo.getText());
        int startMonth;
        int totalMonths = Integer.parseInt(predictAfter.getText());
        //double yearlyConstExp = Double.parseDouble(expConstantAmount.getText());
        Double totalSalary = 0.0;
        Double yearlyTotalExp = 0.0;
        int year = 0;

        //calculate for the given months
        for(startMonth = 0;startMonth <= totalMonths; startMonth++){
            //startMonth += 1;
            //increase employee number
            if(startMonth > 0) {
                if (startMonth % Integer.parseInt(empIncreaseInterval.getText()) == 0) {
                    empCount += Integer.parseInt(empIncreaseNo.getText());
                }
            }

            //deduct employee number
            if(startMonth > 0) {
                if (startMonth % Integer.parseInt(empDecreaseInterval.getText()) == 0) {
                    empCount -= Integer.parseInt(empDecreaseNo.getText());
                }
            }

            //increase salary
            if(startMonth > 0){
                if(startMonth % Integer.parseInt(expEmpSalaryIncreaseInterval.getText()) == 0){
                    salaryPerEmp += Double.parseDouble(expEmpSalaryIncrease.getText());
                }
            }
           //calculate total Salary
            totalSalary = empCount * salaryPerEmp * (startMonth + 1);

            //calculate total expenditure for 1 year
            if(startMonth > 0) {
                if (startMonth % 12 == 0) {
                    //empCount +=1;
                    yearlyTotalExp = Double.parseDouble(expConstantAmount.getText()) + totalSalary;
                    year += 1;
                    sentToDatabase(year, empCount, totalSalary, yearlyTotalExp);
                }
            }

        }
    }

    public void deleteAllData(){
        String deleteData = "DELETE FROM `yearlyPrediction` WHERE 1 ";

        try{
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteData);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    DBConnaction dbConnaction = new DBConnaction();
    Connection connectDB = dbConnaction.getConnection();

    public void sentToDatabase(int year, int empNumber, Double totalS, Double totalExp){
        //DecimalFormat formatter= new DecimalFormat("#,###.00");
        String insertData = "INSERT INTO `yearlyPrediction`(`year`, `number_of_employees`, `total_salary`, `total_expenditure`) VALUES ('"+year+"','"+empNumber+"','"+totalS+"','"+totalExp+"')";

        try{
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertData);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public boolean checkInput(TextField t){
        String s = t.getText();

        if(s == null){
            return false;
        }

        try{
            int i = Integer.parseInt(s);
        }catch (NumberFormatException e){
            return false;
        }

        return true;
    }

    public boolean checkInputForDouble(TextField t){
        String s = t.getText();

        if(s == null){
            return false;
        }

        try{
            Double d = Double.parseDouble(s);
        }catch (NumberFormatException e){
            return false;
        }

        return true;
    }


}