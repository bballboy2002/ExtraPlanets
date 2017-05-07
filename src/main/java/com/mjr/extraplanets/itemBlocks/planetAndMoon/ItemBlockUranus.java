package com.mjr.extraplanets.itemBlocks.planetAndMoon;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockUranus extends ItemBlock
{
	public ItemBlockUranus(Block block)
	{
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int meta)
	{
		return meta;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";

		switch (itemstack.getItemDamage())
		{
		case 0:
		{
			name = "surface";
			break;
		}
		case 1:
		{
			name = "subSurface";
			break;
		}
		case 2:
		{
			name = "stone";
			break;
		}
		case 3:
		{
			name = "oreCrystal";
			break;
		}
		case 4:
		{
			name = "crystalBlock";
			break;
		}
		case 5:
		{
			name = "stoneBricks";
			break;
		}		
		case 6:
		{
			name = "dungeonBrick";
			break;
		}
		case 7:
		{
			name = "oreWhiteGem";
			break;
		}
		case 8:
		{
			name = "whiteGemBlock";
			break;
		}
		default:
			name = "null";
		}

		return this.block.getUnlocalizedName() + "." + name;
	}

	@Override
	public String getUnlocalizedName()
	{
		return this.block.getUnlocalizedName() + ".0";
	}
}