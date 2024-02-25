import java.awt.*;
import java.awt.event.*;

public class AWTForm extends Frame {
    
    // Constructor to setup GUI components
    AWTForm() {
        // Use FlowLayout for the layout manager of this frame
        setLayout(new FlowLayout());

        // Label for name
        Label nameLabel = new Label("Name:");
        add(nameLabel);
        
        // TextField for name input
        TextField nameTextField = new TextField(20);
        add(nameTextField);
        
        // CheckboxGroup for radio buttons (gender selection)
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, false);
        add(maleCheckbox);
        add(femaleCheckbox);
        
        // Checkboxes for hobbies
        Checkbox readingCheckbox = new Checkbox("Reading");
        Checkbox travelingCheckbox = new Checkbox("Traveling");
        add(readingCheckbox);
        add(travelingCheckbox);
        
        // Choice (dropdown) for country selection
        Choice countryChoice = new Choice();
        countryChoice.add("Select Country");
        countryChoice.add("United States");
        countryChoice.add("Canada");
        countryChoice.add("India");
        countryChoice.add("Australia");
        add(countryChoice);
        
        // TextArea for address
        Label addressLabel = new Label("Address:");
        add(addressLabel);
        TextArea addressTextArea = new TextArea(5, 20);
        add(addressTextArea);
        
        // Submit Button
        Button submitButton = new Button("Submit");
        add(submitButton);
        
        // Closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
        
        setTitle("User Input Form");
        setSize(250, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTForm(); // Create the frame on the event dispatching thread
    }
}
