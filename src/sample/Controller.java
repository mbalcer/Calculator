package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {
    @FXML
    Label score;
    @FXML
    Label action;

    private long fnumber;
    private long snumber;
    private char operation = 'e';
    private boolean reset = false;

    public void clickZero() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "0";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickOne() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "1";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickTwo() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "2";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickThree() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "3";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickFour() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "4";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickFife() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "5";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickSix() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "6";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickSeven() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "7";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickEight() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "8";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickNine() {
        if(reset) {
            clickClear();
            reset = false;
        }
        String labelScore = score.getText();
        int labelInt =  Integer.parseInt(labelScore);
        String set = "9";
        if(labelInt == 0)
            labelScore = set;
        else
            labelScore+= set;

        score.setText(labelScore);
    }
    public void clickClear() {
        fnumber = 0;
        snumber = 0;
        score.setText("0");
        action.setText("");
    }

    public void clickAddition() {
        if(reset)
            reset = false;
        String labelScore = score.getText();
        fnumber = Integer.parseInt(labelScore);
        operation = '+';
        action.setText(labelScore+operation);
        score.setText("0");
    }
    public void clickSubtract() {
        if(reset)
            reset = false;
        String labelScore = score.getText();
        fnumber = Integer.parseInt(labelScore);
        operation = '-';
        action.setText(labelScore+operation);
        score.setText("0");
    }
    public void clickMultiply() {
        if(reset)
            reset = false;
        String labelScore = score.getText();
        fnumber = Integer.parseInt(labelScore);
        operation = 'x';
        action.setText(labelScore+operation);
        score.setText("0");
    }
    public void clickDivision() {
        if(reset)
            reset = false;
        String labelScore = score.getText();
        fnumber = Integer.parseInt(labelScore);
        operation = '/';
        action.setText(labelScore+operation);
        score.setText("0");
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
                    result = fnumber / snumber;
                    score.setText(String.valueOf(result));
                break;
            }
            reset = true;
        }
    }
}
