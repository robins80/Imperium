package com.game.types;

import java.util.Random;

public enum PlanetType {
   Asteroids(0, 10, 0, 0) {
      public String toString() {
         return "Asteroids";
      }
   }, 
   Dwarf(2, 3, 4000, 8000) {
      public String toString() {
         return "Dwarf";
      }
   }, 
   GasGiant(6, -3, 125000, 250000) {
      public String toString() {
         return "Gas Giant";
      }
   }, 
   IceGiant(5, -2, 80000, 125000) {
      public String toString() {
         return "Ice Giant";
      }
   }, 
   SubDwarf(1, 5, 1000, 4000) {
      public String toString() {
         return "Sub Dwarf";
      }
   }, 
   SubGiant(4, -1, 20000, 80000) {
      public String toString() {
         return "Sub Giant";
      }
   }, 
   SuperGiant(7, -5, 250000, 500000) {
      public String toString() {
         return "Super Giant";
      }
   }, 
   Terrestrial(3, 0, 8000, 20000) {
      public String toString() {
         return  "Terrestrial";
      }
   };
   
   private final int max;
   private final int min;
   private final int atmosphereModifier;
   private final int value;
   
   PlanetType (int value, int modifier, int min, int max) {
      this.value = value;
      this.atmosphereModifier = modifier;
      this.min = min;
      this.max = max;
   }

   public static PlanetType getType(int value) {
      for (PlanetType type : values()) {
         if (type.value() == value) return type;
      }
      
      return null;
   }
   
   public int max() {return max;}
   
   public int min() {return min;}
   
   public int modifier() {return atmosphereModifier;}
     
   public int value() {return value;}
}