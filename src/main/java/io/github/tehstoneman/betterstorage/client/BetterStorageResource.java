package io.github.tehstoneman.betterstorage.client;

import io.github.tehstoneman.betterstorage.ModInfo;
import net.minecraft.util.ResourceLocation;

public class BetterStorageResource extends ResourceLocation
{
	public BetterStorageResource( String location )
	{
		super( ModInfo.modId, location );
	}
}
