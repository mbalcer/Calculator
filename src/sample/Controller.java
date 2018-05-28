package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.awt.*;

public class Controller {
    @FXML
    Label score;
    @FXML
    Label action;

    @FXML
    Button addition;
    @FXML
    Button multiply;
    @FXML
    Button subtract;
    @FXML
    Button division;
    @FXML
    Button resultbtn;

    private long fnumber;
    private long snumber;
    private char operation = 'e';
    private boolean reset = false;

    private void setNumber(String number) {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        if(labelInt == 0)
            labelScore = number;
        else
            labelScore+= number;

        score.setText(labelScore);
    }

    public void clickZero() {
        setNumber("0");
    }
    public void clickOne() {
        setNumber("1");
    }
    public void clickTwo() {
        setNumber("2");
    }
    public void clickThree() {
        setNumber("3");
    }
    public void clickFour() {
        setNumber("4");
    }
    public void clickFife() {
        setNumber("5");
    }
    public void clickSix() {
        setNumber("6");
    }
    public void clickSeven() {
        setNumber("7");
    }
    public void clickEight() {
        setNumber("8");
    }
    public void clickNine() {
        setNumber("9");
    }
    public void clickClear() {
        fnumber = 0;
        snumber = 0;
        operation = 'e';
        score.setText("0");
        action.setText("");
        score.setFont(new Font(45));
        addition.setDisable(false);
        subtract.setDisable(false);
        multiply.setDisable(false);
        division.setDisable(false);
        resultbtn.setDisable(false);
    }

    private void setOperation(char operation) {
        if(reset)
            reset = false;
        String labelScore = score.getText();
        fnumber = Integer.parseInt(labelScore);
        this.operation = operation;
        action.setText(labelScore+operation);
        score.setText("0");
    }

    public void clickAddition() {
        setOperation('+');
    }
    public void clickSubtract() {
        setOperation('-');
    }
    public void clickMultiply() {
        setOperation('x');
    }
    public void clickDivision() {
        setOperation('/');
    }
    public void clickResult() {
        if(operation!='e') {
            long result;
            String labelScore = score.getText();
            snumber = Integer.parseInt(labelScore);
            String oldAction = action.getText();
            action.setText(String.valueOf(fnumber) + operation + String.valueOf(snumber) + "=");
            switch(operation) {
                case '+':
                result = fnumber + snumber;
                score.setText(String.valueOf(result));
                break;
                case '-':
                    result = fnumber - snumber;
                    score.setText(String.valueOf(result));
                    break;
                case 'x':
                    result = fnumber * snumber;
                    score.setText(String.valueOf(result));
                break;
                case '/':
                    if(snumber == 0) {
                        score.setFont(new Font(18));
                        score.setText("Nie można dzielić przez zero");
                        addition.setDisable(true);
                        subtract.setDisable(true);
                        multiply.setDisable(true);
                        division.setDisable(true);
                        resultbtn.setDisable(true);
                    }
                    else {
                        result = fnumber / snumber;
                        score.setText(String.valueOf(result));
                    }
                break;
            }
            reset = true;
        }
    }
}
