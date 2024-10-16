package com.cjcj55.chrispymod.datagen;

import com.cjcj55.chrispymod.ChrispyMod;
import com.cjcj55.chrispymod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ChrispyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        spawnEggItem(ModItems.SANDY_COW_SPAWN_EGG);

//        simpleItem(ModItems.DYNAMITE);
    }
}
