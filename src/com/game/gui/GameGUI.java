package com.game.gui;

import javax.swing.JPanel;

import com.game.main.ImperiumGame;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Rectangle;

public class GameGUI extends JPanel {
   private ImperiumGame game;
   /**
    * Create the panel.
    */
   public GameGUI(ImperiumGame parentGame) {
      game = parentGame;

      setBounds(new Rectangle(100, 0, 0, 0));
      setBackground(Color.BLUE);
      setPreferredSize(new Dimension(1680, 950));
   }
}
