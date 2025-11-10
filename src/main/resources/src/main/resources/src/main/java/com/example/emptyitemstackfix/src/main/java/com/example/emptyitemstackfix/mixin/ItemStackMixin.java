package com.example.emptyitemstackfix.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 Mixin: intercept ItemStack.writeNbt(NbtCompound) and if the stack is empty,
 return an empty NbtCompound instead of letting code that encodes throw.
*/
@Mixin(ItemStack.class)
public class ItemStackMixin {

    @Inject(method = "writeNbt", at = @At("HEAD"), cancellable = true)
    private void onWriteNbt(NbtCompound tag, CallbackInfoReturnable<NbtCompound> cir) {
        ItemStack self = (ItemStack) (Object) this;
        if (self.isEmpty()) {
            // Return an empty compound to avoid IllegalStateException from codec/encoder
            cir.setReturnValue(new NbtCompound());
        }
    }
}
