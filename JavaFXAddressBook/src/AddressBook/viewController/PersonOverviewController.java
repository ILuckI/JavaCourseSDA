package AddressBook.viewController;

import AddressBook.Main;
import AddressBook.helpers.DateHelper;
import AddressBook.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PersonOverviewController {
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> firstNameColumn;
    @FXML
    private TableColumn<Person, String> lastNameColumn;

    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label streetLabel;
    @FXML
    private Label postalCodeLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label birthdayLabel;
    @FXML
    private Main mainApp;

    public PersonOverviewController() {
    }

    @FXML
    private void initialize() {
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        showPersonalDetails(null);
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPersonalDetails(newValue));
    }

    @FXML
    private void handleRemovePerson() {
        int index = personTable.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            personTable.getItems().remove(index);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Brak zaznaczenia");
            alert.setHeaderText("Nie zaznaczono elementu");
            alert.setContentText("Prosze wskazac element do usuniecia!");
            alert.showAndWait();
        }

    }

    @FXML
    private void handleAddButton() {
        Person tempPerson = new Person("", "");
        boolean buttonClick = mainApp.showPersonEditDialog(tempPerson);
        if (buttonClick) {
            mainApp.getPersonData().add(tempPerson);
        }
    }

    @FXML
    private void handleEdit() {
        Person person = personTable.getSelectionModel().getSelectedItem();
        if (person != null) {
            boolean buttonClick = mainApp.showPersonEditDialog(person);
            if (buttonClick) {
                showPersonalDetails(person);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Brak zaznaczenia");
            alert.setHeaderText("Nie zaznaczono elementu");
            alert.setContentText("Prosze wskazac element do usuniecia!");
            alert.showAndWait();
        }
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
        personTable.setItems(mainApp.getPersonData());
    }

    private void showPersonalDetails(Person person) {
        if (person != null) {
            firstNameLabel.setText(person.getFirstName());
            lastNameLabel.setText(person.getLastName());
            streetLabel.setText(person.getStreet());
            postalCodeLabel.setText(Integer.toString(person.getPostalCode()));
            cityLabel.setText(person.getCity());
            birthdayLabel.setText(DateHelper.format(person.getBirthday()));
        } else {
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            streetLabel.setText("");
            postalCodeLabel.setText("");
            cityLabel.setText("");
            birthdayLabel.setText("");
        }
    }

}
