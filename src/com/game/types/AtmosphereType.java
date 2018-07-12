package com.game.types;

public enum AtmosphereType {
   Corrosive (1) {
      public String toString() {
         return "Corrosive";
      }
   }, 
   Deadly (2) {
      public String toString() {
         return "Deadly";
      }
   }, 
   Dense (3) {
      public String toString() {
         return "Dense";
      }
   }, 
   Exotic (0) {
      public String toString() {
         return "Exotic";
      }
   }, 
   None (9) {
      public String toString() {
         return "None";
      }
   }, 
   Standard (5) {
      public String toString() {
         return "Standard";
      }
   }, 
   Tainted (4) {
      public String toString() {
         return "Tainted";
      }
   }, 
   Thin (6) {
      public String toString() {
         return "Thin";
      }
   }, 
   Trace (8) {
      public String toString() {
         return "Trace";
      }
   }, 
   VeryThin (7) {
      public String toString() {
         return "Very Thin";
      }
   };
   
   private final int value;
   
   AtmosphereType (int value) {
      this.value = value;
   }
   
   public static AtmosphereType getType(int value) {
      for (AtmosphereType type : values()) {
         if (type.value() == value) return type;
      }
      
      return null;
   }

   public int value() {return value;}
}
