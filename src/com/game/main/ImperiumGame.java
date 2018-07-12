package com.game.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.game.components.Coordinates;
import com.game.components.StarSystem;
import com.game.gui.GameGUI;
import com.game.gui.MenuGUI;
import com.game.gui.SetupGUI;

public class ImperiumGame extends JFrame {

   /**
    * 
    */
   private static final long serialVersionUID = 4653623317282419517L;
   public static GameGUI gameGUI;
   public static MenuGUI menuGUI;
   public static SetupGUI setupGUI;
   public static int mapSize;
   public static String[][] gameMap;
   public static ImperiumGame frame;
   public static ArrayList<StarSystem> Systems = new ArrayList<StarSystem>();
   private JPanel contentPane;

   /**
    * Create the frame.
    */
   public ImperiumGame() {
      menuGUI = new MenuGUI(this);
      gameGUI = new GameGUI(this);
      setupGUI = new SetupGUI(this);
      
      setFont(new Font("OCR A Extended", Font.BOLD, 12));
      setTitle("Imperium");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      contentPane = new JPanel();
      contentPane.setBackground(Color.LIGHT_GRAY);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(new BorderLayout(0, 0));
      contentPane.add(menuGUI);
   }

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               frame = new ImperiumGame();
               frame.setUndecorated(true);
               frame.pack();
               frame.setLocationRelativeTo(null);
               frame.setVisible(true);
            }
            catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public void createGalaxy(double percentage) {
      gameMap = new String[mapSize][mapSize];

      System.out.println("----------------------------------------".substring(0, mapSize));
      for (int x = 0; x < mapSize; x++) {
         for (int y = 0; y < mapSize; y++) {
            if (Math.random() <= percentage) {
               StarSystem newSystem = new StarSystem().createSystem(x, y);
               gameMap[x][y] = "S";
               //Debug
               System.out.println(String.format("Generated system at %1$02d%2$02d:", x, y));
               System.out.println("     Planet type: " + newSystem.getPlanetType().toString());
               System.out.println("     Diameter: " + newSystem.getDiameter());   
               System.out.println("     Atmosphere: " + newSystem.getAtmosphere().toString());
               System.out.println(String.format("     Population: %,d", newSystem.getPopulation()));
               System.out.println("     Tech level: " + newSystem.getTechLevel());
               }
            else {
               gameMap[x][y] = " ";
            }
         }
      }
      System.out.println("----------------------------------------".substring(0, mapSize));
   }
}
