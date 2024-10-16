package com.cjcj55.chrispymod.datagen;

import com.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChrispyMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void cross(Block block) {
        getVariantBuilder(block).partialState().setModels(new ConfiguredModel(crossModel(block, blockTexture(block))));
    }

//    public void berryBush(DeferredBlock<Block> block) {
//        getVariantBuilder(block.get()).partialState().with(SweetBerryBushBlock.AGE, 0).modelForState()
//                .modelFile(models().cross("block/berry_bushes/" + name(block.get()) + "_0", berryBushModel(block.get(), 0)).renderType("cutout")).addModel()
//                .partialState().with(SweetBerryBushBlock.AGE, 1).modelForState()
//                .modelFile(models().cross("block/berry_bushes/" + name(block.get()) + "_1", berryBushModel(block.get(), 1)).renderType("cutout")).addModel()
//                .partialState().with(SweetBerryBushBlock.AGE, 2).modelForState()
//                .modelFile(models().cross("block/berry_bushes/" + name(block.get()) + "_2", berryBushModel(block.get(), 2)).renderType("cutout")).addModel()
//                .partialState().with(SweetBerryBushBlock.AGE, 3).modelForState()
//                .modelFile(models().cross("block/berry_bushes/" + name(block.get()) + "_3", berryBushModel(block.get(), 3)).renderType("cutout")).addModel();
//    }

    public String name(Block block) {
        String blockName = block.getLootTable().toString();
        blockName = blockName.replaceAll("chrispymod:blocks/", "");
        return blockName;
    }

    public ModelFile crossModel(Block block, ResourceLocation name) {
        return models().cross(name(block), name);
    }

//    public ResourceLocation berryBushModel(Block block, int age) {
//        return new ResourceLocation(ChrispyMod.MOD_ID, "block/berry_bushes/" + name(block) + "/stage_" + age);
//    }
}
