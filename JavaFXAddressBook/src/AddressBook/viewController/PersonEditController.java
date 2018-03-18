package AddressBook.viewController;

import AddressBook.helpers.DateHelper;
import AddressBook.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class PersonEditController {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField streetField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField postalCodeField;
    @FXML
    private TextField birtgdayField;

    private Stage dialogStage;
    private Person person;

    public void setPerson(Person person){
        this.person = person;
        firstNameField.setText(this.person.getFirstName());
        lastNameField.setText(this.person.getLastName());
        streetField.setText(this.person.getStreet());
        cityField.setText(this.person.getCity());
        postalCodeField.setText(String.valueOf(this.person.getPostalCode()));
        birtgdayField.setText(DateHelper.format(this.person.getBirthday()));
    }

    @FXML
    private void initialize(){}

    public void setDialogStage(Stage stage){
        this.dialogStage = stage;
    }

    private boolean isValidInput(){
        String errorInfo = "";
        if (firstNameField.getText() == null || firstNameField.getText().length() ==0){
            errorInfo += "Bledne imie!\n";
        }
        if (lastNameField.getText() == null || lastNameField.getText().length() ==0){
            errorInfo += "Bledne nazwisko!\n";
        }
        if (streetField.getText() == null || streetField.getText().length() ==0){
            errorInfo += "Bledne ulica!\n";
        }
        if (cityField.getText() == null || cityField.getText().length() ==0){
            errorInfo += "Bledne miasto!\n";
        }
        // kod pocztowy int
        if (postalCodeField.getText() == null || postalCodeField.getText().length() ==0){
            errorInfo += "Bledny kod pocztowy!\n";

        }else {
            try {
                Integer.parseInt(postalCodeField.getText());
            }
            catch (Exception e) {errorInfo += "Kod pocztowy ma byc liczba!";}
        }
        if (birtgdayField.getText() == null || birtgdayField.getText().length() ==0){
            errorInfo += "Bledna data urodzin!\n";
        }else {
            if (!DateHelper.validDate(birtgdayField.getText())){
                errorInfo += "Bleda data urodzin!";
            }
        }

        if (errorInfo.length() == 0)
            return true;
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Bledne dane!");
            alert.setHeaderText("Bleden dane");
            alert.setContentText(errorInfo);
            alert.showAndWait();
            return false;
        }
    }

    @FXML
    private void handleCancel(){
        dialogStage.close();
    }

    private boolean buttonClick = false;
    public boolean isButtonClick(){
        return buttonClick;
    }

    @FXML
    private void handleOk(){
        if (isValidInput()){
            person.setFirstName(firstNameField.getText().trim());
            person.setLastName(lastNameField.getText().trim());
            person.setStreet(streetField.getText().trim());
            person.setCity(cityField.getText().trim());
            person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
            person.setBirthday(DateHelper.parse(birtgdayField.getText()));
            buttonClick = true;
            dialogStage.close();
        }
    }


}
