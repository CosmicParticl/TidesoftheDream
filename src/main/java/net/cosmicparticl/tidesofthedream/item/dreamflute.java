package net.cosmicparticl.tidesofthedream.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class dreamflute extends Item {
    public dreamflute(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound((PlayerEntity) null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ILLUSIONER_PREPARE_BLINDNESS, SoundCategory.PLAYERS, 0.6F, 1.9F);
        user.getItemCooldownManager().set(this, 1200);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 600));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 600));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 140, 5));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 600, 5));

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
