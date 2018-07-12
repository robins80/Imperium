package com.game.utilities;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public final class ScreenUtilities {
   private ScreenUtilities() {}
   
   public static void swapScreens(JFrame frame, JPanel removeThis, JPanel addThis) {
      frame.remove(removeThis);
      frame.add(addThis);
      frame.pack();
   }

   public static JRadioButton getRadioButton(ButtonGroup buttonGroup) {
      JRadioButton returnThis = null;
      ArrayList<AbstractButton> buttons = Collections.list(buttonGroup.getElements());
      
      for (AbstractButton button : buttons) {
         returnThis = (JRadioButton) button;
         
         if (returnThis.isSelected()) {
            return returnThis;
         }
      }
      return returnThis;
   }
}
