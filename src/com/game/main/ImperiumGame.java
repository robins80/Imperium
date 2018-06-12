package com.game.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.game.gui.GameGUI;
import com.game.gui.MenuGUI;

public class ImperiumGame extends JFrame {

   private JPanel contentPane;
   public static GameGUI gameGUI;
   public static MenuGUI menuGUI;
   public static int mapSize;
   public static int [][] gameMap;
   public static ImperiumGame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               frame = new ImperiumGame();
               frame.setUndecorated(true);
               frame.setPreferredSize(new Dimension(1680, 950));
               frame.pack();
               frame.setVisible(true);
            }
            catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public ImperiumGame() {
      menuGUI = new MenuGUI(this);
      gameGUI = new GameGUI(this);
      
      setFont(new Font("OCR A Extended", Font.BOLD, 12));
      setTitle("Imperium");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 50, 1680, 950);
      contentPane = new JPanel();
      contentPane.setBackground(Color.LIGHT_GRAY);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(new BorderLayout(0, 0));
      contentPane.add(menuGUI);
   }

   public void createGame() {
   }
}
