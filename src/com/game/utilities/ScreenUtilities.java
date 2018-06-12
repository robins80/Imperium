package com.game.utilities;

import javax.swing.JFrame;
import javax.swing.JPanel;

public final class ScreenUtilities {
   private ScreenUtilities() {}
   
   public static void swapScreens(JFrame frame, JPanel removeThis, JPanel addThis) {
      frame.remove(removeThis);
      frame.add(addThis);
      frame.pack();
   }
}
