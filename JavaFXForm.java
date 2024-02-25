import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class JavaFXForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        // VBox as the root layout
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        // TextField for name
        TextField nameTextField = new TextField();
        nameTextField.setPromptText("Enter your name");

        // RadioButtons for gender selection
        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton maleRadioButton = new RadioButton("Male");
        maleRadioButton.setToggleGroup(genderGroup);
        RadioButton femaleRadioButton = new RadioButton("Female");
        femaleRadioButton.setToggleGroup(genderGroup);
        HBox radioButtonBox = new HBox(10, maleRadioButton, femaleRadioButton);

        // Checkboxes for hobbies
        CheckBox readingCheckBox = new CheckBox("Reading");
        CheckBox travelingCheckBox = new CheckBox("Traveling");
        HBox checkBoxBox = new HBox(10, readingCheckBox, travelingCheckBox);

        // ComboBox (dropdown) for country selection
        ComboBox<String> countryComboBox = new ComboBox<>();
        countryComboBox.setPromptText("Select Country");
        countryComboBox.getItems().addAll("United States", "Canada", "India", "Australia");

        // TextArea for address
        TextArea addressTextArea = new TextArea();
        addressTextArea.setPromptText("Enter your address");
        addressTextArea.setPrefHeight(100);

        // Button for form submission
        Button submitButton = new Button("Submit");

        // Add all components to the root layout
        root.getChildren().addAll(nameTextField, radioButtonBox, checkBoxBox, countryComboBox, addressTextArea, submitButton);

        // Scene setup
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("User Input Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
