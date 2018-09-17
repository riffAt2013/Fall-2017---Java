/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.util.Calendar;
import java.net.URL;
import java.text.DateFormat;
import static java.text.DateFormat.LONG;
import static java.text.DateFormat.SHORT;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label Hour;
    @FXML
    private Label Minute;
    @FXML
    private ComboBox<?> minset;
    @FXML
    private Button stopAlarm;
    @FXML
    private Button resetAlarm;
//    @FXML
//    private ComboBox<?> hourset;
       ObservableList<Integer> optionsOfHourset = 
    FXCollections.observableArrayList
        (
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 
            20, 21, 22, 23 );

    final ComboBox hourset = new ComboBox(optionsOfHourset);
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  

    @FXML
    private void do1(ActionEvent event) {
     
    
        
    }

    @FXML
    private void do2(ActionEvent event) {
    }
    
    
    
    
  
    
    
}
