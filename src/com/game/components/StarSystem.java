package com.game.components;

import java.util.Random;

import com.game.types.AtmosphereType;
import com.game.types.PlanetType;
import com.game.types.SystemType;

public class StarSystem {
   private AtmosphereType atmosphere;
   private Coordinates coordinates = new Coordinates();
   private int diameter;
   private int owner = 0;
   private PlanetType planetType;
   private long population;
   private int production = 0;
   private Station station = Station.None;
   private SystemType systemType;
   private int techLevel = 0;
   
   public StarSystem createSystem(int x, int y) {
      StarSystem thisSystem = new StarSystem();
      
      //Set coordinates.
      thisSystem.coordinates = new Coordinates(x, y);
      
      //Determine planet type
      thisSystem.planetType = determinePlanetType();
      
      //Set diameter.
      thisSystem.diameter = determineDiameter(thisSystem.planetType);
      
      //Set atmosphere.
      thisSystem.atmosphere = getAtmosphere(thisSystem.planetType.modifier());
      
      //Population.
      thisSystem.population = determinePopulation(thisSystem.planetType);
      
      //Tech level.
      if (thisSystem.population > 0) {
         thisSystem.techLevel = new Random().nextInt(16);
      }
      
      return thisSystem;      
   }

   public int determineDiameter(PlanetType planetType) {
      Random random = new Random();
      int min = planetType.min();
      int max = planetType.max();
      return random.nextInt((max - min) + 1) + min;
   }

   private PlanetType determinePlanetType() {
      Random random = new Random();
      return PlanetType.getType(random.nextInt(8));
   }

   private long determinePopulation(PlanetType planetType) {
      int populationRating = 0;
      double percentage = 0;
      int modifier = 0;
      double population;
      double minPop;
      double maxPop;
      Random random = new Random();
      
      switch (planetType) {
         case Asteroids:
            modifier = -5;
            percentage = 0.05;
            break;
         case Dwarf: 
            modifier = -2;
            percentage = 0.2;
            break;
         case GasGiant: 
            modifier = -8;
            percentage = 0.01;
            break;
         case IceGiant: 
            modifier = -7;
            percentage = 0.01;
            break;
         case SubDwarf: 
            modifier = -6;
            percentage = 0.2;
            break;
         case SubGiant:
            modifier = -6;
            percentage = 0.1;
            break;
         case SuperGiant: 
            modifier = -6;
            percentage = 0.01;
            break;
         case Terrestrial: 
            modifier = 2;
            percentage = 0.50;
            break;
      }
      
      if (Math.random() <= percentage) {
         populationRating = Math.min(Math.max(random.nextInt(11) + modifier, 0), 10);
         minPop = Math.pow(10, populationRating - 1);
         maxPop = Math.pow(10, populationRating);
         return (long) ((Math.random() * (maxPop - minPop)) + minPop);
      }
      return 0;
   }

   public String getAtmosphere() {
      return atmosphere.toString();
   }

   private AtmosphereType getAtmosphere(int modifier) {
      Random random = new Random();
      int atmosphere = random.nextInt(9) + modifier;
      
      if (atmosphere < 0) {
         atmosphere = 0;
      }
      else if (atmosphere > 9) {
         atmosphere = 9;
      }
      
      return AtmosphereType.getType(atmosphere);
   }

   public Coordinates getCoordinates() {
      return coordinates;
   }

   public int getDiameter() {
      return diameter;
   }

   public int getOwner() {
      return owner;
   }

   public PlanetType getPlanetType() {
      return planetType;
   }

   public long getPopulation() {
      return population;
   }

   public int getProduction() {
      return production;
   }

   public Station getStation() {
      return station;
   }

   public SystemType getSystemType() {
      return systemType;
   }

   public int getTechLevel() {
      return techLevel;
   }

   public void setAtmosphere(AtmosphereType atmosphere) {
      this.atmosphere = atmosphere;
   }
   
   public void setCoordinates(Coordinates coordinates) {
      this.coordinates = coordinates;
   }
   
   public void setDiameter(int diameter) {
      this.diameter = diameter;
   }
   
   public void setOwner(int owner) {
      this.owner = owner;
   }
   
   public void setPlanetType(PlanetType planetType) {
      this.planetType = planetType;
   }
   
   public void setPopulation(long population) {
      this.population = population;
   }
   
   public void setProduction(int production) {
      this.production = production;
   }
   
   public void setStation(Station station) {
      this.station = station;
   }

   public void setSystemType(SystemType systemType) {
      this.systemType = systemType;
   }

   public void setTechLevel(int techLevel) {
      this.techLevel = techLevel;
   }
}
