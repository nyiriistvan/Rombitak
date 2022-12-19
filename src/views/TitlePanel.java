/*
* File: TitlePanel.java
* Author: Nyiri István
* Copyright: 2022, Nyiri István
* Group: Szoft_II_N
* Date: 2022-12-19
* Github: https://github.com/nyiriistvan
* Licenc: GNU GPL
*/
package views;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel{
    
    JLabel mainLabel;

    public TitlePanel() {
        mainLabel = new JLabel("Rombus Területének és Kerületének kiszámítása.");  
        add(mainLabel);
    }
    
}
