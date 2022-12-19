/*
* File: MainController.java
* Author: Nyiri István
* Copyright: 2022, Nyiri István
* Group: Szoft_II_N
* Date: 2022-12-19
* Github: https://github.com/nyiriistvan
* Licenc: GNU GPL
*/
package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import views.MainView;

public class MainController {
    MainView mainView;

    public MainController() {
        this.mainView = new MainView();
        this.handleEvents();
    }

    public void handleEvents() {
        JButton calcButton = mainView.buttonsPanel.calcButton;
        JButton aboutButton = mainView.buttonsPanel.aboutButton;

        calcButton.addActionListener(e -> onClickCalcButton());
        aboutButton.addActionListener(e -> onClickABoutButton());
    }

    public void onClickCalcButton() {
        String asiteStr = mainView.asitePanel.getValue();
        String alphaStr = mainView.alphaPanel.getValue();

        double alpha = Double.parseDouble(alphaStr);
        double asite = Double.parseDouble(asiteStr);

        Double volume = 4 * asite;
        Double radian = alpha * Math.PI/180;
        Double area = Math.pow(asite, 2) * Math.sin(radian);

        mainView.volumePanel.setValue(volume.toString());
        mainView.areaPanel.setValue(area.toString());
        
    }
    
    public void onClickABoutButton() {
        JOptionPane.showMessageDialog(mainView, "Rombitak  \n  Verzió: 0.0.1  \n  Szoft_II_N \n 2022-12-19 ");
    }

    public void onClickCopyRightButton() {
        JOptionPane.showMessageDialog(mainView, "Copyright© Nyiri István");
    }
    
    public void onClickRefreshButton() {
        mainView.asitePanel.setValue(null);
        mainView.alphaPanel.setValue(null);
        mainView.volumePanel.setValue(null);
        mainView.areaPanel.setValue(null);
    }
}
