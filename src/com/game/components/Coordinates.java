package com.game.components;
public class Coordinates {
   int x;
   int y;
   
   public Coordinates(int x2, int y2) {
      x = x2;
      y = y2;
   }

   public Coordinates() {
   }

   public int getX() {
      return x;
   }
   
   public void setX(int x) {
      this.x = x;
   }
   
   public int getY() {
      return y;
   }
   
   public void setY(int y) {
      this.y = y;
   }
}
