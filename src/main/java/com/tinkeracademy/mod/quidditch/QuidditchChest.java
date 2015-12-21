package com.tinkeracademy.mod.quidditch;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class QuidditchChest extends Block {

	protected QuidditchChest() {
		super(Material.iron);
		this.setUnlocalizedName("quidditchChest");
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
	}
	
}
