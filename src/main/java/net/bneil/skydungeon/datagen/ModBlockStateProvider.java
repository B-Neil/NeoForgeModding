package net.bneil.skydungeon.datagen;


import net.bneil.skydungeon.SkyDungeon;
import net.bneil.skydungeon.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SkyDungeon.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BISMUTH_BLOCK);

        blockWithItem(ModBlocks.BISMUTH_ORE);
        blockWithItem(ModBlocks.BISMUTH_DEEPSLATE_ORE);

        blockWithItem(ModBlocks.MAGIC_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
