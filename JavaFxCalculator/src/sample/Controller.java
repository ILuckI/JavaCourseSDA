package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private TextField display;

    @FXML
    private void handlerNumericButton(ActionEvent event){
        String number = ((Button)event.getSource()).getText();
        display.setText(display.getText() + number);
    }

    private double number;

    @FXML
    private void handlerEqualOperation(ActionEvent event){
        double current = Double.parseDouble(display.getText());
        double result = 0;
        switch (operation){
            case ADD:
                result = number + current;
                break;
            case DIV:
                result = number / current;
                break;
            case MINUS:
                result = number - current;
                break;
            case MULT:
                result = number * current;
                break;
        }
        display.setText(String.valueOf(result));
    }

    private Operations operation;

    @FXML
    private void handlerOperationButton(ActionEvent event){
        number = Double.parseDouble(display.getText());
        String buttonText = ((Button)event.getSource()).getText();
        operation = Operations.getOperation(buttonText);
        display.clear();
        System.out.println("Nacisnieto " + buttonText);
    }

    @FXML
    private void handlerClear (ActionEvent event){
        display.clear();
    }

    private boolean dotPress = false;
    @FXML
    private void handlerDot (ActionEvent event){
        if (!dotPress){
            String number = ((Button)event.getSource()).getText();
            display.setText(display.getText() + number);
            dotPress = true;
        }




    }





}
