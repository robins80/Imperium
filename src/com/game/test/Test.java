package com.game.test;

import com.game.main.ImperiumGame;

public class Test {
   public static void main(String[] args) {
      ImperiumGame game = new ImperiumGame();
      game.mapSize = 10;
      double percentage = 0.5;
      
      game.createGalaxy(percentage);
   }
}