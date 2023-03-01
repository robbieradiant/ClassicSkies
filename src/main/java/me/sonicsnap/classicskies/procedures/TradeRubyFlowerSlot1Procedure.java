package me.sonicsnap.classicskies.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import me.sonicsnap.classicskies.init.ClassicskiesModItems;
import me.sonicsnap.classicskies.init.ClassicskiesModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class TradeRubyFlowerSlot1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == ClassicskiesModItems.RUBY.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ClassicskiesModBlocks.PAEONIA.get());
				_setstack.setCount(5);
				((Slot) _slots.get(2)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
