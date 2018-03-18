package AddressBook;

import AddressBook.model.Person;

import AddressBook.viewController.PersonEditController;
import AddressBook.viewController.PersonOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane root;
    private ObservableList<Person> personalData = FXCollections.observableArrayList();

    public Main() {
        personalData.add(new Person("Jan", "Kowalski"));
        personalData.add(new Person("Eryk", "Zielinski"));
        personalData.add(new Person("Lukasz", "Mily"));
        personalData.add(new Person("Jakub", "Zly"));
        personalData.add(new Person("Katarzyna", "Jastrzebna"));
        personalData.add(new Person("Malgorzata", "Cieslicka"));

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Address Book");
        this.primaryStage.getIcons().add(new Image("./AddressBook/Resources/icon.png"));
        initRootLayout();
        showPersonOverview();

    }

    private void initRootLayout() {
        try {
            root = FXMLLoader.load(getClass().getResource("viewController/RootLayout.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showPersonOverview() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("viewController/PersonOverview.fxml"));
            AnchorPane personOverview = loader.load();
            PersonOverviewController controller = loader.getController();
            controller.setMainApp(this);
            root.setCenter(personOverview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean showPersonEditDialog(Person person) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("viewController/PersonEditDialog.fxml"));
            AnchorPane page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edycja danych");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);

            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            PersonEditController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setPerson(person);

            dialogStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
       return true;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public ObservableList<Person> getPersonData() {
        return personalData;
    }
}
