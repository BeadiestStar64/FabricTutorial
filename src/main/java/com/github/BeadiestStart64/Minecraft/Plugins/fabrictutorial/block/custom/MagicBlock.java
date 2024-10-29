package com.github.BeadiestStart64.Minecraft.Plugins.fabrictutorial.block.custom;

import com.github.BeadiestStart64.Minecraft.Plugins.fabrictutorial.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagicBlock extends Block {

    public MagicBlock(Settings settings) {
        super(settings);
    }

    // 右クリック時にサウンドを鳴らす
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }

    // アイテムが投げ込まれた時、魔法のようにアイテムを変換する
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof ItemEntity item) {
            if (item.getStack().getItem() == ModItems.RAW_PINK_GARNET) {
                item.setStack(new ItemStack(Items.DIAMOND, item.getStack().getCount()));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
