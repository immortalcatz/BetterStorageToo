package io.github.tehstoneman.betterstorage;

public final class ModInfo
{
	public static final String	modId						= "betterstorage";
	public static final String	modName						= "BetterStorage";
	public static final String	modVersion					= "1.0.0.0-beta1";
	public static final String	dependencies				= "required-after:Forge; after:Thaumcraft; after:JEI;";
	public static final String	acceptedMC					= "1.10.2";
	public static final String	guiFactory					= "io.github.tehstoneman.betterstorage.client.gui.BetterStorageGuiFactory";
	public static final String	updateJson					= "http://tehstoneman.github.io/" + modId + ".json";

	public static final String	commonProxy					= "io.github.tehstoneman.betterstorage.proxy.CommonProxy";
	public static final String	clientProxy					= "io.github.tehstoneman.betterstorage.proxy.ClientProxy";

	public static final String	containerCrate				= "container." + modId + ".crate";
	public static final String	containerCapacity			= "container." + modId + ".crate.capacity";
	public static final String	containerReinforcedChest	= "container." + modId + ".reinforced_chest";
	public static final String	containerLocker				= "container." + modId + ".locker";
	public static final String	containerReinforcedLocker	= "container." + modId + ".reinforced_locker";
	public static final String	containerArmorStand			= "container." + modId + ".armorStand";
	public static final String	containerCardboardBox		= "container." + modId + ".cardboardBox";
	public static final String	containerCraftingStation	= "container." + modId + ".craftingStation";
	public static final String	containerPresent			= "container." + modId + ".present";

	public static final String	containerKeyring			= "container." + modId + ".keyring";

	public static final String	lockableDoor				= modId + ".lockableDoor";
}
