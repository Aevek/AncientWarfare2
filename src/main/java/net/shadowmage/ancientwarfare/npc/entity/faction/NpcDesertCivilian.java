package net.shadowmage.ancientwarfare.npc.entity.faction;

import net.minecraft.world.World;

public class NpcDesertCivilian extends NpcFactionCivilian
{

public NpcDesertCivilian(World par1World)
  {
  super(par1World);
  }

@Override
public String getNpcType()
  {
  return "desert.civilian";
  }

}
