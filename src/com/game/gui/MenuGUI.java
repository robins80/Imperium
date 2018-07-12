package com.game.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import com.game.main.ImperiumGame;
import com.game.utilities.ScreenUtilities;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.border.SoftBevelBorder;

public class MenuGUI extends JPanel {

   /**
    * 
    */
   private static final long serialVersionUID = -79677544296934842L;
   private ImperiumGame game;

   /**
    * Create the panel.
    */
   public MenuGUI(ImperiumGame parentGame) {
      setBackground(Color.BLACK);
      setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
      game = parentGame;
      setLayout(new FormLayout(new ColumnSpec[] {
            ColumnSpec.decode("1024px"),},
         new RowSpec[] {
            FormSpecs.DEFAULT_ROWSPEC,
            FormSpecs.RELATED_GAP_ROWSPEC,
            FormSpecs.DEFAULT_ROWSPEC,
            FormSpecs.RELATED_GAP_ROWSPEC,
            FormSpecs.DEFAULT_ROWSPEC,
            FormSpecs.RELATED_GAP_ROWSPEC,
            FormSpecs.DEFAULT_ROWSPEC,
            FormSpecs.RELATED_GAP_ROWSPEC,
            FormSpecs.DEFAULT_ROWSPEC,}));
      
      //New game button
      JButton newButton = new JButton("New Game");
      add(newButton, "1, 1");
      newButton.setBorder(null);
      newButton.setBorderPainted(false);
      newButton.setContentAreaFilled(false);
      newButton.setOpaque(false);
      newButton.setMaximumSize(new Dimension(200, 40));
      newButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      newButton.setPreferredSize(new Dimension(200, 40));
      newButton.setToolTipText("Start a new game");
      newButton.setSize(500, 100);
      newButton.setForeground(Color.WHITE);
      newButton.setBackground(Color.BLACK);
      newButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent arg0) {
            newButton.setForeground(Color.red);
         }
         @Override
         public void mouseExited(MouseEvent e) {
            newButton.setForeground(Color.white);
         }
      });
      newButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            newButton.setForeground(Color.white);
            ScreenUtilities.swapScreens(game, ImperiumGame.menuGUI, ImperiumGame.setupGUI);
         }
      });
      newButton.setFont(new Font("OCR A Extended", Font.BOLD, 30));
      
      //Load Game button
      JButton loadButton = new JButton("Load Game");
      add(loadButton, "1, 3");
      loadButton.setBorder(null);
      loadButton.setBorderPainted(false);
      loadButton.setContentAreaFilled(false);
      loadButton.setOpaque(false);
      loadButton.setBorderPainted(false);
      loadButton.setContentAreaFilled(false);
      loadButton.setOpaque(false);
      loadButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      loadButton.setBorder(null);
      loadButton.setToolTipText("Load Game");
      loadButton.setPreferredSize(new Dimension(200, 40));
      loadButton.setMaximumSize(new Dimension(200, 40));
      loadButton.setForeground(Color.white);
      loadButton.setFont(new Font("OCR A Extended", Font.BOLD, 30));
      loadButton.setBounds(new Rectangle(0, 0, 200, 100));
      loadButton.setBackground(Color.LIGHT_GRAY);
      loadButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent arg0) {
            loadButton.setForeground(Color.red);
         }
         @Override
         public void mouseExited(MouseEvent e) {
            loadButton.setForeground(Color.white);
         }
      });
      loadButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            loadButton.setForeground(Color.white);
            JOptionPane.showMessageDialog(ImperiumGame.frame, "Feature not implemented");
         }
      });
      
      //Save button
      JButton saveButton = new JButton("Save Game");
      add(saveButton, "1, 5");
      saveButton.setBorder(null);
      saveButton.setBorderPainted(false);
      saveButton.setContentAreaFilled(false);
      saveButton.setOpaque(false);
      saveButton.setToolTipText("Exit Imperium");
      saveButton.setPreferredSize(new Dimension(200, 40));
      saveButton.setMaximumSize(new Dimension(200, 40));
      saveButton.setForeground(Color.white);
      saveButton.setFont(new Font("OCR A Extended", Font.BOLD, 30));
      saveButton.setBounds(new Rectangle(0, 0, 200, 100));
      saveButton.setBorder(null);
      saveButton.setBackground(Color.LIGHT_GRAY);
      saveButton.setAlignmentX(0.5f);
      saveButton.setBorder(null);
      saveButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent arg0) {
            saveButton.setForeground(Color.red);
         }
         @Override
         public void mouseExited(MouseEvent e) {
            saveButton.setForeground(Color.white);
         }
      });
      saveButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            saveButton.setForeground(Color.white);
            JOptionPane.showMessageDialog(ImperiumGame.frame, "Feature not implemented");
         }
      });
      
      //Options button
      JButton optionsButton = new JButton("Options");
      add(optionsButton, "1, 7");
      optionsButton.setBorder(null);
      optionsButton.setBorderPainted(false);
      optionsButton.setContentAreaFilled(false);
      optionsButton.setOpaque(false);
      optionsButton.setToolTipText("Exit Imperium");
      optionsButton.setPreferredSize(new Dimension(200, 40));
      optionsButton.setMaximumSize(new Dimension(200, 40));
      optionsButton.setForeground(Color.white);
      optionsButton.setFont(new Font("OCR A Extended", Font.BOLD, 30));
      optionsButton.setBounds(new Rectangle(0, 0, 200, 100));
      optionsButton.setBorder(null);
      optionsButton.setBackground(Color.LIGHT_GRAY);
      optionsButton.setAlignmentX(0.5f);
      optionsButton.setBorder(null);
      optionsButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent arg0) {
            optionsButton.setForeground(Color.red);
         }
         @Override
         public void mouseExited(MouseEvent e) {
            optionsButton.setForeground(Color.white);
         }
      });
      optionsButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            optionsButton.setForeground(Color.white);
            JOptionPane.showMessageDialog(ImperiumGame.frame, "Feature not implemented");
         }
      });      
      
      //Exit button
      JButton exitButton = new JButton("Exit");
      add(exitButton, "1, 9");
      exitButton.setBorder(null);
      exitButton.setBorderPainted(false);
      exitButton.setContentAreaFilled(false);
      exitButton.setOpaque(false);
      exitButton.setToolTipText("Exit Imperium");
      exitButton.setPreferredSize(new Dimension(200, 40));
      exitButton.setMaximumSize(new Dimension(200, 40));
      exitButton.setForeground(Color.white);
      exitButton.setFont(new Font("OCR A Extended", Font.BOLD, 30));
      exitButton.setBounds(new Rectangle(0, 0, 200, 100));
      exitButton.setBorder(new BevelBorder(BevelBorder.RAISED));
      exitButton.setBackground(Color.LIGHT_GRAY);
      exitButton.setAlignmentX(0.5f);
      exitButton.setBorder(null);
      exitButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent arg0) {
            exitButton.setForeground(Color.red);
         }
         @Override
         public void mouseExited(MouseEvent e) {
            exitButton.setForeground(Color.white);
         }
      });
      exitButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            exitButton.setForeground(Color.white);
            System.exit(0);
         }
      });
   }
}