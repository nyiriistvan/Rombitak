/*
* File: MainView.java
* Author: Nyiri István
* Copyright: 2022, Nyiri István
* Group: Szoft_II_N
* Date: 2022-12-19
* Github: https://github.com/nyiriistvan
* Licenc: GNU GPL
*/
package views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainView extends JFrame {

    TitlePanel titlePanel;
    public AsitePanel asitePanel;
    public AlphaPanel alphaPanel;
    public AreaPanel areaPanel;
    public VolumePanel volumePanel;
    public ButtonsPanel buttonsPanel;

    public MainView() {
        titlePanel = new TitlePanel();
        asitePanel = new AsitePanel();
        alphaPanel = new AlphaPanel();
        volumePanel = new VolumePanel();
        areaPanel = new AreaPanel();
        buttonsPanel = new ButtonsPanel();
        initWindow();
    }

    public void initWindow() {
        setIconImage(new ImageIcon("logo.png").getImage());
        setTitle("Rombitak");
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        addComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void addComponents() {
        add(this.titlePanel);
        add(this.asitePanel);
        add(this.alphaPanel);
        add(this.buttonsPanel);
        add(this.volumePanel);
        add(this.areaPanel);
    }
    
}
