/*
* File: InputPanel.java
* Author: Nyiri István
* Copyright: 2022, Nyiri István
* Group: Szoft_II_N
* Date: 2022-12-19
* Github: https://github.com/nyiriistvan
* Licenc: GNU GPL
*/
package views;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InputPanel extends JPanel 
{
    JLabel label;
    JTextField field;

    public InputPanel() 
    {
        label = new JLabel("InputPanel");
        field = new JTextField();
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        setBorder(new EmptyBorder(50, 10, 50, 10));
        label.setBorder(new EmptyBorder(10, 10, 10, 10));
        addComponent();
    }

    public void addComponent() 
    {
        add(label);
        add(field);
    }
    
    public InputPanel(JLabel label, JLabel label2) {
        this.label = label;
    }

    public void setText(String text) {
        this.label.setText(text);
    }

    public void setValue(String value) {
        this.field.setText(value);
    }

    public String getText() {
        return this.label.getText();
    }

    public String getValue() {
        return this.field.getText();
    }
}