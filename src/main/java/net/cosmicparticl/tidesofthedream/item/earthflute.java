package net.cosmicparticl.tidesofthedream.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;



public class earthflute extends earthflutehelper {
    public earthflute(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack onDoneUsing(ItemStack stack, World world, ServerPlayerEntity user) {

        BlockPos spawn = user.getSpawnPointPosition();

        if (spawn != null && user.getSpawnPointDimension()
                .getValue()
                .equals(world.getRegistryKey()
                        .getValue())) {

            user.requestTeleportAndDismount(spawn.getX(), spawn.getY(), spawn.getZ());
         user.getItemCooldownManager().set(this, 6000);
            world.playSound((PlayerEntity) null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_PORTAL_TRAVEL, SoundCategory.PLAYERS, .7F, 1F);

        }

        return stack;
    }


}
