package com.game.components;
public class StarSystem {
   Coordinates coordinates = new Coordinates();
   int production = 0;
   Station station = Station.None;
   int techLevel = 0;
   boolean warpline = false;
   
   public int getProduction() {
      return production;
   }
   
   public Station getStation() {
      return station;
   }
   
   public int getTechLevel() {
      return techLevel;
   }
   
   public boolean isWarpline() {
      return warpline;
   }
   
   public void setProduction(int production) {
      this.production = production;
   }
   
   public void setStation(Station station) {
      this.station = station;
   }
   
   public void setTechLevel(int techLevel) {
      this.techLevel = techLevel;
   }
   
   public void setWarpline(boolean warpline) {
      this.warpline = warpline;
   }
}
