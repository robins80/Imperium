package com.game.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import com.game.main.ImperiumGame;
import com.game.utilities.ScreenUtilities;

public class MenuGUI extends JPanel {

   private ImperiumGame game;

   /**
    * Create the panel.
    */
   public MenuGUI(ImperiumGame parentGame) {
      game = parentGame;
      setBackground(Color.LIGHT_GRAY);
      
      //New game button
      JButton newButton = new JButton("New Game");
      newButton.setBorder(null);
      newButton.setMaximumSize(new Dimension(200, 40));
      newButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      newButton.setPreferredSize(new Dimension(200, 40));
      newButton.setToolTipText("Start a new game");
      newButton.setSize(500, 100);
      newButton.setForeground(Color.BLACK);
      newButton.setBackground(Color.LIGHT_GRAY);
      newButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent arg0) {
            newButton.setForeground(Color.red);
         }
         @Override
         public void mouseExited(MouseEvent e) {
            newButton.setForeground(Color.black);
         }
      });
      newButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            System.out.println("New game selected");
            game.createGame();
            ScreenUtilities.swapScreens(game, game.menuGUI, game.gameGUI);
         }
      });
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      newButton.setFont(new Font("OCR A Extended", Font.BOLD, 30));
      
      //Load Game button
      JButton loadButton = new JButton("Load Game");
      loadButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      loadButton.setBorder(null);
      loadButton.setToolTipText("Load Game");
      loadButton.setPreferredSize(new Dimension(200, 40));
      loadButton.setMaximumSize(new Dimension(200, 40));
      loadButton.setForeground(Color.BLACK);
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
            loadButton.setForeground(Color.black);
         }
      });
      loadButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(parentGame.frame, "Feature not implemented");
         }
      });
      
      //Exit button
      JButton exitButton = new JButton("Exit");
      exitButton.setToolTipText("Exit Imperium");
      exitButton.setPreferredSize(new Dimension(200, 40));
      exitButton.setMaximumSize(new Dimension(200, 40));
      exitButton.setForeground(Color.BLACK);
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
            exitButton.setForeground(Color.black);
         }
      });
      exitButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            System.exit(0);
         }
      });
      
      //Save button
      JButton saveButton = new JButton("Save Game");
      saveButton.setToolTipText("Exit Imperium");
      saveButton.setPreferredSize(new Dimension(200, 40));
      saveButton.setMaximumSize(new Dimension(200, 40));
      saveButton.setForeground(Color.BLACK);
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
            saveButton.setForeground(Color.black);
         }
      });
      saveButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(parentGame.frame, "Feature not implemented");
         }
      });
      
      //Options button
      JButton optionsButton = new JButton("Options");
      optionsButton.setToolTipText("Exit Imperium");
      optionsButton.setPreferredSize(new Dimension(200, 40));
      optionsButton.setMaximumSize(new Dimension(200, 40));
      optionsButton.setForeground(Color.BLACK);
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
            optionsButton.setForeground(Color.black);
         }
      });
      optionsButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(parentGame.frame, "Feature not implemented");
         }
      });      
      
      add(newButton);
      add(loadButton);
      add(saveButton);
      add(optionsButton);
      add(exitButton);
   }
}