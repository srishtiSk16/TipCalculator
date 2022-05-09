package com.company.tipcalculator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.text.NumberFormat;


public class TipCalculatorController {

    private static final NumberFormat currency =
            NumberFormat.getCurrencyInstance();

    private static final NumberFormat percent=
            NumberFormat.getPercentInstance();


    private BigDecimal tipPercentage = new BigDecimal(0.15); //default value

    @FXML
    private Button calculateButton;

    @FXML
    private Label tipPercentageLabel;

    @FXML
    private Slider tipPercentageSlider;

    @FXML
    private TextField tipTotal;

    @FXML
    private TextField totalTextField;

    @FXML
    void calculateButtonPress(ActionEvent event) {

    }

    public void initialize(){

        tipPercentageSlider.valueProperty().addListener(
                //an anonomyous object
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov,Number oldValue, Number newValue) {
                      //gets the new value as int and change it to decimal for percent
                        tipPercentage = BigDecimal.valueOf(newValue.intValue() / 100.0);
                        tipPercentageLabel.setText(percent.format(tipPercentage));
                    }
                }
        );
    }

}
