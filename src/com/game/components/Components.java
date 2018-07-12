package com.game.components;

import com.game.types.ComponentType;

public class Components {
   ComponentType type = ComponentType.None;  //What type of component is this.
   int size = 0;           //Size of the component, as follows:
                           //Power units: How much power is being generated.
                           //Shields: How much laser damage that can be absorbed.
                           //Armor: How much missile damage that can be absorbed.
                           //Beam: Base damage.
                           //Missile racks: How many missiles that can be launched at a time.
                           //Missiles: How many missiles are being carried.
                           //Warp generator: No meaning, stays at zero.
                           //Towlink: No meaning, stays at zero.
}
