package com.game.gui;

import javax.swing.JPanel;

import com.game.main.ImperiumGame;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Rectangle;

public class GameGUI extends JPanel {
   /**
    * 
    */
   private static final long serialVersionUID = 7231022443180513672L;
   private ImperiumGame game;
   /**
    * Create the panel.
    */
   public GameGUI(ImperiumGame parentGame) {
      setGame(parentGame);

      setBounds(new Rectangle(100, 0, 0, 0));
      setBackground(Color.BLUE);
      setPreferredSize(new Dimension(1680, 950));
   }
   public ImperiumGame getGame() {
      return game;
   }
   public void setGame(ImperiumGame game) {
      this.game = game;
   }
}
