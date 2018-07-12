package com.game.components;
import java.util.ArrayList;

public class Ship {
   Coordinates coordinates = new Coordinates();
   ArrayList<Components> components = new ArrayList<Components>();
   int owner = 0;
   
   public ArrayList<Components> getComponents() {
      return components;
   }
   public Coordinates getCoordinates() {
      return coordinates;
   }
   public int getOwner() {
      return owner;
   }
   public void setComponents(ArrayList<Components> components) {
      this.components = components;
   }
   public void setCoordinates(Coordinates coordinates) {
      this.coordinates = coordinates;
   }
   public void setOwner(int owner) {
      this.owner = owner;
   }
}
