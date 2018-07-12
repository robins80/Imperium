package com.game.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.game.main.ImperiumGame;
import com.game.utilities.ScreenUtilities;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SetupGUI extends JPanel {
   /**
    * 
    */
   private static final long serialVersionUID = 6552455158750995689L;
   /**
    * Create the panel.
    * @param imperiumGame 
    */
   Border raisedEtched = BorderFactory.createLineBorder(Color.white);
   TitledBorder sizeTitle = BorderFactory.createTitledBorder(raisedEtched, "Size", TitledBorder.LEFT, TitledBorder.TOP, new Font("OCR A Extended", Font.PLAIN, 22), Color.white);
   TitledBorder densityTitle = BorderFactory.createTitledBorder(raisedEtched, "Density", TitledBorder.LEFT, TitledBorder.TOP, new Font("OCR A Extended", Font.PLAIN, 22), Color.white);
   ButtonGroup sizeGroup = new ButtonGroup();
   ButtonGroup densityGroup = new ButtonGroup();
   
   public SetupGUI(ImperiumGame imperiumGame) {
      setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Game Setup", TitledBorder.LEADING, TitledBorder.TOP, new Font("OCR A Extended", Font.PLAIN, 22), Color.white));
      //Panel setup.
      setPreferredSize(new Dimension(1024, 1024));
      setBackground(Color.BLACK);
      setLayout(new FormLayout(new ColumnSpec[] {
            ColumnSpec.decode("max(126dlu;default)"),
            FormSpecs.RELATED_GAP_COLSPEC,
            ColumnSpec.decode("max(126dlu;default)"),
            FormSpecs.RELATED_GAP_COLSPEC,
            FormSpecs.DEFAULT_COLSPEC,},
         new RowSpec[] {
            FormSpecs.DEFAULT_ROWSPEC,
            RowSpec.decode("178px"),
            RowSpec.decode("31px"),}));
      
      JPanel sizePanel = new JPanel();
      sizePanel.setBackground(Color.BLACK);
      sizePanel.setForeground(Color.WHITE);
      add(sizePanel, "1, 1, fill, top");
      sizePanel.setLayout(new BoxLayout(sizePanel, BoxLayout.Y_AXIS));
      
      //Galaxy size
//      JPanel sizePanel = new JPanel();
//      sizePanel.setPreferredSize(new Dimension(100, 50));
//      sizePanel.setMaximumSize(new Dimension(100, 50));
      sizePanel.setBorder(sizeTitle);
//      sizePanel.setLayout(new BoxLayout(sizePanel, BoxLayout.Y_AXIS));
      
      JRadioButton sizeSmallRadio = new JRadioButton("Small");
      sizeSmallRadio.setSelected(true);
      sizeSmallRadio.setForeground(Color.WHITE);
      sizeSmallRadio.setBackground(Color.BLACK);
      sizePanel.add(sizeSmallRadio);
      sizeSmallRadio.setFont(new Font("OCR A Extended", Font.PLAIN, 22));
      
      //Create the size button group
      sizeGroup.add(sizeSmallRadio);
      
      JRadioButton sizeMediumRadio = new JRadioButton("Medium");
      sizeMediumRadio.setBackground(Color.BLACK);
      sizeMediumRadio.setForeground(Color.WHITE);
      sizePanel.add(sizeMediumRadio);
      sizeMediumRadio.setFont(new Font("OCR A Extended", Font.PLAIN, 22));
      sizeGroup.add(sizeMediumRadio);
      
      JRadioButton sizeLargeRadio = new JRadioButton("Large");
      sizeLargeRadio.setForeground(Color.WHITE);
      sizeLargeRadio.setBackground(Color.BLACK);
      sizePanel.add(sizeLargeRadio);
      sizeLargeRadio.setFont(new Font("OCR A Extended", Font.PLAIN, 22));
      sizeGroup.add(sizeLargeRadio);
      
      JRadioButton sizeGiganticRadio = new JRadioButton("Gigantic");
      sizeGiganticRadio.setBackground(Color.BLACK);
      sizeGiganticRadio.setForeground(Color.WHITE);
      sizePanel.add(sizeGiganticRadio);
      sizeGiganticRadio.setFont(new Font("OCR A Extended", Font.PLAIN, 22));
      sizeGroup.add(sizeGiganticRadio);
      
      //Density panel
      JPanel densityPanel = new JPanel();
      densityPanel.setBackground(Color.BLACK);
      densityPanel.setPreferredSize(new Dimension(100, 100));
      densityPanel.setMaximumSize(new Dimension(100, 100));
      densityPanel.setBorder(densityTitle);
      densityPanel.setLayout(new BoxLayout(densityPanel, BoxLayout.Y_AXIS));
      add(densityPanel, "3, 1, fill, fill");     
      
      JRadioButton densityLowRadio = new JRadioButton("Low (10%)");
      densityLowRadio.setSelected(true);
      densityLowRadio.setForeground(Color.WHITE);
      densityLowRadio.setBackground(Color.BLACK);
      densityLowRadio.setFont(new Font("OCR A Extended", Font.PLAIN, 22));
      densityPanel.add(densityLowRadio);
      densityGroup.add(densityLowRadio);
      
      JRadioButton densityMediumRadio = new JRadioButton("Medium (25%)");
      densityMediumRadio.setBackground(Color.BLACK);
      densityMediumRadio.setForeground(Color.WHITE);
      densityMediumRadio.setFont(new Font("OCR A Extended", Font.PLAIN, 22));
      densityPanel.add(densityMediumRadio);
      densityGroup.add(densityMediumRadio);
      
      JRadioButton densityHighRadio = new JRadioButton("High (50%)");
      densityHighRadio.setBackground(Color.BLACK);
      densityHighRadio.setForeground(Color.WHITE);
      densityHighRadio.setFont(new Font("OCR A Extended", Font.PLAIN, 22));
      densityPanel.add(densityHighRadio);
      densityGroup.add(densityHighRadio);
      
      JButton backButton = new JButton("Back");
      backButton.setBackground(Color.BLACK);
      backButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ScreenUtilities.swapScreens(imperiumGame, imperiumGame.setupGUI, imperiumGame.menuGUI);
         }
      });
      backButton.setFont(new Font("OCR A Extended", Font.PLAIN, 22));
      add(backButton, "1, 3");
      
      JButton continueButton = new JButton("Continue");
      continueButton.setBackground(Color.BLACK);
      continueButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String galaxySize = ((JRadioButton)ScreenUtilities.getRadioButton(sizeGroup)).getText();
            
            switch(galaxySize) {
               case "Small":
                  imperiumGame.mapSize = 10;
                  break;
               case "Medium":
                  imperiumGame.mapSize = 20;
                  break;
               case "Large":
                  imperiumGame.mapSize = 30;
                  break;
               case "Gigantic":
                  imperiumGame.mapSize = 40;
                  break;
               default:
                  imperiumGame.mapSize = 20;
                  break;
            }
            
            String galaxyDensity = ((JRadioButton)ScreenUtilities.getRadioButton(densityGroup)).getText();
            
            switch(galaxyDensity) {
               case "Low (10%)":
                  imperiumGame.createGalaxy(0.10);
                  break;
               case "Medium (25%)":
                  imperiumGame.createGalaxy(0.25);
                  break;
               case "High (50%)":
                  imperiumGame.createGalaxy(0.50);
                  break;
            }
         }
      });
      continueButton.setFont(new Font("OCR A Extended", Font.PLAIN, 22));
      add(continueButton, "3, 3");
      
      //Add the panels to the main panel.
      GridBagConstraints gbc_sizePanel = new GridBagConstraints();
      gbc_sizePanel.anchor = GridBagConstraints.NORTHWEST;
      gbc_sizePanel.insets = new Insets(0, 0, 5, 0);
      gbc_sizePanel.gridx = 0;
      gbc_sizePanel.gridy = 0;
   }
}