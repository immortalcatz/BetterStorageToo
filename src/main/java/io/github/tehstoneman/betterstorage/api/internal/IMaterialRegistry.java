package io.github.tehstoneman.betterstorage.api.internal;

import java.util.Set;

import io.github.tehstoneman.betterstorage.common.block.ReinforcedMaterial;
import net.minecraft.item.ItemStack;

public interface IMaterialRegistry
{
	/**
	 * Register a material for use in reinforced chests and lockers.
	 * 
	 * @param modID
	 * @param materialName
	 * @param materialIngot Ingot item for this material - can be ore dictionary entry
	 * @param materialBlock Block object for this material - can be ore dictionary entry
	 */
	public void register( String modID, String materialName, Object materialIngot, Object materialBlock );

	/**
	 * Returns the material for the given name
	 * 
	 * @param name
	 * @return
	 */
	public ReinforcedMaterial get( String name );

	/**
	 * Returns the material for the given ItemStack
	 * 
	 * @param stack
	 * @return
	 */
	public ReinforcedMaterial getMaterial( ItemStack stack );

	/**
	 * Return a list of currently registered materials
	 * 
	 * @return
	 */
	public Set< String > getMaterialList();
}
