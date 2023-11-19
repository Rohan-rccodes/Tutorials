import java.awt.*;
import java.awt.event.*;
 class CustomCheckboxLayoutExample extends Frame {
    public CustomCheckboxLayoutExample() {
        setTitle("CheckboxGroup with Custom Layout");
        setSize(300, 200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        
        CheckboxPanel checkboxPanel = new CheckboxPanel();

       
        CheckboxGroup checkboxGroup = new CheckboxGroup();

        Checkbox checkbox1 = new Checkbox("Option 1", checkboxGroup, false);
        Checkbox checkbox2 = new Checkbox("Option 2", checkboxGroup, false);
        Checkbox checkbox3 = new Checkbox("Option 3", checkboxGroup, false);

        checkboxPanel.addCheckbox(checkbox1);
        checkboxPanel.addCheckbox(checkbox2);
        checkboxPanel.addCheckbox(checkbox3);

        
        add(checkboxPanel);
    }

    public static void main(String[] args) {
        CustomCheckboxLayoutExample example = new CustomCheckboxLayoutExample();
        example.setVisible(true);
    }
}

class CheckboxPanel extends Panel {
    private int checkboxCount;
    private int padding = 10;

    public CheckboxPanel() {
        setLayout(null); // Use a null layout for custom positioning
    }

    public void addCheckbox(Checkbox checkbox) {
        checkboxCount++;
        checkbox.setBounds(padding, checkboxCount * 30, 100, 20);
        add(checkbox);
    }
}
